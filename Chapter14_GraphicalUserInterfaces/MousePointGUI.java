package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MousePointGUI extends MouseInputAdapter {
    public static void main(String[] args) {
        MousePointGUI gui = new MousePointGUI();
    }
    //field
    private JFrame frame;
    private JLabel label;

    //sets up the GUI, components, and events
    public MousePointGUI(){
        label = new JLabel();
        label.setText("Move the mouse over me!");

        //listen for mouse events
        label.addMouseListener(this);
        label.addMouseMotionListener(this);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(200, 100));
        frame.setTitle("A frame");
        frame.add(label);

        frame.setVisible(true);
    }

    //responds to mouse movement events

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("(" + e.getX() + ", " + e.getY() + ")");
    }
}
