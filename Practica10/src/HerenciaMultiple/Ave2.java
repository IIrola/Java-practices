/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaMultiple;

/**
 *
 * @author Rigo
 */
public class Ave2 extends Ave implements Cresta {
    public Ave2 (String nombre, String color){
        super(nombre,color); 
    }
     @Override
     public void Mostrardatos(){
          System.out.println("Nombre del Ave2: "+nombre+ "Color del Ave2: "+color);
     }
     @Override
       public void ColorCresta(String color){
           System.out.println("color de la cresta: "+color);
       }
    
}