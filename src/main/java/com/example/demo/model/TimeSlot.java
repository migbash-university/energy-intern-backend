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
public class TimeSlot {
	
	private String time;	   // a timeslot in the format - "00:00 AM \n to \n 01:00 AM"
	private String image;	   // image for the target timeslot, in the format - ("./assets/svg/bright-moon.svg" OR "./assets/svg/image2vector.svg")
	private Boolean preferred; // determines whether the time-slot was a preferred OR not (TRUE/FALSE)

	/**
	 * Class Constructor 
	 * 0 Arguments
	 * @return
	*/
	public TimeSlot() {}

	/**
	 * Class Constructor 
	 * 2 Arguments
	 * @return
	*/
	public TimeSlot(
		String time,
		String image,
		Boolean preferred) {
		
		this.time = time;
		this.image = image;
		this.preferred = preferred;
	}

	public String getTime() {
		return this.time;
	}
}