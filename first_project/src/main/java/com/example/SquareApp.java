package com.example;

import javax.swing.*;
import java.awt.*;

public class SquareApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SquarePanel());
        frame.setVisible(true);
    }
}

class SquarePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // x, y, width, height — width == height makes it a square
        g.drawRect(100, 100, 150, 150);
    }
}
