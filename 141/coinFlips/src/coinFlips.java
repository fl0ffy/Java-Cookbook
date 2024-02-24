/**
 * Created by john on 11/24/16.
 */

// You have an int array named examScores that is 1000 elements in length.
// Provide a single line of code that would sort the examScores.
// (Note: You do not need to provide the import statements supporting the line of code)

import java.util.Random;

public class coinFlips {
    public static void main (String[] args){

        //set array size
        final int ARRAYSIZE = 10;

        //setup arrays
        boolean[] flipsBool = new boolean[ARRAYSIZE];
        String[] flipsString = new String[ARRAYSIZE];

        //conduct coin flip by entering random booleans into array
        for (int f=0; f < flipsBool.length; f++){
            Random r = new Random();
            flipsBool[f] = r.nextBoolean();
        }

        //convert results from true/false to heads/tails

        for (int r=0; r < flipsBool.length; r++){
            if (flipsBool[r] == true){
                flipsString[r] = "heads";
            }
            if (flipsBool[r] == false){
                flipsString[r] = "tails";
            }
            System.out.println(flipsString[r]);
        }

        //determine winner
        


    }   //end main method
}   //end coinFlips class
