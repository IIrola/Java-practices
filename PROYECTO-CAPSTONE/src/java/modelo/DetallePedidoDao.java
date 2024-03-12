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
public class DetallePedidoDao {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;    

    public List ListarDetallesCliente(int cod_cliente,int cod_pedido_cliente) {
        List<DetPedido> ListaDetPedidoCli = new ArrayList<>();

        String sql = "SELECT * FROM V_HISTORIAL_PEDIDOS WHERE cod_cliente="+cod_cliente+" and cod_pedido="+cod_pedido_cliente;

        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetPedido dp = new DetPedido();
                
                dp.setCod_pedido(rs.getInt(2));
                dp.setAuto_pedido(rs.getString(3));
                dp.setNombre_cliente(rs.getString(5));
                dp.setApellido_pate(rs.getString(6));
                dp.setApellido_mate(rs.getString(7));
                dp.setDireccion_cliente(rs.getString(8));
                dp.setSub_total_general(rs.getFloat(17));
                dp.setIgv(rs.getFloat(18));
                dp.setEnvio_precio(rs.getFloat(16));
                dp.setTotal_a_pagar(rs.getFloat(19));
                dp.setCategoria_descri(rs.getString(10));
                dp.setNombre_producto(rs.getString(12));
                dp.setPrecio_unitario(rs.getFloat(13));
                dp.setCantidad(rs.getInt(14));
                dp.setSub_total_por_producto(rs.getFloat(15));
                
                ListaDetPedidoCli.add(dp);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ListaDetPedidoCli;
    }
    
           
    public List ListarTodosDetalles(int cod_ped_admin) {
        List<DetPedido> ListaDetallesPedidos = new ArrayList<>();
        
        String sql = "SELECT * FROM V_HISTORIAL_PEDIDOS WHERE cod_pedido="+cod_ped_admin;

        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetPedido dp = new DetPedido();
                
                dp.setCod_pedido(rs.getInt(2));
                dp.setAuto_pedido(rs.getString(3));
                dp.setNombre_cliente(rs.getString(5));
                dp.setApellido_pate(rs.getString(6));
                dp.setApellido_mate(rs.getString(7));
                dp.setDireccion_cliente(rs.getString(8));
                dp.setSub_total_general(rs.getFloat(17));
                dp.setIgv(rs.getFloat(18));
                dp.setEnvio_precio(rs.getFloat(16));
                dp.setTotal_a_pagar(rs.getFloat(19));
                dp.setCategoria_descri(rs.getString(10));
                dp.setNombre_producto(rs.getString(12));
                dp.setPrecio_unitario(rs.getFloat(13));
                dp.setCantidad(rs.getInt(14));
                dp.setSub_total_por_producto(rs.getFloat(15));
                
                ListaDetallesPedidos.add(dp);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ListaDetallesPedidos;
    }         
    
    
    
}
