package org.example.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class MyShape {
    public RectangularShape shape;
    Color color;
    FillBihavior fillBihavior;

    public MyShape(Color color, RectangularShape shape) {
        this.shape = shape;
        this.color = Color.BLUE;
        this.fillBihavior = FillBihavior.NOFILL;
    }
    public MyShape() {
        color = Color.BLUE;
        shape = new Rectangle2D.Double();
        this.fillBihavior = FillBihavior.NOFILL;
    }

    public void draw(Graphics2D g2) {
        Paint paint = g2.getPaint();
        g2.setColor(color);
        fillBihavior.draw(g2, shape);
        g2.setPaint(paint);
    }

    public void setFrame (Point2D[] p) {
        shape.setFrameFromDiagonal(p[0], p[1]);

    }
    public MyShape clone() {
//        MyShape help = new MyShape((RectangularShape)   shape.clone());
//        help.color = color;
//        help.fillBihavior = fillBihavior;
//        return help;
        MyShape s = new MyShape();
        s.setColor(this.color);
        s.setShape((RectangularShape) this.shape.clone());
        return s;
    }
    public void setShape(RectangularShape shape){
        this.shape = shape;
    }

    public RectangularShape getShape() {
        return shape;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
