/**
 * Filename: P1Driver.java
 * Author: John Bernat
 * Date: Jan 2017
 * Purpose: Create and display attibutes of Employee objects
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class P1Driver {
    public static void main (String[] args) {
        try {
            final String FILENAME = args[0];
            BufferedReader br = null;
            //filer lines into new string based on year
            //String string2015 = P1Utils.split(FILENAME, "2015");
            //String string2016 = P1Utils.split(FILENAME, "2016");
            //create 2d arrays from output strings from above
            //String[][] array2015 = P1Utils.getArray(string2015, " ");
            //String[][] array2016 = P1Utils.getArray(string2016, " ");

            //setup input reader
            String currentLine;
            br = new BufferedReader(new FileReader(FILENAME));
            List list2015 = new ArrayList();
            List list2016 = new ArrayList();

            //while loop to read input and append lines to appropriate list
            while ((currentLine = br.readLine()) != null) {
                if (currentLine.startsWith("2015")) {
                    list2015.add(currentLine);
                }
                if (currentLine.startsWith("2016")) {
                    list2016.add(currentLine);
                }
            }  //end while loop

            System.out.println(list2015);
            System.out.println(list2016);


           // String [] array2015 = list2015.toArray(new String[list2015.size()]);



        } catch (IOException e) {
            //output exception stack
            System.out.println("\nThere was an issue. Please make sure you have the correct file.");
            System.exit(1);
/*
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println("\nThere was an issue in dkgjskdfhgk.");
                System.exit(1);
            }
        }

            //Print out reports
            System.out.println("-------------------------------- Report for 2015 --------------------------------");
            System.out.println(P1Utils.generateReport(array2015));
            System.out.println("-------------------------------- Report for 2016 --------------------------------");
            System.out.println(P1Utils.generateReport(array2016));
*/
        } catch (ArrayIndexOutOfBoundsException oob) {
            System.out.println("\nThere was an issue. Please make sure you specify a file.");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("\nThere is something wrong and I don't know what it could be.");
            System.exit(1);
        }

    }   //end main method
}   //end P1Driver class
