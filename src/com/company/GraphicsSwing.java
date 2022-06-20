package com.company;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class GraphicsSwing extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.setColor(Color.YELLOW);
//        g.fillOval(10, 10, 200, 200);
//
//        // draw Eyes
//        g.setColor(Color.BLACK);
//        g.fillOval(55, 65, 30, 30);
//        g.fillOval(135, 65, 30, 30);
//
//        // draw Mouth
//        g.fillOval(50, 110, 120, 60);
//
//        // adding smile
//        g.setColor(Color.YELLOW);
//        g.fillRect(50, 110, 120, 30);
//        g.fillOval(50, 120, 120, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(60,60,200,200);

        g.setColor(Color.BLACK);
        g.drawArc(90,120,50,50,0,180);
        g.drawArc(190,120,50,50,0,180);
//        g.drawLine(160,120,160,170);
        g.drawArc(110,130,90,90,0,-180);
    }

    public static void main(String[] args) {
        GraphicsSwing smiley = new GraphicsSwing();
        JFrame app = new JFrame();
        app.add(smiley);
        app.setSize(300, 300);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
