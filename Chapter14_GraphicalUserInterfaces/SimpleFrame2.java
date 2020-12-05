package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import java.awt.*;

public class SimpleFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(100, 200));
        frame.setSize(new Dimension(500, 150));
        frame.setTitle("A Frame");
        frame.setVisible(true);
    }
}
