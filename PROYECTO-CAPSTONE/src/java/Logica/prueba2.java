/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
/**
 *
 * @author Sistema
 */
  public class prueba2 {

            public static void main(String[] args) {
                // TODO code application logic here

                     conexion con= new conexion();

                     //con.consulta("select * from curso");
                con.consulta( "SELECT * FROM CLIENTE " 
        );
                try {
                    while(con.getRs().next()){
                        System.out.println(con.getRs().getString(1)+" "+con.getRs().getString(2)+ " " + con.getRs().getString(3));
                    }
                } catch (Exception e) {
                }
            }

        }
