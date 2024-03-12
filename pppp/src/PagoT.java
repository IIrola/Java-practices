
import javax.swing.JOptionPane;

public class PagoT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float diurD=50+20, nocturD=80+40, diur=50, noctur=80, h, sueldo=0;
        
        String hor = JOptionPane.showInputDialog("Ingresa tus horas de trabajo diurnas");
        h=Float.parseFloat(hor);
        sueldo=h*diur;
        hor = JOptionPane.showInputDialog("Ingresa tus horas de trabajo nocturnas");
        h=Float.parseFloat(hor);
        sueldo+=h*noctur;
        hor = JOptionPane.showInputDialog("Ingresa tus horas de trabajo diurnas del domingo");
        h=Float.parseFloat(hor);
        sueldo+=h*diurD;
        hor = JOptionPane.showInputDialog("Ingresa tus horas de trabajo nocturnas del domingo");
        h=Float.parseFloat(hor);
        sueldo+=h*nocturD;
        
        JOptionPane.showMessageDialog(null, "El sueldo ganado es de: "+sueldo);
        
    }
    
}
