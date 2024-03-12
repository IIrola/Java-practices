/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_11;

/**
 *
 * @author josea
 */
public class Adulto extends Humano implements trabajo{
    String Jugar;
    String Reir;
    String Dormir;
    //METODO CONSTRUCTOR
    public Adulto(String Nombre, int Edad,String Dormir,String Reir,String Jugar){
        super(Nombre,Edad);
        this.Dormir=Dormir;
        this.Reir=Reir;
        this.Jugar=Jugar;
    }
    @Override
    public String reir(){
        return Reir+", mucho";
    }
    @Override
    public String dormir(){
        return Dormir+", casi no duerme";
    }
    @Override
    public String jugar(){
        return Jugar+" los fines de semana ";
    }
    @Override
    public void trabajo(String trabaja) {
        System.out.println(trabaja+" es Programador para una gran empresa");
    }
    @Override
    public void sueldo(String sueldo) {
        System.out.println("Su sueldo por quincena es de: $"+sueldo);
    }
     
}
