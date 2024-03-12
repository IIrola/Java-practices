/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_11;

/**
 *
 * @author josea
 */
public abstract class Humano {
    String Nombre;
    int Edad;
    //CONSTRUCTOR
    public Humano(String Nombre, int Edad){
        this.Nombre=Nombre;
        this.Edad=Edad;
    }
    public abstract String reir();
    public abstract String dormir();
    public abstract String jugar();
}
