package org.example.model;

import org.example.model.MyShape;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;

public class Model {
    public ArrayList<MyShape> list;
    public Model() {
        this.list = new ArrayList<>();
    }

    public void add(MyShape currentShape) {
        list.add(currentShape.clone());
    }

    public ArrayList<MyShape> getList() {
        return list;
    }
}
