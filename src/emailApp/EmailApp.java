package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		/*Generate an email with the following syntax:firstname.lastname@department.company.com
		 * Determine the department(Sales, development, accounting), if none leave blank
		 * Generate a random String for a password
		 * Have set methods to change the password, set the mailbox capacity, and define an  alternate email address
		 * Have get methods to display the name, email, and mailbox capacity*/
		Scanner in=new Scanner(System.in);
		System.out.println("Enter you first name:");
		String firstName=in.next();
		System.out.println("Enter you last name:");
		String lastName=in.next();
		
		Email em1= new Email(firstName, lastName);
		
		System.out.println(em1.showInfo());
	
	}

}
