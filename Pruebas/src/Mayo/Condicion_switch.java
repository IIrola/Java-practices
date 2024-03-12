package Mayo;

import java.util.Scanner;

/**
 * @author El Darki
 */
public class Condicion_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int saldo = 1000, ingreso, retiro, pinUser = 0000, pin, pin2;
        byte intentos = 3, opc;
        String mov1 = "Sin registro", mov2 = "Sin registro", mov3 = "Sin registro";
        for (int i = 0; i < 3; i++) {
            System.out.print("<<<<<Bienvenido al sistema bancario BOMBA SOMOS>>>>>\nYa hemos leido su tarjeta. ");
            do {
                System.out.print("Porfavor ingrese su nip:");
                pin = teclado.nextInt();
                if (pin == pinUser) {
                    break;
                }
                intentos--;
                System.out.println("El nip es incorrecto, Le quedan " + intentos
                        + " intentos");
                if (intentos == 0) {
                    System.out.println("Lo siento no podemos atenderle sin su nip y se a quedado sin intentos");
                    while (1 > 0) {
                    }
                }
            } while (intentos > 0);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Nos alegra tenerte devuelta.");
            do {
                System.out.println("Que deseas realizar?\n"
                        + "1-Revision de saldo\n"
                        + "2-Retiro de efectivo\n"
                        + "3-Deposito de efectivo\n"
                        + "4-Cambio de nip\n"
                        + "5-Revision de movimientos\n"
                        + "6-salir");
                opc = teclado.nextByte();
                switch (opc) {
                    case 1:
                        System.out.println("Su saldo actual es de $" + saldo);
                        teclado.nextLine();
                        System.out.println("\n\n");
                        break;
                    case 2:
                        System.out.print("Cuanto dinero desea retirar: ");
                        retiro = teclado.nextInt();
                        if (retiro > saldo) {
                            System.out.println("No es posible retirar esa cantidad, excede el valor de su saldo");
                            System.out.println("\n\n");
                            break;
                        }
                        saldo -= retiro;
                        System.out.println("El dinero se ah entregado");
                        mov3 = mov2;
                        mov2 = mov1;
                        mov1 = "Se retiro de la cuenta $" + retiro;
                        System.out.println("\n\n");
                        break;
                    case 3:
                        System.out.print("Cuanto dinero desea depositar: ");
                        ingreso = teclado.nextInt();
                        saldo += ingreso;
                        System.out.println("El dinero se ah depositado");
                        mov3 = mov2;
                        mov2 = mov1;
                        mov1 = "Se Agregaron a la cuenta $" + ingreso;
                        System.out.println("\n\n");
                        break;
                    case 4:
                        System.out.println("Si quiere cambiar su nip tendra que ingresarlo denuevo para confimar");
                        System.out.print("Ingrese su nip:");
                        pin = teclado.nextInt();
                        if (pin == pinUser) {
                            System.out.print("Ingrese el nuevo nip: ");
                            pin = teclado.nextInt();
                            System.out.print("Ingrese el nuevo nip para confirmar: ");
                            pin2 = teclado.nextInt();
                            if (pin == pin2) {
                                pinUser = pin;
                            } else {
                                System.out.println("Error no se ah podido establecer\n\n\n");
                                break;
                            }
                        } else {
                            System.out.println("\n\n");
                            break;
                        }
                        System.out.println("El nip se ah cambiado correctamente\n\n");
                        break;
                    case 5:
                        System.out.println("Sus ultimos movimientos en 24 horas han sido:"
                                + "\n" + mov1
                                + "\n" + mov2
                                + "\n" + mov3);
                        System.out.println("\n\n");
                        break;
                }
            } while (opc != 6);
        }
    }
}
