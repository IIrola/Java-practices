/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstractas;

/**
 *
 * @author Rigo
 */
public class estudiante extends persona {
    String carrera;
    
    public estudiante(String nombre, String carrera){
        super(nombre);
        this.carrera=carrera;
    }
    @Override
    public String dame_descripcion(){
        return nombre+" es estudiante de la carrera de "+carrera;
    }
}
