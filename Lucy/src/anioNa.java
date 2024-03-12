
import javax.swing.JOptionPane;

public class anioNa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad actual"));
        int origen = 2023 - edad;
        JOptionPane.showMessageDialog(null, "Aproximadamente naciste en : " + origen);
    }

}
