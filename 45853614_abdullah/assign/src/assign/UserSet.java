package assign;

import java.util.ArrayList;

public class UserSet {
	
	ArrayList<User> users= new ArrayList<User>();
	
	/**
	 * The constructor for the UserSet class 
	 * creates an  arrayList of users and adds 11 users to the list
	 * * Time Complexity: O(n*n) (Worst Case)
	 * Time Complexity : O(n) (best Case) 
	 * 
	 */
	public UserSet() {
		users.add(new User("Ricky","ricky0","ricky@gmail.com","blacktown","English",2.0));
		users.add(new User("Molly","molly1","molly@gmail.cpom","blacktown","Italian",1.5));
		users.add(new User("Rocky","rocky2","rocky@gmail.com","blacktown","English",1.7));
		users.add(new User("Tarun","tarun3","tarun@gmail.com","blacktown","English",4.5));
		users.add(new User("Omair","omair4","omair@gmail.com","rootyhill","Hindi",3.7));
		users.add(new User("Ashim","ashim5","ashim@gmail.com","rootyhill","Hindi",2.3));
		users.add(new User("Tariq","tariq6","tariq@gmail.com","epping","Hindi",3.1));
		users.add(new User("Ahmad","ahmad7","ahmad@gmail.com","epping","Italian",4.1));
		users.add(new User("Timm","tim8","tim@gmail.com","epping","Hindi",3.0));
		users.add(new User("Douglas","douglas9","douglas@gmail.cpom","epping","Italian",5.0));
		//users.add(new User("Hansel","Hansel9","Hansel@gmail.cpom","rootyhill","Italian",5.0));
	}
	/**
	 * 
	 * @param users takes a list of users to search for 
	 * 
	 * @param target String to look of
	 * @return  returns the user object  whose username matches the target
	 * Time Complexity : O(n) (Best Case)
	 * Time Complexity : O(n) (Worst Case)
	 * 
	 */
	
