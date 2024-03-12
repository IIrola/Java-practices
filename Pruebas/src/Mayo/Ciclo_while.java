package Mayo;
import java.util.Scanner;//Libreria para el Scanner
/**
 * @author El darki
*/
public class Ciclo_while 
{
    /** 
     * @param args
     */
    public static void main(String[] args) 
    {
        //Declaracin de la Variables
        byte numSillas, numMesas, numManteles;
        float impCliente; 
        byte totalSillas=0;//ACUMULARA EL NUM DE SILLAS ALQUILADAS QUE INICIA EN 0
        byte totalManteles=0;//ACUMILARA EL NUM DE MANTELES ALQUILADOS QUE INICIA EN 0
        byte totalMesas=0;//ACUMULARA EL NUM DE MESAS ALQUILADAS QUE INICIA EN 0
        float totalImportes=0;//ACUMULARA EL NUM DE IMPORTES QUE INICIA EN 0
        byte resp=1;    //RESPUESTA SI HAY OTRO CLIENTE QUE INICIA EN 1
        byte contMay100=0; //QUE INICIA EN 0

        //Presentar el programa en pantalla
        System.out.println("***RENTA DE SILLAS, MESAS Y MANTELES*** ");
        System.out.println("======FUNCIONA PARA VARIOS CLIENTES======");// FUNCIONA PARA VARIOS CLIENTES

        //Declaro el Scanner
        Scanner teclado = new Scanner(System.in);

        //repetir pasos si resp es igual a 1
        while (resp == 1)
        {
            //Sollicitar numero de sillas y mesas
            System.out.print("\nNumero de sillas: ");
            numSillas=teclado.nextByte();
            System.out.print("Numero de manteles:");
            numManteles=teclado.nextByte();
            System.out.print("Numero de mesas: ");
            numMesas=teclado.nextByte();
		
            //Calcular el importe por cliente
            impCliente = (numSillas * 10) + (numMesas * 20) + (numManteles * 2);
		
            //Mostrar el importe del cliente
            System.out.println("EL IMPORTE DEL CILENTE ES: $"+impCliente);
		
            //Calcular el total de sillas 
            totalSillas = (byte) (totalSillas + numSillas);
            //Calcular  el total de mesas
            totalMesas = (byte) (totalMesas + numMesas);
            //calcula total de manteles
            totalManteles = (byte) (totalManteles + numManteles);
            //calcular el total de los importes
            totalImportes = totalImportes + impCliente;
        
            //Calcular total de clientes que pagaro mas de 100 pesos
            if (impCliente > 200)
            {
                contMay100 = (byte) (contMay100 + 1);
            }
            //preguntar si hay otro cliente
            System.out.print("\nHay otro cliente? \n(1 si/ 0 no): "); 
            resp=teclado.nextByte();		
	}//FIN DEL MIENTRAS
        
        //MOSTRAR TOTAL DE SILLAS RENTADAS Y TOTAL DE MESAS RENTADAS Y TOTAL DE IMPORTES
	System.out.println("\n\nEL TOTAL DE SILLAS RENTADAS ES: "+totalSillas);
	System.out.println("EL TOTAL DE MANTELES RENTADOS ES: "+totalManteles);
	System.out.println("EL TOTAL DE MESAS RENTADAS ES: "+totalMesas);
        System.out.println("EL TOTAL DE IMPORTES ES: $"+totalImportes);
	System.out.println("Total de clientes que pagaron mas de 200 pesos:  "+contMay100);
        
        //finalizar  el programa
    }
}