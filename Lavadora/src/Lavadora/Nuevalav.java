/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lavadora;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Nuevalav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte kiloR, tipolav;
        Funciones Lavadora=new Funciones();
        Scanner teclado=new Scanner(System.in);
        do{
        System.out.print("Kilos de ropa leidos: ");
        kiloR=teclado.nextByte();
        if(kiloR>12){
        System.out.println("El sistema no puede iniciar el lavado\nRazon: Kilos excedidos, retire ropa");
        }
        }while(kiloR>12);
        System.out.println("Elija el tipo de lavado: ");
        tipolav=teclado.nextByte();
        tipolav=Lavadora.settertipoL((byte)2);
        System.out.println("El lavado puede comenzar");
        Lavadora.cicloCompleto( tipolav );
    
    
    }
    
}
