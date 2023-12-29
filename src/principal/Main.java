package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Services serv = new Services();
        Scanner in = new Scanner(System.in);
        int choice;
        
        System.out.println("Welcome to Employee System Management : ");
        System.out.println("#-------------------#");
       
        // Menu for user to choose what to do
       
        while(1>0) {
        	 System.out.println("Please choose an action : ");  
             System.out.println("1 - View employees list.\n2 - Search employee.\n3 - Add new employee.\n4 - Update employee.\n5 - Delete employee.\n6 - Exit");
        	choice = in.nextInt();
        	switch(choice) {
        	case 1 :
        		serv.viewAllEmployees();
        		break;
        	case 2 :
        		serv.searchEmployeeById();
        		break;
        	case 3 :
        		serv.AddEmployees();
        		break;
        	case 4 :
        		serv.updateEmployee();
        		break;
        	case 5 :
        		serv.deleteEmployeeById();
        		break;
        	case 6 :
        		System.out.println("Thank you! Good Bye!!");
        	    System.exit(0);
        	default :
        		System.out.println("Please enter a correct choice!!!");
        	}
        	
        }
		

	}

}
