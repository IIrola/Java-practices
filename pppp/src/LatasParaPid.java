
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class LatasParaPid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float b=0, a=0, l=0, area=0, cant;
        int lat;
        
        b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la base"));
        l=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la largo"));
        a=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la altura"));
        
        b+=a*2;
        l+=a*2;
        area=b*l;
        
        
        lat=Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de latas"));
        
        
        
        
    }
    
}
