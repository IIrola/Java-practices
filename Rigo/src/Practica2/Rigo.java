/*
Programa que use getter y setter para cambiar variables de un objeto
 */
package Practica2;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Rigo {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        noviaderigo N = new noviaderigo();
        int opc = 0;
        String val = null, valor;
        do {
            System.out.println("**Hola soy rigo, que me vas a preguntar**\n"
                    + "1. Como se llama tu novia?\n"
                    + "2. Cual es su edad?\n"
                    + "3. Cuanto mide?\n"
                    + "4. Cual es su Numero?\n"
                    + "5. Cual es su direccion?\n"
                    + "6. Cual es su talla?\n"
                    + "7. Cual es su comida favorita?\n"
                    + "8. Cual es su color favorito?\n"
                    + "10. Nueva Novia");
            opc = a.nextInt();
            switch (opc) {

                case 1:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(val);
                    }
                    break;
                case 2:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(N.getEdad());
                    }
                    break;
                case 3:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(N.getEstatura());
                    }
                    break;
                case 4:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(N.getNumero());
                    }
                    break;
                case 5:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(N.getDireccion());
                    }
                    break;
                case 6:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(N.getTalla());
                    }
                    break;
                case 7:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(N.getComidafav());
                    }
                    break;
                case 8:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(N.getColorfav());
                    }
                    break;
                case 10:
                    System.out.println("Cual es su nombre? ");
                    a.nextLine();
                    valor = a.nextLine();
                    N.setNombre(valor);
                    System.out.println("Cual es su Edad? ");
                    valor = a.nextLine();
                    N.setEdad(Integer.parseInt(valor));
                    System.out.println("Cual es su estatura? ");
                    valor = a.nextLine();
                    N.setEstatura(Float.parseFloat(valor));
                    System.out.println("Cual es su Numero? ");
                    valor = a.nextLine();
                    N.setNumero(valor);
                    System.out.println("Cual es su Direccion? ");
                    valor = a.nextLine();
                    N.setDireccion(valor);
                    System.out.println("Cual es su talla? ");
                    valor = a.nextLine();
                    N.setTalla(valor);
                    System.out.println("Cual es su Comida Favorita? ");
                    valor = a.nextLine();
                    N.setComidafav(valor);
                    System.out.println("Cual es su Color favorito? ");
                    valor = a.nextLine();
                    N.setColorfav(valor);

                    break;

            }
        } while (opc != 9);

    }

    public void datosfast() {
        Scanner a = new Scanner(System.in);
        noviaderigo N = new noviaderigo();
        int opc = 0;
        String val = null, valor;
        do {
            System.out.println("**Hola soy rigo, que me vas a preguntar**\n"
                    + "1. Cuales son los datos de tu novia?\n"
                    + "2. Nueva Novia");
            opc = a.nextInt();
            switch (opc) {

                case 1:
                    val = N.getNombre();
                    if (val == null) {
                        System.out.println("no tengo novia");
                        break;
                    } else {
                        System.out.println(val);
                        System.out.println(N.getEdad());
                        System.out.println(N.getEstatura());
                        System.out.println(N.getNumero());
                        System.out.println(N.getDireccion());
                        System.out.println(N.getTalla());
                        System.out.println(N.getComidafav());
                        System.out.println(N.getColorfav());
                    }
                    break;

                case 2:
                    System.out.println("Cual es su nombre? ");
                    a.nextLine();
                    valor = a.nextLine();
                    N.setNombre(valor);
                    System.out.println("Cual es su Edad? ");
                    valor = a.nextLine();
                    N.setEdad(Integer.parseInt(valor));
                    System.out.println("Cual es su estatura? ");
                    valor = a.nextLine();
                    N.setEstatura(Float.parseFloat(valor));
                    System.out.println("Cual es su Numero? ");
                    valor = a.nextLine();
                    N.setNumero(valor);
                    System.out.println("Cual es su Direccion? ");
                    valor = a.nextLine();
                    N.setDireccion(valor);
                    System.out.println("Cual es su talla? ");
                    valor = a.nextLine();
                    N.setTalla(valor);
                    System.out.println("Cual es su Comida Favorita? ");
                    valor = a.nextLine();
                    N.setComidafav(valor);
                    System.out.println("Cual es su Color favorito? ");
                    valor = a.nextLine();
                    N.setColorfav(valor);

                    break;

            }
        } while (opc != 3);
    }

}
