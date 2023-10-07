package com.example.hr;

public class Main {
	public static void main(String[] args) {
        // Create an instance of the Employee class from the "com.example.hr" package
        com.example.hr.Employee employee = new com.example.hr.Employee("John Doe", 12345, 50000.0);

        // Call methods to print employee name and salary
        employee.printName();
        employee.printSalary();
    }
}


