/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_abstractas;

/**
 *
 * @author Rigo
 */
public class cuadrado extends figura {
    int lado ;
    
    public cuadrado(int lado, String nombre){
        super(nombre);
        this.lado=lado;
    }
    @Override
    public double area (){
        return lado*lado;
    }
}
