
import javax.swing.JOptionPane;


public class Caida {

    public static void main(String[] args) {
       
        double caida=0;
       
       caida = 100 - (0.5)*(9.8)*(1)-(100 - (0.5)*(9.8)*(Math.pow(3,2)));
       
       JOptionPane.showMessageDialog(null, "La distancia es de "+caida);
       
    }
    
}
