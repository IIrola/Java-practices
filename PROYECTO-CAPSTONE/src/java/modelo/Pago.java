/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author leoce
 */
public class Pago {

    private int cod_pago;
    private String pago_descripcion;
    private Double monto;

    public Pago() {
    }

    public Pago(int cod_pago, Double monto) {
        this.cod_pago = cod_pago;
        this.monto = monto;
    }

    public Pago(int cod_pago, String pago_descripcion, Double monto) {
        this.cod_pago = cod_pago;
        this.pago_descripcion = pago_descripcion;
        this.monto = monto;
    }
    
    
    public String getPago_descripcion() {
        return pago_descripcion;
    }

    public void setPago_descripcion(String pago_descripcion) {
        this.pago_descripcion = pago_descripcion;
    }
    
    
    public int getCod_pago() {
        return cod_pago;
    }

    public void setCod_pago(int cod_pago) {
        this.cod_pago = cod_pago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    

}
