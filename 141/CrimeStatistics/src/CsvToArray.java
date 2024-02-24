/** File: USCrimeClass.java
 * Author: John Bernat
 * Date: 17 Dec 2016
 * Purpose: take csv filename passed and read csv into a 2d array and return array
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvToArray {
    public static String[][] getArray (String filename){
        //fields
        BufferedReader br = null;
        final int COLUMN = 20;
        final int ROW = 21;
        String array[][] = new String[ROW][COLUMN];

        //Read the CSV file
        //Setup try/catch/finally blocks for exception handling
        try {
            //setup input reader
            String currentLine;
            br = new BufferedReader(new FileReader(filename));

            //while loop to read input, provide output and count
            int count = 0;
            while ((currentLine = br.readLine()) != null) {
                for (int i = count; i < ROW; i++) {
                    array[i] = currentLine.split(",");
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
                System.out.println("\nThere was an issue.");
                System.exit(1);
            }
        }

        return array;
    }
}
