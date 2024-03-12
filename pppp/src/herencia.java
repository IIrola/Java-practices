
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte luis, juan, felipe;
        int total;
        float dinero;
        
        luis = Byte.parseByte(JOptionPane.showInputDialog("Ingresa la edad de luis"));
        juan = Byte.parseByte(JOptionPane.showInputDialog("Ingresa la edad de felipe"));
        felipe = Byte.parseByte(JOptionPane.showInputDialog("Ingresa la edad de juan"));
        
        total = luis+juan+felipe;
        
        dinero = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la herencia"));
       
        JOptionPane.showMessageDialog(null, "La herencia para luis es de "+(((float)luis/total)*dinero)+"\n"
                + "La herencia para felipe es de "+(((float)juan/total)*dinero)+"\n"
                + "La herencia para juan es de "+(((float)felipe/total)*dinero));
        System.exit(0);
    }
    
}
