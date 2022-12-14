package LayoutsEjercicioFormularios;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutUserRegistry extends JFrame{
    public BorderLayoutUserRegistry(){
        super("Formulario con BorderLayout");
        setLayout(new BorderLayout());

        //Crear panel p1 para los campos y creamos el grid layout
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(0,2));

        //Añadir los Jlabel y Jtextfield
        JLabel jlnombre = new JLabel("Nombre");
        JLabel jlapellidos = new JLabel("Apellidos");
        JLabel jlciudad = new JLabel("Ciudad");
        JLabel jlcurso = new JLabel("Curso");
        JLabel jlnacimiento = new JLabel("Nacimiento");

        ButtonGroup grupobotones = new ButtonGroup();
        JRadioButton jrestudiante = new JRadioButton("Estudiante");
        JRadioButton jrprofesor = new JRadioButton("Profesor");
        grupobotones.add(jrprofesor);
        grupobotones.add(jrestudiante);

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
        p1.add(jrestudiante);
        p1.add(jrprofesor);
        
        //Crear panel p2 para englobar p1 y el campo de texto
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JLabel("Formulario",SwingConstants.CENTER), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        //Añadir p2  y textfield al Jframe
        add(p2, BorderLayout.CENTER);
        add(new JTextField("Aquí van los resultados"), BorderLayout.EAST);
        setSize(400,250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        BorderLayoutUserRegistry aplicacion = new BorderLayoutUserRegistry();
    }
}
