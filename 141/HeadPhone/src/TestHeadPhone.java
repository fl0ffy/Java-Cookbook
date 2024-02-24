import java.awt.*;

/** File: TestHeadPhone.java
 * Author: John Bernat
 * Date: 04 Dec 2016
 * Purpose: test class HeadPhone
 */

public class TestHeadPhone {
    public static void main (String[] args){

        // ----- headPhoneOne -----
        System.out.println("\n----- This is headPhoneOne -----\n");
        //create headPhoneOne
        HeadPhone headPhoneOne = new HeadPhone();
        //toString headPhoneOne
        System.out.println("headphoneOne: " + headPhoneOne.toString());

        //set headPhoneOne
        //setVolume
        headPhoneOne.setVolume(1);
        //setPluggedIn
        headPhoneOne.setPluggedIn(false);
        //setManufacturer
        headPhoneOne.setManufacturer("Skull Candy");
        //setHeadPhoneColor
        headPhoneOne.setHeadPhoneColor(Color.gray);
        //toString headphoneOne
        System.out.println("headphoneOne: " + headPhoneOne.toString());

        //get headPhoneOne
        //getVolume
        System.out.println("headphoneOne volume: " + headPhoneOne.getVolume());
        //getPluggedIn
        System.out.println("headphoneOne pluggedIn: " + headPhoneOne.getPluggedIn());
        //getManufacturer
        System.out.println("headphoneOne manufacturer: " + headPhoneOne.getManufacturer());
        //getHeadPhoneColor
        System.out.println("headphoneOne color: " + headPhoneOne.getHeadPhoneColor());

        //change headPhoneOne
        //changeVolume
        headPhoneOne.changeVolume(3);
        //toString headPhoneOne
        System.out.println("headphoneOne: " + headPhoneOne.toString());


        // ----- headPhoneTwo -----
        System.out.println("\n----- This is headPhoneTwo ----\n");
        //create headPhoneTwo
        HeadPhone headPhoneTwo = new HeadPhone(1, true, "sony", Color.blue );
        //toString headPhoneTwo
        System.out.println("headphoneTwo: " + headPhoneTwo.toString());

        //set headPhoneTwo
        //setVolume
        headPhoneTwo.setVolume(3);
        //setPluggedIn
        headPhoneTwo.setPluggedIn(false);
        //setManufacturer
        headPhoneTwo.setManufacturer("Sony");
        //setHeadPhoneColor
        headPhoneTwo.setHeadPhoneColor(Color.cyan);
        //toString headphoneOne
        System.out.println("headPhoneTwo: " + headPhoneTwo.toString());

        //get headPhoneTwo
        //getVolume
        System.out.println("headPhoneTwo volume: " + headPhoneTwo.getVolume());
        //getPluggedIn
        System.out.println("headPhoneTwo pluggedIn: " + headPhoneTwo.getPluggedIn());
        //getManufacturer
        System.out.println("headPhoneTwo manufacturer: " + headPhoneTwo.getManufacturer());
        //getHeadPhoneColor
        System.out.println("headPhoneTwo color: " + headPhoneTwo.getHeadPhoneColor());

        //change headPhoneTwo
        //changeVolume
        headPhoneTwo.changeVolume(2);
        //toString headPhoneTwo
        System.out.println("headPhoneTwo: " + headPhoneTwo.toString());


        // ----- headPhoneThree -----
        System.out.println("\n----- This is headPhoneThree ----\n");
        //create headPhoneThree
        HeadPhone headPhoneThree = new HeadPhone(3, false, "Beats", Color.green);
        //toString headPhoneThree
        System.out.println("headphoneThree: " + headPhoneThree.toString());

        //set headPhoneThree
        //setVolume
        headPhoneThree.setVolume(1);
        //setPluggedIn
        headPhoneThree.setPluggedIn(true);
        //setManufacturer
        headPhoneThree.setManufacturer("Beat by Dre");
        //setHeadPhoneColor
        headPhoneThree.setHeadPhoneColor(Color.pink);
        //toString headPhoneThree
        System.out.println("headPhoneThree: " + headPhoneThree.toString());

        //get headPhoneThree
        //getVolume
        System.out.println("headPhoneThree volume: " + headPhoneThree.getVolume());
        //getPluggedIn
        System.out.println("headPhoneThree pluggedIn: " + headPhoneThree.getPluggedIn());
        //getManufacturer
        System.out.println("headPhoneThree manufacturer: " + headPhoneThree.getManufacturer());
        //getHeadPhoneColor
        System.out.println("headPhoneThree color: " + headPhoneThree.getHeadPhoneColor());

        //change headPhoneThree
        //changeVolume
        headPhoneThree.changeVolume(2);
        //toString headPhoneThree
        System.out.println("headPhoneThree: " + headPhoneThree.toString());


        /*// ----- headPhoneFour -----
        System.out.println("\n----- This is headPhoneFour -----\n");
        //create headPhoneFour
        HeadPhone headPhoneFour = new HeadPhone(3,off,"samsung",Color.tan);
        //toString headPhoneFour
        System.out.println("headPhoneFour: " + headPhoneFour.toString());

        //set headPhoneFour
        //setVolume
        headPhoneFour.setVolume(1);
        //setPluggedIn
        headPhoneFour.setPluggedIn(on);
        //setManufacturer
        headPhoneFour.setManufacturer("Samsung");
        //setHeadPhoneColor
        headPhoneFour.setHeadPhoneColor(Color.gray);
        //toString headPhoneFour
        System.out.println("headPhoneFour: " + headPhoneFour.toString());

        //get headPhoneFour
        //getVolume
        System.out.println("headPhoneFour volume: " + headPhoneFour.getVolume());
        //getPluggedIn
        System.out.println("headPhoneFour pluggedIn: " + headPhoneFour.getPluggedIn());
        //getManufacturer
        System.out.println("headPhoneFour manufacturer: " + headPhoneFour.getManufacturer());
        //getHeadPhoneColor
        System.out.println("headPhoneFour color: " + headPhoneFour.getHeadPhoneColor());

        //change headPhoneFour
        //changeVolume
        headPhoneFour.changeVolume(louder);
        //toString headPhoneFour
        System.out.println("headPhoneFour: " + headPhoneFour.toString());
        */

    }   //end main method
}   //end TestHeadPhone class
