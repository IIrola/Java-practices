
import javax.swing.JOptionPane;


public class guarderia {

    public static void main(String[] args) {
        int nino = Integer.parseInt(JOptionPane.showInputDialog("Ingresa  la cantidad de niños que requieran guarderia "));
        
        
        JOptionPane.showMessageDialog(null, "La cantidad de guarderias necesarias son "+(nino/5));
    }
    
}
