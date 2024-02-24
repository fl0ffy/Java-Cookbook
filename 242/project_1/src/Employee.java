/**
 * Filename: Employee.java
 * Author: John Bernat
 * Date: Jan 2017
 * Purpose: Class to create Employee objects
*/

public class Employee {

    //----- Fields -----
    private String employeeName;
    private int monthlySalary;

    //----- Constructors -----
    //constructor that allows the name and monthly salary to be initialized
    public Employee (String name, int monSalary) {
        this.employeeName = name;
        this.monthlySalary = monSalary;
    }   //end Employee constructor

    //----- Methods -----
    //method returns annual salary for a whole year
    public int annualSalary() {
        return this.monthlySalary * 12;
    }   //end annualSalary method

    //method returns monthly salary
    public int getMonthlySalary() {
        return this.monthlySalary;
    }   //end getMonthlySalary method

    //method returns String containing the name and monthly salary, appropriately labeled
    public String toString() {
        return "Name: " + this.employeeName + "\nMonthly Salary: " + this.monthlySalary;
    }   //end toString method

}   //end Employee class
