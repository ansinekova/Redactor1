package org.example.view;

import org.example.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel {
    private Controller controller;

    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
     controller.setFrame();
    Graphics2D g2 = (Graphics2D) g;
    controller.draw(g2);

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
    addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            controller.mouseDragged(e.getPoint());
            repaint();
        }
    });


}

}

