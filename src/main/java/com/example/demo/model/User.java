package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Class Model for "Block(s)"
 * holds the modal structure for a block in 
 * the "blockmatrix"
 */

@Component
public class User {

	private String id; 									// A simple user ID for people to identify themselves with, ("User" || "Household X")
	private ArrayList<TimeSlot> selectedTimeSlots;		// Contains the User SELECTED Timeslots
	private ArrayList<TimeSlot> allocatedTimeSlots;		// Contains the User ALLOCATED BY THE ALGORITHM Timeslots

	/**
	 * Class Constructor 
	 * 0 Arguments
	 * @return
	*/
	public User() {}
	
	/**
	 * Class Constructor 
	 * 3 Arguments
	 * @return
	*/
	public User(
		String id, 
		ArrayList<TimeSlot> selectedTimeSlots, 
		ArrayList<TimeSlot> allocatedTimeSlots ) {

		this.id = id;
		this.selectedTimeSlots = selectedTimeSlots;
		this.allocatedTimeSlots = allocatedTimeSlots;
	}

}