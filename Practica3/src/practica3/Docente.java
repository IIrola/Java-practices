/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author josea
 */
public class Docente extends Persona{

    public Docente(String nombre, String apellido, int edad){
        super(nombre, apellido,edad);
    }

    public void Docente(String Ileana, String Deyanira, int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellidos: "+getApellido()+"\nEdad: "+getEdad());
    }
}
