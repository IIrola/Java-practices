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
public class Proveedor {
    
    
    private int cod_proveedor;
    private String prov_razon, prov_ruc,prov_celular, prov_correo;
    

    public Proveedor() {
        this.cod_proveedor = 0;
        this.prov_razon = "NN";
        this.prov_ruc = "NN";
        this.prov_celular = "NN";
        this.prov_correo = "NN";
    }

    public Proveedor(int cod_proveedor, String prov_razon, String prov_ruc, String prov_celular, String prov_correo) {
        this.cod_proveedor = cod_proveedor;
        this.prov_razon = prov_razon;
        this.prov_ruc = prov_ruc;
        this.prov_celular = prov_celular;
        this.prov_correo = prov_correo;
    }

    public int getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(int cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }

    public String getProv_razon() {
        return prov_razon;
    }

    public void setProv_razon(String prov_razon) {
        this.prov_razon = prov_razon;
    }

    public String getProv_ruc() {
        return prov_ruc;
    }

    public void setProv_ruc(String prov_ruc) {
        this.prov_ruc = prov_ruc;
    }

    public String getProv_celular() {
        return prov_celular;
    }

    public void setProv_celular(String prov_celular) {
        this.prov_celular = prov_celular;
    }

    public String getProv_correo() {
        return prov_correo;
    }

    public void setProv_correo(String prov_correo) {
        this.prov_correo = prov_correo;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "cod_proveedor=" + cod_proveedor + ", prov_razon=" + prov_razon + ", prov_ruc=" + prov_ruc + ", prov_celular=" + prov_celular + ", prov_correo=" + prov_correo + '}';
    }

    
    
   
                    
    
    
}
