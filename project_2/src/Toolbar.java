/**
 * Filename: P2GUI.java
 * Author: John Bernat
 * Date: ?
 * Purpose: defines toolbar object
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private JButton withdrawBtn;
    private JButton depositBtn;
    private JButton transferToBtn;
    private JButton balanceBtn;
    private StringListener textListener;

    public Toolbar() {
        withdrawBtn = new JButton("Withdrawl");
        depositBtn = new JButton("Deposit");
        transferToBtn = new JButton("Transfer To");
        balanceBtn = new JButton("Balance");

        withdrawBtn.addActionListener(this);
        depositBtn.addActionListener(this);
        transferToBtn.addActionListener(this);
        balanceBtn.addActionListener(this);

        setLayout(new FlowLayout());

        add(withdrawBtn);
        add(depositBtn);
        add(transferToBtn);
        add(balanceBtn);

    }

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



}