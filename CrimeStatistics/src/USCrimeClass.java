/** File: USCrimeClass.java
 * Author: John Bernat
 * Date: 18 Dec 2016
 * Purpose: Read in and store data.
 */

public class USCrimeClass {

    // ---------- fields ----------
    final int COLUMN = 20;
    final int ROW = 21;
    String crimeData2D[][] = new String[ROW][COLUMN];

    // ---------- Constructors ----------
    public USCrimeClass(String crime2darray[][]) {
        this.crimeData2D = crime2darray;
    }

    // --------- getMinMax Method ---------
    protected String getMinMax(String heading, String highestOrLowest) {
        // ---------- Fields ----------
        int rowIndex = 0;
        int columnIndex;
        final int YEARCOLUMNINDEX = 0;
        //returnFields
        String returnYear;
        String returnValue;
        String results = "AHHHHH";

        //set columnIndex to matching heading
        columnIndex = ArrayUtils.getHeadingIndex(this.crimeData2D, heading);

        switch (highestOrLowest){
            case "highest":
                //based on columnIndex set rowIndex to the highest value
                rowIndex = ArrayUtils.getMaxValueRowIndex(this.crimeData2D, columnIndex);
                break;
            case "lowest":
                //based on columnIndex set rowIndex to the lowest value
                rowIndex = ArrayUtils.getMinValueRowIndex(this.crimeData2D, columnIndex);
                break;
            default: System.out.println("you are dumb, high or low?");
                break;
        }

        //based on rowIndex get the year for that row
        returnYear = crimeData2D[rowIndex][YEARCOLUMNINDEX];
        returnValue = crimeData2D[rowIndex][columnIndex];

        results = "The " + highestOrLowest + " " + heading + " was at " + returnValue + " in " + returnYear + ".";
        return results;
    }   //end getMinMax method


    // --------- percentageChange method ----------
    public String getPercentChanged(String heading, String yearOne, String yearTwo) {
        // ---------- Fields ----------
        int firstRowIndex;
        int columnIndex;
        int secondRowIndex;
        String returnValue;

        //search for the first year's row
        firstRowIndex = ArrayUtils.getYearIndex(this.crimeData2D, yearOne);
        //search for the second year's row
        secondRowIndex = ArrayUtils.getYearIndex(this.crimeData2D, yearTwo);
        //search for heading value and set column
        columnIndex = ArrayUtils.getHeadingIndex(this.crimeData2D, heading);

        //Calculations
        double firstStat = Double.parseDouble(crimeData2D[firstRowIndex][columnIndex]);
        double secondStat = Double.parseDouble(crimeData2D[secondRowIndex][columnIndex]);
        double difference = ((secondStat - firstStat) / firstStat) * 100;

        returnValue ="The percentage change for " + heading + " from " + yearOne + " to " + yearTwo + " was " +
                difference + "%.";
        return returnValue;
    }   //end perChange method


    // --------- getValueWhen method ----------
    public String getValueWhen(String firstHeading, String secondHeading, String highestOrLowest) {
        // ---------- Fields ----------
        int rowIndex = 0;
        int firstColumnIndex;
        int secondColumnIndex;
        final int YEARCOLUMNINDEX = 0;
        //returnFields
        String returnYear;
        String returnValue;
        String results = "AHHHH";


        //search for first heading value and set firstColumnIndex
        firstColumnIndex = ArrayUtils.getHeadingIndex(this.crimeData2D, firstHeading);

        //search for first heading value and set secondColumnIndex
        secondColumnIndex = ArrayUtils.getHeadingIndex(this.crimeData2D, secondHeading);

        //determine min/max value in secondColumnIndex and return rowIndex
        switch (highestOrLowest){
            case "highest":
                //based on columnIndex set rowIndex to the highest value
                rowIndex = ArrayUtils.getMaxValueRowIndex(this.crimeData2D, secondColumnIndex);
                break;
            case "lowest":
                //based on columnIndex set rowIndex to the lowest value
                rowIndex = ArrayUtils.getMinValueRowIndex(this.crimeData2D, secondColumnIndex);
                break;
            default: System.out.println("you are dumb, high or low?");
                break;
        }

        //sets up return values
        returnValue = crimeData2D[rowIndex][firstColumnIndex];
        returnYear = crimeData2D[rowIndex][YEARCOLUMNINDEX];
        results = "The " + firstHeading + " was at " + returnValue + " when " + secondHeading +
                " was at it's " + highestOrLowest + " in " + returnYear + ".";

        return results;
    }   //end getValueWhen method

    //Additional Methods go here

    //This section prints the 2d array -- for verification
    public StringBuilder getAllData() {
        //This section prints the 2d array -- for verification
        //sets the row
        StringBuilder allData = new StringBuilder("********** US Crime Statistical Data **********\n");
        for (int i = 0; i < ROW; i++) {
            //sets the columns
            for (int j = 0; j < COLUMN; j++) {
                allData.append(crimeData2D[i][j] + "\t");
            }
            allData.append("\n");
        }

        return allData;
    }   //end getAllData method


}   //end USCrimeClass
