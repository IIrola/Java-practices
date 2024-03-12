/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mayo;
import java.util.Scanner;
/**
 *
 * @author El Darki
 */
public class Lector_de_datos {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String autor, titulo, editorial, fecha;
        short pagina;
        byte Preg;
        
        System.out.println("----Redactor sencillo del formato APA----\n"
                + "Anuncio: El programa solo es capaz de dar formato con 1 autor y\n"
                + "con los datos que pide, esto con el fin de no hacerlo muy complejo");
        System.out.print("Nombre del autor: ");
        autor = teclado.nextLine();
        System.out.print("Titulo del libro o publicacion: ");
        titulo=teclado.nextLine();
        System.out.print("Nombre de la editorial(revista o sitio de publicacion): ");
        editorial=teclado.nextLine();
        System.out.print("Fecha de publicacion: ");
        fecha=teclado.nextLine();
        System.out.println("El texto fue sacado de algun libro o sitio con contador de paginas?\n"
                + "1=Si 0=No: ");
        Preg=teclado.nextByte();
        
        if(Preg==1){
        System.out.println("Ingresa el numero de pagina (Solo un numero sin letras): ");
        pagina=teclado.nextShort();
        System.out.println(" "+autor
                          +" ("+fecha
                          +"), "+titulo
                          +", "+editorial
                          +", pp. "+pagina);
        }else
            System.out.println(" "+autor
                          +" ("+fecha
                          +"), "+titulo
                          +", "+editorial);
    }
}
