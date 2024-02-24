/** File: TestFireplace.java
 * Author: John Bernat
 * Date: 01 Dec 2016
 * Purpose: Create class to test Fireplace class
 */

public class TestFireplace {
    public static void main (String[] args){

        //variables


        //construct a Fireplace
        Fireplace fireplaceOne = new Fireplace();

        System.out.println("it's cold in here do you have a fireplace? and is it on?");
        System.out.println("Here are the descriptions of the fireplaces in the house:\n"
                        + "fireplaceOne: " + fireplaceOne.toString());

                System.out.println("Why yes I do. I have a " + fireplaceOne.getFuelType() + " fireplace in the " + fireplaceOne.getRoomLocation() + " and right now it is " + fireplaceOne.getIsOn());


        if (fireplaceOne.getIsOn() == "off") {
            System.out.println("Oh, well, can you please turn it on?");
        }

        //turn on fireplaceOne
        fireplaceOne.setIsOn(true);
        System.out.println("The fireplace in the " + fireplaceOne.getRoomLocation() + " is " + fireplaceOne.getIsOn());

        //can we add an electric fireplace to the bedroom and turn it on?
        System.out.println("It sure is cold in this house. Can we put an electric fireplace in the bedroom i will be sleeping in tonight?");
        System.out.println("Sure thing!");

        Fireplace fireplaceTwo = new Fireplace(true, "electric", "bedroom");

        System.out.println("Alright, there is now an " + fireplaceTwo.getFuelType() + " fireplace in the " + fireplaceTwo.getRoomLocation() + " and right now it is " + fireplaceTwo.getIsOn());

        System.out.println("Here are the descriptions of the fireplaces in the house:\n"
                + "fireplaceOne: " + fireplaceOne.toString() + "\n" + "fireplaceTwo: " + fireplaceTwo.toString());


    }   //end main method
}   //End TestFireplace class
