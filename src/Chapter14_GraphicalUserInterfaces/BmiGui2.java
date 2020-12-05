package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import java.awt.*;

public class BmiGui2 {
    //onscreen components stored as fields
    private JFrame frame;
    private JTextField heightField;
    private JTextField weightField;
    private JLabel bmiLabel;
    private JButton computeButton;

    //construct the information layout for BMI
    public BmiGui2(){
        //set up components
        JTextField heightField = new JTextField(5);
        JTextField weightField = new JTextField(5);
        JLabel bmiLabel = new JLabel("Type your height and weight");
        JButton computeButton = new JButton("Compute");

        //Layout
        JPanel north = new JPanel(new GridLayout(2, 2));
        north.add(new JLabel("Height: "));
        north.add(heightField);
        north.add(new JLabel("Weight: "));
        north.add(weightField);

        //overall frame
        JFrame frame = new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(north, BorderLayout.NORTH);
        frame.add(bmiLabel, BorderLayout.CENTER);
        frame.add(computeButton, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
