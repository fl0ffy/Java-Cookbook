/**
 * Filename: P2GUI.java
 * Author: John Bernat
 * Date: ?
 * Purpose: Define GUI, event handlers and contains main method
 */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2GUI {


    //private JButton withdrawBtn;
    //private JButton depositBtn;
    //private JButton transferToBtn;
    //private JButton balanceBtn;
    //private Toolbar toolbar;
    //private StringListener textListener;
    //private JTextArea textArea;
    //private JRadioButton checkingRbtn;
    //private JRadioButton savingsRbtn;

    //===============> constructor method <===============
    public P2GUI () {
        //create JFrame object
        JFrame frame = new JFrame("ATM Machine");
        //set JFrame layout and other options
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // create panel components
        JPanel panel = new JPanel();
        JButton withdrawBtn = new JButton("Withdrawl");
        JButton depositBtn = new JButton("Deposit");
        JButton transferBtn = new JButton("Transfer To");
        JButton balanceBtn = new JButton("Balance");
        JRadioButton checkingRBtn = new JRadioButton("Checking");
        JRadioButton savingsRBtn = new JRadioButton("Savings");
        JTextField text = new JTextField(20);   // use text.getText()


        //setup and group radio buttons together
        checkingRBtn.setActionCommand("Checking");
        savingsRBtn.setActionCommand("Savings");
        ButtonGroup group = new ButtonGroup();
        group.add(checkingRBtn);
        group.add(savingsRBtn);
            //use group.getSelection().getActionCommand() to get value

        //add components to panel
        panel.add(withdrawBtn);
        panel.add(depositBtn);
        panel.add(transferBtn);
        panel.add(balanceBtn);
        panel.add(checkingRBtn);
        panel.add(savingsRBtn);
        panel.add(text);

        //add panel to frame
        frame.add(panel);

        // ActionListeners

        withdrawBtn.addActionListener(e -> System.out.println("Boom, Withdraw of " + text.getText() + " from " + group.getSelection().getActionCommand() + " !!!!"));
        depositBtn.addActionListener(e -> System.out.println("Sweet, Deposit of " + text.getText() + " from " + group.getSelection().getActionCommand()  + " !"));
        transferBtn.addActionListener(e -> System.out.println("Tots!, Transferred " + text.getText() + " from " + group.getSelection().getActionCommand()  + " !"));
        balanceBtn.addActionListener(e -> System.out.println("Balance, Bitch has " + text.getText() + " from " + group.getSelection().getActionCommand()  + " !"));

        /*public void actionPerformed(ActionEvent e) {
            JButton clicked = (JButton)e.getSource();

            if (clicked == withdrawBtn) {
                System.out.println("Withdraw");
            } else if (clicked == depositBtn){
                System.out.println("Withdraw");
                //if(textListener != null) {
                //    textListener.textEmitted("Deposit\n");
                //}
            } else if (clicked == transferToBtn){
                if(textListener != null) {
                    textListener.textEmitted("Transfer To\n");
                }
            } else if (clicked == balanceBtn){
                if(textListener != null) {
                    textListener.textEmitted("Balance\n");
                }
            }
        }
        */
        //create components
        //toolbar = new Toolbar();
        //textArea = new JTextArea();
        //withdrawBtn = new JButton("Withdrawl");
        //depositBtn = new JButton("Deposit");
        //transferToBtn = new JButton("Transfer To");
        //balanceBtn = new JButton("Balance");
        //checkingRbtn = new JRadioButton("Checking");
        //savingsRbtn = new JRadioButton("Savings");

        // setup events on click ????????
        //withdrawBtn.addActionListener(this);
        //depositBtn.addActionListener(this);
        //transferToBtn.addActionListener(this);
        //balanceBtn.addActionListener(this);

        //add components to JFrame
            //BorderLayout does not work
        //frame.add(new JScrollPane(textArea), BorderLayout.CENTER); // figure out how to have only the single field
        //frame.add(withdrawBtn, BorderLayout.NORTH);
        //frame.add(depositBtn, BorderLayout.EAST);
        //frame.add(transferToBtn, BorderLayout.CENTER);
        //frame.add(balanceBtn, BorderLayout.WEST);
        //frame.add(checkingRbtn, BorderLayout.AFTER_LAST_LINE);

        /*//toolbar.setTextPanel(textPanel);
        toolbar.setStringListenter(new StringListener() {
            public void textEmitted(String text) {
                //System.out.print(text);
                textPanel.appendText(text);
            }
        });*/




    } // end P2GUI constructor method


    /*
    public void setStringListenter(StringListener listener){
        this.textListener = listener;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if (clicked == withdrawBtn) {
            if(textListener != null) {
                textListener.textEmitted("Withdraw\n");
            }
        } else if (clicked == depositBtn){
            if(textListener != null) {
                textListener.textEmitted("Deposit\n");
            }
        } else if (clicked == transferToBtn){
            if(textListener != null) {
                textListener.textEmitted("Transfer To\n");
            }
        } else if (clicked == balanceBtn){
            if(textListener != null) {
                textListener.textEmitted("Balance\n");
            }
        }
    }
    */







    //====================> Main method <===================
    public static void main (String[] args) {

        // setup GUI
        SwingUtilities.invokeLater(new Runnable() {         //look into replacing with lambda
            public void run() {
                //create and run GUI object
                new P2GUI();
            }
        });


        //two account abjects (checking, savings)

    } //end main method


    //withdraw button w/ event handling (joptionpane error for insufficientFunds exception)

    //deposit button w/ event handling

    //transfer to button w/ event handling (joptionpane error for insufficientFunds exception)

    //balance button w/ event handling

    //radio buttons for account (checking, savings)

    //check all user input values are valid numeric values

}
