import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Gui6 extends JFrame {
    JButton botoncopiar;
    JTextField campoValor, resultado;

    public Gui6(){
        setLayout(new FlowLayout());
        add(new JLabel("Valor "));
        campoValor = new JTextField(5);
        add(campoValor);
        botoncopiar = new JButton("copiar");
        add (botoncopiar);
        botoncopiar.addActionListener(new OyenteBoton());
        add(new JLabel("       Copia"));
        resultado = new JTextField(6);
        add(resultado);
        setSize(400,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui6 aplicacion = new Gui6();
    }
}

