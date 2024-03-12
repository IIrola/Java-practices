

public class herenciaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclado t = new Teclado();
        
        System.out.println("Ingresa la edad de Luis");
        int lu = t.leeInt();
        System.out.println("Ingresa la edad de Juan");
        int ju = t.leeInt();
        System.out.println("Ingresa la edad de Felipe");
        int fe = t.leeInt();
        System.out.println("Ingresa la cantidad de dinero");
        int din = t.leeInt();
        
        int tot = lu + ju + fe;

        System.out.println("La cantidad que le toca a Felipe es de $" + (fe * din / tot) + ", La cantidad que le toca a Luis es de $" + (lu * din / tot) + ", La cantidad que le toca a Juan es de $" + (ju * din / tot));
    }

}
