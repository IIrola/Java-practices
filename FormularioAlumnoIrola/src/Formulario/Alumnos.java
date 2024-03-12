/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formulario;

/**
 *
 * @author josea
 */
public class Alumnos {
    int aula, semestre, edad;
    String Nombre, Apellido, Sexo, Carrera, turno;

    Alumnos(int edad, int aula, int semestre, String Nombre, String Apellido, String Especi, String Sexo, String turno) {
        this.edad=edad;
        this.aula=aula;
        this.semestre=semestre;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Carrera=Especi;
        this.Sexo=Sexo;
        this.turno=turno;
    }

    public String getTurno() {
        return turno;
    }
    
    

    public int getAula() {
        return aula;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getCarrera() {
        return Carrera;
    }
    
}
