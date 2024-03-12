package PaquetedePrueba;
import java.util.Scanner;

/**
 * @author josea
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        User Persona1, Persona2, Persona3;
        Persona1 = new User();
        Persona2 = new User();
        Persona3 = new User();
        
        // otorgar valos al atributo
        String nombre=teclado.nextLine();
        
        //insertar nombre
        Persona1.setNombre(nombre);
        
        System.out.println("el nombre de la persona1 es: "+Persona1.getNombre());
        //insertar edad
        Persona1.setEdad(24);
        
        System.out.println("la edad de la persona1 es: "+Persona1.getEdad());
        //insertar Direccion
        Persona1.setDireccion("Calle san lucas #324");
        
        System.out.println("la direccion de la persona1 es: "+Persona1.getDireccion());
        
        System.out.println("------------------------------------------------------------------------------");
        
        
        //insertar nombre
        Persona2.setNombre("Maria");
        
        System.out.println("el nombre de la persona1 es: "+Persona2.getNombre());
        //insertar edad
        Persona2.setEdad(16);
        
        System.out.println("la edad de la persona2 es: "+Persona2.getEdad());
        //insertar Direccions
        Persona2.setDireccion("Calle Solomon #432");
        
        System.out.println("la direccion de la persona2 es: "+Persona2.getDireccion());
        
    }
    
}
