package Cajero;

/**
 * @author josea
 */
public class Principal {

    /**
     * @param args
     */
    public static void main(String[] args) {
        InicioSesion primeraP = new InicioSesion();
        Menu emilio = new Menu();
        Menu rosy = new Menu();
        Menu balam = new Menu();
        while (1 == 1) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("<<<<<Bienvenido al sistema bancario BOMBA SOMOS>>>>>\n");
            //llamamos para ver que usuario es
            short aux = primeraP.verUser();
            //pedimos que ingrese el nip
            boolean correct = primeraP.comfPass(aux);
            //verificamos si es correcto o no, en caso de no ser cancelamos todo
            if (correct == false) {
                break;
            }

            //Busca que usuario es
            switch (aux) {
                case 1982:
                    emilio.Banca(aux);
                    break;
                case 9128:
                    rosy.Banca(aux);
                    break;
                case 2981:
                    balam.Banca(aux);
                    break;
            }

        }
    }

}
