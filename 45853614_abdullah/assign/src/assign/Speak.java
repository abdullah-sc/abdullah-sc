package assign;

import java.util.ArrayList;

public class Speak {
	
	UserSet userSet;
	AppointmentSet appointmentSet;
	/**
	 * The constructor for the Speak class 
	 *  sets the instance  userSet  object of the UserSet Class
	 *  sets the instance appointmentSet object of the appointmentSet class
	 *  Time Complexity : O(n) (best case) because the time complexity of a userset object is O(n) as a best case 
	 * Time Complexity : O(n*n) ( the worst case) because the worst case time complexity of a userset object is O(n*n) 
	 */
	public Speak() {
		this.userSet= new UserSet();
	this.appointmentSet=new AppointmentSet();
	}
	
	/**
	 * 
	 * @return returns the instance UserSet object
	 * Time complexity O(1)
	 * 
	 */
	
	public UserSet getUserSet() {
		return userSet;
	}
	/**
	 * 
	 * @return returns the instance AppointmentSet object
	 * Time Complexity O(1)
	 */
	public AppointmentSet getAppointmentSet() {
		return appointmentSet;
	}
}
