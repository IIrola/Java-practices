/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica12;

/**
 *
 * @author Rigo
 */

public class Animales {
    public static void main(String[] args) {
    Animal1 a1 = new Animal1 ("Oso Panda", "Mamifero") {};
    Animal2 a2 = new Animal2 ("Oso pardo", "Mamifero") {};
    Animal3 a3 = new Animal3 ("Gato", "Mamifero") {};

    
    a1.MostrarDatos();
    a1.ComePlanta("come plantas, por ende es hervivoro");
            
    a2.MostrarDatos();
    a2.ComeCarne("come carne, por ende es carnivoro");
            
    a3.MostrarDatos();
    a3.ComeCarneYPlanta("come carne y plantas, por ende es omnivoro");
    }
    
}
