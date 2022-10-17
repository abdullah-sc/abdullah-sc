package assign;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
	
    private double rating;
	private String username;//
	private String password;//
	private boolean check;
	private String email;//
	private int contact;
	private String suburb;//
	private String language;  //
    private boolean admin;
    
    /**sets the instance variable (username) to username( the string entered);
     * 
     * @param username : The string username to set the instance varible username
     * 
     *  Time complexity: O(1) (the O notation);
     *  
     *  
     *  
     */
    
    
	public void setUserName(String username) {
		if (username.length() < 4 || username.length() > 14) {
			username = "DefaulUser";
		}
		this.username = username;

	}

	/**
	 * Sets the instance variable password of the user to password 
	 * 
	 * @param password : the String password to set instance variable password
	 * 
	 * if the length of the password is then 3 characters or if the password does not contain any number 
	 * it sets it to username123
	 * Time Complexity: O(n*n) because of helper method checknum (Worst Case)
	 * Time Complexity: O(1) best case
	 */

	public void setPassword(String password) {
		if (password.length() < 3 || !checkNum(password)) {
			password = username + "123";
		}
		this.password = password;

	}
	/**
	 * 
	 * 
	 * @return  return the instance String suburb of the user
	 * Time complexity : O(1)
	 */
	
	public String getSuburb() {
		return suburb;
	}
/**
 * 
 * @param suburb : the string suburb to be used to set the suburb of the user
 * 
 * sets the instance variable suburb to the parrameter suburb
 * 
 * if the parrameter String suburb is less than one character or if it contains any digits 
 * it sets the suburb to default
 * Time Complexity: O(n)  where n is the size of the string (best case)
 * Time Complexity : O(n) (worst case)
 */
	public void setSuburb(String suburb) {
		for (int i = 0; i < suburb.length(); i++) {
			if (suburb.length() < 1 || Character.isDigit(suburb.charAt(i))) {
				suburb = "default";
			}
		}

		this.suburb = suburb;

	}
	/**a helper method
	 * 
	 * @param num : the string to check for any numbers 
	 * 
	 * @return true if the parameter String contains any number returns false otherwise
	 * TimeComplexity: O(n*n) (worst case)
	 * Time Complexity : O(1) (best case)
	 * 
	 */

	public boolean checkNum(String num) {    // validation helper method
		String n = "0123456789";
		for (int i = 0; i < num.length(); i++) {
			for (int j = 0; j < n.length(); j++) {
				if (num.charAt(i) == n.charAt(j)) {
					return true;
				}
			}
		}
		return false;

	}
	/**
	 * 
	 * @param username : the username of the user to check 
	 * @param password  : the passowrd of the user to check
	 * @return  true if the username and password entered are correct, false otherwise
	 * TimeComplexity : O(1) constant
	 */
	

	public  boolean logind(String username,String password) {  // validation algorithm
		if (this.username.equals(username)&&this.password.equals(password)) {
			return true;
		}
		return false;
	}
/**
 * 
 * @return  the email of the user
 * Time Complexity O(1) 
 */
	public String getEmail() {
		return email;
	}
/**

 * @param email the string email to set the instance string email of the user 
 * 
 * 
 * if the string does not contain '@' sets the parameter string to "default@mail.com"
 * Time Complexity : O(n) where n is the length of the string email ( best case)
 * Time Complexity: O(n) worst case
 */
	public void setEmail(String email) {
		boolean check=false;
		char[] arr= email.toCharArray();
		for(int i=0; i<email.length();i++) {
			if(arr[i]=='@') {
				check=true;
			}
		}
		if(check==false) {
			email="default@mail.com";
		}
		
		
		this.email=email;
		
	}
	/**
	 * 
	 * @return : the  username of the user
	 * Time Complexity: O(1)
	 * 
	 */
	public String  getUserName() {
		return username;
	}
	/**
	 * 
	 * @param language  the parrameter string to set the language of the user
	 * 
	 *   if the parameter String language contains any numbers sets it "Default"
	 *   Time Complexity: O(1)
	 */
	public void setLanguage(String language) {
		if(checkNum(language)) {
			language="Default";
		}
		this.language=language;
		}
	
	/**
	 * 
	 * @return : the language of the user
	 * Time Complexity: O(1)
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * the default constructor sets the user object to  null
	 * Time Complexity O(1)
	 
	 */
	
	
	public User() {
		
		
	}
	
	
	
	/**
	 * The constructor of the user class 
	 * 
	 * @param username the username of the user to set
	 * @param password  the password of the user to set
	 * @param email     the email of the user to set
	 * @param suburb    the suburb of the user to set 
	 * @param language  the language of the user to set
	 * @param rating    the rating of the user to set
	 * 
	 * sets the instance variables username,password, email,suburb,language, rating of the user
	 * Time Complexity: O(n*n) because we only care about the highest power of n ( Worst case)
	 * Time Complexity : O(n) (best Case) because in the setsuburb method the best and the worst case time complexity is the same
	 * This is the same for setemail method as well
	 * 
	 * 
	 */
	public User(String username,String password,String email,String suburb,String language,double rating) {
		setUserName(username);
		setPassword(password);
		setEmail(email);
		setSuburb(suburb);
		setLanguage(language);
		setRating(rating);
	}
	/**
	 * return : a string containing username, email, suburb,language of the user 
	 *        it concatenates the instance variables username ,email, suburb,language
	 *        of the users and returns the whole string
	 *  Time Complexity: O(1)
	 */
	public String toString() {
		return username+" " +email+" "+suburb+" "+language; 
	}
	/**
	 * 
	 * @param rating : a double rating to set the rating of the user 
	 * 
	 * if the rating is less than 0 it sets it to 0
	 * if the rating is greater than 5 it sets it to 5
	 * Time Complexity: O(1)
	 */
	public void setRating(double rating) {
		if(rating<0) {
			rating=0;
		}else if(rating>5) {
			rating=5;
		}
		
		this.rating=rating;
		
	}
	
	/**
	 * 
	 * @return  returns the rating of the user
	 * Time Complexity O(1)
	 */
	public double getRating() {
		return rating;
	}
	

}
