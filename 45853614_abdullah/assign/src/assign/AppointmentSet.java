package assign;

import java.util.ArrayList;

public class AppointmentSet {
 ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
 /**
	 * The constructor for the AppointmentSet class 
	 * creates an  arrayList of appointments and adds 16 appointment objects to the list
	 * TimeComplexity : O(1)  as time complexity to create each of the appointment objects is one
	 * 
	 */
public AppointmentSet() {
	appointments.add(new Appointment("assignment",11,9,2019,7,10,"Ricky","Tarun"));//*//
	appointments.add(new Appointment("work",25,8,2019,10,15,"Rocky","Molly"));//
	appointments.add(new Appointment("job",25,8,2019,7,20,"Omair","Ashim"));//
	appointments.add(new Appointment("prospectus",25,8,2019,14,19,"Tariq","Ahmad"));//
	appointments.add(new Appointment("assemlby",11,9,2019,15,30,"Timm","Douglas"));///
	appointments.add(new Appointment("teacher",11,9,2019,19,45,"Ricky","Molly"));///
	appointments.add(new Appointment("plumber",11,9,2019,11,55,"Ricky","Rocky"));///
	appointments.add(new Appointment("freelancing",9,6,2019,13,50,"Rocky","Tarun"));// //
	appointments.add(new Appointment("approval",9,6,2019,9,45,"Ashim","Hansel"));// //
	appointments.add(new Appointment("employment",9,6,2019,16,30,"Omair","Hansel"));// //
	appointments.add(new Appointment("approval",21,9,2019,10,35,"Tariq","Timm"));// // //
	appointments.add(new Appointment("tutor",21,9,2019,12,10,"Tariq","Douglas"));// // //
	appointments.add(new Appointment("employment",21,9,2019,8,30,"Omair","Hansel"));// // //
	appointments.add(new Appointment("approval",11,9,2019,14,35,"Tariq","Timm"));//*//
	appointments.add(new Appointment("tutor",11,9,2019,10,10,"Tariq","Douglas"));//*//
	appointments.add(new Appointment("student",11,9,2019,12,20,"Ahmad","Timm"));//*//
	appointments.add(new Appointment("labour",10,9,2020,11,25,"Ahmad","Douglas"));// /
	
	appointments.add(new Appointment("Siege",10,9,2020,18,20,"Tariq","Ahmad"));
	appointments.add(new Appointment("student",11,9,2019,12,20,"Ahmad","Timm"));//*//
	appointments.add(new Appointment("labour",10,9,2020,11,25,"Ahmad","Douglas"));// /
	
	appointments.add(new Appointment("Siege",10,9,2020,18,20,"Tariq","Ahmad"));// /
    
}
/**
 * 
 * @param appointments An ArrayList of appointments to search for 
 * @param username The String to check for 
 * @return an ArrayList of username Strings of the users who are free at a particular time 
 *@ see  It checks the availability of the user who do not have an appointment at a particular appointment time of the user who logged in
 * Time Complexity : O(n*n) for both the best and the worst cases
 */
public ArrayList<String> goofsearch(ArrayList<Appointment> appointments,String username){
	ArrayList<String> hg= new ArrayList<String>();
	ArrayList<Appointment> folly= searchbyfname(appointments,username);
	for(int i=0;i<appointments.size();i++) {
		for(int j=0;j<folly.size();j++) {
		if(appointments.get(i).getDate().equals(folly.get(j).getDate()) && j!=i) {
			if(!appointments.get(i).getTime().equals(folly.get(j).getTime())) {
				hg.add(appointments.get(i).getUsername1());
			}
		}
	}
	}
	return hg;
}
/**
 * 
 * @param appointments an arrayList of appointments to search for 
 * @param target a String to check for 
 * @return  returns an arrayList of appointmetns whose username1 contains target
 * Time Complexity: O(n) for both the best and the worst cases 
 */


public ArrayList<Appointment> searchbyfname(ArrayList<Appointment> appointments , String target){
	ArrayList<Appointment> hog= new ArrayList<Appointment>();
	for(int i=0;i<appointments.size();i++) {
		if(appointments.get(i).getUsername1().contains(target)) {
			hog.add(appointments.get(i));
		}
	}
	
	return hog;
	
}
/**
 * 
 * @param appointments an ArrayList of appointments to check for 
 * @param target A  String to look for in the the list of appointments 
 * @return an ArrayList of appointments whose name contain the target string 
 * Time Complexity: O(n) For both best and the worst cases
 */

public ArrayList<Appointment> searchAppointments(ArrayList<Appointment> appointments,String target){
	ArrayList<Appointment> hog= new ArrayList<Appointment>();
	for(int i=0;i<appointments.size();i++) {
		if(appointments.get(i).getAppointmentName().contains(target)) {
			hog.add(appointments.get(i));
		}
	}
	
	return hog;
}

/**
 * 
 * @return   returns an arrayList of instance appointments 
 * Time Complexity : O(1)
 */



public ArrayList<Appointment> getAppointments(){
	return appointments;
}
/**
 * 
 * @param appointments AN arrayList of appointmentys to search for 
 * @param obj an appointment object to compare 
 * @return true if the date and time of the appointment object obj do not match the date and time of the other appointments 
 *Time Complexity : O(n) the worst case and (O)(1) the  best case
 */
public boolean addCheckAppointment( ArrayList<Appointment> appointments,Appointment obj) {
	//appointments=this.appointments;
	for(int i=0;i<appointments.size();i++) {
	if(appointments.get(i).getDate().equals(obj.getDate()) && appointments.get(i).getTime().equals(obj.getTime())) {
		
			return false;
		}
	}

	return true;
	
}
// remove appointments \
/**
 * 
 * @param appointments an ArrayList of Appointments to search for 
 * @return  returns a new arraylist puppy which has those appointment times whose time do not clash with the appointment of user(available appointments)
 * Time Complexity : =O(n*n) for both the best and the worst cases
 */
public static ArrayList<Appointment>  duplicateAppointmentss(ArrayList<Appointment> appointments) {
ArrayList<Appointment>	 puppy= new ArrayList<Appointment>();

for(int i=0;i<appointments.size();i++) {
	for(int j=0;j<appointments.size();j++) {
		if(appointments.get(i).getDate().equals(appointments.get(j).getDate()) && (appointments.get(i).getTime().equals(appointments.get(j).getTime())) ) {
			if(i!=j) {
				
			
				puppy.add(appointments.get(i));
				appointments.remove(i);}
			}
		}
	}
	

return puppy;
	
	
}






/**
 * 
 * @param appointments An array of appointments to add to 
 * @param pc   the appointment object to add
 * Time complexity O(1)
 */
public void addAppointment(ArrayList<Appointment> appointments,Appointment pc) {
	appointments.add(pc);
	
	this.appointments=appointments;
}
/**
 * 
 * @param i  the index of the appointment object to remove 
 * Removes the appointment object from the instance appointment ArrayList
 * Time complexity: O(1); 
 */
public void removeAppointment(int i) {
	appointments.remove(i);
}
/**
 * 
 * @param appointments  the instance ArrayList of appointments  to search for 
 * @param target  the appointment object to check for 
 * @return  true if two appointments are identical otherwise false
 * Time Complexity : O(n) for worst case AND O(1) for best case
 */
	public boolean  duplicateAppointment(ArrayList<Appointment> appointments, Appointment target) {
		for(int i=0;i<appointments.size();i++) {
			if(appointments.get(i).getDate().equals(target.getDate())) {
				if(appointments.get(i).getTime().equals(target.getTime())){
					return true;
				}
			}
			}
		return false;
		
	}
	/**
	 * 
	 * @param list   ArrayList of appointment objects to check 
	 * @See removes any duplicate appointment object if found
	 *TimeComplexity : O(n*n) for both best and worst cases 
	 *
	 */
	public void removeDuplicates(ArrayList<Appointment> list ) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).getDate().equals(list.get(j).getDate()) && list.get(i).getTime().equals(list.get(j).getTime())) {
				    list.remove(i);
				}
			}
		}
	}
	
}
