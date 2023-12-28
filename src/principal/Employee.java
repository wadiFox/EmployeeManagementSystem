package principal;

import java.util.*;

public class Employee {
private int id;
private String name;
private String department;
private String function;
private double salary;

public Employee(int id, String name, String department, String function, double salary) {
	this.id = id;
	this.name = name;
	this.department = department;
	this.function = function;
	this.salary = salary;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getFunction() {
	return function;
}
public void setFunction(String function) {
	this.function = function;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", function=" + function
			+ ", salary=" + salary + "]";
}


}
