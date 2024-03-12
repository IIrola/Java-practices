/*
 * Promedio Jose Angel Irola Canto 3AVPR Fecha: 27/09/2021
 * Elaborar un programa que pueda sacar el promedio de 3 calificaciones
 * Y al final muestre el resultado junto al nombre del alumno
 * and open the template in the editor.
 */
package miproyectoirola;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class MiProyectoIrola {

    /**
     * Al iniciar declaro las variables a usar, despues pido el nombre
     * pido las calificaciones y saco el promedio
     * continuando con un if que determinara si el alumno reprobo o aprobo
     * y finalizando con un texto diciendo la calificacion y el nombre del alumno 
     * @param args
     */
    public static void main(String[] args) {
        float calif1, calif2, calif3;
        float promedio;
        String mensaje, nombre;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nombre del estudiante: ");
        nombre=teclado.nextLine();
        System.out.print("Calificacion 1: ");
        calif1=teclado.nextFloat();
        System.out.print("Calificacion 2: ");
        calif2=teclado.nextFloat();
        System.out.print("Calificacion 3: ");
        calif3=teclado.nextFloat();
        
        promedio=(calif1+calif2+calif3)/3f;
        
        if(promedio>=6){
        mensaje="Aprobo";
        }
        else{
            mensaje="reprobo";
        }
        System.out.println("El estudiante "+nombre);
        System.out.println("Obtuvo el promedio de "+promedio+" y "+mensaje);
        System.out.println("Autor: Jose Angel Irola ");
    }
    
}
