/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_11;

/**
 *
 * @author josea
 */
public class PRACTICA_11 {
public static void main(String[] args) {
        Niño h1= new Niño ("Pedro",9,"Si","Si","Si");
        Adulto h2=new Adulto("Leonardo",33,"Si 7 hrs","Si","Si");
        System.out.println("Niño: \nNombre: "+h1.Nombre+"\nEdad: "+h1.Edad+"\n¿Rie? "+h1.reir()
                          +"\n¿Duerme? "+h1.dormir()+"\n¿Juega? "+h1.jugar());
        System.out.println("Adulto: \nNombre: "+h2.Nombre+"\nEdad: "+h2.Edad+"\n¿Rie? "+h2.reir()
                          +"\n¿Duerme? "+h2.dormir()+"\n¿Juega? "+h2.jugar());
        System.out.println("¿Trabaja? ¿En que trabaja?");
        h2.trabajo("Si");
        System.out.println("¿Cual es su sueldo?");
        h2.sueldo("9500");
    }
    
}
