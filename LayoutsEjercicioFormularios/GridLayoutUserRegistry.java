package LayoutsEjercicioFormularios;

import java.awt.*;

import javax.crypto.spec.PBEKeySpec;
import javax.swing.*;

public class GridLayoutUserRegistry extends JFrame{

    public GridLayoutUserRegistry(){
        super("Formulario Básico");	
        setLayout(new GridLayout(1,2));

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(0,2));

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

        add(p2);
        add(new JTextField("Aquí van los resultados"));
        setSize(400,250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        GridLayoutUserRegistry aplicacion = new GridLayoutUserRegistry();
    }
}
