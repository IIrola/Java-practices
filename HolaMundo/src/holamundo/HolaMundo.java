package HolaMundo;
// libreria para leer a traves del teclado

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        // definir variables 
        byte calif1; //byte tipo primitivo
        byte calif2;
        byte calif3, c10 = 0, repro = 0, apro = 0, resp = 1;
        float promedio;
        String mensaje; // String tipo creado por una clase
        String nombre;

        //crear objeto teclado de la clase Scanner para entrada 
        //de datos al sistema 
        Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<<<-Bienvenido al sistema de calificaciones->>>>>>>");

        System.out.print("Presione enter para continuar");
        while (resp == 1) {
            //limpiaremos el buffer
            teclado.nextLine();
            // leer el nombre del estudiante
            System.out.print("Nombre del estudiante: ");
            nombre = teclado.nextLine();
            

            // leer la primera calificacion
            System.out.print("Digite la calif1: ");
            calif1 = teclado.nextByte();
            // leer la segunda calificacion
            System.out.print("Digite la calif2: ");
            calif2 = teclado.nextByte();
            // leer la tercera calificacion
            System.out.print("Digite la calif3: ");
            calif3 = teclado.nextByte();

            // calcular promedio
            promedio = (float) (calif1 + calif2 + calif3) / 3;

            // determinar si la calificacion es aprobatoria o reprobatoria
            if (promedio >= 6) {
                mensaje = "Aprobatoria";
                apro++;
            } else {
                mensaje = "Reprobo";
                repro++;
            }

            if (promedio == 10)
                c10++;

            System.out.println("El alumno " + nombre + " a conseguido una calificacion " + mensaje + "\nla cual es " + promedio);

            System.out.print("Hay otro alumno (1 si/ 0 no): ");
            resp = teclado.nextByte();
        }
        
        System.out.println("El numero de alumnos que aprobaron es: "+apro);
        System.out.println("El numero de reprobados es: "+repro);
        System.out.println("El numero de excentos es: "+c10);
        
        
        
        System.out.println("======================================================================================================\n");

        System.out.println("\nAutor: Juan Salazar");

    }
}
