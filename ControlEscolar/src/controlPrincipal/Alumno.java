package controlPrincipal;

/**
 *
 * @author josea
 */
public class Alumno {
    private String nombre, codig, img;
    private Float Cal1,Cal2,Cal3, Prom;
    
    public Alumno(String codig,String Nombre, float cal1, float cal2, float cal3/*,float cal4*/, float prom, String Img){
        this.nombre=Nombre;
        this.Cal1=cal1;
        this.Cal2=cal2;
        this.Cal3=cal3;
//        this.Cal4=cal4;
        this.Prom=prom;
        this.codig=codig;
        this.img=Img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCal1() {
        return Cal1;
    }

    public void setCal1(Float Cal1) {
        this.Cal1 = Cal1;
    }

    public Float getProm() {
        return Prom;
    }

    public void setProm(Float Prom) {
        this.Prom = Prom;
    }

    public Float getCal2() {
        return Cal2;
    }

    public void setCal2(Float Cal2) {
        this.Cal2 = Cal2;
    }

    public Float getCal3() {
        return Cal3;
    }

    public void setCal3(Float Cal3) {
        this.Cal3 = Cal3;
    }
/*
    public Float getCal4() {
        return Cal4;
    }

    public void setCal4(Float Cal4) {
        this.Cal4 = Cal4;
    }*/

    public String getCodig() {
        return codig;
    }

    public void setCodig(String codig) {
        this.codig = codig;
    }
    
}
