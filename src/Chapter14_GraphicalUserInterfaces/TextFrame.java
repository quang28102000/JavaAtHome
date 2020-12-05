package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import java.awt.*;

public class TextFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(300, 150));
        frame.setTitle("Text Frame");

        JTextArea area = new JTextArea(2, 20);
        frame.add(area);

        frame.setVisible(true);
    }
}
