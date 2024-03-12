/*Prog NPromedios Realizó: Irola Canto Jose Angel Grupo:3AVPR Fecha: 12/08/2021
Un maestro desea obtener promedios de los alumnos que se presentan al aula
Al llegar al aula prepara el programa para promedios de alumnos (mientras haya alumnos, respuesta = 1)
Después de cada alumno preguntar si hay otro : 1)si 0)no
PARA CADA ALUMNO REALIZAR:
-Solicitar nombre del alumno, calif1, calif2 y calif3
-Calcular y mostrar el promedio de las 3 calif y un mensaje de "Aprobó" o "Reprobó".
EN GENERAL OBTENER Y MOSTRAR:
Contador de alumnos aprobados
Contador de alumnos reprobados
Contador de alumnos cuyo promedio sea igual a 10*/
package MisClases;

import java.util.Scanner;

/**
* @author Josea
*/
public class Promedios2{

/**
* @param args
*/
public static void main(String[] args) {
//DECLARO VARIABLES SHORT
short calif, r, contA=0, contR=0, con10=0;
String nombre, mensaje;
//DESCRIBO EL PROGRAMA
System.out.println("-----Sistema de calificaciones-----");
System.out.println("El programa imprime el nombre, calificacion eh incluso\nsi el alumno aprobo o reprobo utilizando los datos que proporcione");
Scanner teclado= new Scanner(System.in);
do{
    //DECLARO MIS FLOAT
    float prom, sumacalif=0;
    //LIMPIA EL BUFFER
    System.out.print("Enter para continuar");
    teclado.nextLine();
    //PIDE EL NOMBRE
    System.out.print("Ingrese el nombre del alumno: ");
    nombre=teclado.nextLine();
    //PIDE LAS TAREAS
    for(int i=1; i<=3; i++){
    System.out.print("Ingrese la tarea "+i+": ");
    calif = teclado.nextShort();
    sumacalif += calif;
    }
    //DEFINE EL PROMEDIO
    prom=(float) sumacalif/3;
    //CHECA SI APROBO O REPROBO
    if(prom>=6){
        mensaje="Aprobo";
        contA++;
    }
    else{
        mensaje="reprobo";
        contR++;
    }
    
        //CHECA QUIEN PASO CON 10
    if(prom==10)con10++;
    
        //IMPRIME LA INFO DEL ALUMNO
    System.out.println("El estudiante "+nombre);
    System.out.println("Obtuvo el promedio de "+prom+" y "+mensaje);
        
    System.out.print("hay otro alumno?\n1(Si) 2(No): ");
    r = teclado.nextByte();
}while(r==1);//finaliza el DO WHILE
        //MOSTRAR TOTAL DE ALUMNO APROBADO, TOTAL DE ALUMNOS REPROBADOS Y TOTAL DE APROBADOS CON 10
	System.out.println("\n\nEL TOTAL DE ALUMNOS APROBADOS ES: "+contA);
	System.out.println("EL TOTAL DE ALUMNOS REPROBADOS ES: "+contR);
	System.out.println("TOTAL DE ALUMNOS QUE PASARON CON 10 :  "+con10);
        
        //Separar informacion
        System.out.println("----------------------------------------------------");
        //Mostrar autor del programa
        System.out.println("Autor: Irola Canto Jose Angel");

        //finalizar  el programa
    }
}
