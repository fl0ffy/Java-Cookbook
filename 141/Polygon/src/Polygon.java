/** File: Polygon.java
 * Author: John Bernat
 * Date: 20 Nov 2016
 * Purpose: learn to create classes and objects
 */

public class Polygon {

    // --- fields ---
    private int numSides;
    private double sideLength;
    private double xCoord;
    private double yCoord;
    private double apothem;
    private double perimeter;

    // --- Constructors ---
    //default polygon constructor
    public Polygon(){
        numSides = 4;
        sideLength = 10.0;
        xCoord = 0.0;
        yCoord = 0.0;
        apothem = 5.0;
        perimeter = 20.0;
    }

    //polygon constructor with input
    public Polygon(int pnumSides, double psideLength, double pxCoord, double pyCoord, double papothem, double pperimeter){
        numSides = pnumSides;
        sideLength = psideLength;
        xCoord = pxCoord;
        yCoord = pyCoord;
        apothem = papothem;
        perimeter = pperimeter;
    }

    // --- Setter methods ---
    //setNumSides
    public void setNumSides(int sNumSides){
        numSides = sNumSides;
    }
    //setSideLength
    public void setSideLength(double sSideLength){
        sideLength = sSideLength;
    }
    //setXCoord
    public void setXCoord(double sXCoord){
        xCoord = sXCoord;
    }
    //setYCoord
    public void setYCoord(double sYCoord){
        yCoord = sYCoord;
    }
    //setApothem
    public void setApothem(double sApothem){
        apothem = sApothem;
    }
    //setPerimeter
    public void setPerimeter(double sPerimeter){
        perimeter = sPerimeter;
    }

    // --- Getter methods ---
    //getNumSides
    public int getNumSides(){
        return numSides;
    }
    //getSideLength
    public double getSideLength(){
        return sideLength;
    }
    //getXCoord
    public double getXCoord(){
        return xCoord;
    }
    //getYCoord
    public double getYCoord(){
        return yCoord;
    }
    //getApothem
    public double getApothem(){
        return apothem;
    }
    //getPerimeter
    public double getPerimeter(){
        return perimeter;
    }
    //getArea method
    public double getArea(){
        double area = 1.0/2.0 * apothem * perimeter;
        return area;
    }

    // --- toString method ---
    public String toString(){
        String str = "(numSides=" + numSides +
                ", sideLength=" + sideLength +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", apothem=" + apothem +
                ", perimeter=" + perimeter +
                ")";
        return str;
    }

}
