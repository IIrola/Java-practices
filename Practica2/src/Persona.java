/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Rigo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    public String getNombre () {
        return nombre;
    }
    public void setNombre(String txt){
        nombre=txt;
    }
    public String getApellido (){
        return apellido;
    }
    public void setApellido (String txt) {
        apellido=txt;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad (int n){
        edad=n;
    }
}
