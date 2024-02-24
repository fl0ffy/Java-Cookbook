/** File: TestCrime.java
 * Author: John Bernat
 * Date:  Dec 2016
 * Purpose: Display menu to user and output data from various classes
 */

//import Classes
import java.util.Scanner;

public class TestCrime {
    public static void main(String[] args){
        try {
            //fields
            Long startTime, endTime, elapsedTime;
            String userInput;

            /** Create and instantiate USCrimeClass object
             * pass command line argument to CsvToArray.getArray static method to convert csv to 2d array
             * pass the returned array to the constructor as a parameter
             */
            USCrimeClass usCrimes = new USCrimeClass(CsvToArray.getArray(args[0]));


            //set start time
            startTime = System.nanoTime();

            //setup scanner
            Scanner stdin = new Scanner(System.in);

            System.out.println("\n********** Welcome to the US Crime Statistical Application **************************");

            //print menu
            // loop while userInput is not equal to "Q" or "q"
            while (true) {
                //Call Menu class static method getMenu and print
                System.out.println(Menu.getMenu());
                //take user input
                userInput = stdin.nextLine();

                //take action based on user choice
                switch (userInput.toLowerCase()) {
                    case "1":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getPercentChanged("Population","1994","1995"));
                        System.out.println(usCrimes.getPercentChanged("Population","1995","1996"));
                        System.out.println(usCrimes.getPercentChanged("Population","1996","1997"));
                        System.out.println(usCrimes.getPercentChanged("Population","1997","1998"));
                        System.out.println(usCrimes.getPercentChanged("Population","1998","1999"));
                        System.out.println(usCrimes.getPercentChanged("Population","1999","2000"));
                        System.out.println(usCrimes.getPercentChanged("Population","2000","2001"));
                        System.out.println(usCrimes.getPercentChanged("Population","2001","2002"));
                        System.out.println(usCrimes.getPercentChanged("Population","2002","2003"));
                        System.out.println(usCrimes.getPercentChanged("Population","2003","2004"));
                        System.out.println(usCrimes.getPercentChanged("Population","2004","2005"));
                        System.out.println(usCrimes.getPercentChanged("Population","2005","2006"));
                        System.out.println(usCrimes.getPercentChanged("Population","2006","2007"));
                        System.out.println(usCrimes.getPercentChanged("Population","2007","2008"));
                        System.out.println(usCrimes.getPercentChanged("Population","2008","2009"));
                        System.out.println(usCrimes.getPercentChanged("Population","2009","2010"));
                        System.out.println(usCrimes.getPercentChanged("Population","2010","2011"));
                        System.out.println(usCrimes.getPercentChanged("Population","2011","2012"));
                        System.out.println(usCrimes.getPercentChanged("Population","2012","2013"));
                        break;
                    case "2":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getMinMax("Murder and nonnegligent manslaughter rate","highest"));
                        break;
                    case "3":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getMinMax("Murder and nonnegligent manslaughter rate","lowest"));
                        break;
                    case "4":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getMinMax("Robbery rate","highest"));
                    break;
                    case "5":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getMinMax("Robbery rate","lowest"));
                        break;
                    case "6":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getPercentChanged("Motor Vehicle Theft","1998","2012"));
                        break;
                    case "7":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getValueWhen("Population","Violent crime rate","highest"));
                        break;
                    case "8":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getValueWhen("Violent crime rate", "Burglary rate","highest"));
                        break;
                    case "9":  System.out.println("\nyou have chosen: " + userInput + "\n");
                        System.out.println(usCrimes.getAllData());
                        break;
                    case "q"://end time and calculate duration of run in seconds
                        System.out.println("\nThank you for trying the US Crimes Statistics Program");
                        endTime = System.nanoTime(); //LocalTime.now().toSecondOfDay();
                        elapsedTime = (endTime - startTime) / 1000000000;
                        System.out.println("\nElapsed time in seconds was: " + elapsedTime);
                        //exit program without error
                        System.exit(0);
                        break;
                    default: System.out.println("\nInvalid selection. Please choose again.");
                        break;
                }   //end switch

            }   //end while loop

        } catch (ArrayIndexOutOfBoundsException oob) {
            System.out.println("\nThere was an issue. Please make sure you specify a file.");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("\nThere is something wrong and I don't know what it could be.");
            System.exit(1);
        }

    }   //end main method
}   //end TestCrime class
