
import javax.swing.JOptionPane;


public class CaidaTeclado {

    public static void main(String[] args) {
        
        Teclado t = new Teclado();
       
        double caida=0;
       
       caida = 100 - (0.5)*(9.8)*(1)-(100 - (0.5)*(9.8)*(Math.pow(3,2)));
       
       System.out.println( "La distancia es de "+caida);
       
    }
    
}
