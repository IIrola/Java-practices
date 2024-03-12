
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josea
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /**
         * dada un numero, define que numero es par y que numero es impar
         * 
         */
        
        /*
        x>3 --- x=4 --- x=3
        x<5 
        x>=9
        x<=9
        x==7 --- x=7
        
        if( ** ){
            
        }
        
        +
        -
        *
        /
        %
        
        5*3
        (5+5+5)
        10/5=2
        (5+5)
        8/2=4
        (2+2+2+2)
        10/3
        (3+3+3)
        10%3=1
        
        12/3=4
        8%2=0
        
        
        
        
        */
        
        /**
         * Realiza un programa que indique si un numero es multiplo del 6
        */
        /*
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        
        // 
        
        if((num1%2)==0){
            
            JOptionPane.showMessageDialog(null, "Es par");
            
        } else {

            JOptionPane.showMessageDialog(null, "es impar");
            
        }
        */
        
        
        
        
        
        
        /*
        int num = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
        
        if((num%2)==0){
            JOptionPane.showMessageDialog(null, "El numero "+num+" es par");
        }else {
            JOptionPane.showMessageDialog(null, "El numero "+num+" es impar");
        }
         */
        
        /*
        Un programa que calcule el area de un triangulo
        
        */
        
        
        /**
         * 
         * Realizar un programa que indique la calificacion obtenida 
         * en la materia de calculo diferencial en base a las calificaciones
         *  de tus actividades y a la ponderacion del maestro
         * 
         * examen 25%
         * extra 25%
         * reporte 25%
         * libreta 25%
         * 
         * Agregar un if que indique si el usuario aprobo o reprobo la unidad
         * la calificacion minima aprobatoria es 70
         * 
         */
        
        float extra=0, libreta=0, cuadro=0, report=0, exam=0, calif=0;
        
        libreta = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu califcacion en la libreta"));
        cuadro = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu califcacion en el cuadro"));
        report = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu califcacion en el reporte"));
        extra = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu califcacion en los extra-clase"));
        exam = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu califcacion en el examen")); 
        
        calif  = (extra*0.25f)+(exam*0.30f)+(report*0.15f)+(cuadro*0.15f)+(libreta*0.15f);
        
        JOptionPane.showMessageDialog(null, calif);
        
        if (calif>=70){
           
           JOptionPane.showMessageDialog(null, "Felicidades, aprobaste la unidad");
           
       }else{
       
           JOptionPane.showMessageDialog(null, "Ni pedo, no sirves para esto\nNo mereces ser ingeniero");
           
       }
        
        
        /*
        un string es donde se almacenan cadenas de texto
        
        h o  l a
        0 1 2 3
        
        
        */
        
        /**
         * Un programa que solicite el nombre al ususario y que sin importar el uso de 
         * mayusculas lo imprima en minusculas
         * 
         * toUpperCase
         * toLowerCase
         * 
         */
        /*
        String cadena = "HOLA";
        
        JOptionPane.showMessageDialog(null, cadena.toLowerCase());
        
        */
        
    }
    
}
