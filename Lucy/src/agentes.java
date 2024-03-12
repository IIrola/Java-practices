
import javax.swing.JOptionPane;


public class agentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom1 = JOptionPane.showInputDialog("Ingresa el nombre del agente 1");
        String nom2 = JOptionPane.showInputDialog("Ingresa el nombre del agente 2");

        int vent1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las ventas del agente " + nom1 + " "));
        int vent2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las ventas del agente " + nom2 + " "));

        int venTot = vent1 + vent2;

        JOptionPane.showMessageDialog(null, "El agente " + nom1 + " vendio: $" + (vent1 * 15800));
        JOptionPane.showMessageDialog(null, "El agente " + nom2 + " vendio: $" + (vent2 * 15800));

        JOptionPane.showMessageDialog(null, "La ganancia de la empresa es de: $" + ((venTot * 15800) * 0.8));
}

    
}
