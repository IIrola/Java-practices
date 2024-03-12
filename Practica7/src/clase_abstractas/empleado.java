/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstractas;

/**
 *
 * @author Rigo
 */
public class empleado extends persona {
    int id;
    String sueldo;
    
    public empleado(String nombre, int id, String sueldo){
        super(nombre);
        this.id=id;
        this.sueldo=sueldo;
    }
    @Override
    public String dame_descripcion(){
        return nombre+", es empleado con id: "+id+" y un sueldo de "+sueldo;
    }
}