package org.example.controller;

import org.example.controller.action.ActionDraw;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.Collection;

public class Controller {

    MyPanel myPanel;
    MyFrame frame;
    Model model;
    MyShape currentShape;
    Point2D[]points;
    ActionDraw actionDraw;

    public Controller() {
        points = new Point2D[2];
        model = new Model();
        myPanel = new MyPanel(this);
        frame = new MyFrame(myPanel);
        actionDraw = new ActionDraw(model);
        actionDraw.setSampleShape(new MyShape(new Ellipse2D.Double()));
        //currentShape = new MyShape(new Ellipse2D.Double());
    }

//    public String speak() {
//        return currentShape.speak();
//    }
//

//    public void setFrame() {
//        currentShape.stratch(points[0],points[1]);
//    }

    public void mouseDragged(Point point) {
        //points[1] = point;
        actionDraw.stretchShape(point);
    }

    public void mousePressed(Point point) {
//        points[0] = point;
//        points[1] = point;
        //model.add(currentShape);
        actionDraw.createShape(point);
    }
    public Collection<MyShape> getShapes() {
        return model.getList();
    }

//    public void draw(Graphics2D g2) {
//        for (MyShape shape : model.getList()) {
//            shape.draw(g2);
//        }
//
//    }
}
