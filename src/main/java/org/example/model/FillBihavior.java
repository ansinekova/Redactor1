package org.example.model;

import java.awt.*;
import java.awt.geom.RectangularShape;

public enum FillBihavior {
    FILL{
        @Override
        void draw(Graphics2D g2, RectangularShape shape) {
            g2.fill(shape);
        }
    }, NOFILL{
        @Override
        void draw(Graphics2D g2, RectangularShape shape) {
            g2.draw(shape);
        }
    };
    abstract void draw(Graphics2D g2, RectangularShape shape);

}
