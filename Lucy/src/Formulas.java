
import javax.swing.JOptionPane;


public class Formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=0, b=0, f=0, x=0, y=0;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero para X"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero para Y"));
        f = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero para F"));
        
        a=(2*Math.pow(y, 2))+(4*(Math.pow(x,2))*y)/3;
        
        JOptionPane.showMessageDialog(null, "El valor para la primera ecuacion es "+a);
        
        b=x*y+Math.pow(f, 2)+Math.pow((f*x), 1/3);
        
        JOptionPane.showMessageDialog(null, "El valor para la segunda ecuacion es "+b);
        
    }
    
}
