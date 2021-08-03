package com.example.demo.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.model.RequestBodyObj;
import com.example.demo.model.ResponseJSON;
import com.example.demo.model.TimeSlot;
import com.example.demo.model.User;

@RestController
@RequestMapping("/")
public class SimualtionController {

	private static final Logger logger = LoggerFactory.getLogger(SimualtionController.class);

	// @Autowired
    // private RequestObj new_blockMatrix;

    // @Autowired
    // private ResponseJSON new_wallet;

    // @Autowired
    // private Timeslot wallet_genesis;

    // @Autowired
    // private User new_block;

	@CrossOrigin(origins = {"http://192.168.0.10:3000", "https://energy-web-intern.herokuapp.com/"})
	@PostMapping("/run_algorithm")
	public String run_algorithm(@RequestBody String data) {

		/**
		 * Print Body Output *data*
		 * contains the user's selected TimeSlots Data
		 * in the form of an array, 
		*/
		logger.info(data);

		// ======== [TODO] ==========
		// run simulation and gather the data;

		// public void run(String userTimeslotPreferences, int numAgents, int timeslotsPerAgent);
		// public String getUserAllocation();
		// public ArrayList<String> getOtherAgentsPreferences();
		// public ArrayList<String> getOtherAgentsAllocations();

		/**
		 * Description
		 * Dealing with the user at the beginning, 
		 * 
		 * =======================================
		 * 				REAL USER
		 * =======================================
		*/
		ArrayList<TimeSlot> timeSlotList = new ArrayList<TimeSlot>();
		timeSlotList.add(new TimeSlot(
			"00:00 AM \n to \n 01:00 AM", 
			"./assets/svg/bright-moon.svg",
			true
		));
		timeSlotList.add(new TimeSlot(
			"00:00 AM \n to \n 01:00 AM", 
			"./assets/svg/bright-moon.svg",
			false
		));

		User user;
		user = new User(
			"User", 
			timeSlotList, 
			timeSlotList
		);

		/**
		 * Description
		 * Deling with the houseHold Agent users
		 * 
		 * =======================================
		 * 				FAKE USER
		 * =======================================
		*/
		ArrayList<TimeSlot> userAgentSelectedTimeSlots;
		ArrayList<TimeSlot> userAgentAllocatedTimeSlots;
		ArrayList<User> householdUsers = new ArrayList<User>();

		int counter = 1;
  
        // assuming there are Fake 4 Agents...
        while (counter <= 4) {

			/**
			 * Assign new Timeslots for the FakeUser,
			 * their `Selected Options`,
			*/
			userAgentSelectedTimeSlots = new ArrayList<TimeSlot>();
			userAgentSelectedTimeSlots.add(new TimeSlot(
				"00:00 AM \n to \n 01:00 AM", 
				"./assets/svg/bright-moon.svg",
				false
			));
			userAgentSelectedTimeSlots.add(new TimeSlot(
				"00:00 AM \n to \n 01:00 AM", 
				"./assets/svg/bright-moon.svg",
				true
			));

			/**
			 * Assign new Timeslots for the FakeUser,
			 * their `Allocated Options`,
			*/
			userAgentAllocatedTimeSlots = new ArrayList<TimeSlot>();
			userAgentAllocatedTimeSlots.add(new TimeSlot(
				"00:00 AM \n to \n 01:00 AM", 
				"./assets/svg/bright-moon.svg",
				true
			));
			userAgentAllocatedTimeSlots.add(new TimeSlot(
				"00:00 AM \n to \n 01:00 AM", 
				"./assets/svg/bright-moon.svg",
				true
			));

			/**
			 * Assign a new User to the List of FakeUsers, 
			*/
			householdUsers.add(new User(
				"Household " + counter,
				userAgentSelectedTimeSlots,
				userAgentAllocatedTimeSlots
			));
  
            /**
			 * Increment the value of x for
			 * next iteration
			*/
            counter++;
        };

		/**
		 * Description:
		 * Declaring the Simulation Variables,
		 * and assigning them to the class
		*/
		ResponseJSON jsonRes;
		jsonRes = new ResponseJSON(
			80,
			user,
			householdUsers
		);

		/**
		 * Decalre the JSON Object,
		 * using GSON()
		*/
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		/**
		 * Convert the Object Class
		 * to a JSON format,
		 * using GSON()
		*/
		String json = gson.toJson(jsonRes);

		/**
		 * Send back the data to the website,
		 * in the form of a JSON Object, 
		*/
		return json;
	}
}