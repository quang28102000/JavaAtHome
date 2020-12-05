package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import java.awt.*;

public class ComponentsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 100));
        frame.setTitle("A Frame");

        JButton button1 = new JButton();
        button1.setText("I am a button");
        button1.setBackground(Color.BLUE);
        frame.setLayout(new FlowLayout());
        frame.add(button1);

        JButton button2 = new JButton();
        button2.setText("Click me");
        button2.setBackground(Color.RED);
        frame.setLayout(new FlowLayout());
        frame.add(button2);

        button1.addActionListener(new MessageListener());


        JLabel label = new JLabel("Type your ZIP code");
        JTextField field = new JTextField(5);
        JButton button = new JButton("Submit");

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(button);

        frame.setLayout(new GridLayout(2,3));
        for (int i = 0; i <= 6; i++){
            frame.add(new JButton("Button " + i));
        }

        frame.pack();
        frame.setVisible(true);

        button1.setPreferredSize(new Dimension(150, 14));
        button2.setPreferredSize(new Dimension(100, 45));


    }
}
