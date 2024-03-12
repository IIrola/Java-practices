/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_abstractas;

/**
 *
 * @author Rigo
 */
public class circulo extends figura {
    double radio;
    
   public circulo(double radio, String nombre){
       super(nombre);
       this.radio=radio;
   }
   @Override
   public double area(){
       return radio*radio*Math.PI;
   }
}
