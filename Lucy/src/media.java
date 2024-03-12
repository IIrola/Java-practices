
import javax.swing.JOptionPane;

public class media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1=0, num2=0, num3=0, num4=0, num5=0, media=0;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero"));
        num3 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero"));
        num4 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero"));
        num5 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero"));
        
        media = (num1+num2+num3+num4+num5)/5;
        
        JOptionPane.showMessageDialog(null ,"La media es de: "+media);
        
    }
    
}
