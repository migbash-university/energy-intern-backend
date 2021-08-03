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
public class ResponseJSON {

    Logger logger = LoggerFactory.getLogger(ResponseJSON.class);

    private int percentageTimeSlotsSatisfied;  // percetage of the users satisfied for their selected time-slots
	private User userData; 					   // holdes a single JSON Object Instance of the USER DATA `{...}`
	private ArrayList<User> householdData;     // holdes a single JSON Object Instance of the USER DATA `{...}`

	/**
	 * Class Constructor 
	 * 0 Arguments
	 * @return
	*/
	public ResponseJSON() {}

	/**
	 * Class Constructor 
	 * 3 Arguments
	 * @return
	*/
	public ResponseJSON(
		int percentageTimeSlotsSatisfied,
		User userData,
		ArrayList<User> householdData ) {
		
		this.percentageTimeSlotsSatisfied = percentageTimeSlotsSatisfied;
		this.userData = userData;
		this.householdData = householdData;
	}

	/**
	 * CLASS Getters
	 * @return
	*/

	public int getPercentageTimeSlotsSatisfied() { return percentageTimeSlotsSatisfied; }
	public User getUserData() { return userData; }
	public ArrayList<User> getHouseholdData() { return householdData; }

	/**
	 * CLASS Setters
	 * @return
	*/

	public void setPercentageTimeSlotsSatisfied(int num) { this.percentageTimeSlotsSatisfied = num; }
	public void setUserData(User userData) { this.userData = userData; }
	public void setHouseholdData(ArrayList<User> householdData) { this.householdData = householdData; }
}