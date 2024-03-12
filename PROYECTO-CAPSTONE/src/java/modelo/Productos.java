
package modelo;


public class Productos {
 
    private int cod_producto;
    private String cod_auto_producto;
    private String prod_descripcion;
    private float prod_precio;
    private int prod_stock;
    private int cod_categoria;
    private int cod_proveedor;
    private String descripcion_categoria;
    private String descripcion_proveedor;
    
    public Productos() {
        this.cod_producto = 0;
        this.cod_auto_producto = "nn";
        this.prod_descripcion = "nn";
        this.prod_precio = 0;
        this.prod_stock =0;
        this.cod_categoria = 0;
        this.cod_proveedor = 0; 
         this.descripcion_categoria = "nn";
    }

    public Productos(int cod_producto, String cod_auto_producto, String prod_descripcion, float prod_precio, int prod_stock, int cod_categoria, int cod_proveedor, String descripcion_categoria, String descripcion_proveedor) {
        this.cod_producto = cod_producto;
        this.cod_auto_producto = cod_auto_producto;
        this.prod_descripcion = prod_descripcion;
        this.prod_precio = prod_precio;
        this.prod_stock = prod_stock;
        this.cod_categoria = cod_categoria;
        this.cod_proveedor = cod_proveedor;
        this.descripcion_categoria = descripcion_categoria;
        this.descripcion_proveedor = descripcion_proveedor;
    }    
    
    public String getDescripcion_proveedor() {
        return descripcion_proveedor;
    }

    public void setDescripcion_proveedor(String descripcion_proveedor) {
        this.descripcion_proveedor = descripcion_proveedor;
    }
    

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

    public int getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(int cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getCod_auto_producto() {
        return cod_auto_producto;
    }

    public void setCod_auto_producto(String cod_auto_producto) {
        this.cod_auto_producto = cod_auto_producto;
    }

    public String getProd_descripcion() {
        return prod_descripcion;
    }

    public void setProd_descripcion(String prod_descripcion) {
        this.prod_descripcion = prod_descripcion;
    }

    public float getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(float prod_precio) {
        this.prod_precio = prod_precio;
    }

    public int getProd_stock() {
        return prod_stock;
    }

    public void setProd_stock(int prod_stock) {
        this.prod_stock = prod_stock;
    }

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    @Override
    public String toString() {
        return "Productos{" + "cod_producto=" + cod_producto + ", cod_auto_producto=" + cod_auto_producto + ", prod_descripcion=" + prod_descripcion + ", prod_precio=" + prod_precio + ", prod_stock=" + prod_stock + ", cod_categoria=" + cod_categoria + ", cod_proveedor=" + cod_proveedor + ", descripcion_categoria=" + descripcion_categoria + ", descripcion_proveedor=" + descripcion_proveedor + '}';
    }


}
