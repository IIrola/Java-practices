/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class edadFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * escribir un algoritmo ddf y pj que permita calcular la edad actual de una
        * persona solicitando su año de nacimiento.
        * imprimir el resultado obtenido
        * 
        */
       
       Teclado T = new Teclado();
       
       int yearB=0, yearA=0;
       
       System.out.println("Ingresa tu año de nacimiento");
       yearB = T.leeInt();
       
       System.out.println("Ingresa el año actual");
       yearA = T.leeInt();
       
       System.out.println("Tu edad actual deberia ser: "+(yearA-yearB));
       
    }
    
}
