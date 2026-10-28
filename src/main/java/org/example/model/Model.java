package org.example.model;

import org.example.model.MyShape;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.Collection;

public class Model {
    private ArrayList<MyShape> list;
    public MyShape currentShape;
    public Model() {
        this.list = new ArrayList<>();
    }

//    public void add(MyShape currentShape) {
//        list.add(currentShape.clone());
//    }
//
    public void createCurrentShape(MyShape shape) {
        this.currentShape = shape;
        this.list.add(currentShape);
    }
//    public ArrayList<MyShape> getList() {
//        return list;
//    }
    public MyShape getCurrentShape() {
        return currentShape;
    }

    public Collection<MyShape> getList() {
        return list;
    }
}
