/** File: Fireplace.java
 * Author: John Bernat
 * Date: 01 Dec 2016
 * Purpose: Create class Fireplace
 */

/*
* Design and implement your own simple class to represent any household item of your
* choice (toaster, fan, hair dryer, piano ...) Your class should have a constructor,
* one additional method and at least one member variable (e.g. boolean isOn to turn
* the item on or off). Be sure you demonstrate your class works properly by constructing
* an instance of it and calling your method.
*/

public class Fireplace {

    // --- Fields ---
    private boolean isOn;
    private String fuelType;     //e.g. gas, wood, electric, ...
    private String roomLocation; //e.g. living, dining, bedroom, ...

    // --- Constructors ---
    //default
    public Fireplace() {
        isOn = false;
        fuelType = "wood";
        roomLocation = "living room";
    }

    //input
    public Fireplace(boolean isOn, String fuelType, String roomLocation) {
        this.isOn = isOn;
        this.fuelType = fuelType;
        this.roomLocation = roomLocation;
    }

    // --- Setter Methods ---
    //setIsOn
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    //setFuelType
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    //setRoomLocation
    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }

    // --- Getter Methods ---
    //getIsOn
    public String getIsOn() {
        String on = "on";
        String off = "off";

        if (isOn) {
            return on;
        } else {
        return off;
        }
    }
    //getFuelType
    public String getFuelType() {
        return fuelType;
    }
    //getRoomLocation
    public String getRoomLocation() {
        return roomLocation;
    }

    // --- Other Methods ---
    public boolean turnOn(){
        setIsOn(true);
        return this.isOn;
    }

    public boolean turnOff(){
        setIsOn(false);
        return this.isOn;
    }

    // --- toString Method ---
    public String toString() {
        String str = "(" +
                "isOn=" + isOn +
                ", fuelType=" + fuelType +
                ", roomLocation=" + roomLocation +
                ")";
        return str;
    }

}   //End Fireplace class
