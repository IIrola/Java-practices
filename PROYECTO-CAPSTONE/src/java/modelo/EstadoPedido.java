/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sistema
 */
public class EstadoPedido {
    private int cod_estado_pedido;
    private String estado_descripcion;

    public EstadoPedido(){
        this.cod_estado_pedido = 0;
        this.estado_descripcion = "NN";
    }

    public EstadoPedido(int cod_estado_pedido, String estado_descripcion) {
        this.cod_estado_pedido = cod_estado_pedido;
        this.estado_descripcion = estado_descripcion;
    }

    public int getCod_estado_pedido() {
        return cod_estado_pedido;
    }

    public void setCod_estado_pedido(int cod_estado_pedido) {
        this.cod_estado_pedido = cod_estado_pedido;
    }

    public String getEstado_descripcion() {
        return estado_descripcion;
    }

    public void setEstado_descripcion(String estado_descripcion) {
        this.estado_descripcion = estado_descripcion;
    }

    @Override
    public String toString() {
        return "EstadoPedido{" + "cod_estado_pedido=" + cod_estado_pedido + ", estado_descripcion=" + estado_descripcion + '}';
    }
    
    
    
    
}
