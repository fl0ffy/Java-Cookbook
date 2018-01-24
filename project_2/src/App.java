/**
 * Filename: P2GUI.java
 * Author: John Bernat
 * Date: ?
 * Purpose: temp main method while i figure this out
 */

import javax.swing.*;

public class App {
    public static void main (String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //create and run MainFrame object
                new P2GUI();
            }
        });

    } //end main method
} //end App class