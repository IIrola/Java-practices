/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_ropa;

/**
 *
 * @author Rigo
 */
public class Vestido {
      private String color;
    private String tipo;
    private String talla;
    private int precio;
    
    public Vestido (String color, String tipo, String talla, int precio){
        this.color=color;
        this.tipo=tipo;
        this.talla=talla;
        this.precio=precio;
    }
    public String getColor(){
        return color;
    }
    public String getTipo(){
        return tipo;
    }
    public String getTalla(){
        return talla;
    }
    public int getPrecio(){
        return precio;
    }
    
}
