package ventana;
//librerias para poder crear la ventana
import java.awt.Color;
import java.awt.Dimension;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//crea la ventana
public class ventana extends JFrame{
    
    public ventana(){
    setSize(500, 500);//iniciamos ventana
    setLocationRelativeTo(null);//sirve para centrar la ventana
    //setLocation(450, 150);//Establece la ubicacion de la ventana
    //setBounds(450, 150, 500, 500);// adjunta el setSize y setLocation
    
    setMinimumSize(new Dimension(200, 200));//define el tamaño minimo de la ventana 
    //setResizable(false);//se usa para que no puedan cambiar el tamaño de la ventana
    
    
    setTitle("Programa de prueba");//establece un titulo a la ventana
    
    //this.getContentPane().setBackground(Color.RED);//Le da un color a la ventana
    
    iniciarComponentes();
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);//finaliza el proceso al cerrar la ventana
    }
    //iniciamos los componentes de la ventana
    private void iniciarComponentes(){
        JPanel panel = new JPanel();//instanciamos el panel
        panel.setLayout(null);//desactivamos el diseño pedeterminado
        //panel.setBackground(Color.GREEN);// le damos color al panel
        this.getContentPane().add(panel);//ponemos el panel en la ventana
        
        JLabel etiqueta =new JLabel();//creamos una etiqueta de texto
        etiqueta.setOpaque(true);//permitimos el cambio de color del fondo de la etiqueta
        etiqueta.setText("Hola papu");//definimos el texto de otra forma
        etiqueta.setBounds(0, 0, 56, 13);//definimos la posicion de la etiqueta con su tamaño
        etiqueta.setBackground(Color.black);//le damos color al fondo de la etiquea
        etiqueta.setForeground(Color.cyan);//le damos color a la letra
        panel.add(etiqueta);//ponemos la etiqueta sobre el panel
    }
}