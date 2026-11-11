package org.example.model;

import org.example.model.MyShape;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.Collection;

public class Model {
    Collection<MyShape> list;
    MyShape currentShape;

    public Model() {
        this.list = new ArrayList<>();
    }

    public void createCurrentShape(MyShape shape) {
        this.currentShape = shape;
        this.list.add(currentShape);
    }

    public Collection<MyShape> getList() {
        return list;
    }
}
