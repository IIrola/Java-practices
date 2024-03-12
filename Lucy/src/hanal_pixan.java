import javax.swing.JOptionPane;

public class hanal_pixan {

    public static void main(String[] args) {
        // Pedir el número de latas que desea fabricar
        String input = JOptionPane.showInputDialog("Ingresa el número de latas que desea fabricar");
        int pCans = Integer.parseInt(input);

        // Pedir el largo de las latas que desea fabricar
        input = JOptionPane.showInputDialog("Ingresa el largo de las latas que desea fabricar");
        float largo = Float.parseFloat(input);

        // Pedir el ancho de las latas que desea fabricar
        input = JOptionPane.showInputDialog("Ingresa el ancho de las latas que desea fabricar");
        float ancho = Float.parseFloat(input);

        // Pedir la altura de las latas que desea fabricar
        input = JOptionPane.showInputDialog("Ingresa la altura de las latas que desea fabricar");
        float altura = Float.parseFloat(input);

        // Calcular el área de cada lata
        float arCan = (ancho + (altura * 2)) * (largo + (altura * 2));

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "Necesita una lámina de " + arCan + " cm² por cada lata");
        JOptionPane.showMessageDialog(null, "En total una lámina de " + (arCan * pCans) + " cm² ");
        JOptionPane.showMessageDialog(null, "O también una lámina de " + ((arCan * pCans) / (ancho + (altura * 2))) + " cm × " + (ancho + (altura * 2)) + " cm");
    }
}

