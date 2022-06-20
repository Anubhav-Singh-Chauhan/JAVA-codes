package com.company;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Calculator implements ActionListener {
    JFrame jf;
    JLabel jl1, jl2, jl3;
    JTextField tf1, tf2, tf3;
    JButton jb1, jb2, jb3, jb4;

    void func() {
        jf = new JFrame();
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jl1 = new JLabel("Number 1: ");
        jl1.setBounds(100, 100, 80, 60);
        jf.add(jl1);

        jl2 = new JLabel("Number 2: ");
        jl2.setBounds(100, 200, 80, 60);
        jf.add(jl2);

        tf1 = new JTextField();
        tf1.setBounds(200, 100, 80, 40);
        jf.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(200, 200, 80, 40);
        jf.add(tf2);

        jl3 = new JLabel("Result: ");
        jl3.setBounds(180, 300, 60, 50);
        jf.add(jl3);

        tf3 = new JTextField();
        tf3.setBounds(250, 300, 80, 50);
        jf.add(tf3);

        jb1 = new JButton("Sum");
        jb1.setBounds(50, 400, 80, 60);
        jb1.addActionListener(this);
        jf.add(jb1);

        jb2 = new JButton("Subtract");
        jb2.setBounds(150, 400, 90, 60);
        jb2.addActionListener(this);
        jf.add(jb2);

        jb3 = new JButton("Multiply");
        jb3.setBounds(250, 400, 90, 60);
        jb3.addActionListener(this);
        jf.add(jb3);

        jb4 = new JButton("Divide");
        jb4.setBounds(350, 400, 90, 60);
        jb4.addActionListener(this);
        jf.add(jb4);

        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        if (e.getSource() == jb1) {
            Integer sum = a + b;
            tf3.setText(sum.toString());
        }
        else if(e.getSource()==jb2)
        {
            Integer sub = a-b;
            tf3.setText(sub.toString());
        }

        else if(e.getSource()==jb3)
        {
            Integer mul = a*b;
            tf3.setText(mul.toString());
        }
        else if(e.getSource()==jb4)
        {
            Integer div = a/b;
            tf3.setText(div.toString());
        }
    }
}


    public class CalculatorUsingSwing
    {
        public static void main(String[] args) {
            Calculator obj = new Calculator();
            obj.func();
        }
    }