/** File: TestRandomNumbers.java
 * Author: John Bernat
 * Date: 05 Dec 2016
 * Purpose: Test the RandomNumbers class
 */

//import classes
import java.util.Scanner;

public class TestRandomNumbers {
    public static void main (String[] args){

        //create randomnumber object;
        RandomNumbers randomNumberFirst = new RandomNumbers();

        //setup scanner
        Scanner stdin = new Scanner(System.in);
        //prompt user for min/max input
        System.out.print("Enter lowest value for the range: ");
        randomNumberFirst.setMin(stdin.nextInt());

        //set min/max input
        System.out.print("Enter highest value for the range: ");
        randomNumberFirst.setMax(stdin.nextInt());

        //set min/max input
        System.out.print("Enter how many numbers you would like: ");
        randomNumberFirst.setArraySize(stdin.nextInt());

        //generate random number
        System.out.println("Your random numbers are: " + randomNumberFirst.getRandomNumberArray());
        System.out.println("\nSummary: " + randomNumberFirst.toString());


    }   //end main method
}   //end TestRandomNumbers class
