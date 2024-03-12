
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class encuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mT=0, nin=0, ninT=0, cont=0, ed=0;
        
        
        while(mT<3){
            
            if(JOptionPane.showConfirmDialog(null, "Usted trabaja?")==1){
                JOptionPane.showMessageDialog(null, "Su respuesta no aplica a la encuesta");
            }else{
                mT++;
                ninT=Integer.parseInt(JOptionPane.showInputDialog("Cuantos niños tiene en casa?"));
                while(cont<ninT){   
                    ed=Integer.parseInt(JOptionPane.showInputDialog("Que edad tiene su hijo "+(cont+1)));
                    if(ed>=1 && ed<=4){
                        nin++;
                    }
                    cont++;
                }
                cont=0;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Se necesitan "+(nin/5)+" guarderias");
        
    }
    
}
