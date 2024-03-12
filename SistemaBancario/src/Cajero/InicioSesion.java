package Cajero;

import java.util.Scanner;

/**
 * @author josea
 */
public class InicioSesion {

    Scanner teclado = new Scanner(System.in);
    //se declara el Nip de ingreso de cada usuario
    protected short Users[] = {1982, 9128, 2981};
    
    protected short cod;

    public short verUser() {
        //se pide que ingrese el codigo de su cuenta hasta que sea valido
        while (1 == 1) {
            System.out.print("Ingrese su codigo de usuario: ");
            cod = teclado.nextShort();
            //comprobamos cada codigo
            switch (cod) {
                case 328:
                    return Users[0];
                case 435:
                    return Users[1];
                case 974:
                    return Users[2];
                default:
                    //en caso de error o codigo sin registro se anuncia y se repite el intento
                    System.out.print("Error codigo de usuario no registrado\nIntente denuevo\n\n");
                    break;
            }
        }
    }
    //confirmador de contraseña
    public boolean comfPass(short pinUser) {
        //declaro el contador de intentos
        byte intentos = 3;
        //inicio el do
        do {
            //pido la contraseña
            System.out.print("Ingrese su nip porfavor: ");
            cod = teclado.nextShort();
            //verifico que este bien, en caso de serlo retorno true
            if (cod == pinUser) {
                return true;
            } else {
                //en caso contrario resto un intento y lo anuncio para que reintente
                intentos--;
                System.out.println("El nip es erroneo, Intentelo denuevo.\nLe quedan " + intentos + " Intentos\n");
            }
        } while (intentos > 0);//finaliza do while
        //si se acaban los intentos retorna false y no inicia nada
        return false;
    }
}
