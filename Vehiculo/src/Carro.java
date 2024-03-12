/*

 */

/**
 *
 * @author josea
 */
public class Carro {
    //Caracteristicas
    public String color="Rojo";
    public String Marca="Mazda";
    public String Tipo="Camion";
    public String Tamaño="Grande";
    public String puertas="4";
    
    //Metodos
    public void encender(){
        System.out.println("El carro se ha encendido");
    }
    public void frenar(){
        System.out.println("El carro se ha frenado");
    }
    public void retroceder(){
        System.out.println("El carro avanza en reversa");
    }
    public void girarIzq(){
        System.out.println("El carro gira a la izquierda");
    }
    public void girarDer(){
        System.out.println("El carro gira a la derecha");
    }
    public void avanzar(){
        System.out.println("El carro avanza hacia delante");
    }
    public void apagar(){
        System.out.println("El carro se ha apagado");
    }
}