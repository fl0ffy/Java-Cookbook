/** File: ReadFile.java
 * Author: John Bernat
 * Date: 13 Dec 2016
 * Purpose: read input from file and write output from file while counting values
 */

//import classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main (String[] args) {

        //set fields
        final String FILENAME = args[0];
        BufferedReader br = null;
        FileReader fr = null;

        //Setup try/catch/finally blocks for exception handling
        try {
            //setup input reader
            String currentLine;
            br = new BufferedReader(new FileReader(FILENAME));
            int count=0;

            //while loop to read input, provide output and count
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
                count++;
            }
            //output overall count
            System.out.println("\n" + count + " data values were read");

        } catch (IOException e) {
            //output exception stack
            e.printStackTrace();
        } finally {
            //Setup try/catch/finally blocks for exception handling
            try {

                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }   //end main method
}   //end ReadFile class
