package com.languagefundamentals.constructors;

public class Employee {
	
	int employee_id;
	String employee_name;
	double employee_salary;
	boolean isActive;
	
	Employee() {
		System.out.println("no-arg constructor is started");
		employee_id = 10;
		employee_name = "unknown";
		employee_salary = 10000.00;
		isActive = true;
		System.out.println("no -arg constructor ended");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Employee emp = new Employee();
		emp.getEmployeeInfo();
		
		Employee emp1 = new Employee();
		// emp1.employee_id = 101;
		emp1.employee_name = "Mulampaka Nagu";
		emp1.employee_salary = 500000.00;
		emp1.isActive = true;
		emp1.getEmployeeInfo();
		
		Employee emp2 = new Employee();
		emp2.employee_name = "Sella Hemanth Kumar";
		emp2.isActive = true;
		emp2.getEmployeeInfo();
		
		System.out.println("main method ended");
	}
	
	void getEmployeeInfo() {
		System.out.println("Employee Id: " + employee_id);
		System.out.println("Employee Name: " + employee_name);
		System.out.println("Employee Salary: " + employee_salary);
		System.out.println("Employee is Active: " + isActive);
		System.out.println("******************************");
	}

}
