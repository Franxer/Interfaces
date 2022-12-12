package LayoutsEjercicioFormularios;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutUserRegistry extends JFrame {

    public FlowLayoutUserRegistry() {
        super("Formulario Básico");	
        setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(0,2));

        //Añadir los Jlabel y Jtextfield
        JLabel jlnombre = new JLabel("nombre");
        JLabel jlapellidos = new JLabel("apellidos");
        JLabel jlciudad = new JLabel("ciudad");
        JLabel jlcurso = new JLabel("curso");
        JLabel jlnacimiento = new JLabel("nacimiento");

        JTextField jtnombre = new JTextField();
        JTextField jtapellidos = new JTextField();
        JTextField jtciudad = new JTextField();
        JTextField jtcurso = new JTextField();
        JTextField jtnacimiento = new JTextField();


        p1.add(jlnombre);
        p1.add(jtnombre);
        p1.add(jlapellidos);
        p1.add(jtapellidos);
        p1.add(jlciudad);
        p1.add(jtciudad);
        p1.add(jlcurso);
        p1.add(jtcurso);
        p1.add(jlnacimiento);
        p1.add(jtnacimiento);

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JLabel("Formulario",SwingConstants.CENTER), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        add(p2, FlowLayout.LEFT);
        add(new JTextField("Aquí van los resultados"), FlowLayout.CENTER);
              
     setSize(400,300);
     setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
      
    public static void main(String argv[]) {
     new FlowLayoutUserRegistry();
    }
}
