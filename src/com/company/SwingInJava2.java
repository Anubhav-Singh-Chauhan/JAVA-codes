package com.company;

import javax.swing.*;
class Frame1
{
    void CreateFrame()
    {
        JFrame jf = new JFrame();
        jf.setSize(500, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        JLabel jb1 = new JLabel("Name: ");
        jb1.setBounds(100, 50, 80, 30);
        jf.add(jb1);

        JTextField jt1 = new JTextField();
        jt1.setBounds(200, 50, 150, 30);
        jf.add(jt1);

        JLabel jb2 = new JLabel("Email: ");
        jb2.setBounds(100, 100, 80, 30);
        jf.add(jb2);

        JTextField jt2 = new JTextField();
        jt2.setBounds(200, 100, 150, 30);
        jf.add(jt2);

        JLabel jb3 = new JLabel("Password: ");
        jb3.setBounds(100, 150, 80, 30);
        jf.add(jb3);

        JPasswordField jt3 = new JPasswordField();
        jt3.setBounds(200, 150, 150, 30);
        jf.add(jt3);

        JLabel jb4 = new JLabel("Gender: ");
        jb4.setBounds(100, 200, 80, 30);
        jf.add(jb4);

        JRadioButton jr1 = new JRadioButton("Male");
        jr1.setBounds(200, 200, 80, 30);
        jf.add(jr1);

        JRadioButton jr2 = new JRadioButton("Female");
        jr2.setBounds(300, 200, 80, 30);
        jf.add(jr2);

        JLabel jb5 = new JLabel("City: ");
        jb5.setBounds(100, 250, 80, 30);
        jf.add(jb5);

        String City[] = {"Haridwar", "Mumbai", "Dehradun", "Rishikesh"};

        JComboBox jc = new JComboBox(City);
        jc.setBounds(200, 250, 100, 30);
        jf.add(jc);

        JButton jb = new JButton("Register");
        jb.setBounds(150, 300, 150, 50);
        jf.add(jb);


        jf.setVisible(true);
    }
}

public class SwingInJava2 {
    public static void main(String[] args) {
        Frame1 obj = new Frame1();
        obj.CreateFrame();
    }
}
