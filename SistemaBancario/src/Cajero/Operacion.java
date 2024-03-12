/*
 Manejo de operaciones relacionados directamente con los datos delicados de la cuenta
 */
package Cajero;

import java.util.Scanner;

/**
 * @author josea
 */
public class Operacion extends DatosCuenta {

    Scanner tecla = new Scanner(System.in);
    
    public void detector(byte opc, short nipU){
        int cant;
        switch (opc) {
                case 1:
                    //revision de saldo
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    verSal();
                    System.out.print("Enter para continuar ");
                    tecla.nextLine();
                    tecla.nextLine();
                    break;
                case 2:
                    //retiro de dinero
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Cuanto desea retirar?\n"
                            + "1-100\n"
                            + "2-200\n"
                            + "3-500\n"
                            + "4-1000\n"
                            + "5-1500\n"
                            + "6-Otro monto");
                    opc = tecla.nextByte();
                    switch (opc) {
                        case 1:
                            Retiro(100);
                            break;
                        case 2:
                            Retiro(200);
                            break;
                        case 3:
                            Retiro(500);
                            break;
                        case 4:
                            Retiro(1000);
                            break;
                        case 5:
                            Retiro(1500);
                            break;
                        default:
                            System.out.print("Digite el monto a retirar: ");
                            cant = tecla.nextInt();
                            Retiro(cant);
                    }
                    System.out.print("Enter para continuar ");
                    tecla.nextLine();
                    tecla.nextLine();
                    break;
                case 3:
                    //deposito de dinero
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.print("Inserte los billetes y monedas a depositar: ");
                    cant = tecla.nextInt();
                    Deposito(cant);
                    System.out.print("Enter para continuar ");
                    tecla.nextLine();
                    tecla.nextLine();
                    break;
                case 4:
                    //impresion de movimientos
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    movimientos();
                    System.out.print("Enter para continuar ");
                    tecla.nextLine();
                    tecla.nextLine();
                    break;
                case 5:
                    //cambio de nip
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    cambioNIP(nipU);
                    break;
            }
    }

    //impresion de saldo 
    private void verSal() {
        System.out.println("Su saldo actual es de $" + saldo);
    }

    //retiro de dinero
    private void Retiro(int cant) {
        if (cant <= saldo && cant > 0) {
            saldo -= cant;
            System.out.println("El retiro fue exitoso, se ah entregado el dinero solicitado");
            //funcion para añadir el movimiento
            mov6 = mov5;
            mov5 = mov4;
            mov4 = mov3;
            mov3 = mov2;
            mov2 = mov1;
            mov1 = "Se retiro de la cuenta $" + cant;
        } else {
            //en caso de exceder el saldo, retirar 0 o numeros negativos cancela la operacion
            System.out.println("No es posible retirar la cantidad solicitada\nSe le devolvera el menu");
        }
    }
    //funcion para depositos en la cuenta
    private void Deposito(int cant) {
        //añade el dinero solicitado 
        saldo += cant;
        System.out.println("La cantidad ingresada fue depositada a su cuenta");
        //registra el movimiento 
        mov6 = mov5;
        mov5 = mov4;
        mov4 = mov3;
        mov3 = mov2;
        mov2 = mov1;
        mov1 = "Se deposito ha la cuenta $" + cant;
    }

    private void movimientos() {
        //te dice tus ultimos movimientos
        System.out.println("Sus ultimos movimientos en 24 horas han sido:"
                + "\n" + mov6
                + "\n" + mov5
                + "\n" + mov4
                + "\n" + mov3
                + "\n" + mov2
                + "\n" + mov1);

    }

    private void cambioNIP(short pinUser) {
        //declaro las variables que usare
        short pin, pin2, pospin = 0;
        System.out.println("Si quiere cambiar su nip tendra que ingresarlo denuevo para confimar");
        //pide el nip para confirmar
        System.out.print("Ingrese su nip: ");
        pin = teclado.nextShort();
        if (pin == pinUser) {
            //busca donde esta guardado el pin del usuario actual
            for (short i = 0; i < 3; i++) {
                if (Users[i] == pinUser) {
                    pospin = i;
                    break;
                }
            }
            //pide el nuevo nip
            System.out.print("Ingrese el nuevo nip: ");
            pin = teclado.nextShort();
            //lo vuelve a pedir para confirmar
            System.out.print("Ingrese el nuevo nip para confirmar: ");
            pin2 = teclado.nextShort();
            //compara que sean iguales
            if (pin == pin2) {
                //cambia el nip del usuario
                Users[pospin] = pin;
                mov6 = mov5;
                mov5 = mov4;
                mov4 = mov3;
                mov3 = mov2;
                mov2 = mov1;
                mov1 = "SE HA CAMBIADO SU NIP";
            } else {
                //si no son iguales dara error y te sacara
                System.out.println("Error no se ah podido establecer, usted sera redirigido al menu");
            }

        } else {
            //en caso de no poner el nip bien el inicio te saca
            System.out.println("Su nip no es correcto, usted sera redirigido al menu");
        }
    }
    
    

}
