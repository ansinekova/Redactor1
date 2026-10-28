package org.example.view;

import org.example.controller.Controller;
import org.example.model.MyShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel {
    private Controller controller;

    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    for (MyShape shape : controller.getShapes()) {
        shape.draw(g2);
    }

}

public MyPanel(Controller controller) {
    this.controller = controller;
    addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        controller.mousePressed(e.getPoint());
        }
    });
    addMouseMotionListener(new MouseAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        controller.mouseDragged(e.getPoint());
            repaint();
            }
    });
}

}

