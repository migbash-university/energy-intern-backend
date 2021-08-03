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
public class RequestBodyObj {

	private ArrayList<TimeSlot> userSelectedTimeSlots;

	/**
	 * Class Constructor 
	 * 0 Arguments
	 * @return
	*/
	RequestBodyObj() {}

	/**
	 * Class Constructor 
	 * 1 Arguments
	 * @return
	*/
	RequestBodyObj(ArrayList<TimeSlot> userSelectedTimeSlots) {
		this.userSelectedTimeSlots = userSelectedTimeSlots;
	}
}