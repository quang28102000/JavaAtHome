package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;

public class UseOptionPanes {
    public static void main(String[] args) {
        //read the user's name graphically
        String name = JOptionPane.showInputDialog(null, "What's your name");
        //ask the user yes/no question
        int choice = JOptionPane.showConfirmDialog(null,"Do you like cake, " + name + "?");

        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of course! Who doesn't?");
        }else {
            JOptionPane.showMessageDialog(null, "We'll have to agree to disagree");
        }
    }
}
