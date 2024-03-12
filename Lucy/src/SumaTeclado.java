
import javax.swing.JOptionPane;


public class SumaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0, y=0;
        
        Teclado t = new Teclado();
        System.out.println("Ingresa el primer numero");
        x= t.leeInt();
        System.out.println("Ingresa el segundo numero");
        y=t.leeInt();
        
        System.out.println( "La suma de los 2 numero es: "+(x+y));
        
    }
    
}
