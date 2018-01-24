/**
 * Filename: P2GUI.java
 * Author: John Bernat
 * Date: ?
 * Purpose: Define GUI, event handlers and contains main method
 */

import javax.swing.*;
import java.awt.*;

public class P2GUI extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;

    //constructor method
    public P2GUI () {
        //create JFrame object
        super("ATM Machine");

        //set JFrame layout and other options
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        //create components
        textPanel = new TextPanel();
        toolbar = new Toolbar();

        //toolbar.setTextPanel(textPanel);
        toolbar.setStringListenter(new StringListener() {
            public void textEmitted(String text) {
                //System.out.print(text);
                textPanel.appendText(text);
            }
        });

        //add components to JFrame
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
    }

    //two account abjects (checking, savings)

    //Main method

    //constructor to build GUI

    //withdraw button w/ event handling (joptionpane error for insufficientFunds exception)

    //deposit button w/ event handling

    //transfer to button w/ event handling (joptionpane error for insufficientFunds exception)

    //balance button w/ event handling

    //radio buttons for account (checking, savings)

    //check all user input values are valid numeric values

}
