package assign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JList;

public class Client {
     private Speak speak;
	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField txtMin;
	private JTextField txtMax;
	private JTextField textFieldSuburb;
    private UserSet users;
    private JTextField textFieldappname;
    private JTextField textFieldappday;
    private JTextField textFieldappmonth;
    private JTextField textFieldappyear;
    private JTextField textFieldapphours;
    private JTextField textFieldappminutes;
    private JTextField textField_1nameapp;
    private JTextField textField_1bub;
    private JTextField textField_1noob;
   // private ArrayList<User> bubble;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//bubble =speak.getUserSet().getUsers();
		users = new UserSet();
		speak = new Speak();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		login.setBackground(Color.ORANGE);
		frame.getContentPane().add(login, "name_85911101224379");
		login.setLayout(null);
		
		JPanel profile = new JPanel();
		profile.setBackground(Color.PINK);
		frame.getContentPane().add(profile, "name_85925790966179");
		profile.setLayout(null);
		
		JPanel searchUserPage = new JPanel();
		searchUserPage.setBackground(Color.GREEN);
		frame.getContentPane().add(searchUserPage, "name_93581142586382");
		searchUserPage.setLayout(null);
		
		
		JPanel suburbPage = new JPanel();
		suburbPage.setBackground(Color.CYAN);
		frame.getContentPane().add(suburbPage, "name_172072681788833");
		suburbPage.setLayout(null);
		
		JPanel SortUserPage = new JPanel();
		SortUserPage.setBackground(Color.CYAN);
		frame.getContentPane().add(SortUserPage, "name_174040756409254");
		SortUserPage.setLayout(null);
		
		
		JPanel mettingpage = new JPanel();
		frame.getContentPane().add(mettingpage, "name_196214442589790");
		mettingpage.setLayout(null);
		
		JList<User> list = new JList<User>();
		list.setFont(new Font("Tahoma", Font.PLAIN, 10));
		list.setBounds(10, 93, 424, 157);
		searchUserPage.add(list);
		
		JPanel addappointmentpage = new JPanel();
		frame.getContentPane().add(addappointmentpage, "name_164165928867597");
		addappointmentpage.setLayout(null);
		
		textFieldappname = new JTextField();
		textFieldappname.setBounds(100, 8, 110, 20);
		addappointmentpage.add(textFieldappname);
		textFieldappname.setColumns(10);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setBounds(10, 11, 80, 14);
		addappointmentpage.add(lblEnterName);
		
		JLabel lblEnterDay = new JLabel("Enter Day");
		lblEnterDay.setBounds(10, 39, 64, 14);
		addappointmentpage.add(lblEnterDay);
		
		textFieldappday = new JTextField();
		textFieldappday.setBounds(84, 36, 48, 20);
		addappointmentpage.add(textFieldappday);
		textFieldappday.setColumns(10);
		
		textFieldappmonth = new JTextField();
		textFieldappmonth.setBounds(251, 39, 59, 20);
		addappointmentpage.add(textFieldappmonth);
		textFieldappmonth.setColumns(10);
		
		JLabel lblEnterMonth = new JLabel("Enter Month");
		lblEnterMonth.setBounds(163, 39, 78, 14);
		addappointmentpage.add(lblEnterMonth);
		
		textFieldappyear = new JTextField();
		textFieldappyear.setBounds(94, 67, 59, 20);
		addappointmentpage.add(textFieldappyear);
		textFieldappyear.setColumns(10);
		
		JLabel lblEnterYear = new JLabel("Enter year");
		lblEnterYear.setBounds(10, 64, 62, 14);
		addappointmentpage.add(lblEnterYear);
		
		JLabel lblEnterHours = new JLabel("Enter Hours");
		lblEnterHours.setBounds(223, 11, 74, 14);
		addappointmentpage.add(lblEnterHours);
		
		textFieldapphours = new JTextField();
		textFieldapphours.setBounds(307, 8, 80, 20);
		addappointmentpage.add(textFieldapphours);
		textFieldapphours.setColumns(10);
		
