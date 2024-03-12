
public class diasNaTeclado {

    
    public static void main(String[] args) {
        
        Teclado t = new Teclado();
        
        System.out.println("Ingresa tu año de nacimiento");
        int edad = t.leeInt();
        int origen = 2023 - edad;
        System.out.println("Aproximadamente naciste hace : " + (origen * 365) + " días");
    }

}
