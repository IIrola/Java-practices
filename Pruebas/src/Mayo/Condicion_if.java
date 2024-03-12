package Mayo;
import java.util.Scanner;
/**
 * @author El darki
 */
public class Condicion_if {
    /**
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
    }
    
}