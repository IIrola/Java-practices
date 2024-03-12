package ejemploarraylist;

/**
 * @author josea
 */
//clase array
public class ArrayL {

    private int id;
    private String nom, numT;

    

    //establecemos los datos

    public ArrayL(int cant, String nom, String numt) {
        this.id = cant;
        this.nom = nom;
        this.numT=numt;
    }

    //funcion getter

    public int getId() {
        return id;
    }
    //funcion getter
    public String getNumT() {
        return numT;
    }
    //funcion getter

    public String getNom() {
        return nom;
    }

    //funcion setter

    public void setNom(String d) {
        this.nom = d;
    }

    public void setNumT(String numT) {
        this.numT = numT;
    }

}
