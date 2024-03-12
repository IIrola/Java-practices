/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_abstractas;

/**
 *
 * @author josea
 */
public class Clase_abstractas {

    public static void main(String[] args) {
        // TODO code application logic here
        persona p1=new estudiante("Jonathan Joestar", "Contador");
        persona p2=new empleado("Dio Brando", 753645 ,"85600");
        System.out.println(p2.dame_descripcion());
        System.out.println(p1.dame_descripcion());
    }
    
}
