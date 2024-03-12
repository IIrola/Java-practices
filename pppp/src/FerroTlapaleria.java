/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author josea
 */
public class FerroTlapaleria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pYeso=0, pInter=0, pRust=0, ingE=0, ventE=0, ventM=0, Suel1=0, Suel2=0, ganaE=0, vYeso=0, vInter=0, vRust=0, vCon=0, vAis=0, vCr=0, vMos, vElec;
        
        pYeso = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el costo de los mosaicos de yeso"));
        pInter = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el costo de los mosaicos de Interceramic"));
        pRust = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el costo de los mosaicos Rústicos"));
        
        vCon = Float.parseFloat(JOptionPane.showInputDialog("Ingresa las piezas vendidas de Contacto de luz"));
        vAis = Float.parseFloat(JOptionPane.showInputDialog("Ingresa las piezas vendidas de Cinta Aislante"));
        vCr = Float.parseFloat(JOptionPane.showInputDialog("Ingresa las piezas vendidas de Rollo de cable"));
        
        vYeso = Float.parseFloat(JOptionPane.showInputDialog("Ingresa las cajas vendidas de Mosaicos de yeso"));
        vInter = Float.parseFloat(JOptionPane.showInputDialog("Ingresa las cajas vendidas de Mosaicos de interceramic"));
        vRust = Float.parseFloat(JOptionPane.showInputDialog("Ingresa las cajas vendidas de Mosaicos Rústicos"));
        
        vElec = vCon+vAis+vCr;
        vMos= vYeso+vInter+vRust;        
        
        ventE=(75*1.16f*vCon)+(vAis*55)+(vCr*150);
        
        ventM=((vYeso*pYeso)+(vInter*pInter)+(vRust*pRust))*0.9f;
        
        Suel1 =  (ventM*0.30f)+5000;
        Suel2 = (ventE*0.30f)+5000;
        
        ingE = ( ventM ) + ( ventE );
        
        ganaE = ingE-Suel1-Suel2;
        
        JOptionPane.showMessageDialog(null, "En total se vendieron "+ vMos+ " mosaicos y "+ vElec+ " Productos electricos");
        JOptionPane.showMessageDialog(null, "El ingreso de la empresa es en total: $"+ ingE);
        JOptionPane.showMessageDialog(null, "El sueldo del empleado de Mosaicos sera de: $"+ventM);
        JOptionPane.showMessageDialog(null, "El sueldo del empleado de Electricos sera de: " + ventE);
        JOptionPane.showMessageDialog(null, "La utilidad real de la empresa es en total: $" + ganaE);
    }
    
}
