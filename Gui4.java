import java.awt.*;

import javax.swing.*;

class MiPanel2 extends JPanel{
    public void paintComponent (Graphics g){
        Color c = new Color(180, 10, 120);
        g.setColor(c);
        g.drawString("Dibujar en el panel", 90,90);
        g.fillOval(1,1,90,90);
    }
}

public class Gui4 extends JFrame {
    
    public Gui4(){
        super("Interfaz Gráfica");
        add(new MiPanel2());
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Gui4 aplicacion = new Gui4();
    }
}
