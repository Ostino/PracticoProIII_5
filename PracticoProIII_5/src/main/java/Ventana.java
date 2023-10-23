
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    String palabra = "Esta es la palabra buena";

    public Ventana() {
        super("ARbol");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Arbol<String> modelo = prepararArbol();
        Panel dibujoPanel = new Panel(modelo);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add( dibujoPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private Arbol<String> prepararArbol() {
        Arbol<String> a = new Arbol<>();


        a.insertar("F","F", null);
        a.insertar("D", "D", "F");
        a.insertar("R", "R", "F");
        a.insertar("A", "A", "F");

        a.insertar("P", "P", "R");
        a.insertar("X", "X", "R");
        a.insertar("H", "H", "A");
        a.insertar("B", "B", "A");
        a.insertar("Z", "Z", "A");

        return a;
    }

    public static void main(String[] args) {
        new Ventana();
    }
}
