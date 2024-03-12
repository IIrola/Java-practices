/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaMultiple;

/**
 *
 * @author Rigo
 */
public class Ave {
    String nombre;
    String color;
    
    public Ave(){
        
    }
    public Ave(String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    }
    public void Mostrardatos(){
        System.out.println("nombre del ave: "+nombre+"Color del ave: "+color);
    }
}
