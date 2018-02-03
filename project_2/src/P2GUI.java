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

        //-----> Components <-----//
        JButton withdrawBtn = new JButton("Withdrawl");
        JButton depositBtn = new JButton("Deposit");
        JButton transferBtn = new JButton("Transfer To");
        JButton balanceBtn = new JButton("Balance");
        JRadioButton checkingRBtn = new JRadioButton("Checking");
        JRadioButton savingsRBtn = new JRadioButton("Savings");
        JTextField text = new JTextField(20);   // use text.getText()

        //-----> Radio Button Group <-----//
        checkingRBtn.setActionCommand("Checking");
        savingsRBtn.setActionCommand("Savings");
        ButtonGroup group = new ButtonGroup();
        group.add(checkingRBtn);
        group.add(savingsRBtn);
        checkingRBtn.setSelected(true);
            //use group.getSelection().getActionCommand() to get value

        //-----> Panel <-----//
        JPanel panel = new JPanel();
        panel.add(withdrawBtn);
        panel.add(depositBtn);
        panel.add(transferBtn);
        panel.add(balanceBtn);
        panel.add(checkingRBtn);
        panel.add(savingsRBtn);
        panel.add(text);

        //-----> Frame <-----//
        JFrame frame = new JFrame("ATM Machine");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(panel);


        //-----> ActionListeners <-----//
        //withdraw button w/ event handling (joptionpane error for insufficientFunds exception)
        withdrawBtn.addActionListener(e ->
                System.out.println("Boom, Withdraw of " + text.getText() + " from " + group.getSelection().getActionCommand() + " !!!!")
        );

        //deposit button w/ event handling
        depositBtn.addActionListener(e ->
                System.out.println("Sweet, Deposit of " + text.getText() + " from " + group.getSelection().getActionCommand()  + " !")
        );

        //transfer to button w/ event handling (joptionpane error for insufficientFunds exception)
        transferBtn.addActionListener(e ->
                System.out.println("Tots!, Transferred " + text.getText() + " from " + group.getSelection().getActionCommand()  + " !")
        );

        //balance button w/ event handling
        balanceBtn.addActionListener(e ->
                System.out.println("Balance, Bitch has " + text.getText() + " from " + group.getSelection().getActionCommand()  + " !")
        );


    } // end P2GUI constructor method


    //====================> Main method <===================
    public static void main (String[] args) {

        //-----> GUI <-----//
        SwingUtilities.invokeLater(new Runnable() {         //look into replacing with lambda
            public void run() {
                //create and run GUI object
                new P2GUI();
            }
        });

        //-----> Accounts <-----//
        Account checking = new Account();
        Account savings = new Account();

    } //end main method

} //end P2GUI class
