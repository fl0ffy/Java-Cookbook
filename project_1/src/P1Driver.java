/**
 * Filename: P1Driver.java
 * Author: John Bernat
 * Date: Jan 2017
 * Purpose: Create and display attibutes of Employee objects
 */

import java.io.IOException;

public class P1Driver {
    public static void main (String[] args) {
        try {
            final String FILENAME = args[0];
            //filer lines into new string based on year
            String string2015 = P1Utils.split(FILENAME, "2015");
            String string2016 = P1Utils.split(FILENAME, "2016");
            //create 2d arrays from output strings from above
            String[][] array2015 = P1Utils.getArray(string2015, " ");
            String[][] array2016 = P1Utils.getArray(string2016, " ");

            //Print out reports
            System.out.println("-------------------------------- Report for 2015 --------------------------------");
            System.out.println(P1Utils.generateReport(array2015));
            System.out.println("-------------------------------- Report for 2016 --------------------------------");
            System.out.println(P1Utils.generateReport(array2016));

        } catch (ArrayIndexOutOfBoundsException oob) {
            System.out.println("\nThere was an issue. Please make sure you specify a file.");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("\nThere is something wrong and I don't know what it could be.");
            System.exit(1);
        }

    }   //end main method
}   //end P1Driver class
