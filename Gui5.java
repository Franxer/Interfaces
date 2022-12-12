import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Gui5 extends JFrame{
    JButton boton;
    public Gui5(){
        boton = new JButton("Pulsa!");
        add(boton);
        boton.addActionListener(new OyenteBoton());
        setSize(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui5 aplicacion = new Gui5();
    }
}

class OyenteBoton implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().beep();
    }
}
