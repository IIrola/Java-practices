/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_ropa;

/**
 *
 * @author Rigo
 */
public class Eleccion extends Vestido{
    
    public Eleccion(String color, String tipo, String talla,int precio){
        super(color, tipo, talla, precio);
    }

    void Eleccion(String Melanie, String Rios, int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void mostrarDatos(){
        System.out.println("Color: "+getColor()+"\nTipo: "+getTipo()+"\nTalla: "+getTalla()+"\nPrecio: "+getPrecio());
    }
}
