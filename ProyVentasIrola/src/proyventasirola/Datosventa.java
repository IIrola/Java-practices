/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyventasirola;

/**
 *
 * @author josea
 */
public class Datosventa {
    private float sillas, mesas, importeIn, desc, ImporteFin;

    Datosventa(float a, float b, float valor2, float valor3, float valor1) {
        this.sillas=a;
        this.mesas= b;
        this.ImporteFin= valor3;
        this.desc= valor2;
        this.importeIn=valor1;
    }

    public void Datosventa(float sillas, float mesas, float des, float fin, float ini){
        this.sillas=sillas;
        this.mesas= mesas;
        this.ImporteFin= fin;
        this.desc= des;
        this.importeIn=ini;
    }

    public float getSillas() {
        return sillas;
    }

    public float getMesas() {
        return mesas;
    }

    public float getImporteIn() {
        return importeIn;
    }

    public float getDesc() {
        return desc;
    }

    public float getImporteFin() {
        return ImporteFin;
    }

    
}
