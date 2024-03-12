

import javax.swing.JOptionPane;


public class cm_To_Inch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float inch=0, cm=0;
        
        inch = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa las pulgadas"));
        
        cm = inch*2.54f;
        
        JOptionPane.showMessageDialog(null, "El valor de "+inch+" convertido a centimetros es: "+cm);
        
    }
    
}
