/**
 * Filename: P2GUI.java
 * Author: John Bernat
 * Date: ?
 * Purpose: Define GUI, event handlers and contains main method
 */

import javax.swing.*;
import java.text.DecimalFormat;

public class P2GUI {


    private JButton withdrawBtn;
    private JButton depositBtn;
    private JButton transferBtn;
    private JButton balanceBtn;
    private JRadioButton checkingRadioBtn;
    private JRadioButton savingsRadioBtn;
    private JTextField textField;
    private ButtonGroup btnGroup;
    private JPanel panel;
    private JFrame frame;
    //private DecimalFormat df = new DecimalFormat("#.##");


    //===============> constructor method <===============
    public P2GUI (Account checking, Account savings) {

        //-----> Components <-----//
        withdrawBtn = new JButton("Withdrawl");
        depositBtn = new JButton("Deposit");
        transferBtn = new JButton("Transfer To");
        balanceBtn = new JButton("Balance");
        checkingRadioBtn = new JRadioButton("Checking");
        savingsRadioBtn = new JRadioButton("Savings");
        textField = new JTextField(20);   // use text.getText()

        //-----> Radio Button Group <-----//
        checkingRadioBtn.setActionCommand("Checking");
        savingsRadioBtn.setActionCommand("Savings");
        btnGroup = new ButtonGroup();
        btnGroup.add(checkingRadioBtn);
        btnGroup.add(savingsRadioBtn);
        checkingRadioBtn.setSelected(true);
            //use group.getSelection().getActionCommand() to get value

        //-----> Panel <-----//
        panel = new JPanel();
        panel.add(withdrawBtn);
        panel.add(depositBtn);
        panel.add(transferBtn);
        panel.add(balanceBtn);
        panel.add(checkingRadioBtn);
        panel.add(savingsRadioBtn);
        panel.add(textField);

        //-----> Frame <-----//
        frame = new JFrame("ATM Machine");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(panel);


        //-----> ActionListeners <-----//
        //withdraw button w/ event handling (joptionpane error for insufficientFunds exception)
        withdrawBtn.addActionListener(e -> {
            System.out.println("Withdraw of " + textField.getText() + " from " + btnGroup.getSelection().getActionCommand());
            if (btnGroup.getSelection().getActionCommand().equals("Checking")) {
                try {
                    checking.withdraw(Double.parseDouble(textField.getText()));
                } catch (InsufficientFunds funds) {
                    System.out.println(funds.getDeficientFunds() + " needed");
                    JOptionPane.showMessageDialog(frame,
                            "Deficient funds of $" + funds.getDeficientFunds(),
                            "Deficient Funds",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
            if (btnGroup.getSelection().getActionCommand().equals("Savings")) {
                try {
                    savings.withdraw(Double.parseDouble(textField.getText()));
                } catch (InsufficientFunds funds) {
                    System.out.println(funds.getDeficientFunds() + " needed");
                    JOptionPane.showMessageDialog(frame,
                            "Deficient funds of $" + funds.getDeficientFunds(),
                            "Deficient Funds",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        //deposit button w/ event handling
        depositBtn.addActionListener(e -> {
            System.out.println("Deposit of " + textField.getText() + " to " + btnGroup.getSelection().getActionCommand() + " account");
            if (btnGroup.getSelection().getActionCommand().equals("Checking")) {
                checking.deposit(Double.parseDouble(textField.getText()));
            }
            if (btnGroup.getSelection().getActionCommand().equals("Savings")) {
                savings.deposit(Double.parseDouble(textField.getText()));
            }
        });

        // transfer to button w/ event handling (joptionpane error for insufficientFunds exception)
        transferBtn.addActionListener(e -> {
            System.out.println("Transferring " + textField.getText() + " to " + btnGroup.getSelection().getActionCommand() + " !");
            if (btnGroup.getSelection().getActionCommand().equals("Checking")) {
                try {
                    savings.transfer(Double.parseDouble(textField.getText()), checking);
                    //savings.withdraw(Double.parseDouble(textField.getText()));
                    //checking.deposit(Double.parseDouble(textField.getText()));
                } catch (InsufficientFunds funds) {
                    System.out.println(funds.getDeficientFunds() + " needed");
                    JOptionPane.showMessageDialog(frame,
                            "Deficient funds of $" + funds.getDeficientFunds(),
                            "Deficient Funds",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
            if (btnGroup.getSelection().getActionCommand().equals("Savings")) {
                try {
                    checking.transfer(Double.parseDouble(textField.getText()), savings);
                    //checking.withdraw(Double.parseDouble(textField.getText()));
                    //savings.deposit(Double.parseDouble(textField.getText()));
                } catch (InsufficientFunds funds) {
                    System.out.println(funds.getDeficientFunds() + " needed");
                    JOptionPane.showMessageDialog(frame,
                            "Deficient funds of $" + funds.getDeficientFunds(),
                            "Deficient Funds",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        //balance button event handling
        balanceBtn.addActionListener(e -> {
            System.out.println("Balance from " + btnGroup.getSelection().getActionCommand() + " is " + checking.balance());
            if (btnGroup.getSelection().getActionCommand().equals("Checking")) {
                JOptionPane.showMessageDialog(frame,
                        btnGroup.getSelection().getActionCommand() + " account balance is $" + checking.balance(),
                        "Balance",
                        JOptionPane.PLAIN_MESSAGE);
            }
            if (btnGroup.getSelection().getActionCommand().equals("Savings")) {
                JOptionPane.showMessageDialog(frame,
                        btnGroup.getSelection().getActionCommand() + " account balance is $" + savings.balance(),
                        "Balance",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });



    } // end P2GUI constructor method


    //====================> Main method <===================
    public static void main (String[] args) {

        //-----> Accounts <-----//
        Account checking = new Account();
        Account savings = new Account();

        //-----> GUI <-----//
        SwingUtilities.invokeLater( new Runnable() {         //look into replacing with lambda
            public void run() {
                //create and run GUI object
                new P2GUI(checking, savings);
            }
        });


    } //end main method

} //end P2GUI class
