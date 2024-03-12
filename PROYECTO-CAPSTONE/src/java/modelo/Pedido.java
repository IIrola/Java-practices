package modelo;

import java.util.List;

public class Pedido {

    private int cod_pedido;
    private String cod_auto_pedido;
    private int cod_estado_pedido;
    private Double precio_envio;
    private String fecha_envio;
    private String fecha_compra;
    private Cliente cliente;
    private int cod_pago;

    private float total;
    private String descripcion_pago;
    private String descripcion_estado;

    private List<Carrito> detallepedido;

    public Pedido() {
    }

    public Pedido( String fecha_envio, Cliente cliente,int cod_pago,List<Carrito> detallepedido) {
        this.fecha_envio = fecha_envio;   
        this.cliente = cliente;
        this.detallepedido = detallepedido;
        this.cod_pago = cod_pago;
    }
    
    public Pedido(int cod_pedido, String cod_auto_pedido, int cod_estado_pedido, Double precio_envio, String fecha_envio, String fecha_compra, Cliente cliente, int cod_pago, float total, String descripcion_pago, String descripcion_estado, List<Carrito> detallepedido) {
        this.cod_pedido = cod_pedido;
        this.cod_auto_pedido = cod_auto_pedido;
        this.cod_estado_pedido = cod_estado_pedido;
        this.precio_envio = precio_envio;
        this.fecha_envio = fecha_envio;
        this.fecha_compra = fecha_compra;
        this.cliente = cliente;
        this.cod_pago = cod_pago;
        this.total = total;
        this.descripcion_pago = descripcion_pago;
        this.descripcion_estado = descripcion_estado;
        this.detallepedido = detallepedido;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDescripcion_pago() {
        return descripcion_pago;
    }

    public void setDescripcion_pago(String descripcion_pago) {
        this.descripcion_pago = descripcion_pago;
    }

    public String getDescripcion_estado() {
        return descripcion_estado;
    }

    public void setDescripcion_estado(String descripcion_estado) {
        this.descripcion_estado = descripcion_estado;
    }
    
    public List<Carrito> getDetallepedido() {
        return detallepedido;
    }

    public void setDetallepedidos(List<Carrito> detallepedido) {
        this.detallepedido = detallepedido;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public String getCod_auto_pedido() {
        return cod_auto_pedido;
    }

    public void setCod_auto_pedido(String cod_auto_pedido) {
        this.cod_auto_pedido = cod_auto_pedido;
    }

    public int getCod_estado_pedido() {
        return cod_estado_pedido;
    }

    public void setCod_estado_pedido(int cod_estado_pedido) {
        this.cod_estado_pedido = cod_estado_pedido;
    }

    public Double getPrecio_envio() {
        return precio_envio;
    }

    public void setPrecio_envio(Double precio_envio) {
        this.precio_envio = precio_envio;
    }

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCod_pago() {
        return cod_pago;
    }

    public void setCod_pago(int cod_pago) {
        this.cod_pago = cod_pago;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cod_pedido=" + cod_pedido + ", cod_auto_pedido=" + cod_auto_pedido + ", cod_estado_pedido=" + cod_estado_pedido + ", precio_envio=" + precio_envio + ", fecha_envio=" + fecha_envio + ", fecha_compra=" + fecha_compra + ", cliente=" + cliente + ", cod_pago=" + cod_pago + ", total=" + total + ", descripcion_pago=" + descripcion_pago + ", descripcion_estado=" + descripcion_estado + ", detallepedido=" + detallepedido + '}';
    }
    
    
    

}
