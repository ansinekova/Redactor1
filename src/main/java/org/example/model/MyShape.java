package org.example.model;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class MyShape {

    RectangularShape shape;
    Color color;
    FillBihavior fillBihavior;

    public MyShape(RectangularShape shape) {
        fillBihavior = FillBihavior.NOFILL;
        this.shape = shape;
        color = Color.BLUE;
    }

    public void draw(Graphics2D g2) {
        Paint paint;
        paint = g2.getPaint();
        g2.setColor(color);
        fillBihavior.draw(g2, shape);
        g2.setPaint(paint);
    }

    public void stratch(Point2D point, Point2D point1) {
        shape.setFrameFromDiagonal(point, point1);

    }
    public MyShape clone() {
        MyShape help = new MyShape((RectangularShape)   shape.clone());
        help.color = color;
        help.fillBihavior = fillBihavior;
        return help;
    }
}
