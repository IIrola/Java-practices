/**
 * Act 11C arraySueldo AUTOR: Jose Angel Irola Canto GRUPO: 3AVPR Fecha: 04/11/2021
 * programa que usa arreglos para guardar ciertos datos, sacamos un Sueldo y al final lo muestra con una lista
 * igual sirve para n trabajadores
*/

package arrays;

import java.util.Scanner;
/**
 * @author josea
 */
public class arrayspromedios2 {

    public static void main(String[] args) {
        //iniciamos el scanner para leer datos
        Scanner tecla = new Scanner(System.in);
        //defino variables
        byte cont=1, n=0;
        
        System.out.println("-------Registro de sueldos-------\n******Nombre y Sueldo en lista para varios Trabajadores*******\n--------------------------------------");
        //pregunto cuantos Trabajadoras se registraran
        System.out.print("Cuantos Empleados va registrar: ");
        n=tecla.nextByte();
        
        //inicio los vectores
        String rnom[] = new String[n];
        float rHoras[] = new float[n];
        float rSueldo[] = new float[n];
        
        //Iniciamos el while
        while(cont<=n)
            {
            tecla.nextLine();
            //leer el nombre del Trabajador    
            System.out.print("Nombre del empleado: ");
            
            rnom[cont-1]=tecla.nextLine();//guardamos en el vector
            
            //leemos las Horas trabajadas
            System.out.print("Ingrese las horas que trabajo: ");
            rHoras[cont-1]=tecla.nextFloat();//guardamos las calificaciones en vectores
            
            //calculamos el sueldo y lo registramos en un vector
            rSueldo[cont-1]= rHoras[cont-1]*25f;
            
            cont++;//incrementamos el contador
        }//fin del while
        //Mostramos los encabezados de la tabla
        System.out.println("NOMBRE"+ "\t"+"HORAS TRAB."+"\t"+"SUELDO");
        //empezamos el for para cada alumno
        for(int i=0; i<n; i++){
            //imprimimos los valores de cada Empleado en una linea
            System.out.println(rnom[i]+"\t"+rHoras[i]+"\t"+"\t"+rSueldo[i]);
        }//fin del for
        System.out.println("Autor: Jose Angel Irola Canto");
    }//fin del main
    
}//fin de la clase
