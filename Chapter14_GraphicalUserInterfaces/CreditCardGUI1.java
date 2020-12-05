package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditCardGUI1 implements ActionListener {
    public static void main(String[] args) {
        CreditCardGUI1 gui = new CreditCardGUI1();
    }

    //fields
    private JFrame frame;
    private JTextField numberField;
    private JLabel validLabel;
    private JButton verifyButton;

    //creates components, does layout, show window onscreen
    public CreditCardGUI1() {
        //set up components
        numberField = new JTextField(16);
        validLabel = new JLabel("not yet verified");
        verifyButton = new JButton("Verify CC number");

        //event listeners
        verifyButton.addActionListener(this);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(350, 100));
        frame.setTitle("Credit card number verifier");

        frame.setLayout(new FlowLayout());
        frame.add(numberField);
        frame.add(verifyButton);
        frame.add(validLabel);
        frame.setVisible(true);
    }
    // returns whether the given string can be a valid Visa
    //card number according to the Luhn checksum algorithm
    public boolean isValidCC(String text){
        int sum = 0;
        for(int i = text.length() - 1; i >= 0; i--){
            int digit = Integer.parseInt(text.substring(i, i + 1));
            //these lines computation are acceptable to for both
            //even and odd numbers
            //if it is even number, just multiply it and separate digits
            //through % and /
            //and if it is odd number, just does not multiply digit
            //and get through % and / (odd number and 0)
            if(i % 2 == 0){ //double even digit
                digit *= 2;
            }
            sum += (digit / 10) + (digit % 10);
        }
        //valid numbers add up to a multiple of 10
        return sum % 10 == 0 && text.startsWith("4");
    }
    //Sets label's text to show whether CC number is Valid
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String text = numberField.getText();
        if(isValidCC(text)){
            validLabel.setText("Valid number");
        }else{
            validLabel.setText("Invalid number");
        }
    }
}
