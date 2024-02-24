package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {
    String pinnumber;
    MiniStatement(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        setLayout(null);

         JLabel mini = new JLabel();
         mini.setBounds(20,140,400,200);
         add(mini);

         JLabel bank = new JLabel("Indian Bank");
         bank.setBounds(150,20,200,30);
         add(bank);

         JLabel card = new JLabel();
         setBounds(20,80,300,20);
         add(card);
         JLabel balance = new JLabel();
         balance.setBounds(20,400,300,20);
         add(balance);

         try {
             Conn conn = new Conn();
             int bal = 0;
             ResultSet rs = conn.s.executeQuery("Select * from login where pin_number = '"+pinnumber+"'");
             while (rs.next()){
                 card.setText("Card Number : "+rs.getString("card_number").substring(0,4) + "XXXXXXXX" + rs.getString("card_number").substring(12));
                 if (rs.getString("type").equals("Deposit")){
                     bal += Integer.parseInt(rs.getString("amount"));
                 }
                 else {
                     bal -= Integer.parseInt(rs.getString("amount"));
                 }
             }
             balance.setText("Your current account balance is "+bal);
         }
         catch (Exception e){
             System.out.println(e);
         }
         try {
             Conn conn = new Conn();
             ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
             while (rs.next()){
                    mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br></html>");
             }
         }
         catch (Exception e){
             System.out.println(e);
         }

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
