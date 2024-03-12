/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica12;

/**
 *
 * @author Rigo
 */

public class Animal {
     String nombre;
    String tipo;
    
    public Animal(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }


    public void MostrarDatos(){
        System.out.println("Nombre del animal: "+nombre+" /Tipo de animal: "+tipo);
        
    }
    
}
