/** File: StateBirdFlower.java
 * Author: John Bernat
 * Date: 11 Dec 2016
 * Purpose: Test StateBirdFlower class
 */

//import classes
import java.util.Scanner;

public class TestStateBirdFlower {
    public static void main(String[] args) {

        String userInput = "blank";

        //setup scanner
        Scanner stdin = new Scanner(System.in);

        //loop while userInput is not equal to "none"
        while ( !(userInput.equalsIgnoreCase("none"))) {
            //get user input and set variable
            System.out.print("Enter a State or None to exit: ");
            userInput = stdin.nextLine();

            //check to see if user input in none prior to running method
            if (userInput.equalsIgnoreCase("none")) {
                System.exit(0);
            } // end if statement

            //Create object
            StateBirdFlower state = new StateBirdFlower(userInput);

            //check to see if the results are null
            if (state.getBird() == null) {
                System.out.println("State not found. You may need to check your spelling. Please try again.");
            } else {
                //Call toString method to return info
                System.out.println(state.toString());
            } // end if-else statement

        }   //end while loop


    }   //end main method
}   // end TestStateBirdFlower class
