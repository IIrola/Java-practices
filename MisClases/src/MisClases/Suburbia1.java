/*Act 5b camisasSub  Realizo: Irola Canto Jose Angel  3AVPR Fecha: 30/09/2021
En suburbia venden las camisas a $95.00, 
Al importe de la compra se le agrega el 10% de iva
y ademas 5 pesos de empaque. 
Solicitar el número de camisas y dar como resultado 
el importe inicial, el importe del IVA , los 5 de empaque y el importe final  
*/
package MisClases;
import java.util.Scanner;//Libreria para el Scanner
/**
 * @author josea
*/
public class Suburbia1 {
    /** 
     * @param args
     */
    public static void main(String[] args) {
        //Declaracin de la Variables
        byte nCam;
        float impIni, iva, impFin;
        //Declaro el Scanner
        Scanner teclado = new Scanner(System.in);
        //Presento el programa
        System.out.println("SUBURBIA. VENTA DE CAMISAS A $95.00\n "
                + "\"================================= \n");
        //Solicitar cantidad de camisas a comprar
        System.out.print("Cantidad de camisas: ");
        nCam=teclado.nextByte();
        //Calcular importe inicial de camisas
        impIni = nCam * 95;
        //Calcular el iva
        iva = (float) (impIni*0.1);
        //Calcular importe final de camisas con iva y 5 de empaque
        impFin = impIni + iva + 5;

        //Mostrar el importe inicial, el iva, 5 de empaque y el importe final
        System.out.println("\nEL IMPORTE INICIAL ES: $"+impIni);
        System.out.println("EL IVA ES: $"+iva);
        System.out.println("Se cobra $5.00 de empaque");
        System.out.println("EL IMPORTE FINAL ES: $"+impFin);
        System.out.println("Autor: Jose Angel Irola ");
    }
    
}