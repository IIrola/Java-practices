
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class partidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String team = JOptionPane.showInputDialog("Ingresa el nombre del equipo");
        String input = JOptionPane.showInputDialog("Ingresa la cantidad de partidos perdidos");
        int lose = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Ingresa la cantidad de partidos empatados");
        int empt = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Ingresa la cantidad de partidos ganados");
        int win = Integer.parseInt(input);
        int puntT = (win * 3) + (empt * 1) + (lose * 0);
        JOptionPane.showMessageDialog(null, "El equipo " + team + " tiene " + puntT + " puntos");
    }
    
}
