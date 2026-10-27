package org.example.controller;

import org.example.model.Model;
import org.example.model.MyShape;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class Controller {

    MyPanel myPanel;
    MyFrame mp;
    Model model;
   MyShape currentShape;
    Point2D[]points;
    public Controller() {
        points = new Point2D[2];
        model = new Model();

        myPanel = new MyPanel(this);
        mp = new MyFrame(myPanel);
        currentShape = new MyShape(new Ellipse2D.Double());
    }

//    public String speak() {
//        return currentShape.speak();
//    }
//

    public void setFrame() {
        currentShape.stratch(points[0],points[1]);
    }

    public void mouseDragged(Point point) {
        points[1] = point;
    }

    public void mousePressed(Point point) {
        points[0] = point;
        model.add(currentShape);
    }

    public void draw(Graphics2D g2) {
        for (MyShape shape : model.getList()) {
            shape.draw(g2);
        }

    }
}
