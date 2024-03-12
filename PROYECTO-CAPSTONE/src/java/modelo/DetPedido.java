
package modelo;

public class DetPedido {
    int cod_detalle;
    int cod_pedido;
    int cod_producto;
    int cantidad;
    
    private String auto_pedido;
    private String nombre_cliente;
    private String apellido_pate;
    private String apellido_mate;
    private String direccion_cliente;
    private String cel_cliente;
               
    private float sub_total_general;
    private float igv;
    private float envio_precio;
    private float total_a_pagar;

    private String categoria_descri;
    private String nombre_producto;
    private float precio_unitario;
    
    private float sub_total_por_producto;

    public DetPedido() {
    }
    

    public DetPedido(int cod_detalle, int cod_pedido, int cod_producto, int cantidad) {
        this.cod_detalle = cod_detalle;
        this.cod_pedido = cod_pedido;
        this.cod_producto = cod_producto;
        this.cantidad = cantidad;
    }
    
   
    public int getCod_detalle() {
        return cod_detalle;
    }

    public void setCod_detalle(int cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DetPedido(int cod_detalle, int cod_pedido, int cod_producto, int cantidad, String auto_pedido, String nombre_cliente, String apellido_pate
            , String apellido_mate, String direccion_cliente, float sub_total_general, float igv, float envio_precio, float total_a_pagar,
            String categoria_descri, String nombre_producto, float precio_unitario, float sub_total_por_producto) {
        this.cod_detalle = cod_detalle;
        this.cod_pedido = cod_pedido;
        this.cod_producto = cod_producto;
        this.cantidad = cantidad;
        this.auto_pedido = auto_pedido;
        this.nombre_cliente = nombre_cliente;
        this.apellido_pate = apellido_pate;
        this.apellido_mate = apellido_mate;
        this.direccion_cliente = direccion_cliente;
        this.sub_total_general = sub_total_general;
        this.igv = igv;
        this.envio_precio = envio_precio;
        this.total_a_pagar = total_a_pagar;
        this.categoria_descri = categoria_descri;
        this.nombre_producto = nombre_producto;
        this.precio_unitario = precio_unitario;
        this.sub_total_por_producto = sub_total_por_producto;
        
    }

    public String getCel_cliente() {
        return cel_cliente;
    }

    public void setCel_cliente(String cel_cliente) {
        this.cel_cliente = cel_cliente;
    }

    
    public String getAuto_pedido() {
        return auto_pedido;
    }

    public void setAuto_pedido(String auto_pedido) {
        this.auto_pedido = auto_pedido;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_pate() {
        return apellido_pate;
    }

    public void setApellido_pate(String apellido_pate) {
        this.apellido_pate = apellido_pate;
    }

    public String getApellido_mate() {
        return apellido_mate;
    }

    public void setApellido_mate(String apellido_mate) {
        this.apellido_mate = apellido_mate;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public float getSub_total_general() {
        return sub_total_general;
    }

    public void setSub_total_general(float sub_total_general) {
        this.sub_total_general = sub_total_general;
    }

    public float getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public float getEnvio_precio() {
        return envio_precio;
    }

    public void setEnvio_precio(float envio_precio) {
        this.envio_precio = envio_precio;
    }

    public float getTotal_a_pagar() {
        return total_a_pagar;
    }

    public void setTotal_a_pagar(float total_a_pagar) {
        this.total_a_pagar = total_a_pagar;
    }

    public String getCategoria_descri() {
        return categoria_descri;
    }

    public void setCategoria_descri(String categoria_descri) {
        this.categoria_descri = categoria_descri;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getSub_total_por_producto() {
        return sub_total_por_producto;
    }

    public void setSub_total_por_producto(float sub_total_por_producto) {
        this.sub_total_por_producto = sub_total_por_producto;
    }

    @Override
    public String toString() {
        return "DetPedido{" + "cod_detalle=" + cod_detalle + ", cod_pedido=" + cod_pedido + ", cod_producto=" + cod_producto + ", cantidad=" + cantidad + ", auto_pedido=" + auto_pedido + ", nombre_cliente=" + nombre_cliente + ", apellido_pate=" + apellido_pate + ", apellido_mate=" + apellido_mate + ", direccion_cliente=" + direccion_cliente + ", sub_total_general=" + sub_total_general + ", igv=" + igv + ", envio_precio=" + envio_precio + ", total_a_pagar=" + total_a_pagar + ", categoria_descri=" + categoria_descri + ", nombre_producto=" + nombre_producto + ", precio_unitario=" + precio_unitario + ", sub_total_por_producto=" + sub_total_por_producto + '}';
    }
    
 
}
