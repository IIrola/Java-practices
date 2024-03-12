
import javax.swing.JOptionPane;


public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0, y=0;
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        
        JOptionPane.showMessageDialog(null, "La suma de los 2 numero es: "+(x+y));
        
    }
    
}
