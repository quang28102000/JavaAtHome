package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import java.awt.*;

public class EmailMassage {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 300));
        frame.setTitle("Send Message");

        frame.setLayout(new BorderLayout());

        //northside
        JPanel northWest = new JPanel(new GridLayout(3,1));
        northWest.add(new JTextField("From: "));
        northWest.add(new JTextField("To: "));
        northWest.add(new JTextField("Subject: "));

        JPanel northCenter = new JPanel(new GridLayout(3, 1));
        northCenter.add(new JTextField());
        northCenter.add(new JTextField());
        northCenter.add(new JTextField());

        JPanel northEast = new JPanel(new GridLayout(3, 1));
        northEast.add(new JButton("Browse... "));
        northEast.add(new JButton("Browse... "));

        //BorderLayout having two arguments, one's for its component, the others for its location
        JPanel north = new JPanel(new BorderLayout());
        north.add(northWest, BorderLayout.WEST);
        north.add(northCenter, BorderLayout.CENTER);
        north.add(northEast, BorderLayout.EAST);

        JPanel south = new JPanel(new FlowLayout());
        south.add(new JButton("Send "));

        frame.add(north, BorderLayout.NORTH);
        frame.add(new JTextArea(), BorderLayout.CENTER);
        frame.add(south, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
