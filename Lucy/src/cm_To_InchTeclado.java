

import javax.swing.JOptionPane;


public class cm_To_InchTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float inch=0, cm=0;
        
        Teclado t = new Teclado();
        
        System.out.println("Ingresa las pulgadas");
        
        inch = t.leeFloat();
        
        cm = inch*2.54f;
        
        System.out.println( "El valor de "+inch+" convertido a centimetros es: "+cm);
        
    }
    
}
