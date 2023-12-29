package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Services {
	List<Employee> emps = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	Employee  emp1= new Employee(101,"wadi","IT","Developer",45000);
	Employee  emp2= new Employee(102,"Sami","IT","Developer",55000);
	Employee  emp3= new Employee(103,"Ramsey","Administration","CEO",75000);
	Employee  emp4= new Employee(104,"Steve","Finances","Accountant",35000);
	Employee  emp5= new Employee(105,"John","IT","Designer",45000);
	
	int id;
	String name;
	String department;
	String function;
	double salary;
	boolean idExist=false;

	public Services() {
	
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
	}
	
	// View all employees
	
	public void viewAllEmployees() {
		for(Employee emp:emps) {
			System.out.println(emp);
		}
	}
	
	// A simple method to verify if id already exist before adding it
	
	  public boolean checkIdd() {
	    	System.out.println("Please enter the id : ");
			id = input.nextInt();
			for(Employee emp:emps) {
				if(id==emp.getId()) {
					idExist=true;
					System.out.println("Id already exist !! ");
					}
				else idExist=false;
				}
			return idExist;
	    }
	  
	  public boolean checkId() {
		    System.out.println("Please enter the id : ");
		    id = input.nextInt();
		    
		    for (Employee emp : emps) {
		        if (id == emp.getId()) {
		            idExist = true;
		            System.out.println("Id already exists!!");
		            return true; // Return true if the id exists
		        }
		    }
		    
		    idExist = false;
		    return false; // Return false if the id doesn't exist
		}

	
	// Add a new employee
	   /* 
	  public void AddEmployeess() {
		    do {
		        if (checkId()) {
		            System.out.println("Id already exists. Please enter a different id: ");
		            id = input.nextInt();
		        } else {
		            System.out.println("Please enter the name : ");
		            name = input.next();
		            System.out.println("Please enter the department : ");
		            department = input.next();
		            System.out.println("Please enter the function : ");
		            function = input.next();
		            System.out.println("Please enter the salary : ");
		            salary = input.nextDouble();
		        }
		    } while (checkId()); // Continue looping until a unique ID is entered

		    Employee emp = new Employee(id, name, department, function, salary);
		    emps.add(emp);
		}  */
	  
	  public void AddEmployees() {
		    do {
		        if (checkId()) {
		          
		        } else {
		            System.out.println("Please enter the name : ");
		            name = input.next();
		            System.out.println("Please enter the department : ");
		            department = input.next();
		            System.out.println("Please enter the function : ");
		            function = input.next();
		            System.out.println("Please enter the salary : ");
		            salary = input.nextDouble();
		        }
		    } while (idExist); // Continue looping until idExist is false

		    Employee emp = new Employee(id, name, department, function, salary);
		    emps.add(emp);
		}

		// Update an employee using id
		
		public void updateEmployee() {
			System.out.println("Please enter the id to update : ");
			id = input.nextInt();
			for(Employee emp:emps) {
				if(id==emp.getId()) {
					System.out.println(emp);
					emp.setId(id);
					System.out.println("Please enter the name : ");
					name = input.next();
					emp.setName(name);
					System.out.println("Please enter the department : ");
					department = input.next();
					emp.setDepartment(department);
					System.out.println("Please enter the function : ");
					function = input.next();
					emp.setFunction(function);
					System.out.println("Please enter the salary : ");
					salary = input.nextDouble();
					emp.setSalary(salary);
					}

				System.out.println("Employee update : " + emps); // Print the entire list or specific employee details
				
			   }
			
		}
		
		
}

