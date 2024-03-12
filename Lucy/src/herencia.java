
import javax.swing.JOptionPane;

public class herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lu = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de Luis"));
        int ju = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de Juan"));
        int fe = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de Felipe"));
        int din = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de dinero"));

        int tot = lu + ju + fe;

        JOptionPane.showMessageDialog(null, "La cantidad que le toca a Felipe es de $" + (fe * din / tot) + ", La cantidad que le toca a Luis es de $" + (lu * din / tot) + ", La cantidad que le toca a Juan es de $" + (ju * din / tot));
    }

}
