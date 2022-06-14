package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame1 implements ActionListener
{
    JFrame jf;
    JButton jb,jbt;
    JLabel jb1,jb2,jb3,jb4,jb5;
    JRadioButton jr1,jr2;
    JTextField jt1,jt2;
    JPasswordField jt3;
    JComboBox jc;
    void CreateFrame()
    {
        jf = new JFrame();
        jf.setSize(500, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jb1 = new JLabel("Name: ");
        jb1.setBounds(100, 50, 80, 30);
        jf.add(jb1);

        jt1 = new JTextField();
        jt1.setBounds(200, 50, 150, 30);
        jf.add(jt1);

        jb2 = new JLabel("Email: ");
        jb2.setBounds(100, 100, 80, 30);
        jf.add(jb2);

        jt2 = new JTextField();
        jt2.setBounds(200, 100, 150, 30);
        jf.add(jt2);

        jb3 = new JLabel("Password: ");
        jb3.setBounds(100, 150, 80, 30);
        jf.add(jb3);

        jt3 = new JPasswordField();
        jt3.setBounds(200, 150, 150, 30);
        jf.add(jt3);

        jb4 = new JLabel("Gender: ");
        jb4.setBounds(100, 200, 80, 30);
        jf.add(jb4);

        jr1 = new JRadioButton("Male");
        jr1.setBounds(200, 200, 80, 30);
        jf.add(jr1);

        jr2 = new JRadioButton("Female");
        jr2.setBounds(300, 200, 80, 30);
        jf.add(jr2);

        jb5 = new JLabel("City: ");
        jb5.setBounds(100, 250, 80, 30);
        jf.add(jb5);

        String City[] = {"Haridwar", "Mumbai", "Dehradun", "Rishikesh"};

        jc = new JComboBox(City);
        jc.setBounds(200, 250, 100, 30);
        jf.add(jc);

        jb = new JButton("Register");
        jb.setBounds(50, 300, 100, 50);
        jb.addActionListener(this);
        jf.add(jb);

        jbt = new JButton("Clear");
        jbt.addActionListener(this);
        jbt.setBounds(250,300,100,50);
        jf.add(jbt);


        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb)
        {
            String s1 = jt1.getText();
            String s2 = jt2.getText();
            String s3 = (String) jc.getSelectedItem();
            if(jr1.isSelected())
            {
                JOptionPane.showMessageDialog(jf,"Registered Successfully\n" + "Name: " + s1 + "\nEmail: " + s2 + "\nMale" + "\nCity: " + s3);
            }
            else if(jr2.isSelected())
            {
                JOptionPane.showMessageDialog(jf,"Registered Successfully\n" + "Name: " + s1 + "\nEmail: " + s2 + "\nFemale" + "\nCity: " + s3);
            }
            else if(s1.equals("") || s2.equals("") || !jr1.isSelected() || !jr2.isSelected() || s3.equals(""))
            {
                JOptionPane.showMessageDialog(jf,"Enter All Details Properly");
            }
        }
        if(e.getSource()==jbt)
        {
            jt1.setText(null);
            jt2.setText(null);
            jt3.setText(null);
            jr1.setSelected(false);
            jr2.setSelected(false);
        }
    }
}

public class SwingInJava2 {
    public static void main(String[] args) {
        Frame1 obj = new Frame1();
        obj.CreateFrame();
    }
}
