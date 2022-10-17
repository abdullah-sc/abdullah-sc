package assign;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

//import ffp.Revesion;

class MethodTest {
 
	@Test
	void testsortUserbyRating() {
		
		ArrayList<User> users= new ArrayList<User>();
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
		   UserSet.sortUserbyRating(users);
		assertEquals(1.5,users.get(0).getRating());
		assertEquals(1.7,users.get(1).getRating());
		assertEquals(2.0,users.get(2).getRating());
		assertEquals(2.3,users.get(3).getRating());
		assertEquals(3.0,users.get(4).getRating());
		assertEquals(3.1,users.get(5).getRating());
		assertEquals(3.7,users.get(6).getRating());
		assertEquals(4.1,users.get(7).getRating());
		assertEquals(4.5,users.get(8).getRating());
		assertEquals(5.0,users.get(9).getRating());
		
		UserSet.sortUserbyRating(users);
		// again for reverse order
		assertEquals(5.0,users.get(0).getRating());
		assertEquals(4.5,users.get(1).getRating());
		assertEquals(4.1,users.get(2).getRating());
		assertEquals(3.7,users.get(3).getRating());
		assertEquals(3.1,users.get(4).getRating());
		assertEquals(3.0,users.get(5).getRating());
		assertEquals(2.3,users.get(6).getRating());
		assertEquals(2.0,users.get(7).getRating());
		assertEquals(1.7,users.get(8).getRating());
		assertEquals(1.5,users.get(9).getRating());
		
	}

	@Test
	void testduplicateAppointmentss() {
		 ArrayList<Appointment> appointments = new ArrayList<Appointment>();
			appointments.add(new Appointment("assignment",11,9,2019,7,10,"Ricky","Tarun"));//*//0
			appointments.add(new Appointment("work",25,8,2019,10,15,"Rocky","Molly"));//1
			appointments.add(new Appointment("job",25,8,2019,7,20,"Omair","Ashim"));//2
			appointments.add(new Appointment("prospectus",25,8,2019,14,19,"Tariq","Ahmad"));//3
			appointments.add(new Appointment("assemlby",11,9,2019,15,30,"Timm","Douglas"));///4
			appointments.add(new Appointment("teacher",11,9,2019,19,45,"Ricky","Molly"));///5
			appointments.add(new Appointment("plumber",11,9,2019,11,55,"Ricky","Rocky"));///6
			appointments.add(new Appointment("freelancing",9,6,2019,13,50,"Rocky","Tarun"));// //7
			appointments.add(new Appointment("approval",9,6,2019,9,45,"Ashim","Hansel"));// //8
			appointments.add(new Appointment("employment",9,6,2019,16,30,"Omair","Hansel"));// //9
			appointments.add(new Appointment("approval",21,9,2019,10,35,"Tariq","Timm"));// // //10
			appointments.add(new Appointment("tutor",21,9,2019,12,10,"Tariq","Douglas"));// // //11
			appointments.add(new Appointment("employment",21,9,2019,8,30,"Omair","Hansel"));// // //12
			appointments.add(new Appointment("approval",11,9,2019,14,35,"Tariq","Timm"));//*//13
			appointments.add(new Appointment("tutor",11,9,2019,10,10,"Tariq","Douglas"));//*//14
			appointments.add(new Appointment("student",11,9,2019,12,20,"Ahmad","Timm"));//*//15
			appointments.add(new Appointment("labour",10,9,2020,11,25,"Ahmad","Douglas"));// /16
			
			appointments.add(new Appointment("Siege",10,9,2020,18,20,"Tariq","Ahmad"));//17
			appointments.add(new Appointment("student",11,9,2019,12,20,"Ahmad","Timm"));//*// 18
			appointments.add(new Appointment("labour",10,9,2020,11,25,"Ahmad","Douglas"));// / 19
			
			appointments.add(new Appointment("Siege",10,9,2020,18,20,"Tariq","Ahmad"));// /20
			
			ArrayList<Appointment> toppin= new ArrayList<Appointment>();
			Appointment p =appointments.get(15);
			Appointment q =appointments.get(17);
			Appointment r =appointments.get(19);
			toppin.add(p);
			toppin.add(q);
			toppin.add(r);
			ArrayList<Appointment> garlic=AppointmentSet.duplicateAppointmentss(appointments);
			
			assertEquals(toppin.get(1),garlic.get(1));
			assertEquals(toppin.get(2),garlic.get(2));
			assertEquals(toppin.get(0),garlic.get(0));
		}
	
		
	}
	



