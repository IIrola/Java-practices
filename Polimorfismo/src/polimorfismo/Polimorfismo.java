
package polimorfismo;

/**
 *
 * @author josea
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones_clasePadre calculo=new Suma_Clasehija();
        
        calculo.pedirdatos();
        calculo.operaciones();
        calculo.Mostrardatos();
        
        Operaciones_clasePadre calc=new Resta_Clasehija();
        
        calc.pedirdatos();
        calc.operaciones();
        calc.Mostrardatos();
        
    }
}
