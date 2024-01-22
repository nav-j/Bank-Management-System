package BankManagementSystem;

import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame {
    JRadioButton sa,fda,ca,ra;
    JCheckBox atm,internet,mobile,email,cheque,estatement,declaration;
    JButton submit,cancel;
    SignupThree(){
        setLayout(null);
        JLabel accountDetails = new JLabel("Page : 3 Account Details");
        accountDetails.setFont(new Font("Raleway",Font.BOLD,22));
        accountDetails.setBounds(280,40,400,30);
        add(accountDetails);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        sa = new JRadioButton("Saving Account");
        sa.setFont(new Font("Raleway",Font.BOLD,16));
        sa.setBounds(100,180,150,20);
        sa.setBackground(Color.white);
        add(sa);

        fda = new JRadioButton("Fixed Deposit Account");
        fda.setFont(new Font("Raleway",Font.BOLD,16));
        fda.setBounds(350,180,250,20);
        fda.setBackground(Color.white);
        add(fda);

        ca = new JRadioButton("Current Account");
        ca.setFont(new Font("Raleway",Font.BOLD,16));
        ca.setBounds(100,220,250,20);
        ca.setBackground(Color.white);
        add(ca);

        ra = new JRadioButton("Recurring Deposit Account");
        ra.setFont(new Font("Raleway",Font.BOLD,16));
        ra.setBounds(350,220,250,20);
        ra.setBackground(Color.white);
        add(ra);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(sa);
        groupaccount.add(fda);
        groupaccount.add(ca);
        groupaccount.add(ra);

        JLabel card = new JLabel("Card Number ");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4332");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(350,300,300,30);
        add(number);
        JLabel carddetails = new JLabel("Your 16 digit card number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,300,20);
        add(carddetails);

        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(350,370,300,30);
        add(pnumber);
        JLabel pindetails = new JLabel("Your 4 digit PIN number");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,300,20);
        add(pindetails);

        JLabel services = new JLabel("Services Required ");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,300,20);
        add(services);

        atm = new JCheckBox("ATM card");
        atm.setFont(new Font("Raleway", Font.BOLD,16));
        atm.setBounds(100,500,200,20);
        atm.setBackground(Color.white);
        add(atm);
        internet = new JCheckBox("Internet Banking");
        internet.setFont(new Font("Raleway", Font.BOLD,16));
        internet.setBounds(350,500,200,20);
        internet.setBackground(Color.white);
        add(internet);
        mobile = new JCheckBox("Mobile Banking");
        mobile.setFont(new Font("Raleway", Font.BOLD,16));
        mobile.setBounds(100,550,200,20);
        mobile.setBackground(Color.white);
        add(mobile);
        email = new JCheckBox("E-mail & SMS alert");
        email.setFont(new Font("Raleway", Font.BOLD,16));
        email.setBounds(350,550,200,20);
        email.setBackground(Color.white);
        add(email);
        cheque = new JCheckBox("Cheque Book");
        cheque.setFont(new Font("Raleway", Font.BOLD,16));
        cheque.setBounds(100,600,200,20);
        cheque.setBackground(Color.white);
        add(cheque);
        estatement = new JCheckBox("E-Statement");
        estatement.setFont(new Font("Raleway", Font.BOLD,16));
        estatement.setBounds(350,600,200,20);
        estatement.setBackground(Color.white);
        add(estatement);

        declaration = new JCheckBox("I hereby declare that the above information is correct to the best of my knowledge.");
        declaration.setFont(new Font("Raleway", Font.BOLD,16));
        declaration.setBounds(100,650,600,20);
        declaration.setBackground(Color.white);
        add(declaration);

        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.setBounds(250,700,100,20);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        add(submit);

        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.setBounds(420,700,100,20);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        add(cancel);

        setSize(850,1000);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.white);
    }
    public static void main(String[] args) {
        new SignupThree();
    }
}
