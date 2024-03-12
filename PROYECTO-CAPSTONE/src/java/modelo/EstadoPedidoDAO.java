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
public class EstadoPedidoDAO {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarEstadosPedidos(){
        List<EstadoPedido> ListaEstadoPedido = new ArrayList<>();
        String sql = "SELECT * FROM ESTADO_PEDIDO";
        
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                EstadoPedido ep = new EstadoPedido();
                ep.setCod_estado_pedido(rs.getInt(1));
                ep.setEstado_descripcion(rs.getString(2));
                ListaEstadoPedido.add(ep);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ListaEstadoPedido;
    }
}
