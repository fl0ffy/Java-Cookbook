/**
 * Filename: InsufficientFunds.java
 * Author: John Bernat
 * Date: Jan 2017
 * Purpose: User defined checked exception
 */

 public class InsufficientFunds extends Exception {

    //----- Fields -----
    private double deficientFunds;

    //----- Constructor -----
    public InsufficientFunds(double deficientFunds) {
        this.deficientFunds = deficientFunds;
    }

    //----- Methods -----
    public double getDeficientFunds() {
        return deficientFunds;
    }

}
