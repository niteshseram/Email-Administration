package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=8;
	private String email;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private String companySuffix="xyz.com";
	
	//Constructor to recieve first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created "+this.firstName+" "+this.lastName);
		
		//Call a method asking for the department - return the department
		this.department =setDepartment();
		//System.out.println("Department: "+this.department);
		
		//Call a method that returns a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your Password is "+this.password);
		
		//Combine elements to generate email
		if(department!="") {
			email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		}else {
			email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+companySuffix;
		}
		//System.out.println("Your email is "+email);
		
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("New Employee:"+firstName+ " "+lastName+"\nDepartment Codes\n1 for Sales\n2 for Development\n3 for Accounting \n0 for none\nEnter Department:");
		Scanner sc=new Scanner(System.in);
		int departmentChoice = sc.nextInt();
		if(departmentChoice ==1) { return "sales"; }
		else if(departmentChoice == 2) { return "Dev"; }
		else if(departmentChoice == 3) { return "accounting"; }
		else { return  ""; }
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@*!$";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	
	//set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	//change the password
	public void changePassword(String password){
		this.password = password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	
	public String showInfo() {
		return "DISPLAY NAME:"+ firstName+ " "+ lastName+
				"\nCOMPANY EMAIL:" +email + 
				"\nMAILBOX CAPACITY: "+ mailboxCapacity+ "mb";
	}
}
