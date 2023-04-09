package fullstack_java;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class button implements ActionListener {
    private int contador = 0;
    public void actionPerformed(ActionEvent e) {
        System.out.println("Botón pulsado " + contador + " veces");
        contador++;
    }
}
