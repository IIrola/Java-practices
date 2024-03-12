/*Act 6 rentadora  Realiz0: Irola Canto Jose Angel  Grupo:3AVPR        Fecha: 04-OCTUBRE-2021
En una rentadora se renta cada silla a 10 pesos y cada mesa a 25 pesos,
Al iniciar el dia se prepara el programa para las rentas del dia (mientras haya clientes respuesta = 1)
Despues de cada cliente preguntar si hay otro :  1)si  0)no 
PARA CADA CLIENTE REALIZAR:
Solicitar numero de sillas y numero de mesas a rentar.
Calcular y mostrar el importe a pagar por el cliente.
EN GENERAL OBTENER Y REALIZAR:
El total de sillas rentadas por todos los clientes
El total de mesas rentadas por todos los clientes

El total de importes de todos los clientes
Contador de clientes que pagaron mas de 100 pesos. */
package MisClases;
import java.util.Scanner;//Libreria para el Scanner
/**
 * @author josea
*/
public class Rentadora1 
{
    /** 
     * @param args
     */
    public static void main(String[] args) 
    {
        //Declaracin de la Variables
        byte numSillas, numMesas;
        float impCliente; 
        byte totalSillas=0;//ACUMULARA EL NUM DE SILLAS ALQUILADAS QUE INICIA EN 0
        byte totalMesas=0;//ACUMULARA EL NUM DE MESAS ALQUILADAS QUE INICIA EN 0
        float totalImportes=0;//ACUMULARA EL NUM DE IMPORTES QUE INICIA EN 0
        byte resp=1;    //RESPUESTA SI HAY OTRO CLIENTE QUE INICIA EN 1
        byte contMay100=0; //QUE INICIA EN 0

        //Presentar el programa en pantalla
        System.out.println("***RENTA DE SILLAS Y MESAS*** ");
        System.out.println("===FUNCIONA PARA VARIOS CLIENTES======");// FUNCIONA PARA VARIOS CLIENTES

        //Declaro el Scanner
        Scanner teclado = new Scanner(System.in);

        //repetir pasos si resp es igual a 1
        while (resp == 1)
        {
            //Sollicitar numero de sillas y mesas
            System.out.print("\nNumero de sillas: ");
            numSillas=teclado.nextByte();
            System.out.print("Numero de mesas: ");
            numMesas=teclado.nextByte();
		
            //Calcular el importe por cliente
            impCliente = (numSillas * 10) + (numMesas * 25);
		
            //Mostrar el importe del cliente
            System.out.println("EL IMPORTE DEL CILENTE ES: $"+impCliente);
		
            //Calcular el total de sillas 
            totalSillas = (byte) (totalSillas + numSillas);
            //Calcular  el total de mesas
            totalMesas = (byte) (totalMesas + numMesas);
            //calcular el total de los importes
            totalImportes = totalImportes + impCliente;
        
            //Calcular total de clientes que pagaro mas de 100 pesos
            if (impCliente > 100)
            {
                contMay100 = (byte) (contMay100 + 1);
            }
            //preguntar si hay otro cliente
            System.out.print("\nHay otro cliente? \n(1 si/ 0 no): "); 
            resp=teclado.nextByte();		
	}//FIN DEL MIENTRAS
        
        //MOSTRAR TOTAL DE SILLAS RENTADAS Y TOTAL DE MESAS RENTADAS Y TOTAL DE IMPORTES
	System.out.println("\n\nEL TOTAL DE SILLAS RENTADAS ES: "+totalSillas);
	System.out.println("EL TOTAL DE MESAS RENTADAS ES: "+totalMesas);
        System.out.println("EL TOTAL DE IMPORTES ES: $"+totalImportes);
	System.out.println("Total de clientes que pagaron mas de 100 pesos:  "+contMay100);
        
        //Separar informacion
        System.out.println("----------------------------------------------------");
        //Mostrar autor del programa
        System.out.println("Autor: Irola Canto Jose Angel");

        //finalizar  el programa
    }
}