package Mayo;
import java.util.Scanner;
/**
 *
 * @author El darki
 */
public class Ciclo_for {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Impresor de tablas de multiplicar (Tu elijes el rango, 1 a la 10, 1 a la 20 o 20 a la 21.)");
        int inicio, fin, res;
        System.out.print("Ingresa el valor inicial: ");
        inicio=teclado.nextInt();
        System.out.print("Ingresa el valor limite(Mayor al inicial): ");
        fin=teclado.nextInt();
        
        for(int i=inicio; i<=fin; i++){
            System.out.println("\nLa tabla del "+i);
            for(int j=1; j<=10; j++){
                res=i*j;
                System.out.print(" "+i
                                +"x"+j
                                +"="+res
                                +"\n");
            }
        }
    }
    
}
