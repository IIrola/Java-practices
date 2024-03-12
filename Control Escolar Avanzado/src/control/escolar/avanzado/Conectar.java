/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.escolar.avanzado;

import java.sql.Statement;
import java.sql.Connection; //cambiar el nombre de esa libreria 
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author josea
 */
public class Conectar {
    
     Connection con=null;
    
    
    String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", "108.162.221.168", 44888, "escuela");
    public Connection Conexion(){
       try {
            Class.forName("com.mysql.jdbc.Driver");//se conecta a la base
       
            con=DriverManager.getConnection(url, "root", "");//llamamos a la base
            /*String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", "localhost", 3306, "escuela");*/
            //JOptionPane.showMessageDialog(null,"Conectado"); //bingo si se conecto  :)
        }catch (Exception e) {
            System.err.println("Error "+e);//por si no se conecta
        } 
       return con;
    }
}
