package BankManagementSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupTwo extends JFrame implements ActionListener{
        JTextField panTextField,aadharTextField;
        JRadioButton syes,sno,ayes,ano;
        JComboBox religion,category,income,education,occupation;
        String formno;
        SignupTwo(String formno){
            this.formno = formno;
            setLayout(null);
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

            JLabel additionalDetails = new JLabel("Page 2 : Additional Details ");
            additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
            additionalDetails.setBounds(290,80,400,30);
            add(additionalDetails);

            JLabel religionLabel = new JLabel("Religion : ");
            religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
            religionLabel.setBounds(100,140,100,30);
            add(religionLabel);
            String religionVal[] = {"Hindu","Muslim","Sikh","Christian"};
            religion = new JComboBox(religionVal);
            religion.setFont(new Font("Raleway", Font.BOLD,20));
            religion.setBounds(300,140,400,30);
            religion.setBackground(Color.white);
            add(religion);

            JLabel categoryLabel = new JLabel("Category : ");
            categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
            categoryLabel.setBounds(100,190,200,30);
            add(categoryLabel);
            String categoryVal[] = {"General","SC","ST","BC","Other"};
            category = new JComboBox(categoryVal);
            category.setFont(new Font("Raleway", Font.BOLD,20));
            category.setBounds(300,190,400,30);
            category.setBackground(Color.white);
            add(category);

            JLabel incomeLabel = new JLabel("Income : ");
            incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
            incomeLabel.setBounds(100,240,200,30);
            add(incomeLabel);
            String incomeVal[] = {"< 1,00,000","< 5,00,000","upto 10,00,000"};
            income = new JComboBox(incomeVal);
            income.setFont(new Font("Raleway", Font.BOLD,20));
            income.setBounds(300,240,400,30);
            income.setBackground(Color.white);
            add(income);

            JLabel educationLabel = new JLabel("Educational : ");
            educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
            educationLabel.setBounds(100,290,200,30);
            add(educationLabel);

            JLabel qualificationLabel = new JLabel("Qualification : ");
            qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
            qualificationLabel.setBounds(100,315,200,30);
            add(qualificationLabel);

            String educationVal[] = {"Non - Graduate","Graduate","Post - Graduate"};
            education = new JComboBox(educationVal);
            education.setFont(new Font("Raleway", Font.BOLD,20));
            education.setBounds(300,310,400,30);
            education.setBackground(Color.white);
            add(education);

            JLabel occupationLabel = new JLabel("Occupation : ");
            occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
            occupationLabel.setBounds(100,390,200,30);
            add(occupationLabel);
            String occupationVal[] = {"Salaried","Self - Employed","Business","Retired","Student"};
            occupation = new JComboBox(occupationVal);
            occupation.setFont(new Font("Raleway", Font.BOLD,20));
            occupation.setBounds(300,390,400,30);
            occupation.setBackground(Color.white);
            add(occupation);

            JLabel panLabel = new JLabel("PAN Number : ");
            panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
            panLabel.setBounds(100,440,200,30);
            add(panLabel);
            panTextField = new JTextField();
            panTextField.setFont(new Font("Raleway", Font.BOLD,20));
            panTextField.setBounds(300,440,400,30);
            add(panTextField);

            JLabel aadhar = new JLabel("Aadhar Number : ");
            aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
            aadhar.setBounds(100,490,200,30);
            add(aadhar);
            aadharTextField = new JTextField();
            aadharTextField.setFont(new Font("Raleway", Font.BOLD,20));
            aadharTextField.setBounds(300,490,400,30);
            add(aadharTextField);

            JLabel citizen = new JLabel("Senior Citizen : ");
            citizen.setFont(new Font("Raleway", Font.BOLD, 20));
            citizen.setBounds(100,540,200,30);
            add(citizen);
            syes = new JRadioButton("Yes");
            syes.setBounds(300,540,100,20);
            syes.setBackground(Color.white);
            add(syes);
            sno = new JRadioButton("No");
            sno.setBounds(450,540,100,20);
            sno.setBackground(Color.white);
            add(sno);
            ButtonGroup citizenGroup = new ButtonGroup();
            citizenGroup.add(syes);
            citizenGroup.add(sno);

            JLabel existingAccount = new JLabel("Existing Account : ");
            existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
            existingAccount.setBounds(100,590,200,30);
            add(existingAccount);
            ayes = new JRadioButton("Yes");
            ayes.setBounds(300,590,100,20);
            ayes.setBackground(Color.white);
            add(ayes);
            ano = new JRadioButton("No");
            ano.setBounds(450,590,100,20);
            ano.setBackground(Color.white);
            add(ano);
            ButtonGroup accountGroup = new ButtonGroup();
            accountGroup.add(ayes);
            accountGroup.add(ano);

            JButton next = new JButton("Next");
            next.setBackground(Color.BLACK);
            next.setForeground(Color.white);
            next.setBounds(600,600,100,30);
            next.addActionListener(this);
            add(next);

            getContentPane().setBackground(Color.WHITE);
            setSize(800,1000);
            setLocation(350,10);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent ae){
            String sreligion = (String) religion.getSelectedItem();
            String scategory = (String) category.getSelectedItem();
            String sincome = (String) income.getSelectedItem();
            String seducation = (String) education.getSelectedItem();
            String soccupation = (String) occupation.getSelectedItem();
            String pan = panTextField.getText();
            String aadhar = aadharTextField.getText();
            String scitizen = null;
            if (syes.isSelected()){
                scitizen = "Yes";
           } else if (sno.isSelected()) {
                scitizen = "No";

            }
            String saccount = null;
            if (ayes.isSelected()){
                saccount = "Yes";
            } else if (ano.isSelected()) {
                saccount = "No";
            }

            try {
                if (pan.equals("")){
                    JOptionPane.showMessageDialog(null,"Pan number is Required.");
                }
                else {
                    Conn c = new Conn();

                    String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+saccount+"')";
                    c.s.executeUpdate(query);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        public static void main(String[] args) {
            new SignupTwo("");
        }
}
