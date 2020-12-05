package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class MovementListener extends MouseInputAdapter {
    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Mouse entered!");
    }
}
