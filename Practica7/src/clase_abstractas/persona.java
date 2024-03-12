/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstractas;

/**
 *
 * @author Rigo
 */
public abstract class persona {
    String nombre;
    public persona(String nombre){
        this.nombre=nombre;
    }
    public abstract String dame_descripcion();
    
}
