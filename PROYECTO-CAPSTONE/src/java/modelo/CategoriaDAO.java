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
public class CategoriaDAO {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarCategorias() {
        List<Categoria> ListaCategoria = new ArrayList<>();
        String sql = "SELECT * FROM CATEGORIA";
        
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setCod_categoria(rs.getInt(1));
                c.setCate_descripcion(rs.getString(2));
                ListaCategoria.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
        return ListaCategoria;
    }

}
