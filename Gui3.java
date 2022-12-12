import java.awt.*;

import javax.swing.*;

public class Gui3 extends JFrame{
    public Gui3(){
        super("Layout anidado");
        setLayout(new BorderLayout());
        //Crear panel p1 para los botones y creamos el grid layout
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        //Añadir los botones al panel
        for(int i = 1; i<=9;i++){
            p1.add(new JButton(""+i));
        }
        p1.add(new JButton(""+0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        //Crear panel p2 para englobar p1 y el campo de texto
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("Aqui el tiempo"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        //Añadir p2  y un botón al Jframe
        add(p2, BorderLayout.EAST);
        add(new Button("Aquí la comida"), BorderLayout.CENTER);
        setSize(400,250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Gui3 aplicacion = new Gui3();
    }
}
