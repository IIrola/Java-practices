/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String oracion = a.nextLine();

        char[] oracion2 = new char[oracion.length()];

        oracion2=oracion.toCharArray();

        if (oracion.charAt(0) >= 97 && oracion.charAt(0) <= 122) {
            oracion2[0] = (char) (oracion.charAt(0) - 32);
        }

        for (int i = 1; i < oracion.length(); i++) {
            char caracter = oracion.charAt(i);
            if (i % 2 == 0) {
                if (caracter >= 97 && caracter <= 122) {
                    oracion2[i] =  (char)(caracter - 32);
                }
            } else if (caracter >= 65 && caracter <= 90) {
                oracion2[i] = (char) (caracter + 32);
            }
        }


        System.out.println(oracion2);
    }

}
/*
        if(oracion.charAt(i)>=65 && oracion.charAt(i)<90){
        oracion2+=oracion.charAt(i)+32;
        }
*/
