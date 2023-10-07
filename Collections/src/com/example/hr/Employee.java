package com.example.hr;

public class Employee {
 private String name;
 private int ID;
 private double salary;

 public Employee(String name, int ID, double salary) {
     this.name = name;
     this.ID = ID;
     this.salary = salary;
 }

 public String getName() {
     return name;
 }

 public int getID() {
     return ID;
 }

 public double getSalary() {
     return salary;
 }

 public void printName() {
     System.out.println("Employee Name: " + name);
 }

 public void printID() {
     System.out.println("Employee ID: " + ID);
 }

 public void printSalary() {
     System.out.println("Employee Salary: $" + salary);
 }
}
