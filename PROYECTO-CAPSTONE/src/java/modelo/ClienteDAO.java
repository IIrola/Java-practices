/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Logica.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leoce
 */
public class ClienteDAO {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Cliente ListaIdCliente(int id_cliente) {
        Cliente c = new Cliente();
        String sql = "SELECT * FROM CLIENTE WHERE cod_cliente=" + id_cliente;
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setCod_cliente(rs.getInt(1));
                c.setCod_auto_cliente(rs.getString(2));
                c.setCli_nombre(rs.getString(3));
                c.setCli_ap_paterno(rs.getString(4));
                c.setCli_ap_materno(rs.getString(5));
                c.setCli_dni(rs.getString(6));
                c.setCli_celular(rs.getString(7));
                c.setCli_direccion(rs.getString(8));
                c.setCorreo(rs.getString(9));
                c.setPassword(rs.getString(10)); 
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return c;
    }
    
    public List ListarClientes() {
        List<Cliente> ListaClientes = new ArrayList<>();
        String sql = "Select * from CLIENTE";
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCod_cliente(rs.getInt(1));
                c.setCod_auto_cliente(rs.getString(2));
                c.setCli_nombre(rs.getString(3));
                c.setCli_ap_paterno(rs.getString(4));
                c.setCli_ap_materno(rs.getString(5));
                c.setCli_dni(rs.getString(6));
                c.setCli_celular(rs.getString(7));
                c.setCli_direccion(rs.getString(8));
                c.setCorreo(rs.getString(9));
                c.setPassword(rs.getString(10));
                ListaClientes.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ListaClientes;
    }
 
    public void AgregarCLiente(Cliente c) {
       
        String sql = "exec insertar_cliente ?,?,?,?,?,?,?,?";
       
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getCli_nombre());
            ps.setString(2, c.getCli_ap_paterno());
            ps.setString(3, c.getCli_ap_materno());
            ps.setString(4, c.getCli_dni());
            ps.setString(5, c.getCli_celular());
            ps.setString(6, c.getCli_direccion());
            ps.setString(7, c.getCorreo());
            ps.setString(8, c.getPassword());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
  
    public void ActualizarCliente(Cliente c) {
        
        String sql="exec actualizar_cliente ?,?,?,?,?,?,?,?,?"; 
        
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCod_cliente());
            ps.setString(2, c.getCli_nombre());
            ps.setString(3, c.getCli_ap_paterno());
            ps.setString(4, c.getCli_ap_materno());
            ps.setString(5, c.getCli_dni());
            ps.setString(6, c.getCli_celular());
            ps.setString(7, c.getCli_direccion());
            ps.setString(8, c.getCorreo());
            ps.setString(9, c.getPassword());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    

}
