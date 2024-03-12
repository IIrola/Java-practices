package ejemploarraylist;
//importacion de librerias

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author josea
 */
public class EjeArrayL {

    //declaramos unas funciones globales
    boolean tal = false;
    ArrayList<ArrayL> Arr = null;

    /**
     * @param args the command line arguments
     */
    //funcion principal
    public static void main(String[] args) {
        //creamos una instancia altamente inecesaria
        EjeArrayL objet = new EjeArrayL();
        objet.menu();
    }

    //iniciamos funcion de menu
    private void menu() {
        //declaramos variable para las opciones
        String op;
        //iniciamos do while
        do {
            //imprimimos el panel para pedir la opcion
            op = JOptionPane.showInputDialog(null, "1. Crear ArrayList\n"
                    + "2. Introducir datos\n"
                    + "3. Modificar datos\n"
                    + "4. Eliminar datos\n"
                    + "5. Buscar datos\n"
                    + "6. Mostrar datos\n"
                    + "7. Salir\n"
                    + "<><<Iro Enterprice>><>");
            //iniciamos switch
            switch (op) {
                case "1": //bloque para crear el array List
                    if (!tal) {//creamos el array list
                        Arr = new ArrayList<ArrayL>();
                        //volvemos tal true porque ya creamos el array
                        tal = true;
                        JOptionPane.showMessageDialog(null, "Ya se ah creado el array list");
                    } else {//si ya existe damos mensaje de error
                        JOptionPane.showMessageDialog(null, "ya esta creado el array list", "", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "2"://introduyce datos al array list
                    if (!tal) {//aventamos un mensaje de error si no existe el array
                        JOptionPane.showMessageDialog(null, "Porfavor, Crea el array list con la opcion 1");
                    } else {
                        //declaramos valirables
                        int a;
                        String b, c;
                        //pedimos el numero
                        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID del nuevo usuario "));
                        //pedimos el nombre
                        b = JOptionPane.showInputDialog(null, "Digite el nombre del nuevo usuario: ");
                        //pedimos el numero de telefono
                        c = JOptionPane.showInputDialog(null, "Digite el numero del nuevo usuario: ");
                        //agregamos al array
                        Arr.add(new ArrayL(a, b, c));
                    }
                    break;
                case "3":
                    if (!tal) {
                        JOptionPane.showMessageDialog(null, "Porfavor, Crea el array list con la opcion 1");
                    } else {
                        int indice, b;
                        String c, e;
                        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice a modificar: "));
                        if (existEnArray(b)) {
                            indice = indicedato(b);
                            c = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                            Arr.get(indice).setNom(c);
                            e = JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de telefono: ");
                            Arr.get(indice).setNumT(e);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe ningun usuario en ese codigo", "", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case "4"://bloque para eliminar datos de array
                    if (!tal) {
                        JOptionPane.showMessageDialog(null, "No existen datos!");
                    } else {
                        int id, i;
                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a eliminar: "));
                        if (existEnArray(id)) {
                            i = indicedato(id);
                            Arr.remove(i);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe ningun usuario en ese codigo", "", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case "5":
                    if (tal) {
                        String mostrarBus = "No se ha encontrado nada";
                        int id, i;
                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a buscar: "));
                        if (existEnArray(id)) {
                            i = indicedato(id);
                            mostrarBus = "";
                            //agregamos la id
                            mostrarBus += "Numero de la posicion " + i + ": " + Arr.get(i).getId();
                            //agregamos el nombre
                            mostrarBus += "\nNombre de la posicion " + i + ": " + Arr.get(i).getNom();
                            //agregamos el numero de telefono
                            mostrarBus += "\nNumero de tel. de la posicion " + i + ": " + Arr.get(i-1).getNumT();
                            
                        }
                        JOptionPane.showMessageDialog(null, mostrarBus);
                    } else {
                        JOptionPane.showMessageDialog(null, "Porfavor, Crea el array list con la opcion 1");
                    }
                    break;
                case "6"://mostraremos los datos del array
                    if (tal) {
                        //creamos la funcion de salida
                        String Salida = "";
                        //sacamos un for para llenar de datos la salida
                        for (int i = 1; i <= Arr.size(); i++) {
                            //agregamos la id
                            Salida += "Numero de la posicion " + i + ": " + Arr.get(i-1).getId();
                            //agregamos el nombre
                            Salida += "\nNombre de la posicion " + i + ": " + Arr.get(i-1).getNom();
                            //agregamos el numero de telefono
                            Salida += "\nNumero de tel. de la posicion " + i + ": " + Arr.get(i-1).getNumT();
                            //agregamos saltos de linea para separar la informacion
                            Salida += "\n\n";
                        }
                        //imprimimos la salida
                        JOptionPane.showMessageDialog(null, Salida);
                    } else {
                        JOptionPane.showMessageDialog(null, "Porfavor, Crea el array list con la opcion 1");
                    }

                    break;
                case "7":
                    //imprimimos una pestaña de despedida y cerramos el programa
                    JOptionPane.showMessageDialog(null, "Programador: Jose Angel Irola Canto\n"
                            + "Espero te haya servido!!");
                    System.exit(0);
                    break;
                default:
                    //en caso de poner un numero invalido lo notificamos
                    JOptionPane.showMessageDialog(null, "Opcion invalida", "", JOptionPane.ERROR_MESSAGE);
            }
        } while (!op.equals("7"));
    }
//determinamos la existencia de un ID en el array

    private boolean existEnArray(int bus) {

        //iniciamos un for para buscar el indice del codigo
        for (int i = 0; i < Arr.size(); i++) {
            if (Arr.get(i).getId() == bus) {
                return true;// si encuentra el codigo retornara true
            }        //en otro caso sera false
        }
        return false;
    }

    private int indicedato(int bus) {
        //iniciamos la variable que nos devolvera la posicion
        int j = 0;
        //iniciamos el for que buscara el indice
        for (int i = 0; i < Arr.size(); i++) {
            if (Arr.get(i).getId() == bus) {
                j = i;
                break;
            }
        }
        return j;
    }

}
