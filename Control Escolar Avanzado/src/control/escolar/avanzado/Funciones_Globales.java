/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.escolar.avanzado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class Funciones_Globales {

    public int numeros() {

        int c = 0;

        String SQL = "SELECT MAX(NoControl) AS NoControl FROM alumnos";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getInt("NoControl");
            }
            System.out.print(c);

            if (c != 0) {
                return (c + 1);
            } else {
                return 1;
            }

        } catch (SQLException ex) {
        }
        return 0;
    }

    public boolean subirDAlm(String nombre, String apell, String Curp, String Turno, String Grupo, String Esp, String DirIMG) {
        if (Turno == null || "".equals(nombre) || "".equals(apell) || "".equals(Curp) || "".equals(Grupo) || "Seleccionar".equals(Esp)) {
            return false;
        }
        String insertar = "INSERT INTO alumnos (`NoControl`, `Nombre`, `Apellido`, `Curp`, `Turno`, `Grupo`, `Especialidad`, `imagen`) VALUES(?,?,?,?,?,?,?,?)";
        try {

            FileInputStream archivofoto;
            PreparedStatement pst = cn.prepareStatement(insertar);
            pst.setString(1, null);
            pst.setString(2, nombre);
            pst.setString(3, apell);
            pst.setString(4, Curp);
            pst.setString(5, Turno);
            pst.setString(6, Grupo);
            pst.setString(7, Esp);

            archivofoto = new FileInputStream(DirIMG);

            pst.setBinaryStream(8, archivofoto);

            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                return true;
            }
            return false;
        } catch (SQLException ex) {
            //Error relacionado con SQL
            JOptionPane.showMessageDialog(null, "Error Asegurece de llenar todos los campos de datos y vuelva a intentar Error: Asub");
            return false;
        } catch (FileNotFoundException ex) {
            //error relacionado con el archivo
            JOptionPane.showMessageDialog(null, "Error Asegurece de llenar todos los campos de datos y vuelva a intentar Error: Bsub");
            return false;
        }
    }
    
    

    Conectar cc = new Conectar();
    Connection cn = cc.Conexion();
}
