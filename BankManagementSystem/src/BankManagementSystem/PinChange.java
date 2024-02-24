package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class PinChange extends JFrame implements ActionListener {
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;

    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text =new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(250,280,400,30);
        image.add(text);

        JLabel pintext =new JLabel("Enter New PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,14));
        pintext.setBounds(160,320,300,25);
        image.add(pintext);
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD,14));
        pin.setBounds(320,320,180,25);
        image.add(pin);

        JLabel repintext =new JLabel("Re-Enter New PIN");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD,14));
        repintext.setBounds(160,360,400,25);
        image.add(repintext);
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD,14));
        repin.setBounds(320,360,180,25);
        image.add(repin);

        change  = new JButton("CHANGE");
        change.setBounds(400,480,100,25);
        change.addActionListener(this);
        image.add(change);
        back  = new JButton("BACK");
        back.setBounds(400,510,100,25);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == change) {
           try {
               String npin = pin.getText();
               String rpin = repin.getText();
               if (!npin.equals(rpin)) {
                   JOptionPane.showMessageDialog(null, "Entered pin does not match");
                   return;
               }
               if (npin.equals("")){
                   JOptionPane.showMessageDialog(null,"Please Enter New PIN");
                   return;
               }
               if (rpin.equals("")){
                   JOptionPane.showMessageDialog(null,"Please Re-Enter New PIN");
                   return;
               }
               Conn conn = new Conn();
               String query1 = "update bank set pin ='"+rpin+"' where pin = '"+pinnumber+"'";
               String query2 = "update login set pin_number ='"+rpin+"' where pin_number = '"+pinnumber+"'";
               String query3 = "update signupthree set pin_number ='"+rpin+"' where pin_number= '"+pinnumber+"'";
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully.");
                setVisible(false);
                new  Transactions(rpin).setVisible(true);

           } catch (Exception e) {
               System.out.println(e);
           }
       }
       else {
           setVisible(false);
           new  Transactions(pinnumber).setVisible(true);
       }
    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
