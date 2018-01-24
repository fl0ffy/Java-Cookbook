/**
 * Filename: Account.java
 * Author: John Bernat
 * Date: ?
 * Purpose: Used to create account objects
 */

public class Account {

    //----- fields -----
    private double balance;
    private int count;

    //----- constructor -----
    //one parameter representing the initial deposit
    public void Account (double deposit) {
        this.balance = deposit;
    }   //end Account constructor

    //----- Methods -----
    //withdraw method (must throw InsufficientFunds exception when attempt to use more funds than available)
    public void withdraw (double requestedAmount) throws InsufficientFunds {
        //Add in insufficient funds check and throw exception
        if ( requestedAmount <= balance ) {
            balance = balance - requestedAmount;
            //logic to charge $1.25 on every 5th withdrawal from either account
        } else {
            double amountNeeded = requestedAmount - balance;
            throw new InsufficientFunds(amountNeeded);
        }
    }   //end withdraw method

    //deposit method
    public void deposit (double depositAmount) {
        balance = balance + depositAmount;
    }   //end deposit method

    //transfer to method (must throw InsufficientFunds exception when attempt to use more funds than available)
    public void transfer (double transferAmount) throws InsufficientFunds {
        //figure out how to transfer
        if ( transferAmount <= balance ) {
            // transfer logic goes here
        } else {
            double amountNeeded = transferAmount - balance;
            throw new InsufficientFunds(amountNeeded);
        }
    }
    //balance method

    public double balance () {
        return balance;
    }   //end balance method

}   //end Account Class
