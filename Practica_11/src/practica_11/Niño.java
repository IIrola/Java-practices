/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_11;

/**
 *
 * @author Rigo
 */
public class Niño extends Humano{
    String Jugar;
    String Dormir;
    String Reir;
    public Niño(String Nombre, int Edad,String Jugar,String Dormir,String Reir){
        super(Nombre,Edad);
        this.Jugar=Jugar;
        this.Dormir=Dormir;
        this.Reir=Reir;
    }
    @Override
    public String reir(){
        return Reir+" rie mucho.";
    }
    @Override
    public String dormir(){
        return Dormir+" 9 hrs por dia";
    }    
    @Override
    public String jugar(){
        return Jugar+" Todos los dias   ";
    }
}
