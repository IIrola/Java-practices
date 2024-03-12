/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalsion;

import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class comprobarDel {

String comp(){

String Direccion=JOptionPane.showInputDialog(null, "Ingrese su direccion: ", "Envio", JOptionPane.DEFAULT_OPTION );
if(Direccion != null)
if(JOptionPane.showConfirmDialog(null, "El Deliveri tendra un costo de: 100\nAcepta el monto?", null,JOptionPane.YES_NO_OPTION)==0){
return Direccion;
}
return "C";

    
}
}