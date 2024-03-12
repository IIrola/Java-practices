
package modelo;

import java.util.List;

public class Carrito {
    private int item;
    private int categoria; //CODIGO CATEGORIA
    private String descripcion; //DESCRIPCION CATEGORIA
    private String descripcion_producto; //DESCRIPCION PRODUCTO
    private float precioCompra;
    private int cantidad;
    private float subTotal;
    private int cod_prod;
    
    public Carrito() {
        this.item = 0;
        this.categoria = 0;
        this.descripcion = "NN";
         this.descripcion_producto =  "NN";
        this.precioCompra = 0;
        this.cantidad = 0;
        this.subTotal = 0;
        this.cod_prod = 0;
    }

    public Carrito(int item, int categoria, String descripcion, float precioCompra, int cantidad, float subTotal, int cod_prod) {
        this.item = item;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.cod_prod = cod_prod;
    }

    public Carrito(int item, int categoria, String descripcion, String descripcion_producto, float precioCompra, int cantidad, float subTotal, int cod_prod) {
        this.item = item;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.descripcion_producto = descripcion_producto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.cod_prod = cod_prod;
    }

    
    
    
    
    
    
    
    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }


    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "Carrito{" + "item=" + item + ", categoria=" + categoria + ", descripcion=" + descripcion + ", descripcion_producto=" + descripcion_producto + ", precioCompra=" + precioCompra + ", cantidad=" + cantidad + ", subTotal=" + subTotal + ", cod_prod=" + cod_prod + '}';
    }

    
    
}
