import javax.swing.*;
import java.util.Arrays;

/**
 * Created by john on 11/27/16.
 */

import java.util.Arrays;

public class test3 {

/*  ------------- create a single line of code to sort array ---------------
//You have an int array named examScores that is 1000 elements in length.
// Provide a single line of code that would sort the examScores.
// (Note: You do not need to provide the import statements supporting the line of code)

    public static void main(String[] args) {
        final int ARRAYLENGTH=10;

        //initialize array
        int[] examScores = new int[ARRAYLENGTH];

        //for loop to add values in array
        for (int i = 0; i < examScores.length; i++) {
            examScores[i] = (int) (Math.random() * 10);
        }

        //print unsorted array
        for (int i = 0; i < examScores.length; i++) {
            System.out.println(examScores[i]);
        }

        //sort array
        Arrays.sort(examScores);  //  <<------- this is the answer
        System.out.println("------------");

        //print sorted array
        for (int i = 0; i < examScores.length; i++) {
            System.out.println(examScores[i]);
        }


    }   //end main method
//----------------------------------------------------------------------------------------
*/


/*  -------------- create a method that will compute the average of an array of doubles ---------------
    public static double average(double[] x) {
        //initialize sum double
        double sum = 0;

        //for loop to add values in array
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }

        //initialize avg double set to the result of the sum divided by the length of the array
        double avg = sum / x.length;

        //return avg
        return avg;
    } //end average method


    public static void main(String[] args) {
        final int ARRAYLENGTH=10;

        //initialize array
        double[] examScores = new double[ARRAYLENGTH];

        //for loop to add values in array
        for (int i = 0; i < examScores.length; i++) {
            examScores[i] = Double.parseDouble((String) String.format("%.2f", Math.random() * 10));
        }

        //print array
        for (int i = 0; i < examScores.length; i++) {
            System.out.println(examScores[i]);

        }

        System.out.println("------------");

        System.out.println(Double.parseDouble((String) String.format("%.2f", average(examScores))));

    }  //end main method

//--------------------------------------------------------------------------------------------------------
*/



/*  -------------- create 2d array of random ints and display in 5 rows by 10 columns ---------------
    public static void main(String[] args) {

        final int COLUMNS = 10;
        final int ROWS = 5;

        //Create array of doubles 2 D
        int[][] array = new int[COLUMNS][ROWS];

        // Assign random values
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int j = 0; j < ROWS; j++) {
            for (int i = 0; i < COLUMNS; i++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }   //end main method

//-------------------------------------------------------------------------------------------------------
*/


/*  -------------- create 2d array of random ints and display in 5 rows by 10 columns --------------
// You have an int array named examScore that is 100 elements in length.
// Provide a single line of code that would search the examScores for values that
// are 50.

    public static void main(String[] args) {
        final int ARRAYLENGTH=100;

        //initialize array
        int[] examScores = new int[ARRAYLENGTH];

        //for loop to add values in array
        for (int i = 0; i < examScores.length; i++) {
            examScores[i] = i+43;
        }

        //print unsorted array
        for (int i = 0; i < examScores.length; i++) {
            System.out.println(examScores[i]);
        }

        System.out.println("------------");
        //sort array
        System.out.println(Arrays.binarySearch(examScores, 50));  //  <<------- this is the answer
        System.out.println("------------");



    }   //end main method
//-------------------------------------------------------------------------------------------------------
*/


/*  -------------------------------  create a 3d array of random ints --------------------------------
    public static void main(String[] args) {
        final int FIRST = 2;
        final int SECOND = 2;
        final int THIRD = 2;

        //int[] examScores = new int[1000];

        //Create array of doubles
        int[][][] rowerScores = new int[2][2][2];

        // Assign random values
        //int r = 0;  //use this to count
        for (int k = 0; k < THIRD; k++) {
            for (int i = 0; i < SECOND; i++) {
                for (int j = 0; j < FIRST; j++) {
                    rowerScores[k][i][j] = (int) (Math.random() * 10 + 1);
                    //r++;  //use this to count
                }
            }
        }
        //Print list of values
        for (int k = 0; k < THIRD; k++) {
            for (int i = 0; i < SECOND; i++) {
                for (int j = 0; j < FIRST; j++) {
                    System.out.println("[" + k + "][" + i + "][" + j + "] " + rowerScores[k][i][j]);
                }
            }
        }
    }   //end main method
//--------------------------------------------------------------------------------------------------------
*/


}   //end test3 class