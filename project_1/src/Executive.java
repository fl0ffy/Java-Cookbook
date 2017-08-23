/**
 * Filename: Executive.java
 * Author: John Bernat
 * Date: Jan 2017
 * Purpose: Class to extend Employee class
 */

public class Executive extends Employee {

    //----- Fields -----
    private int currentStockPrice;
    private int bonus;

    //----- Constructors -----
    //constructor that allows the name and monthly salary to be initialized and adds current stock price
    public Executive (String name, int monSalary, int stockPrice) {
        super(name, monSalary);
        this.currentStockPrice = stockPrice;
    }   //end Executive constructor

    //overrides annualSalary method in Employee Superclass
    //returns annual Salary + bonus
    public int annualSalary() {
        super.annualSalary();

        if (currentStockPrice < 100) {
            bonus = 0;
        }
        if (100 < currentStockPrice) {
            bonus = 20000;
        }

        return super.annualSalary() + bonus;
    }   //end annualSalary method

    //overrides toString method in Employee Superclass
    //returns String containing the name, monthly salary and number of items sold (appropriately labeled)
    public String toString() {
        return super.toString() + "\nStock Price: " + this.currentStockPrice;
    }   //end toString method

}   //end Executive class
