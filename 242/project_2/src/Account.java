/**
 * Filename: Account.java
 * Author: John Bernat
 * Date: ?
 * Purpose: Used to create account objects
 */

import java.text.DecimalFormat;

public class Account {

    //----- fields -----//
    private double balance;
    private int withdrawCount = 0;
    //private DecimalFormat df = new DecimalFormat("#.##");

    //----- constructor -----//
    //one parameter representing the initial deposit
    public void Account () {
        this.balance = 0;
    }   //end Account constructor

    //----- Methods -----//
    //withdraw method (must throw InsufficientFunds exception when attempt to use more funds than available)
    public void withdraw (double requestedAmount) throws InsufficientFunds {
        //Add in insufficient funds check and throw exception
        withdrawCount++;
        //logic to charge $1.25 on every 5th withdrawal from either account
        if (withdrawCount % 5 == 0) {
            requestedAmount = requestedAmount + 1.25;
        }

        if ( requestedAmount <= balance ) {
            balance = balance - requestedAmount;

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

    public void transfer (double transferAmount, Account recipient) throws InsufficientFunds {
        //figure out how to transfer
        if ( transferAmount <= balance ) {
            this.withdraw(transferAmount);
            recipient.deposit(transferAmount);
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
