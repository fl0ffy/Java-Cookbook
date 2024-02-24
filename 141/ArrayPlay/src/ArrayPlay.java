/** File: ArrayPlay.java
 * Author: John Bernat
 * Date: 24 Nov 2016
 * Purpose: learn to create create and use arrays
 */

import java.util.Arrays;

public class ArrayPlay {

    //Define constant array size
    static final int ARRAYSIZE = 10;

    //Main method
    public static void  main(String[] args) {

        int[] intValues = new int[ARRAYSIZE];

        //create random int array with random ints
        for (int i=0; i < intValues.length; i++){
            intValues[i] = (int) (Math.random() * 100);
        }

        //output intValues
        for (int o=0; o < intValues.length; o++){
            System.out.print(intValues[o] + "\t");
        }

        //output fun comment
        System.out.println("\n\nThis is very messy! Let's clean this up a bit.\n");

        //Sort values
        Arrays.sort(intValues);

        //output sorted intValues
        for (int o=0; o < intValues.length; o++){
            System.out.print(intValues[o] + "\t");
        }

        //output another fun comment
        System.out.println("\n\nNow that's better.\n");

    }   //end main method
}   //end ArrayPlay class
