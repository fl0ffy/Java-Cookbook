/** File: Menu.java
 * Author: John Bernat
 * Date: 17 Dec 2016
 * Purpose: provides various utilities to find array indexes based on some search criteria
 */

public class ArrayUtils {

    // ----------- fields ----------
    private static final int YEARCOLUMNINDEX = 0;
    private static final int HEADINGROWINDEX = 0;


    //getHeadingIndex - column
    public static int getHeadingIndex(String[][] array, String heading){
        int columnIndex = 0;

        for (int i = 1; i < 20; i++){
            if (array[HEADINGROWINDEX][i].equals(heading)){
                columnIndex = i;
            }
        }
        return columnIndex;
    }   //end getHeadingIndex method

    //getYearIndex - row
    public static int getYearIndex(String[][] array, String year){
        int rowIndex = 0;

        for (int i = 1; i < 21; i++){
            if (array[i][YEARCOLUMNINDEX].equals(year)){
                rowIndex = i;
            }
        }
        return rowIndex;
    }   //end getHeadingIndex method

    //getMaxValueRowIndex
    public static int getMaxValueRowIndex(String[][] array, int columnIndex){
        double maxValue = 0;
        double value;
        int rowIndex = 0;

        for (int i = 1; i < 21; i++){
            value = Double.parseDouble(array[i][columnIndex]);
            if (maxValue < value) {
                maxValue = value;
                rowIndex = i;
            }
        }
        return rowIndex;
    }   //end getMaxValueRowIndex method

    //getMinValueRowIndex
    public static int getMinValueRowIndex(String[][] array, int columnIndex){
        double minValue = 1000000000;
        double value;
        int rowIndex = 0;

        for (int i = 1; i < 21; i++){
            value = Double.parseDouble(array[i][columnIndex]);
            if (minValue > value) {
                minValue = value;
                rowIndex = i;
            }
        }
        return rowIndex;
    }   //end getMinValueRowIndex method


}   //end ArraysUtils class
