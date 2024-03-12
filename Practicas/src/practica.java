
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ag1 = JOptionPane.showInputDialog("Captura el nombre del primer agente");
        String ag2 =  JOptionPane.showInputDialog("Captura el nombre del segundo  agente");
        float ncva1 = Float.parseFloat(JOptionPane.showInputDialog("Captura el numero de computadoras vendidas por "+ag1));
        float ncva2 = Float.parseFloat(JOptionPane.showInputDialog("Captura el numero de computadoras vendidas por "+ag2));
        float ntcv = ncva1+ncva2;
        float mtva1 = ncva1*15800;
        float mtva2 = ncva2*15800;
        float irpe = mtva1+mtva2*0.8f;
        JOptionPane.showMessageDialog(null,("Numero total de computadoras vendidas" + ntcv));
        JOptionPane.showMessageDialog(null,("Ingreso recibido por la empreza" + irpe));
        JOptionPane.showMessageDialog(null,("Monto vendido por el primer agente" + mtva1));
        JOptionPane.showMessageDialog(null,("Monto vendido por el segundo agente" + mtva2));
        
        
        
    }
    
}
