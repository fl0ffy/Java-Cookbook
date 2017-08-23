/**
 * Filename: Salesman.java
 * Author: John Bernat
 * Date: Jan 2017
 * Purpose: Class to extend Employee class
 */

public class Salesman extends Employee {

    //----- Fields -----
    private int numItemsSold;
    private int commission;

    //----- Constructors -----
    //constructor that allows the name and monthly salary to be initialized and adds number of items sold
    public Salesman (String name, int monSalary, int itemsSold) {
        super(name, monSalary);
        this.numItemsSold = itemsSold;
    }   //end Salesman constructor

    //overrides annualSalary method in Employee Superclass
    //returns annual Salary + commission
    public int annualSalary() {
        super.annualSalary();

        if (numItemsSold < 100) {
            commission = 0;
        }
        if ((100 < numItemsSold) & (numItemsSold < 200)) {
            commission = monthlySalary;
        }
        if (200 < numItemsSold) {
            commission = monthlySalary * 2;
        }

        return super.annualSalary() + commission;
    }   //end annualSalary method

    //overrides toString method in Employee Superclass
    //returns String containing the name, monthly salary and number of items sold (appropriately labeled)
    public String toString() {
        return super.toString() + "\nItems sold: " + this.numItemsSold;
    }   //end toString method

}   //end Salesman class
