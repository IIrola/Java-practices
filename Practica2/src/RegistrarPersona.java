
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class RegistrarPersona {

/**
 *
 * @author Rigo
 */
    public static void main(String [] args) {
        Persona a = new Persona();
        a.setNombre ("Rigoberto");
        a.setApellido ("Salazar");
        a.setEdad (18);
        //a.setSexo("H");
        System.out.println("Nombre: "+a.getNombre()+" "+a.getApellido());
        System.out.println("Edad: "+a.getEdad());
        //System.out.println("Sexo: "a.getSexo());
    }
}
