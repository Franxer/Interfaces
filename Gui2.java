import java.awt.*;
import javax.swing.*;

public class Gui2 extends JFrame {
    
    public Gui2(){
        super("Ejemplo Grid Layout");
        setLayout(new GridLayout(4,3,5,5));
        for(int i=1;i<=10;i++){
            add(new JButton(Integer.toString(i)));
        }
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Gui2 aplicacion = new Gui2();
    }
}
