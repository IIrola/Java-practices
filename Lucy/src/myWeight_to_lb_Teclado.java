
import javax.swing.JOptionPane;

public class myWeight_to_lb_Teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float kg=52.5f, lb=0;
        
        lb = kg*2.20462f;
        
        System.out.println( "Mi peso de "+kg+"kg convertido a libras es: "+lb);
        
    }
    
}
