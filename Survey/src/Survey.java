/**
 * Created by john on 10/29/16.
 */

// File: hw1.java
// Author: John Bernat
// Date: 23-10-2016
// Purpose: take input, run some calculations and display output

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args){
        // declare variables
        int emplid;
        double quiz1;
        double quiz2;
        double quiz_avg;
        int age;
        double temp_far;
        double temp_cel;

        //get input
        Scanner stdin = new Scanner(System.in);
        //Enter your Student EMPLID (0 - 999999): 4301
        System.out.print("Enter your Student EMPLID (0-999999): ");
        emplid = stdin.nextInt();
        //---> verify input
        if (!(emplid > 0) && !(emplid < 999999)) {
            System.out.println("Please enter a correct EMPLID (0 - 999999)");
        }


        //Enter your quiz1 percentage score (0.0 – 100.0): 89.1
        System.out.print("Enter your quiz1 percentage score (0.0 - 100.0): ");
        quiz1 = stdin.nextDouble();
        //---> verify input

        //Enter your quiz2 percentage score (0.0 – 100.0): 82.1
        System.out.print("Enter your quiz2 percentage score (0.0 - 100.0): ");
        quiz2 = stdin.nextDouble();
        //---> verify input

        //Enter your age (0-120): 32
        System.out.print("Enter your age (0-120): ");
        age = stdin.nextInt();
        //---> verify input

        //Enter the current Temperature in degrees Fahrenheit: 32.0
        System.out.print("Enter the current Temperature in degrees Fahrenheit: ");
        temp_far = stdin.nextDouble();
        //---> verify input

        //calculations
        //average the two quiz scores
        quiz_avg = (quiz1 + quiz2) / 2;
        //convert fahrenheit to celsius
        temp_cel = (temp_far - 32) * 5/9;

        System.out.println("");
        System.out.println("******* Thank you for completing our survey **********************************");

        //provide output
        //Student EMPLID: 4301
        System.out.println("Student EMPLID: " + emplid);
        //Quiz 1 Score: 89.1
        System.out.println("Quiz 1 Score: " + quiz1 + "%");
        //Quiz 2 Score: 82.1
        System.out.println("Quiz 2 Score: " + quiz2 + "%");
        //Average quiz score: 85.6
        System.out.println("Average quiz score: " + quiz_avg + "%");
        //Temperature in Celsius: 0.0
        System.out.println("Temperature in Celsius: " + temp_cel + "\u00B0");
        //Age: 32
        System.out.println("Age: " + age);

    }  //end main method
}  //end class hw1
