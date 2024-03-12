
import javax.swing.JOptionPane;


public class trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horasN = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas entre semana"));
        int horasNN = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas de noche entre semana"));
        int horasD = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la horas trabajadas el domingo"));
        int horasDN = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la horas trabajadas el domingo en la noche"));

        int Sueldo = (horasN * 50) + (horasNN * 80) + (horasD * 70) + (horasDN * 120);

        JOptionPane.showMessageDialog(null, "El trabajador ganará: $" + Sueldo);
}

    
}
