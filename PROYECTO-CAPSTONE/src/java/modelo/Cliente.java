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
public class Cliente {

    private int cod_cliente;
    private String cod_auto_cliente,cli_nombre,cli_ap_paterno, cli_ap_materno,cli_dni,cli_celular,cli_direccion,correo,password;

    public Cliente() {
        this.cod_cliente = 0;
        this.cod_auto_cliente = "NN";
        this.cli_nombre = "NN";
        this.cli_ap_paterno = "NN";
        this.cli_ap_materno = "NN";
        this.cli_dni = "NN";
        this.cli_celular = "NN";
        this.cli_direccion = "NN";
        this.correo = "NN";
        this.password = "NN";
        
    }

    public Cliente(int cod_cliente, String cod_auto_cliente, String cli_nombre, String cli_ap_paterno, String cli_ap_materno, String cli_dni, String cli_celular, String cli_direccion, String correo, String password) {
        this.cod_cliente = cod_cliente;
        this.cod_auto_cliente = cod_auto_cliente;
        this.cli_nombre = cli_nombre;
        this.cli_ap_paterno = cli_ap_paterno;
        this.cli_ap_materno = cli_ap_materno;
        this.cli_dni = cli_dni;
        this.cli_celular = cli_celular;
        this.cli_direccion = cli_direccion;
        this.correo = correo;
        this.password = password;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getCod_auto_cliente() {
        return cod_auto_cliente;
    }

    public void setCod_auto_cliente(String cod_auto_cliente) {
        this.cod_auto_cliente = cod_auto_cliente;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_ap_paterno() {
        return cli_ap_paterno;
    }

    public void setCli_ap_paterno(String cli_ap_paterno) {
        this.cli_ap_paterno = cli_ap_paterno;
    }

    public String getCli_ap_materno() {
        return cli_ap_materno;
    }

    public void setCli_ap_materno(String cli_ap_materno) {
        this.cli_ap_materno = cli_ap_materno;
    }

    public String getCli_dni() {
        return cli_dni;
    }

    public void setCli_dni(String cli_dni) {
        this.cli_dni = cli_dni;
    }

    public String getCli_celular() {
        return cli_celular;
    }

    public void setCli_celular(String cli_celular) {
        this.cli_celular = cli_celular;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_cliente=" + cod_cliente + ", cod_auto_cliente=" + cod_auto_cliente + ", cli_nombre=" + cli_nombre + ", cli_ap_paterno=" + cli_ap_paterno + ", cli_ap_materno=" + cli_ap_materno + ", cli_dni=" + cli_dni + ", cli_celular=" + cli_celular + ", cli_direccion=" + cli_direccion + ", correo=" + correo + ", password=" + password + '}';
    }

    
    
    
    
}
