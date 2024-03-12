/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica12;

/**
 *
 * @author Rigo
 */

public abstract class Animal2 extends Animal implements Carne {
    public Animal2(String nombre, String tipo){
    super(nombre, tipo);
    }


    @Override
    public void MostrarDatos(){
        System.out.println("Nombre del animal: "+nombre+" /Tipo de animal: "+tipo);
    }
    @Override
    public void ComeCarne(String tipo){
        System.out.println("¿Que come este animal: "+tipo);
    }
}
