
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author josea
 */
public class diasNa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu año de nacimiento"));
        int origen = 2023 - edad;
        JOptionPane.showMessageDialog(null, "Aproximadamente naciste hace : " + (origen * 365) + " días");
    }

}
