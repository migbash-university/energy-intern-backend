/**
 * 
 */
package resource_exchange_arena;

import java.util.ArrayList;

/**
 * @author Simon Powers
 * Interface to run and retrieve results from an energy
 * exchange simulation.
 */
public interface Simulation {

	/**
	 * Call this to run the simulation.
	 * @param userTimeslotPreferences a comma separated String of the user's preferences, of
	 *        the form timeslit1,timeslot2,timeslot3 etc, where timeslot varies from 0 to 23.
	 * @param numAgents the total number of agents in the simulation (including the user).
	 * @param timeslotsPerAgent the number of timeslots each agent requests.
	 */
	public void run(String userTimeslotPreferences, int numAgents, int timeslotsPerAgent);
	
	/**
	 * Gets the allocations of the other user, after the algorithm has run.
	 * @return the timeslots allocated to the user, as a comma separated String:
	 *         timeslot1,timeslot2 etc.
	 */
	public String getUserAllocation();
	
	/**
	 * Gets the preferences of the other simulated agents so they can be displayed.
	 * @return an ArrayList of the other agents' preferences. Each element contains one agent's
	 * 		   preferences as a comma separated String.
	 */
	public ArrayList<String> getOtherAgentsPreferences();
	
	/**
	 * Gets the allocations of the other simulated agents so they can be displayed.
	 * @return an ArrayList of the other agents' allocations after the algorithm has run. 
	 * 		   Each element contains one agent's allocations as a comma separated String.
	 */
	public ArrayList<String> getOtherAgentsAllocations();
}
