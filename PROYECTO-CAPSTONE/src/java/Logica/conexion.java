/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor    49670.
 */
package Logica;
import java.sql.*;
/**
 * @author User
 */
public class conexion {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private String url;

    
    //63897
    /*url="jdbc:sqlserver://LAPTOP-HC3FCUDR:1433;databaseName=PROYECTOCAPSTONE";*/
    
    
    public conexion() {
        url="jdbc:sqlserver://localhost:1433;databaseName=carritocompra";

        
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(url,"usuario1","12345");
            st=con.createStatement();
            System.out.println("Exito, Sí se conectó"); 
            
        } catch (Exception e) {      
            
            System.out.println("FRACASO CONEXIÓN: "+e);
        }     
    }
    
    
    
    
    
    
    
    
    
    

    public void consulta(String qry){
        try {
            rs=st.executeQuery(qry); 
        } catch (Exception e) {
            System.out.println("Fracaso: "+e);
        }
    }
    
    public conexion(Connection con, Statement st, ResultSet rs, String url) {
        this.con = con;
        this.st = st;
        this.rs = rs;
        this.url = url;
    }  
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "conexion{" + "con=" + con + ", st=" + st + ", rs=" + rs + ", url=" + url + '}';
    }
    
       
}
