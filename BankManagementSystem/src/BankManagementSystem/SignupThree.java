package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton sa,fda,ca,ra;
    JCheckBox atm,internet,mobile,email,cheque,estatement,declaration;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        JLabel accountDetails = new JLabel("Page : 3 Account Details");
        accountDetails.setFont(new Font("Raleway",Font.BOLD,22));
        accountDetails.setBounds(280,20,400,30);
        add(accountDetails);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,80,200,30);
        add(type);

        sa = new JRadioButton("Saving Account");
        sa.setFont(new Font("Raleway",Font.BOLD,16));
        sa.setBounds(100,150,150,20);
        sa.setBackground(Color.white);
        add(sa);

        fda = new JRadioButton("Fixed Deposit Account");
        fda.setFont(new Font("Raleway",Font.BOLD,16));
        fda.setBounds(350,150,250,20);
        fda.setBackground(Color.white);
        add(fda);

        ca = new JRadioButton("Current Account");
        ca.setFont(new Font("Raleway",Font.BOLD,16));
        ca.setBounds(100,190,250,20);
        ca.setBackground(Color.white);
        add(ca);

        ra = new JRadioButton("Recurring Deposit Account");
        ra.setFont(new Font("Raleway",Font.BOLD,16));
        ra.setBounds(350,190,250,20);
        ra.setBackground(Color.white);
        add(ra);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(sa);
        groupaccount.add(fda);
        groupaccount.add(ca);
        groupaccount.add(ra);

        JLabel card = new JLabel("Card Number ");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,240,200,30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4332");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(350,240,300,30);
        add(number);
        JLabel carddetails = new JLabel("Your 16 digit card number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100,270,300,20);
        add(carddetails);

        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,320,200,30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(350,320,300,30);
        add(pnumber);
        JLabel pindetails = new JLabel("Your 4 digit PIN number");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,350,300,20);
        add(pindetails);

        JLabel services = new JLabel("Services Required ");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,400,300,20);
        add(services);

        atm = new JCheckBox("ATM card");
        atm.setFont(new Font("Raleway", Font.BOLD,16));
        atm.setBounds(100,430,200,20);
        atm.setBackground(Color.white);
        add(atm);
        internet = new JCheckBox("Internet Banking");
        internet.setFont(new Font("Raleway", Font.BOLD,16));
        internet.setBounds(350,430,200,20);
        internet.setBackground(Color.white);
        add(internet);
        mobile = new JCheckBox("Mobile Banking");
        mobile.setFont(new Font("Raleway", Font.BOLD,16));
        mobile.setBounds(100,460,200,20);
        mobile.setBackground(Color.white);
        add(mobile);
        email = new JCheckBox("E-mail & SMS alert");
        email.setFont(new Font("Raleway", Font.BOLD,16));
        email.setBounds(350,460,200,20);
        email.setBackground(Color.white);
        add(email);
        cheque = new JCheckBox("Cheque Book");
        cheque.setFont(new Font("Raleway", Font.BOLD,16));
        cheque.setBounds(100,490,200,20);
        cheque.setBackground(Color.white);
        add(cheque);
        estatement = new JCheckBox("E-Statement");
        estatement.setFont(new Font("Raleway", Font.BOLD,16));
        estatement.setBounds(350,490,200,20);
        estatement.setBackground(Color.white);
        add(estatement);

        declaration = new JCheckBox("I hereby declare that the above information is correct to the best of my knowledge.");
        declaration.setFont(new Font("Raleway", Font.BOLD,16));
        declaration.setBounds(100,530,800,20);
        declaration.setBackground(Color.white);
        add(declaration);

        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.setBounds(250,570,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        add(submit);
        submit.addActionListener(this);

        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.setBounds(420,570,100,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        add(cancel);
        cancel.addActionListener(this);

        setSize(850,750);
        setLocation(350,10);
       // JScrollPane scrollPane = new JScrollPane(getContentPane());
        //add(scrollPane);
        JScrollBar scrollBar = new JScrollBar();
        add(scrollBar);
        setVisible(true);

        getContentPane().setBackground(Color.white);

    }
    public void  actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String accountType = null;
            if (sa.isSelected()){
                accountType = "Saving Account";
            }
            else if (fda.isSelected()) {
                accountType = "Fixed Deposit Account";
            }
            else if (ca.isSelected()) {
                accountType = "Current Account";
            }
            else if (ra.isSelected()) {
                accountType = "Recurring Account";
            }
            Random random = new Random();
            String cardNumber ="" + Math.abs(random.nextLong() % 9000000L + 5087000000000000L);

            String pinNumber = "" + Math.abs(random.nextLong() % 9000L + 1000L);
            String facility = "";
            if (atm.isSelected()){
                facility = facility + "ATM Card";
            } else if (internet.isSelected()) {
                facility = facility + "Internet Banking";
            }
            else if (mobile.isSelected()) {
                facility = facility + "Mobile Banking";
            }
            else if (email.isSelected()) {
                facility = facility + "E-mail & SMS Alert";
            }
            else if (cheque.isSelected()) {
                facility = facility + "Cheque Book";
            }
            else if (estatement.isSelected()) {
                facility = facility + "E-Statement";
            }
            try {
                if (accountType.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Account Type is Required.");
                }
                else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"Card number : "+cardNumber+"\n Pin : "+pinNumber);
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(true);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else if (ae.getSource() == cancel) {
            setVisible(false);
            new  Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new SignupThree("");
    }
}
