public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Teclado read = new Teclado();
        
        System.out.println("Ingresa tu nombre");
        
        String Dato = read.leeString();
        
        System.out.println(Dato);
        
    }
    
}