		textFieldappminutes = new JTextField();
		textFieldappminutes.setBounds(307, 73, 80, 20);
		addappointmentpage.add(textFieldappminutes);
		textFieldappminutes.setColumns(10);
		
		JLabel lblcheckwork = new JLabel("something is wrong");
		lblcheckwork.setBounds(125, 134, 188, 34);
		addappointmentpage.add(lblcheckwork);
		lblcheckwork.setVisible(false);
		
		
		JList<Appointment> listcurrentappshow = new JList<Appointment>();
		listcurrentappshow.setBounds(10, 179, 397, 71);
		addappointmentpage.add(listcurrentappshow);
		
		
		JLabel lblEnterMinutes = new JLabel("Enter minutes");
		lblEnterMinutes.setBounds(196, 76, 87, 14);
		addappointmentpage.add(lblEnterMinutes);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name= textFieldappname.getText();
				String username1=textField_1bub.getText();
				String username2=textField_1noob.getText();
				int  day=Integer.parseInt(textFieldappday.getText());
				int month=Integer.parseInt(textFieldappmonth.getText());
				int  year=Integer.parseInt(textFieldappyear.getText());
				int hours=Integer.parseInt(textFieldapphours.getText()); 
				int minutes=Integer.parseInt(textFieldappminutes.getText());
				Appointment pc= new Appointment(name,day,month,year,hours,minutes,username1,username2);
				ArrayList<Appointment> good= speak.getAppointmentSet().getAppointments();
				ArrayList<User>  foof= speak.getUserSet().getUsers();
				boolean horrible= speak.getUserSet().loginUs11(foof, username1);
				boolean possible=speak.getUserSet().loginUs22(foof, username2);
				if(speak.getAppointmentSet().addCheckAppointment(good,pc)==true && rightValue(horrible,possible)) {
					speak.getAppointmentSet().addAppointment(good,pc);
					Appointment [] ff= new Appointment[1];
					ff[0]=pc;
					listcurrentappshow.setListData(ff);
				}else if
				(speak.getAppointmentSet().addCheckAppointment(good,pc)==false) {
					
					lblcheckwork.setVisible(true);
				}else if(rightValue(horrible,possible)==false) {
					
					lblcheckwork.setVisible(true);
				}
				
