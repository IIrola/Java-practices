
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Teclado T = new Teclado();
        
        /**
         * 2 vehiculos viajan a diferentes velocidades y estan distanciados con una distancia D. el que esta detras viaja a 
         *una velocidad mayor. se pide hacer un algoritmo, ddf y pj para ingresar la distancia entre los 2 vehiculos y sus respectiva 
         *velocidades, con esto determinar e imprimir en que tiempo alcanzara el vehiculo que tiene mayor velicidad al otro
         * 
         * T = D/(V1-V2)
         * 
         */
        
        float v1=0, v2=0, x=0, time=0;
        
        System.out.println("Ingrese la distancia entre vehiculos");
        x = T.leeFloat();
        
        System.out.println("Ingrese la velocidad del vehiculo 1");
        v1 = T.leeFloat();
        
        System.out.println("Ingrese la velocidad del vehiculo 2");
        v2 = T.leeFloat();
        
        time = x/(v1-v2);
        
        System.out.println("Tardaran "+time+" segundos en encontrarse");
        
    }
    
}
