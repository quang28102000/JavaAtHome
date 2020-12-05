package Chapter14_GraphicalUserInterfaces;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class ClickListener extends MouseInputAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Mouse pressed at position (" + e.getX() + ", " + e.getY() + ")");
    }
}
