package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TextFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(300, 150));
        frame.setTitle("Text Frame");

        JTextArea area = new JTextArea(5, 20);
        frame.add(area);
        area.setFont(new Font("Serif", Font.BOLD, 14));

        JButton button = new JButton();
        button.setText("My drawing");

        //create a shape image icon for this button
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(10, 20, 80, 70);
        g.setColor(Color.RED);
        g.fillOval(40, 50, 25, 25);

        //use scrollbars on this text area
        frame.add(new JScrollPane(area));
        frame.setVisible(true);
    }
}
