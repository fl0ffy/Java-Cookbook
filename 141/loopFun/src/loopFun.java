/** File: loopFun.java
 * Author: John Bernat
 * Date: 09 Nov 2016
 * Purpose: experiment with loop control structures using the fibonacci
 */

//import required java class
import java.util.Scanner;

public class loopFun {
    public static void main(String[] args) {

        //variables
        int a = 0;
        int b = 1;
        int sum = 0;
        int count;
        String loopType;

        // Use the Scanner class to read System.in
        Scanner stdin = new Scanner(System.in);

        // Prompt user to Enter choose type of loop
        System.out.print("what type of loop would you like to use (for, while, do-while)?: ");
        // the nextLine() method scans the next string value
        loopType = stdin.nextLine();

        // Prompt user to Enter your number the fibonacci should go to
        System.out.print("Fibonacci to what number? : ");
        // the nextInt() method scans the next int value
        count = stdin.nextInt();


        switch (loopType) {

            case "for":
                //for loop
                System.out.println("You have chosen the " + loopType + " loop type.");
                System.out.println(b);
                for (int counter = 0; counter <= count; counter = a + b) {
                    sum = a + b;
                    System.out.println(sum);
                    a = b;
                    b = sum;
                }
                break;

            case "while":
                //while loop
                System.out.println("You have chosen the " + loopType + " loop type.");
                System.out.println(b);
                while (a + b <= count) {
                    sum = a + b;
                    System.out.println(sum);
                    a = b;
                    b = sum;
                }
                break;

            case "do-while":
                //do-while loop
                System.out.println("You have chosen the " + loopType + " loop type.");
                System.out.println(b);
                do {
                    sum = a + b;
                    System.out.println(sum);
                    a = b;
                    b = sum;
                } while (a + b <= count);
                break;

            default:
                System.out.println("You have chosen a loop type that is not available.");
                System.out.println("Good day to you!");
                break;


        }

    } //end main method
} //end class loopFun
