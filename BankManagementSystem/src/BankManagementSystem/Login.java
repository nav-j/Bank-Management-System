package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Login  extends JFrame  implements ActionListener {

    JButton login, clear , signup;
    JTextField cardTextField, pinTextField;
    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100,100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);

        JLabel cardNo = new JLabel("Card No. : ");
        cardNo.setBounds(120,150,200,30);
        cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);


        JLabel pin = new JLabel("Pin : ");
        pin.setBounds(120,220,250,30);
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        add(pin);
        pinTextField = new JTextField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);




        getContentPane().setBackground(Color.white);
        setSize(800,400);
        setVisible(true);
        setLocation(350,200);

    }

    public  void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");

        } else if (ae.getSource() == signup) {

        } else if (ae.getSource() == login) {

        }

    }
    public static void main(String[] args) {
       Login login = new Login();
    }
}
