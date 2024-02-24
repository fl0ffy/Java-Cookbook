/**
 * Filename: P1Utils.java
 * Author: John Bernat
 * Date: Jan 2017
 * Purpose: contains various static methods to provide formating and calculations
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by john on 1/22/17.
 */
public class P1Utils {
    public static String generateReport(String array[][]) {

        // --- fields ---
        String returnString;
        StringBuilder employeeString = new StringBuilder("Employees:\nYear\tEmpl Type\tName\t\tMonSalary\tAnSalary\n");
        StringBuilder salesmanString = new StringBuilder("Salesmen:\nYear\tEmpl Type\tName\t\tMonSalary\tItems Sold\tAnSalary\n");
        StringBuilder executiveString = new StringBuilder("Executives:\nYear\tEmpl Type\tName\t\tMonSalary\tStock\tAnSalary\n");
        StringBuilder annualSalaryString = new StringBuilder();

        //parses through and add various types of employees to specific strings
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][1].equals("Employee")) {
                    employeeString.append(array[j][i] + "\t");
                }
                if (array[j][1].equals("Salesman")) {
                    salesmanString.append(array[j][i] + "\t");
                }
                if (array[j][1].equals("Executive")) {
                    executiveString.append(array[j][i] + "\t");
                }
            }
            //parses through employee types and runs calculations and adds to respective string
            if (array[j][1].equals("Employee")) {
                Employee employee = new Employee(array[j][2],Integer.parseInt(array[j][3]));
                //System.out.print(Integer.toString(employee.annualSalary()) + "\t");
                employeeString.append(Integer.toString(employee.annualSalary()) + "\t");
                annualSalaryString.append(Integer.toString(employee.annualSalary()) + "\n");
                employeeString.append("\n");
            }
            if (array[j][1].equals("Salesman")) {
                Salesman salesman = new Salesman(array[j][2],Integer.parseInt(array[j][3]),Integer.parseInt(array[j][4]));
                //System.out.print(Integer.toString(salesman.annualSalary()) + "\t");
                salesmanString.append(Integer.toString(salesman.annualSalary()) + "\t");
                annualSalaryString.append(Integer.toString(salesman.annualSalary()) + "\n");
                salesmanString.append("\n");
            }
            if (array[j][1].equals("Executive")) {
                Executive executive = new Executive(array[j][2],Integer.parseInt(array[j][3]),Integer.parseInt(array[j][4]));
                //System.out.print(Integer.toString(executive.annualSalary()) + "\t");
                executiveString.append(Integer.toString(executive.annualSalary()) + "\t");
                annualSalaryString.append(Integer.toString(executive.annualSalary()) + "\n");
                executiveString.append("\n");
            }
            //System.out.println("");
            //returnString.append("\n");
        }


        //calculation average salary for the year
        String avgAnnualSalaryArray[] = annualSalaryString.toString().split("\n");
        int annualSalaryTotal = 0;
        for (int k = 0; k < array.length; k++) {
            annualSalaryTotal = annualSalaryTotal + Integer.parseInt(avgAnnualSalaryArray[k]);
        }
        int avgAnnualSalary = annualSalaryTotal / avgAnnualSalaryArray.length;

        //combines respective strings into a single return report string
        returnString = employeeString + "\n" + salesmanString + "\n" + executiveString + "\n" + "Average Annual Salary: " + avgAnnualSalary + "\n";

        return returnString;
    }   // end generateReport method


    //method to determine linecount of input file to setup array length
    public static int lineCount(String input) {

        BufferedReader br = null;
        int count = 0;

        // ----- Read data from input file -----
        try {
            //setup input reader
            String currentLine;
            br = new BufferedReader(new StringReader(input));

            //while loop to read input, provide output and count
            while ((currentLine = br.readLine()) != null) {
                count++;
            }

        } catch (IOException e) {
            //output exception stack
            e.printStackTrace();
        } finally {
            //Setup try/catch/finally blocks for exception handling
            try {

                if (br != null) {
                    br.close();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }   //end finally blocks
        // ----- End reading input file -----
        return count;

    }   //end lineCount method

    //method to create 2d array from input data
    public static String[][] getArray(String filename, String delimiter){
        //fields
        BufferedReader br = null;
        final int COLUMN = 8;
        final int ROW = P1Utils.lineCount(filename);
        String array[][] = new String[ROW][COLUMN];

        //Read the source file
        //Setup try/catch/finally blocks for exception handling
        try {
            //setup input reader
            String currentLine;
            br = new BufferedReader(new StringReader(filename));

            //while loop to read input, provide output and count
            int count = 0;
            while ((currentLine = br.readLine()) != null) {
                for (int i = count; i < ROW; i++) {
                    array[i] = currentLine.split(delimiter);
                }
                count++;
            }
        } catch (IOException e) {
            //output exception stack
            System.out.println("\nThere was an issue. Please make sure you have the correct file.");
            System.exit(1);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println("\nThere was an issue in SourceToArray Class.");
                System.exit(1);
            }
        }
        return array;
    }   //end getArray method


    //method to filter out lines in input file by a starting string. in this case the year
    public static String split(String filename, String sortBy){
        //fields
        BufferedReader br = null;
        StringBuilder returnString = new StringBuilder();

        //Read the source file
        //Setup try/catch/finally blocks for exception handling
        try {
            //setup input reader
            String currentLine;
            br = new BufferedReader(new FileReader(filename));

            //while loop to read input, provide output and count
            while ((currentLine = br.readLine()) != null) {
                if (currentLine.startsWith(sortBy)) {
                    returnString.append(currentLine + "\n");
                }
            }

        } catch (IOException e) {
            //output exception stack
            System.out.println("\nThere was an issue. Please make sure you have the correct file.");
            System.exit(1);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println("\nThere was an issue in SplitSourceClass.");
                System.exit(1);
            }
        }
        return returnString.toString();
    }   //end split method

}   //end P1Utils Class
