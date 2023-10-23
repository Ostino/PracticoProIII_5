

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Arbol<String> modelo;
    public Panel(Arbol<String> m) {
        modelo = m;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600,600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        modelo.dibujar(g);
    }
}
