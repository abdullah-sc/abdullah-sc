package assign;

public class Appointment {
	/**
	 * Instance variables  
	 */
	private String username1;
	private String username2;
private String name;
private int day ;
private int month;
private  int year;
private String date;
private String time;
private int hours;
private int minutes;
/**
 * 
 * @return returns the Instance String username1 
 * Time Complexity :  O(1) 
 */

public String getUsername1() {
	return username1;
}
/**
 * 
 * @return returns the Instance String username2
 * TimeComplexity : O(1) 
 *  
 */
public String getUsername2() {
	return username2;
}
/**
 * 
 * @return returns the String containing the instance Strings
 */
public String getUserNames() {
	return username1+" "+username2+" "+name+" On "+date +" at "+ time;
}
public void setUsername1(String username1) {
	this.username1=username1;
	
}
public void setUsername2(String username2) {
	this.username2=username2;
}
/**
 * 
 * @param name  the name to set for the appointment
 * sets the instance string name to the parrameter string name
 * Time Complexity : O(1) 
 * 
 */
public void setAppointmentName(String name) {
	
	this.name=name;
}
/**
 * 
 * @return the instance string name
 * Time Complexity : O(1)
 */
public String getAppointmentName() {
	return name;
}
/**
 * The default Constructor for appointment class  for initializing the appointment object and setting in to null
 * Time Complexity :  O(1)
 */
public Appointment() {
	
}
/**
 * 
 * @param day   integer to set the   instance variable day
 * @param month integer to set the intance variable month 
 * @param year   integer to set the instance variable year
 * if the day>30 or day<1 it sets the day to 0
 * , if the month is greater than 12 or lesser than 1 it sets it to 0
 * , if the year is lesser than 2019 or greater than 2020 it sets the year to zero
 * @see   after setting day month year it then sets the instance String date in the order day/month/year
 * Time Complextiy : O(1) 
 */
public void setDate(int day,int month,int year) {
	if(day>30 || day<1 ) {
		day=0;
		}
	if(month>12 || month<1) {
		month=0;
	}
	if(year>2020 || year<2019) {
		year=0;
	}
	this.day=day;
	this.month=month;
	this.year=year;
	date= this.day+"/"+this.month+"/"+this.year;
	}
/**
 * 
 * @return  returns the instance string date 
 * Time Complexity : O(1)
 */
public String getDate() {
	
	return date;
}
/**
 * 
 * @param hours  integer to set the instance variable hours
 * @param minutes integer to set the instance variable minutes
 * if the hours is less than zero or greater than 24 it sets hours to zero 
 * if the minuted are greater than 60 or lesser than 0 it sets  minutes to zero 
 * @see after setting hours and minutes it then sets the instance string time in the order hours : minutes
 * Time Complexity : O(1)
 */
public void setTime(int hours,int minutes) {
	if(hours<0 || hours>24) {
		hours=0;
	}
	if(minutes<0 || minutes>60) {
		minutes=0;
	}
	this.hours=hours;
	this.minutes=minutes;
	time=this.hours+" : "+ this.minutes;
}
/**
 * 
 * @return the instance string time
 * Time Complexity : O(1) 
 */
public String getTime() {
	return time;
}
/**
 * The constructor for the appointment class
 * 
 * @param name   the name of the appointment 
 * @param day    the day of the appointment 
 * @param month  the month of the appointment
 * @param year   the year of the appointment 
 * @param hoursn  the appointment hour 
 * @param minutes the appointment minute 
 * 
 * @see sets the instance variables name, day, month, year , hours,minutes, date, time,username1 ,username2
 * Time Complexity : O(1)
 */
public Appointment(String name,int day,int month,int year,int hours,int minutes,String username1,String username2) {
	setAppointmentName(name);
	setDate(day,month,year);
	setTime(hours,minutes);
	setUsername1(username1);
	setUsername2(username2);
}
/**
 * @ return a string containing instance variables date and time, both the variables concatenanted in a string
  * Time Complexity : O(1)
 */
public String toString() {
	return name+" On "+date +" at "+ time+" "+username1+" "+username2;
}

}

