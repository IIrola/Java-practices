/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_abstractas;

/**
 *
 * @author Rigo
 */
public abstract class figura {
    String nombre;
    //constructor
    public figura(String nombre){
        this.nombre=nombre;
    }
    public abstract double area();
}