				//
				//
				//
				//
				//
				//textFieldappname.setText("");
			}
		});
		btnAdd.setBounds(318, 140, 89, 23);
		addappointmentpage.add(btnAdd);
		
		JButton btnGoBack_1 = new JButton("Go back");
		btnGoBack_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				addappointmentpage.setVisible(false);
				
				//
			}
		});
		btnGoBack_1.setBounds(1, 141, 89, 23);
		addappointmentpage.add(btnGoBack_1);
		
		JLabel lblUsername_2 = new JLabel("Username1");
		lblUsername_2.setBounds(10, 103, 64, 14);
		addappointmentpage.add(lblUsername_2);
		
		textField_1bub = new JTextField();
		textField_1bub.setBounds(88, 98, 96, 20);
		addappointmentpage.add(textField_1bub);
		textField_1bub.setColumns(10);
		
		textField_1noob = new JTextField();
		textField_1noob.setBounds(307, 103, 96, 20);
		addappointmentpage.add(textField_1noob);
		textField_1noob.setColumns(10);
		
		JLabel lblUsername_3 = new JLabel("Username2");
		lblUsername_3.setBounds(206, 101, 91, 14);
		addappointmentpage.add(lblUsername_3);
		
		
		
		
		//
		
		
		
		
		
		JLabel lblAllSpeak = new JLabel("All Speak");
		lblAllSpeak.setBounds(177, 0, 64, 20);
		searchUserPage.add(lblAllSpeak);
		
		JLabel lblSearchByUsername = new JLabel("Search By username");
		lblSearchByUsername.setBounds(10, 11, 101, 14);
		searchUserPage.add(lblSearchByUsername);
		
		textField = new JTextField();
		textField.setBounds(83, 31, 96, 20);
		searchUserPage.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername_1 = new JLabel("username");
		lblUsername_1.setBounds(20, 36, 58, 14);
		searchUserPage.add(lblUsername_1);
		
		JLabel lblSearchByRating = new JLabel("Search by rating");
		lblSearchByRating.setBounds(263, 11, 108, 14);
		searchUserPage.add(lblSearchByRating);
		
		txtMin = new JTextField();
		txtMin.setBounds(250, 31, 46, 20);
		searchUserPage.add(txtMin);
		txtMin.setColumns(10);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(220, 31, 21, 14);
		searchUserPage.add(lblMin);
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setBounds(316, 34, 31, 14);
		searchUserPage.add(lblMax);
		
		txtMax = new JTextField();
		txtMax.setBounds(344, 32, 68, 17);
		searchUserPage.add(txtMax);
		txtMax.setColumns(10);
		
		JButton btnSearchRating = new JButton("search");
		btnSearchRating.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 double min=Double.parseDouble(txtMin.getText());
			 double max= Double.parseDouble(txtMax.getText());
			 ArrayList<User> users = speak.getUserSet().findUserRating(max, min);
			 list.setListData(users.toArray(new User[users.size()] ));
		
			}
		});
		btnSearchRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchRating.setBounds(326, 59, 89, 23);
		searchUserPage.add(btnSearchRating);
		
		JLabel lblSearchResultsUserName = new JLabel("Search Results");
		lblSearchResultsUserName.setBounds(10, 76, 89, 18);
		searchUserPage.add(lblSearchResultsUserName);
		
	
		//ArrayList<User> results
		list.setListData(getArray(speak.getUserSet().getUsers()));
		
		JButton btnsearchUser = new JButton("search");
		btnsearchUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username= textField.getText();
				User[] cust= getArray(speak.getUserSet().searchUserbyName(speak.getUserSet().getUsers(),username ));
				list.setListData(cust);
				txtUserName.setText("");
			}
		});
		btnsearchUser.setBounds(83, 59, 89, 23);
		searchUserPage.add(btnsearchUser);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				searchUserPage.setVisible(false);
			}
		});
		btnGoBack.setBounds(188, 59, 89, 23);
		searchUserPage.add(btnGoBack);
		//list.setListData(getArray(speak.getUserSet().getUsers()));
		

		JButton btnLookForUsers = new JButton("Search For Users");
		btnLookForUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(false);
				searchUserPage.setVisible(true);
			}
		});
		btnLookForUsers.setBounds(10, 27, 145, 44);
		profile.add(btnLookForUsers);
		
		JButton btnsortUsers = new JButton("Go to Sort Users");
		btnsortUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsortUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SortUserPage.setVisible(true);
				profile.setVisible(false);
			}
		});
		btnsortUsers.setBounds(10, 93, 174, 44);
		profile.add(btnsortUsers);
		
		
		JPanel NearbyPage = new JPanel();
		frame.getContentPane().add(NearbyPage, "name_45857068788965");
		NearbyPage.setLayout(null);
		
		JButton btnmutualappointmentsplus = new JButton("Nearby users");
		btnmutualappointmentsplus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NearbyPage.setVisible(true);
				profile.setVisible(false);
			}
		});
		btnmutualappointmentsplus.setBounds(10, 148, 174, 30);
		profile.add(btnmutualappointmentsplus);
		
		JPanel removeduplicates = new JPanel();
		removeduplicates.setBackground(Color.ORANGE);
		frame.getContentPane().add(removeduplicates, "name_7871825867007");
		removeduplicates.setLayout(null);
		
		JButton btnyourownappointments = new JButton("Remove duplicate appointments");
		btnyourownappointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnyourownappointments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removeduplicates.setVisible(true);
				profile.setVisible(false);
				
			}
		});
		btnyourownappointments.setBounds(10, 199, 226, 23);
		profile.add(btnyourownappointments);
		
		JButton btngoAppointments = new JButton("Got to Appointments");
		btngoAppointments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mettingpage.setVisible(true);
				profile.setVisible(false);
			
			
			//
				//
				//
				//
			}
		});
		btngoAppointments.setBounds(246, 152, 167, 23);
		profile.add(btngoAppointments);
		
		JButton btngosuburb = new JButton("search by suburb");
		btngosuburb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				suburbPage.setVisible(true);
				profile.setVisible(false);
				
			}
		});
		btngosuburb.setBounds(261, 38, 152, 23);
		profile.add(btngosuburb);
		
		JButton btnMakeAnAppointment = new JButton("Make an Appointment");
		btnMakeAnAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMakeAnAppointment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(false);
				addappointmentpage.setVisible(true);
			}
		});
		btnMakeAnAppointment.setBounds(246, 104, 167, 23);
		profile.add(btnMakeAnAppointment);
		
		JPanel yourownapp = new JPanel();
		yourownapp.setBackground(Color.PINK);
		frame.getContentPane().add(yourownapp, "name_50908819163198");
		yourownapp.setLayout(null);
		
		JButton btnGoToMutual = new JButton("Go to online users");
		btnGoToMutual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGoToMutual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				yourownapp.setVisible(true);
				profile.setVisible(false);
			}
		});
		btnGoToMutual.setBounds(246, 199, 167, 23);
		profile.add(btnGoToMutual);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(142, 84, 167, 30);
		login.add(txtUserName);
		txtUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(142, 136, 174, 30);
		login.add(passwordField);
		
		
		JLabel lblErrorMessage = new JLabel("Invalid UserName or Password !");
		lblErrorMessage.setForeground(Color.RED);
		lblErrorMessage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErrorMessage.setBounds(43, 199, 174, 14);
		login.add(lblErrorMessage);
		lblErrorMessage.setVisible(false);
		
		
		
		
		JList<User> listnearbyusers = new JList<User>();
		listnearbyusers.setBounds(10, 63, 377, 174);
		NearbyPage.add(listnearbyusers);
		
		JList<String> list_1 = new JList<String>();
		list_1.setBounds(10, 166, 379, 84);
		yourownapp.add(list_1);
		
		
		
		JList<Appointment> listpersonalapp = new JList<Appointment>();
		listpersonalapp.setBounds(10, 48, 371, 76);
		yourownapp.add(listpersonalapp);
		//ArrayList<Appointment> nothing= speak.getAppointmentSet().getAppointments();
		//ArrayList<Appointment> funny= speak.getAppointmentSet().searchbyfname(nothing,);
		//
		//
		//
		//
		
		JButton btnlogin = new JButton("login");
		btnlogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = txtUserName.getText();
				String password= passwordField.getText();
				if(speak.userSet.login(username, password)) {
					profile.setVisible(true);
					login.setVisible(false);
					ArrayList<User> haunt= speak.getUserSet().getUsers();
					User ko= speak.getUserSet().getMatch(haunt,username);
					
					//ArrayList<User> haunt= speak.getUserSet().getUsers();
					ArrayList<User>  fungun= speak.getUserSet().Nearby(haunt,ko );
					listnearbyusers.setListData(fungun.toArray(new User[fungun.size()]));
					ArrayList<Appointment> nothing= speak.getAppointmentSet().getAppointments();//
					ArrayList<Appointment> funny= speak.getAppointmentSet().searchbyfname(nothing,username);
					listpersonalapp.setListData(funny.toArray(new Appointment[funny.size()]));
					ArrayList<String> hog= speak.getAppointmentSet().goofsearch(nothing, username);
					list_1.setListData(hog.toArray(new String[hog.size()]));
					//
					//
					//
					//
					
					
					
				}else {
					lblErrorMessage.setVisible(true);
				}
			}
		});
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlogin.setBounds(242, 195, 89, 23);
		login.add(btnlogin);
		
	
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setBounds(71, 92, 89, 14);
		login.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(71, 144, 89, 14);
		login.add(lblPassword);
		
		
		
		textFieldSuburb = new JTextField();
		textFieldSuburb.setBounds(112, 47, 96, 20);
		suburbPage.add(textFieldSuburb);
		textFieldSuburb.setColumns(10);
		
		JLabel lblEnterSuburbname = new JLabel("Enter suburbName");
		lblEnterSuburbname.setBounds(10, 50, 105, 14);
		suburbPage.add(lblEnterSuburbname);
		
		JList<User> list2 = new JList<User>();
		list2.setBounds(10, 103, 414, 147);
		suburbPage.add(list2);
		ArrayList<User> persons = speak.getUserSet().getUsers();
		list2.setListData(persons.toArray(new User[persons.size()]));
		
		
		JList<User> list3 = new JList<User>();
		list3.setBounds(10, 73, 414, 177);
		SortUserPage.add(list3);
		ArrayList<User> susers= speak.getUserSet().getUsers();
		list3.setListData(susers.toArray(new User[susers.size()]));
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texta= textFieldSuburb.getText();
				ArrayList<User> huh= speak.getUserSet().getUsers();
				ArrayList<User> nah = speak.getUserSet().searchUserbySuburb(huh, texta);
				list2.setListData(nah.toArray(new User[nah.size()]));
			}
		});
		btnSearch.setBounds(83, 77, 89, 23);
		suburbPage.add(btnSearch);
		
		JButton btnsuburbgoback = new JButton("go back");
		btnsuburbgoback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				suburbPage.setVisible(false);
			}
		});
		btnsuburbgoback.setBounds(10, 11, 89, 23);
		suburbPage.add(btnsuburbgoback);
		
		JButton btnNewmaxRating = new JButton("get the user with max rating");
		btnNewmaxRating.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<User> job= speak.getUserSet().getUsers();
				User  p=speak.getUserSet().getMaxRating(job);
				ArrayList<User> q= new ArrayList<User>();
				q.clear();
				q.add(p);
				list2.setListData(q.toArray(new User[q.size()]));;
				
			}
		});
		btnNewmaxRating.setBounds(233, 63, 191, 23);
		suburbPage.add(btnNewmaxRating);
		
		JButton btnGetTheUser = new JButton("get the user with minimum rating");
		btnGetTheUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<User>  easy= speak.getUserSet().getUsers();
			User f=speak.getUserSet().getMinRating(easy);
			ArrayList<User> nice= new ArrayList<User>();
			nice.clear();
			nice.add(f);
			list2.setListData(nice.toArray(new User[nice.size()]));
			}
		});
		btnGetTheUser.setBounds(191, 11, 233, 23);
		suburbPage.add(btnGetTheUser);
		
		
		
		JButton btnsortingbutton = new JButton("by username");
		btnsortingbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// i need help here Daniel because this button is still not working
		btnsortingbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<User>  gp = speak.getUserSet().getUsers();
				speak.getUserSet().sortUserbyName(gp);
				list3.setListData(gp.toArray(new User[gp.size()]));
			}
		});
		btnsortingbutton.setBounds(35, 39, 103, 23);
		SortUserPage.add(btnsortingbutton);
		
		
		
		JButton btnByRating = new JButton("by Rating");
		btnByRating.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<User> bubble= speak.getUserSet().getUsers();
				speak.getUserSet().sortUserbyRating(bubble);
				
				list3.setListData(bubble.toArray(new User[bubble.size()]));
			}
		});
		btnByRating.setBounds(171, 39, 89, 23);
		SortUserPage.add(btnByRating);
		
		JLabel lblSortUsers = new JLabel("Sort Users");
		lblSortUsers.setBounds(35, 11, 103, 14);
		SortUserPage.add(lblSortUsers);
		
		JButton btnsortUsergoback = new JButton("Go back");
		btnsortUsergoback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				SortUserPage.setVisible(false);
			}
		});
		btnsortUsergoback.setBounds(300, 39, 89, 23);
		SortUserPage.add(btnsortUsergoback);
		
		
		
		JLabel lblAppointments = new JLabel("Search by name");
		lblAppointments.setBounds(10, 22, 147, 14);
		mettingpage.add(lblAppointments);
		
		JList<Appointment> appshowlist = new JList<Appointment>();
		appshowlist.setBounds(10, 47, 403, 203);
		mettingpage.add(appshowlist);
		
		
		
		textField_1nameapp = new JTextField();
		textField_1nameapp.setBounds(103, 19, 96, 20);
		mettingpage.add(textField_1nameapp);
		textField_1nameapp.setColumns(10);
		ArrayList<Appointment> gossip= speak.getAppointmentSet().getAppointments();
		appshowlist.setListData(gossip.toArray(new Appointment[gossip.size()]));
		
		JButton btnsearchnameappointment = new JButton("Search");
		btnsearchnameappointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsearchnameappointment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String sp= textField_1nameapp.getText();
				ArrayList<Appointment> goh= speak.getAppointmentSet().getAppointments();
				ArrayList<Appointment> jog= speak.getAppointmentSet().searchAppointments(goh,sp);
				appshowlist.setListData(jog.toArray(new Appointment[jog.size()]));
				//
				//
				//
				///
				//
				//
				//
				textField_1nameapp.setText("");
			}
		});
		btnsearchnameappointment.setBounds(209, 18, 89, 23);
		mettingpage.add(btnsearchnameappointment);
		
		JButton btnNewButton = new JButton("Go Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				mettingpage.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(324, 18, 89, 23);
		mettingpage.add(btnNewButton);
		
	
		
		JLabel lblNearbyUsers = new JLabel("NearBy Users");
		lblNearbyUsers.setBounds(10, 23, 89, 14);
		NearbyPage.add(lblNearbyUsers);
		
		JButton btnGobezerk = new JButton("go back");
		btnGobezerk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				NearbyPage.setVisible(false);
				//
				//
				//
			}
		});
		btnGobezerk.setBounds(296, 19, 89, 23);
		NearbyPage.add(btnGobezerk);
		
		
		
		JLabel lblYourAppointments = new JLabel("Your appointments");
		lblYourAppointments.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblYourAppointments.setBounds(10, 11, 125, 14);
		yourownapp.add(lblYourAppointments);
		
		JLabel lblFreeUsers = new JLabel("Free users");
		lblFreeUsers.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblFreeUsers.setBounds(10, 135, 81, 14);
		yourownapp.add(lblFreeUsers);
		
		JButton btnGoBack_3 = new JButton("Go back");
		btnGoBack_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				yourownapp.setVisible(false);
			}
		});
		btnGoBack_3.setBounds(298, 14, 89, 23);
		yourownapp.add(btnGoBack_3);
		
		
		
		
		
		JList<Appointment> list_1123 = new JList<Appointment>();
		list_1123.setBounds(22, 97, 372, 131);
		removeduplicates.add(list_1123);
		
		JButton btnRemoveDuplicatesAppointments = new JButton("Remove duplicates appointments");
		btnRemoveDuplicatesAppointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//list_1123.setListData();
			}
		});
		btnRemoveDuplicatesAppointments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Appointment> oops= speak.getAppointmentSet().getAppointments();
				ArrayList<Appointment> nope= speak.getAppointmentSet().duplicateAppointmentss(oops);
				list_1123.setListData(nope.toArray(new Appointment[nope.size()]));
				
			}
		});
		btnRemoveDuplicatesAppointments.setBounds(157, 35, 195, 23);
		removeduplicates.add(btnRemoveDuplicatesAppointments);
		
		JButton btnGoBack_2 = new JButton("Go Back");
		btnGoBack_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profile.setVisible(true);
				removeduplicates.setVisible(false);
			}
		});
		btnGoBack_2.setBounds(10, 35, 89, 23);
		removeduplicates.add(btnGoBack_2);
		
	
		
	
	//
		//
		//
		///
		///
	
		
		
		
		
		
		
	}
	/**
	 * 
	 * @param list  takes an ArrayList of users
	 * @return an array of users 
	 * converts an ArrayList of users to an Array of users
	 * Time Complexity : O(n) for both the best and the worst cases 
	 */
	public static User[] getArray(ArrayList<User> list) {
		User[] arr= new User[list.size()];
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		return arr;
	}
	/**
	 * 
	 * @param f16   A boolean parameter  to use 
	 * @param g16  A boolean parameter to use 
	 * @return returns true if both the parameters are true and false other wise 
	 * @ see a helper method in client 
	 */
	public static boolean rightValue(boolean f16,boolean g16) {
		if(f16 && g16) {
			return true;
		}
		return false;
	}
	}

