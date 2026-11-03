package org.example.controller.action;

import org.example.model.Model;
import org.example.model.MyShape;

import java.awt.*;
import java.awt.geom.Point2D;

public class ActionDraw implements ActionInterface {
    MyShape sampleShape;
    MyShape shape;
    Point2D[] p;
    Model model;

    @Override
    public void mousePressed(Point point) {
        createShape(point);
    }

    @Override
    public void mouseDragged(Point point) {
        stretchShape(point);
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    public void setSampleShape(MyShape sampleShape) {
        this.sampleShape = sampleShape;
    }

    public ActionDraw() {
        p = new Point2D[2];
    }

    public ActionDraw(  Model model) {
        this.p = new Point2D[2];
        this.model = model;
    }

    public void setShape(MyShape shape) {
        this.shape = shape;
    }
    public void stretchShape(Point point){
        p[1] = point;
        shape.setFrame(p);
    }
    public void createShape(Point point){
        p[0] = point;
        p[1] = point;
        shape = sampleShape.clone();
        model.createCurrentShape(shape);
    }


}
