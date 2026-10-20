package view;

import controller.Controller;
import model.Cat;
import model.Dog;
import model.SpeakBehavior;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel {
    private Controller controller;
    private final Dog dog=null;
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton bSpeak;
    //JButton m;
    //Point2D point1;
    //Point2D point2;
    Rectangle2D shape;
    //Cat cat;

    //boolean isFilled = true;
    //boolean showCat = false;
    //Cat myCat = new Cat();

    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
     controller.setFrame();
    Graphics2D g2 = (Graphics2D) g;
    controller.draw(g2);

}

public MyPanel(Controller controller) {
    this.controller = controller;
    //this.cat = cat;
    //this.dog = dog;
    t1 = new JTextField("                                ");
    //t2 = new JTextField("                                ");
    bSpeak = new JButton("Сказать");
   // b1 = new JButton("knopka");
    b2 = new JButton("koshka");
    b3 = new JButton("Bobic");
    //b2 = new JButton("Fill / draw");
    //JButton b3 = new JButton("мяу");
    //m = new JButton("МЯУ");
    //shape = new Rectangle2D.Double();

    // point1 = new Point2D();
//    add(t1);
//    add(bSpeak);
    //add(t2);
    //add(b1);
    add(b2);
    add(b3);
    //add(b3);
    // add(m);
    //////////////////////////////////////////////////
////    bSpeak.addActionListener(new ActionListener() {
////        @Override
////        public void actionPerformed(ActionEvent e) {
////            try {
////                t1.setText(controller.speak());
////            } catch (Exception ex) {
////                throw new RuntimeException(ex);
////            }
////            // String dogSound = dog.speak();
////
////        }
//    });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                controller.mousePressed(e.getPoint());
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                controller.mouseDragged(e.getPoint());
                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                controller.mouseReleased(e.getPoint());
                repaint();
            }
        });

//        m.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("МЯУ");
//            }
//        });
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.setCat();
        }
    });

    b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.setDog();
        }
    });
//
//    //////////////////////
//    b1.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            // System.out.println(t1.getText());
//            // t2.setText(t1.getText().trim());
//            int num = Integer.parseInt(t1.getText().trim());
//            int rez = num * 2;
//            t2.setText("" + rez);
//        }
//    });
}
}

