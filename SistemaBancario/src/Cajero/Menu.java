package Cajero;

import Cajero.Operacion;
import Cajero.Operacion;
import java.util.Scanner;

/**
 * @author josea
 */
public class Menu {

    Scanner tecla = new Scanner(System.in);
    Operacion funcion = new Operacion();

    public void Banca(short Nip) {
        //declaro algunas variables de apoyo
        short nipU=Nip;
        byte opc;
        //doy la bienvenida al usuario
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Nos alegra tenerte devuelta.");
        //inicio el do
        do {
            //presento el menu de opciones
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Que deseas realizar?\n"
                    + "1-Revision de saldo\n"
                    + "2-Retiro de efectivo\n"
                    + "3-Deposito de efectivo\n"
                    + "4-Revision de movimientos\n"
                    + "5-Cambio de nip\n"
                    + "6-salir");
            //leo su eleccion y la identifico con el switch
            opc = tecla.nextByte();
            funcion.detector(opc, nipU);
        //finalizo el do while
        } while (opc != 6);
    }
}
