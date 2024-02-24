/** File: TestPolygon.java
 * Author: John Bernat
 * Date: 20 Nov 2016
 * Purpose: learn to create classes and objects - Test case for Polygon.java
 */

public class TestPolygon {
    public static void main (String[] args) {

        // --- Test case 1 - polygonOne (default params) ---
        Polygon polygonOne = new Polygon();

        System.out.println(" -- Test Case 1 -- ");
        System.out.println("toString() results: " + polygonOne.toString() );
        System.out.println("getNumSides() results: " + polygonOne.getNumSides() );
        System.out.println("getSideLength() results: " + polygonOne.getSideLength() );
        System.out.println("getXCoord() results: " + polygonOne.getXCoord() );
        System.out.println("getYCoord() results: " + polygonOne.getYCoord() );
        System.out.println("getApothem() results: " + polygonOne.getApothem() );
        System.out.println("getPerimeter() results: " + polygonOne.getPerimeter() );
        System.out.println("getArea() results: " + polygonOne.getArea() );
        polygonOne.setNumSides(4);
        System.out.println("setNumSides(4) results: " + polygonOne.getNumSides() );
        polygonOne.setSideLength(3);
        System.out.println("setSideLength(3) results: " + polygonOne.getSideLength() );
        polygonOne.setXCoord(2.0);
        System.out.println("setXCoord(2.0) results: " + polygonOne.getXCoord() );
        polygonOne.setYCoord(2.0);
        System.out.println("setYCoord(2.0) results: " + polygonOne.getYCoord() );
        polygonOne.setApothem(2.0);
        System.out.println("setApothem(2.0) results: " + polygonOne.getApothem() );
        polygonOne.setPerimeter(2.0);
        System.out.println("setPerimeter(2.0) results: " + polygonOne.getPerimeter() );
        System.out.println();

        // --- Test case 2 - polygonTwo ---
        Polygon polygonTwo = new Polygon(1, 2.0, 3.0, 4.0, 5.0, 6.0);

        System.out.println(" -- Test Case 2 -- ");
        System.out.println("toString() results: " + polygonTwo.toString() );
        System.out.println("getNumSides() results: " + polygonTwo.getNumSides() );
        System.out.println("getSideLength() results: " + polygonTwo.getSideLength() );
        System.out.println("getXCoord() results: " + polygonTwo.getXCoord() );
        System.out.println("getYCoord() results: " + polygonTwo.getYCoord() );
        System.out.println("getApothem() results: " + polygonTwo.getApothem() );
        System.out.println("getPerimeter() results: " + polygonTwo.getPerimeter() );
        System.out.println("getArea() results: " + polygonTwo.getArea() );
        polygonTwo.setNumSides(6);
        System.out.println("setNumSides(6) results: " + polygonTwo.getNumSides() );
        polygonTwo.setSideLength(5);
        System.out.println("setSideLength(5) results: " + polygonTwo.getSideLength() );
        polygonTwo.setXCoord(4.0);
        System.out.println("setXCoord(4.0) results: " + polygonTwo.getXCoord() );
        polygonTwo.setYCoord(3.0);
        System.out.println("setYCoord(3.0) results: " + polygonTwo.getYCoord() );
        polygonTwo.setApothem(2.0);
        System.out.println("setApothem(2.0) results: " + polygonTwo.getApothem() );
        polygonTwo.setPerimeter(1.0);
        System.out.println("setPerimeter(1.0) results: " + polygonTwo.getPerimeter() );
        System.out.println();

        // --- Test case 3 - polygonThree ---
        Polygon polygonThree = new Polygon(11, 12.0, 13.0, 14.0, 15.0, 16.0);

        System.out.println(" -- Test Case 3 -- ");
        System.out.println("toString() results: " + polygonThree.toString() );
        System.out.println("getNumSides() results: " + polygonThree.getNumSides() );
        System.out.println("getSideLength() results: " + polygonThree.getSideLength() );
        System.out.println("getXCoord() results: " + polygonThree.getXCoord() );
        System.out.println("getYCoord() results: " + polygonThree.getYCoord() );
        System.out.println("getApothem() results: " + polygonThree.getApothem() );
        System.out.println("getPerimeter() results: " + polygonThree.getPerimeter() );
        System.out.println("getArea() results: " + polygonThree.getArea() );
        polygonThree.setNumSides(16);
        System.out.println("setNumSides(16) results: " + polygonThree.getNumSides() );
        polygonThree.setSideLength(15);
        System.out.println("setSideLength(15) results: " + polygonThree.getSideLength() );
        polygonThree.setXCoord(14.0);
        System.out.println("setXCoord(14.0) results: " + polygonThree.getXCoord() );
        polygonThree.setYCoord(13.0);
        System.out.println("setYCoord(13.0) results: " + polygonThree.getYCoord() );
        polygonThree.setApothem(12.0);
        System.out.println("setApothem(12.0) results: " + polygonThree.getApothem() );
        polygonThree.setPerimeter(11.0);
        System.out.println("setPerimeter(11.0) results: " + polygonThree.getPerimeter() );
        System.out.println();


        // --- Test case 4 - polygonFour ---
        Polygon polygonFour = new Polygon(15, 25.0, 35.0, 45.0, 55.0, 65.0);

        System.out.println(" -- Test Case 4 -- ");
        System.out.println("toString() results: " + polygonFour.toString() );
        System.out.println("getNumSides() results: " + polygonFour.getNumSides() );
        System.out.println("getSideLength() results: " + polygonFour.getSideLength() );
        System.out.println("getXCoord() results: " + polygonFour.getXCoord() );
        System.out.println("getYCoord() results: " + polygonFour.getYCoord() );
        System.out.println("getApothem() results: " + polygonFour.getApothem() );
        System.out.println("getPerimeter() results: " + polygonFour.getPerimeter() );
        System.out.println("getArea() results: " + polygonFour.getArea() );
        polygonFour.setNumSides(11);
        System.out.println("setNumSides(11) results: " + polygonFour.getNumSides() );
        polygonFour.setSideLength(21);
        System.out.println("setSideLength(21) results: " + polygonFour.getSideLength() );
        polygonFour.setXCoord(31.0);
        System.out.println("setXCoord(31.0) results: " + polygonFour.getXCoord() );
        polygonFour.setYCoord(41.0);
        System.out.println("setYCoord(41.0) results: " + polygonFour.getYCoord() );
        polygonFour.setApothem(51.0);
        System.out.println("setApothem(51.0) results: " + polygonFour.getApothem() );
        polygonFour.setPerimeter(61.0);
        System.out.println("setPerimeter(61.0) results: " + polygonFour.getPerimeter() );
        System.out.println();

        // --- Test case 5 - polygonFive ---
        Polygon polygonFive = new Polygon(36, 112.2, 59.4, 93.2, 2.56, 234.0);

        System.out.println(" -- Test Case 5 -- ");
        System.out.println("toString() results: " + polygonFive.toString() );
        System.out.println("getNumSides() results: " + polygonFive.getNumSides() );
        System.out.println("getSideLength() results: " + polygonFive.getSideLength() );
        System.out.println("getXCoord() results: " + polygonFive.getXCoord() );
        System.out.println("getYCoord() results: " + polygonFive.getYCoord() );
        System.out.println("getApothem() results: " + polygonFive.getApothem() );
        System.out.println("getPerimeter() results: " + polygonFive.getPerimeter() );
        System.out.println("getArea() results: " + polygonFive.getArea() );
        polygonFive.setNumSides(54);
        System.out.println("setNumSides(54) results: " + polygonFive.getNumSides() );
        polygonFive.setSideLength(87);
        System.out.println("setSideLength(87) results: " + polygonFive.getSideLength() );
        polygonFive.setXCoord(42.4);
        System.out.println("setXCoord(42.4) results: " + polygonFive.getXCoord() );
        polygonFive.setYCoord(7.47);
        System.out.println("setYCoord(7.47) results: " + polygonFive.getYCoord() );
        polygonFive.setApothem(245.5);
        System.out.println("setApothem(245.5) results: " + polygonFive.getApothem() );
        polygonFive.setPerimeter(57.45);
        System.out.println("setPerimeter(57.45) results: " + polygonFive.getPerimeter() );
        System.out.println();


        /*
        // --- Test case 6 - polygonFive ---
        Polygon polygonSix = new Polygon(36.5, 2.5, 2.5, 2.5, 2.5, 2.5);

        System.out.println(" -- Test Case 6 -- ");
        System.out.println("toString() results: " + polygonSix.toString() );
        System.out.println("getNumSides() results: " + polygonSix.getNumSides() );
        System.out.println("getSideLength() results: " + polygonSix.getSideLength() );
        System.out.println("getXCoord() results: " + polygonSix.getXCoord() );
        System.out.println("getYCoord() results: " + polygonSix.getYCoord() );
        System.out.println("getApothem() results: " + polygonSix.getApothem() );
        System.out.println("getPerimeter() results: " + polygonSix.getPerimeter() );
        System.out.println("getArea() results: " + polygonSix.getArea() );
        polygonSix.setNumSides(3.0);
        System.out.println("setNumSides(3.0) results: " + polygonSix.getNumSides() );
        polygonSix.setSideLength(3.0);
        System.out.println("setSideLength(3.0) results: " + polygonSix.getSideLength() );
        polygonSix.setXCoord(3.0);
        System.out.println("setXCoord(3.0) results: " + polygonSix.getXCoord() );
        polygonSix.setYCoord(3.0);
        System.out.println("setYCoord(3.0) results: " + polygonSix.getYCoord() );
        polygonSix.setApothem(3.0);
        System.out.println("setApothem(3.0) results: " + polygonSix.getApothem() );
        polygonSix.setPerimeter(3.0);
        System.out.println("setPerimeter(3.0) results: " + polygonSix.getPerimeter() );
        System.out.println();
        */

    }
}
