/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases_abstractas;

/**
 *
 * @author Rigo
 */

public class Clases_abstractas {

   
    public static void main(String[] args) {
        // TODO code application logic here
        figura f1;
        f1=new cuadrado(8, "Cuadrado");
        figura f2=new circulo(15.5, "Circulo");
        System.out.println("Area del circulo: "+f2.area());
        System.out.println("Area del cuadrado: "+f1.area());
    }
    
}