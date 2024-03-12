package Lavadora;

/**
 * @author josea
 */
public class Funciones {
    
    private byte llenadocomplet=0, lavadocomp=0,secadocomp=0, tipolav=0, kilosropa=0;

    private void llenado(){
        System.out.println("La lavadora se esta llenando");
        System.out.println("El llenado se ah completado");
        llenadocomplet=1;
    }
    private void lavado(){
        llenado();
        if(llenadocomplet==1){
        System.out.println("El lavado esta comenzando");
        if(tipolav==1){
        System.out.println("El lavado seleccionado es el suave\n"
                + "Comenzando lavado\n"
                + "Lavado completo");
        lavadocomp=1;
        }
        else if(tipolav==2){
        System.out.println("El lavado seleccionado es el Intenso\n"
                + "Comenzando lavado\n"
                + "Lavado completo");
        lavadocomp=1;
        }
        }
    }        
    private void secado(){
        lavado();
        System.out.println("El secado se ah comenzado\n"
                + "Secado completo");
    }
    public void cicloCompleto(byte tipoL){
        tipolav=tipoL;
    secado();
    System.out.println("El ciclo se ah completado, puede retirar la ropa");
    }
    public byte settertipoL(byte tipoL){
    tipolav=tipoL;
    return 2;
    } 
}
