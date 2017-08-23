/** File: Menu.java
 * Author: John Bernat
 * Date: 16 Dec 2016
 * Purpose: return menu as a string when called
 */

public class Menu {
    public static String getMenu() {
        //instantiate and read menu into string variable
        String menu = "\n" +
                "Enter the number of the question you want answered. Enter ‘Q’ to quit the program :\n" +
                "1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n" +
                "2. What year was the Murder rate the highest?\n" +
                "3. What year was the Murder rate the lowest?\n" +
                "4. What year was the Robbery rate the highest?\n" +
                "5. What year was the Robbery rate the lowest?\n" +
                "6. What was the total percentage change in Motor Vehicle Theft between 1998 and 2012?\n" +
                "7. What was the Population when the Violent crime rate was the highest?\n" +
                "8. What was Violent crime rate when the Burglary rate was the highest?\n" +
                "9. View a table of all statistical data.\n" +
                "Q. Quit the program\n" +
                "Enter your selection:" +
                "";

        return menu;
    }   // end getMenu method
}   // end Menu class
