
public class edadTeclado {

    public static void main(String[] args) {
        
        Teclado t = new Teclado();
        
        System.out.println("Ingresa tu año de nacimiento");
        
        int an = t.leeInt();
        int edad = 2023 - an;
        System.out.println( "Tu edad este año sera de : " + edad);
    }

}
