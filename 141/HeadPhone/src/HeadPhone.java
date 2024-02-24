/** File: HeadPhone.java
 * Author: John Bernat
 * Date: 04 Dec 2016
 * Purpose: Create class for headphones
 */

//import classes
import java.awt.Color;

public class HeadPhone {

    // --- constants ---
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    // --- data fields ---
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;

    // --- Constructors ---
    //default
    public HeadPhone() {
        volume = MEDIUM;
        pluggedIn = false;
        manufacturer = "unknown";
        headPhoneColor = Color.black;
    }

    //data input
    public HeadPhone(int volume, boolean pluggedIn, String manufacturer, Color headPhoneColor) {
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.manufacturer = manufacturer;
        this.headPhoneColor = headPhoneColor;
    }

    // --- Setter methods ---
    //setVolume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    //setPluggedIn
    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }
    //setManufacturer
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    //setHeadPhoneColor
    public void setHeadPhoneColor(Color headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }

    // --- Getter methods ---
    //getVolume
    public int getVolume() {
        return volume;
    }
    //getPluggedIn
    public boolean getPluggedIn() {
        return pluggedIn;
    }
    //getManufacturer
    public String getManufacturer() {
        return manufacturer;
    }
    //getHeadPhoneColor
    public Color getHeadPhoneColor() {
        return headPhoneColor;
    }

    // --- changeVolume method ---
    public int changeVolume(int volume){
        setVolume(volume);
        return this.volume;
    }

    // --- toString method ---
    public String toString() {
        String str = "(volume=" + volume +
                ", pluggedIn=" + pluggedIn +
                ", manufacturer=" + manufacturer +
                ", headPhoneColor=" + headPhoneColor +
                ")";
        return str;
    }

}   //end HeadPhone class
