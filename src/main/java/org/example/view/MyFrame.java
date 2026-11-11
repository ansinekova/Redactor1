package org.example.view;
import org.example.controller.Controller;
import org.example.controller.action.ActionDraw;
import org.example.controller.action.ActionMove;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    MyPanel myPanel;
    Controller controller;
    public MyFrame(MyPanel myPanel) {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu action = new JMenu("Action");
        JMenuItem draw = new JMenuItem("Draw");
        JMenuItem move = new JMenuItem("Move");
        action.add(draw);
        action.add(move);
        menuBar.add(action);

        draw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setActionInterface(new ActionDraw());
            }
        });
        move.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setActionInterface(new ActionMove(null));
            }
        });
        this.myPanel = myPanel;
        super.setSize(600, 600);

        //MyPanel panel = new MyPanel();
        super.add(myPanel);

        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
