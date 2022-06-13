package com.company;

import javax.swing.*;

public class SwingInJava {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        JLabel j1 = new JLabel("Enter Name: ");
        j1.setBounds(100,50,100,50);
        jf.add(j1);

        JTextField jt = new JTextField();
        jt.setBounds(200,50,250,50);
        jf.add(jt);

        JButton jb = new JButton("Click Here");
        jb.setBounds(200,150,100,50);
        jf.add(jb);
        jf.setVisible(true);

    }
}
