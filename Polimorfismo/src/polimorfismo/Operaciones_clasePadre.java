/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public abstract class Operaciones_clasePadre {
    protected int resultados,valor1,valor2; 
    Scanner teclado= new Scanner(System.in);
    
    //ponemos el metodo
    public void pedirdatos(){
    //dame el primer valor
        System.out.print("Dame el dato 1: ");
        valor1=teclado.nextInt();
        System.out.print("Dame el dato 2: ");
        valor2=teclado.nextInt();
    }
    
    public abstract void operaciones();
    
    //metodo para dar datos
    
    public void Mostrardatos(){
        System.out.println(" "+resultados);
    }
}
