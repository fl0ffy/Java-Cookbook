/** File: RandomNumbers.java
 * Author: John Bernat
 * Date: 05 Dec 2016
 * Purpose: Create class to create randomNumber objects with methods to generate a random number between given values
 */

//import classes
import java.util.Arrays;

public class RandomNumbers {
    // --- fields ---
    private int min;            //min number in range given via user input
    private int max;            //max number in range given via user input
    private int arraySize;
    private int randomNumber;   //make this an array with size as user input
    private String randomNumbersArrayString;

    // --- Constructors ---
    public RandomNumbers() {
        min = 0;
        max = 10;
        arraySize = 10;
    }

    // --- Setters ---
    //setMin
    public void setMin(int min) {
        this.min = min;
    }
    //setMax
    public void setMax(int max) {
        this.max = max;
    }
    //setArraySize
    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    // --- Getters ---
    //getMin
    public int getMin() {
        return min;
    }
    //getMax
    public int getMax() {
        return max;
    }
    //getArraySize
    public int getArraySize() {
        return arraySize;
    }


    // --- Methods ---
    // generate random number (inclusive)
    private int generateRandomNumber() {
        int range = (this.max - this.min) + 1;
        this.randomNumber = (int)(Math.random() * range) + this.min;
        return randomNumber;
    }

    //generate random number array (uses generate random number method
    public String getRandomNumberArray() {
        //create array
        int[] randomNumbersArray = new int[arraySize];
        //fill array with random numbers
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = generateRandomNumber();
        }
        randomNumbersArrayString = (Arrays.toString(randomNumbersArray));
        return randomNumbersArrayString;
    }

    // --- toString Method ---
    public String toString() {
        String str = "The " + arraySize + " random numbers between " + min +
                " and " + max +
                " are " + randomNumbersArrayString
                ;
        return str;
    }




}   //end RandomNumbers Class
