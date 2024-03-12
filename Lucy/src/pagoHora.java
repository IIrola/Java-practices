
import javax.swing.JOptionPane;


public class pagoHora {


    public static void main(String[] args) {
        int horas = 60;
        
        float S=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa tu sueldo por hora"));
        float sueld=0, bono=0;
        
        sueld = 40*S;
        
        bono= (horas-40)*S*1.3f;
        
        float tot= sueld+bono;
        
        JOptionPane.showMessageDialog(null, "El sueldo es "+tot);
        
    }
    
}
