/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalsion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class CompStock {

    public boolean verStock(String cod) {
        String tok="0";
        try {
            String consultar = "SELECT Stock FROM `zapatos` WHERE `cod_pro` = " + cod;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultar);
            if (rs.next()) {
                tok = rs.getString("Stock");
            }
            if ("0".equals(tok)) {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    Conectar cc = new Conectar();
    Connection cn = cc.Conexion();

}
