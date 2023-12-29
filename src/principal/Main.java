package principal;

public class Main {

	public static void main(String[] args) {
		
		Services serv = new Services();
		serv.AddEmployees();
		serv.viewAllEmployees();
		serv.updateEmployee();
		serv.viewAllEmployees();

	}

}
