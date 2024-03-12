/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMultiple;

/**
 *
 * @author Rigo
 */
public class HerenciaMultiple {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Ave a= new Ave("paloma", "blanca");
        Ave1 a1= new Ave1();
        Ave2 a2= new Ave2("gallina","amarilla");
        
        a.Mostrardatos();
        a1.Mostrardatos();
        a2.Mostrardatos();
        
        a2.ColorCresta("rojo");
                
    }
    
    
}
