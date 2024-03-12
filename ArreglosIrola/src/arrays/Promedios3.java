/**
 * Act 11 arrayPromedios3 AUTOR: Jose Angel Irola Canto GRUPO: 3AVPR Fecha: 19/10/2021
 * programa que usa arreglos para guardar ciertos datos, sacamos un promedio y al final lo con una lista
*/

package arrays;

import java.util.Scanner;
/**
 * @author josea
 */
public class Promedios3 {

    public static void main(String[] args) {
        //iniciamos el scanner para leer datos
        Scanner tecla = new Scanner(System.in);
        //defino variables
        byte calif1,cont=1, n=3;
        int calif3, calif2;
        String nombre;
        
        System.out.println("-------Registro de calificacion-------\n******Nombre y promedio en lista*******\n--------------------------------------");
        //inicio los vectores
        String rnom[] = new String[n];
        float rprom[] = new float[n];
        byte rCalif1[] = new byte[n];
        
        System.out.print("Enter para continuar");
        //Iniciamos el while
        while(cont<=n)
            {
            tecla.nextLine();
            //leer el nombre del alumno    
            System.out.print("Nombre del estudiante: ");
            
            rnom[cont-1]=tecla.nextLine();//guardamos en el vector
            
            //leemos las calificaciones
            System.out.print("Ingrese la primera calificacion: ");
            rCalif1[cont-1]=tecla.nextByte();//guardamos la pirmera en un vector
            System.out.print("Ingrese la segunda calificacion: ");
            calif2=tecla.nextInt();//guardamos la segunda y tercera normal
            System.out.print("Ingrese la tercera calificacion: ");
            calif3=tecla.nextInt();
            
            //calculamos el promedio y registramos promedio en un vector
            rprom[cont-1]= (rCalif1[cont-1]+calif2+calif3)/3f;
            
            cont++;//incrementamos el contador
        }//fin del while
        //Mostramos los encabezados de la tabla
        System.out.println("NOMBRE"+ "\t"+ "CAL1"+ "\t"+ "PROM");
        //empezamos el for para cada alumno
        for(int i=0; i<n; i++){
            //imprimimos los valores de cada alumno en una linea
            System.out.println(rnom[i]+"\t"+rCalif1[i]+"\t"+rprom[i]);
        }//fin del for
        System.out.println("Autor: Jose Angel Irola Canto");
    }//fin del main
    
}//fin de la clase
