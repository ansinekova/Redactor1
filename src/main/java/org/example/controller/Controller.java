package org.example.controller;

import org.example.controller.action.ActionDraw;
import org.example.controller.action.ActionInterface;
import org.example.controller.action.ActionMove;
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
    ActionInterface actionInterface;
    ActionMove actionMove;

    public Controller() {
        points = new Point2D[2];
        model = new Model();
        myPanel = new MyPanel(this);
        frame = new MyFrame(myPanel);
        actionDraw = new ActionDraw(model);
        actionDraw.setSampleShape(new MyShape(Color.BLUE, new Ellipse2D.Double()));
        actionMove = new ActionMove(model);
        actionInterface = new ActionDraw(model);
        frame.setController(this);
    }

//    public String speak() {
//        return currentShape.speak();
//    }
//

//    public void setFrame() {
//        currentShape.stratch(points[0],points[1]);
//    }
    public void setActionInterface(ActionInterface actionInterface) {
        this.actionInterface = actionInterface;
        actionInterface.setModel(model);
    }

    public void mouseDragged(Point point) {
        actionInterface.mouseDragged(point);
    }

    public void mousePressed(Point point) {
//        points[0] = point;
//        points[1] = point;
        //model.add(currentShape);
        actionInterface.mousePressed(point);
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
