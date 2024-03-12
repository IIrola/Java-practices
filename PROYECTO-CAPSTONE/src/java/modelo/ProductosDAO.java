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
 * @author leoce
 */
public class ProductosDAO {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public List BuscarProducto(String texto) {
        List<Productos> listas = new ArrayList<>();

            String sql = "SELECT * FROM VISTA_PRODUCTOS_TIENDA_EJEMPLO where cate_descripcion like '%" + texto + "%' or prod_descripcion like '%" + texto + "%'";
        
            try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos pr = new Productos();
                pr.setCod_producto(rs.getInt(1));
                pr.setCod_auto_producto(rs.getString(2));
                pr.setProd_descripcion(rs.getString(3));
                pr.setProd_precio(rs.getFloat(4));
                pr.setProd_stock(rs.getInt(5));
                pr.setCod_categoria(rs.getInt(6));
                pr.setCod_proveedor(rs.getInt(7));
                pr.setDescripcion_categoria(rs.getString(8));
                pr.setDescripcion_proveedor(rs.getString(9));
                listas.add(pr);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return listas;
    }

   
    public Productos listaID(int id) {
        Productos p = new Productos();
        String sql = "SELECT * FROM VISTA_PRODUCTOS_TIENDA_EJEMPLO  where cod_producto=" + id;
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setCod_producto(rs.getInt(1));
                p.setCod_auto_producto(rs.getString(2));
                p.setProd_descripcion(rs.getString(3));
                p.setProd_precio(rs.getFloat(4));
                p.setProd_stock(rs.getInt(5));
                p.setCod_categoria(rs.getInt(6));
                p.setCod_proveedor(rs.getInt(7));
                p.setDescripcion_categoria(rs.getString(8));
                p.setDescripcion_proveedor(rs.getString(9));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return p;
    }

    
    public List ListarProductosTienda() {
        List<Productos> ListaProductos = new ArrayList<>();
    
        String sql = "SELECT * FROM VISTA_PRODUCTOS_TIENDA_EJEMPLO";

        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos p = new Productos();
                p.setCod_producto(rs.getInt(1));
                p.setCod_auto_producto(rs.getString(2));
                p.setProd_descripcion(rs.getString(3));
                p.setProd_precio(rs.getFloat(4));
                p.setProd_stock(rs.getInt(5));
                p.setCod_categoria(rs.getInt(6));
                p.setCod_proveedor(rs.getInt(7));
                p.setDescripcion_categoria(rs.getString(8));
                p.setDescripcion_proveedor(rs.getString(9));
                ListaProductos.add(p);

            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ListaProductos;
    }

    public int AgregarProducto(Productos p) {
        
        String sql = "exec insertar_producto ?,?,?,?,?";
     
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getProd_descripcion());
            ps.setFloat(2, p.getProd_precio());
            ps.setInt(3, p.getProd_stock());
            ps.setInt(4, p.getCod_categoria());
            ps.setInt(5, p.getCod_proveedor());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return r;
    }

    public int ActualizarProducto(Productos p) {
        
        String sql = "exec actualizar_producto ?,?,?,?,?,?";

        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql); 
            ps.setInt(1, p.getCod_producto());
            ps.setString(2, p.getProd_descripcion());
            ps.setFloat(3, p.getProd_precio());
            ps.setInt(4, p.getProd_stock());
            ps.setInt(5, p.getCod_categoria());
            ps.setInt(6, p.getCod_proveedor());
            
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return r;
    }

    public void BorrarProducto(int cod) {
        
        String sql = "exec borrar_producto ?";
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cod);
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    public int ActualizarStock(int id, int stock) {

        String sql = "update producto set prod_stock=? where cod_producto=?";
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return r;
    }
    
     public Productos BuscarStock(int idp) {
        Productos p = new Productos();
        String sql = "select * from PRODUCTO where cod_producto="+idp;
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setCod_producto(rs.getInt(1));
                p.setCod_auto_producto(rs.getString(2));
                p.setProd_descripcion(rs.getString(3));
                p.setProd_precio(rs.getFloat(4));
                p.setProd_stock(rs.getInt(5));
                p.setCod_categoria(rs.getInt(6));
                p.setCod_proveedor(rs.getInt(7)); 
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return p;
    }

}
