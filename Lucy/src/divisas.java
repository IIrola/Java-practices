
import javax.swing.JOptionPane;

public class divisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double chel = Double.parseDouble(JOptionPane.showInputDialog("Ingresa una cantidad de chelines para pasar a pesetas"));
        double drac = Double.parseDouble(JOptionPane.showInputDialog("Ingresa una cantidad en dracmas para pasar a francos"));

        double pesetas = (chel / 9.56871);

        double francos = (drac / 0.88607) * (1 / 20.110);

        JOptionPane.showMessageDialog(null, "La cantidad de chelines a pesetas es de : $" + pesetas);
        JOptionPane.showMessageDialog(null, "La cantidad de dracmas a francos es de : $" + francos);
    }

}
