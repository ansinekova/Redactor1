package org.example.view;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel myPanel;
    public MyFrame(MyPanel myPanel) {
        this.myPanel = myPanel;
        super.setSize(600, 600);

        //MyPanel panel = new MyPanel();
        super.add(myPanel);

        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
