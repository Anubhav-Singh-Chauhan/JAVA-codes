package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseListener implements MouseListener
{

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
class EL extends MyMouseListener implements ActionListener  //Adapter Pattern
{
    JFrame jf;
    JTextField jt;
    JButton jb1,jb2;
    void Frame1()
    {
        jf = new JFrame();
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jt = new JTextField();
        jt.setBounds(100,50,300,40);
        jf.add(jt);

        jb1 = new JButton("Click Me");
        jb1.addActionListener(this);
        jb1.addMouseListener(this);
        jb1.setBounds(100,150,120,50);
        jf.add(jb1);

        jb2 = new JButton("Clear");
        jb2.addActionListener(this);
        jb2.setBounds(250,150,120,50);
        jf.add(jb2);

        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1) {
            String s1 = jt.getText();
            //System.out.println("Hello " +s1);
            if (s1.equals("")) {
                JOptionPane.showMessageDialog(jf,"Nothing To Display");
            }
            else {
                JOptionPane.showMessageDialog(jf, "Hello " + s1);
            }
        }
        if(e.getSource()==jb2)
        {
            jt.setText(null);
        }
    }


    public void mouseEntered(MouseEvent e) {
      if (e.getSource()==jb1)
      {
          jb1.setBackground(Color.green);
          jb1.setForeground(Color.white);
      }
    }

    public void mouseExited(MouseEvent e) {
        if (e.getSource()==jb1)
        {
            jb1.setBackground(null);
            jb1.setForeground(null);
        }
    }
}

public class EventListnerJava {
    public static void main(String[] args) {
        EL obj = new EL();
        obj.Frame1();
    }
}
