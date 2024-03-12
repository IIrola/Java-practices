
public class anioNaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Teclado t = new Teclado();
        
        System.out.println("Ingresa tu edad actual");
        int edad = t.leeInt();
        int origen = 2023 - edad;
        System.out.println("Aproximadamente naciste en : " + origen);
    }

}
