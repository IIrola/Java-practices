/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Logica.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sistema
 */
public class ProveedorDAO {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public List buscar(String texto) {
        List<Proveedor> listas = new ArrayList<>();

        String sql = "SELECT * FROM PROVEEDOR where prov_razon like '%" + texto + "%' or prov_ruc like '%" + texto + "%'";
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor pr = new Proveedor();
                pr.setCod_proveedor(rs.getInt(1));
                pr.setProv_razon(rs.getString(2));
                pr.setProv_ruc(rs.getString(3));
                pr.setProv_celular(rs.getString(4));
                pr.setProv_correo(rs.getString(5));
                listas.add(pr);
            }
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        return listas;
    }
    
    public Proveedor listaID(int id){   
        Proveedor pr = new Proveedor();
        String sql = "SELECT * FROM PROVEEDOR where cod_proveedor=" + id;
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pr.setCod_proveedor(rs.getInt(1));
                pr.setProv_razon(rs.getString(2));
                pr.setProv_ruc(rs.getString(3));
                pr.setProv_celular(rs.getString(4));
                pr.setProv_correo(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return pr;
    }
    
    
    public List listar() {
        
        List<Proveedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM PROVEEDOR";

        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor p = new Proveedor();
                p.setCod_proveedor(rs.getInt(1));
                p.setProv_razon(rs.getString(2));
                p.setProv_ruc(rs.getString(3));
                p.setProv_celular(rs.getString(4));
                p.setProv_correo(rs.getString(5));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
    
    public int AgregarNuevoProveedor(Proveedor p){
        
        String sql = "exec insertar_proveedor ?,?,?,?";
         
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getProv_razon());
            ps.setString(2, p.getProv_ruc());
            ps.setString(3, p.getProv_celular());
            ps.setString(4, p.getProv_correo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return r;
    }

    public int ActualizarProveedor(Proveedor p) {
        
        String sql="exec actualizar_proveedor ?,?,?,?,?";   
        
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCod_proveedor());
            ps.setString(2, p.getProv_razon());
            ps.setString(3, p.getProv_ruc());
            ps.setString(4, p.getProv_celular());
            ps.setString(5, p.getProv_correo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return r;
    }

    public void EliminarProveedor(int cod) {
        String sql = "exec borrar_proveedor ?";
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cod);
            ps.executeQuery();
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    
}
