package principal;

public class Main {

	public static void main(String[] args) {
		
		Services serv = new Services();

		serv.viewAllEmployees();
        serv.deleteEmployeeById();
        serv.updateEmployee();

	}

}
