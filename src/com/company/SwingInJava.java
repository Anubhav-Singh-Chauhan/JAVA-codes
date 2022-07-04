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


        String Subject[] = {"Maths", "Hindi", "English", "Science"};
        JList list = new JList(Subject);
        list.setBounds(100,200,100,70);
        jf.add(list);

        String Data[][] = {{"Maths","100"}, {"Hindi","80"}, {"English","90"}, {"Science","96"},{"SST","60"},{"Java","100"}};
        String Column[] = {"Subject","Marks"};

        JTable table = new JTable(Data,Column);
        table.setBounds(100,300,200,100);
        jf.add(table);

//        JScrollBar sb = new JScrollBar();
//        sb.setBounds(520,20,80,400);
//        jf.add(sb);
        JScrollPane sp = new JScrollPane(table);
        jf.add(sp);
        jf.setVisible(true);

    }
}