	public User getMatch(ArrayList<User> users,String target) {
		User p= new User();
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUserName().equals(target)) {
				p=users.get(i);
			}
		}
		return p;
		
	}
	/**
	 * 
	 * @param users Takes the arraylist of users to search for 
	 * @param obj A user obj to compare 
	 * @return   Returns an ArrayList of users whose suburb equals to the obj suburb
	 * Time Complexity: O(n) best Case
	 * Time Complexity :O(n) worst Case
	 */
	
	public ArrayList<User> Nearby(ArrayList<User> users,User obj){
		ArrayList<User>  pgh= new ArrayList<User>();
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getSuburb().equals(obj.getSuburb())) {
				pgh.add(users.get(i));
			}
		}
		return pgh;
		
	}
	
	/**
	 * 
	 * @param users an ArrayList of user objects to search for 
	 * @param Username2   a string to check for
	 * @return returns true if the username2 string equals to the username of any user object in the
	 * users list false otherwise
	 * Time Complexity: O(n) (worst case)
	 * Time Complexity : O(1) (best case)
	 */
	
	
	
	
	
	public boolean loginUs22(ArrayList<User> users,String Username2) {
		for(int i=0;i<users.size();i++){
			if(users.get(i).getUserName().equals(Username2)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @param users An arrayList of user objects to search for 
	 * @param Username1 a string to look for in the list
	 * @return true if the username equals to the username of any user object
	 * false otherwise
	 * Time Complexity: O(n) worst case
	 * Time Complexity : O(1) best Case
	 */
	public boolean loginUs11(ArrayList<User> users,String Username1) {
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUserName().equals(Username1)) {
				return true;
			}
		}
		return false;
		
	}
	/**
	 * 
	 * @param username the username of the user to check
	 * @param password the password  of the user to check
	 * @return  true if the password and the username are correct false otherwise
	 * Time Complexity : O(n) (worst case)
	 * Time Complex: O(1) best case
	 */
	public  boolean login(String username, String password) {
		// Make a loop
		
		// Check if the user has the same username and password
		for(User u:users) {
			if(u.logind(username, password)) {
				return true;
			}
		}
		
		return false;
	}
	/**
	 * 
	 * @param users  the arraylist of  the type User to sort
	 * 
	 * . Sorts the arrayList of the users by the first character of their username
	 * . 
	 * . if the list is in descending order it sorts it in ascending order 
	 * Time Complexity : O(n)( best case ) if the list is already sorted 
	 * Time Complexity: O(n*n) ( worst case)
	 */
	
	public  void sortUserbyName(ArrayList<User> users) {
		for(int i=1;i<users.size();i++) {
			User backup= users.get(i);
			int k=i-1;
			while(k>=0 && (users.get(k).getUserName().charAt(0)>backup.getUserName().charAt(0)  )) {
				users.set(k+1, users.get(k));
				k--;
			}
		
			users.set(k+1, backup);
			
		}
	}
	/**
	 * 
	 * @param users : the arrayList to be sorted
	 * 
	 *. Sorts the parramter ArrayList of users by their ratings both in ascending and descending orders
	 * . If the list is in ascending order then sorts it in descending order and if the list is in the descending 
	 * order then sorts the list in ascending order 
	 * Time Complexity :  O(n*n) best case 
	 * Time Complexity:O(n*n) worst case 
	 */
	
	public static  void sortUserbyRating(ArrayList<User> users) {
		boolean order = false;
		if(users.get(1).getRating()> users.get(0).getRating()) {
			order=true;
		}
		for (int i = 0; i < users.size(); i++) {
			int minIdx = i;
			for (int j = i + 1; j < users.size(); j++) {
				double a = users.get(minIdx).getRating();
				double b = users.get(j).getRating();
				if ((order&&(a<b)) || (!order&&(a>b)))
					minIdx = j;
			}
			User backup = users.get(i);
			users.set(i,users.get(minIdx));
               users.set(minIdx,backup);
		}
	}
	
	/**
	 * 
	 * @param users   the arrayList of users to be searched 
	 * @param target  the string to match with the arrayList
	 * @return  the arrayList of users whose usernames matched with the target string
	 * Time complexity: O(n) both best and worst case 
	 */
	
	public ArrayList<User> searchUserbyName(ArrayList<User>users,String target) {
		ArrayList<User>  result= new ArrayList<User>();
		
	   for(User item : users) {
		   if(item.getUserName().toLowerCase().contains(target.toLowerCase())) {
			   result.add(item);
		   }
		   }
		return result;
		}
	/**
	 * 
	 * @param users   users   the arrayList of users to be searched 
	 * @param target  the string to match with the arrayList
	 * @return  the arrayList of users whose suburbs matched with the target string
	 * Time Complexity : O(n) both  best and the worst case 
	 * 
	 */
	public ArrayList<User> searchUserbySuburb(ArrayList<User>users,String target) {
		ArrayList<User>  result= new ArrayList<User>();
		
	   for(User item : users) {
		   if(item.getSuburb().toLowerCase().contains(target.toLowerCase())) {
			   result.add(item);
		   }
		   }
		return result;
		}
	/**
	 * 
	 * @return  the instance ArrayList of the users
	 * Time Complexity : O(1)
	 */
	public ArrayList<User> getUsers(){
		return users;
	}
/**
 * 
 * @param list   The arrayLsit of users to be searched
 * @return   the user object who has the maximum rating 
 * Time Complexity : O(n) best and  worst case 
 */
	public User getMaxRating(ArrayList<User> list ) {
		User max=list.get(0);
		for(User item: list) {
			if(item.getRating()>max.getRating()) {
				max=item;
			}
		}
	return max;
	}
	/**
	 * 
	 * @param list   the arrayLsit of the users to be searched 
	 * @return   the user object who has the minimum rating 
	 * Time Complexity :O(n)  both and worst case 
	 * 
	 */
	
	public User getMinRating(ArrayList<User> list) {
	  User min =list.get(0);
	  for(User item: list) {
		  if(item.getRating()<min.getRating()){
			  min=item;
		  }
	  }
	  return min;
	}
	/**
	 * 
	 * @param max   the maximum amount the rating can be
	 * @param min   the minimum amount the rating can be 
	 * @return     an ArrayList of users having the ratings  within the range min and max
	 * Time Complexity: O(n) best and worst case  
	 */
	public ArrayList<User> findUserRating(double max,double min){
		ArrayList<User>  result= new ArrayList<User>();
		for(int i=0;i<users.size();i++) {
		if(users.get(i).getRating()>=min && users.get(i).getRating()<=max) {
			result.add(users.get(i));
			}
		}
		return result;
	}
	/**
	 * 
	 * @param i   the  index of the object in the  instance arrayList of users
	 * @return    the User object at index i
	 * Time Complexity : O(1)
	 */
	public  User getUser(int i) {
		return users.get(i);
	}
	/**
	 * 
	 * @return  the instance arrayList of the users converted to an array 
	 * Time Complexity :O(n) best and worst case 
	 */
	public User[] toArray() {
		User[] arr= new User[users.size()];
		for(int i=0;i<users.size();i++) {
			arr[i]=users.get(i);
		}
		return arr;
	}
	
}