package controller;

import model.Cat;
import model.Dog;
import model.Model;
import model.SpeakBehavior;
import view.MyFrame;
import view.MyPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class Controller {
    Cat cat;
    Dog dog;
    MyPanel myPanel;
    MyFrame mp;
    Model model;
    RectangularShape currentShape;
    Point2D[]points;
    public Controller() {
        points = new Point2D[2];
        model = new Model();
        cat = new Cat("myska");
        dog = new Dog("Gav!");
        myPanel = new MyPanel(this);
        mp = new MyFrame(myPanel);
        currentShape = new Ellipse2D.Double();
    }

//    public String speak() {
//        return currentShape.speak();
//    }
//
    public void setDog() {
        currentShape = new Rectangle2D.Double();
    }

    public void setCat() {
        currentShape = new Ellipse2D.Double();
    }

    public void setFrame() {
        currentShape.setFrameFromDiagonal(points[0],points[1]);
    }

    public void mouseDragged(Point point) {
        points[1] = point;
    }

    public void mousePressed(Point point) {
        points[0] = point;
    }

    public void mouseReleased(Point point){
        model.list.add(currentShape);
        points[0] = null;
        points[1] = null;

        currentShape = new Ellipse2D.Double();
    }

    public void draw(Graphics2D g2) {
        for (RectangularShape shape : model.list) {
            g2.draw(shape);
        }
        g2.draw(currentShape);

    }
}
