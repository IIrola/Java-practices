
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int an = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu año de nacimiento"));
        int edad = 2023 - an;
        JOptionPane.showMessageDialog(null, "Tu edad este año sera de : " + edad);
    }

}
