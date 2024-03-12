/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author josea
 */
public class raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A= Integer.parseInt(JOptionPane.showInputDialog("Ingresa los muebles en A"));
        int B= Integer.parseInt(JOptionPane.showInputDialog("Ingresa los muebles en B"));
        int C= Integer.parseInt(JOptionPane.showInputDialog("Ingresa los muebles en C"));
        
        float diner = Float.parseFloat(JOptionPane.showInputDialog("Cuanto ofrecio por los muebles"));
        
        float pagA = A*diner;
        float pagB = B*diner;
        float pagC = C*diner;
        
        float tot=(pagA+pagB+pagC)*0.9f;
        
        int mTot=A+B+C;
        
        JOptionPane.showMessageDialog(null, "En total se llevo "+mTot+"muebles");
        JOptionPane.showMessageDialog(null, "por A paga en total: "+ pagA);
        JOptionPane.showMessageDialog(null, "por B paga en total: "+ pagB);
        JOptionPane.showMessageDialog(null, "por C paga en total: "+ pagC);
        JOptionPane.showMessageDialog(null, "En total pago"+tot);
    }
    
}
