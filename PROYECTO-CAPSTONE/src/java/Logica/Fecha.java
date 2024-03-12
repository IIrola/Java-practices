package Logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fecha {

    public static Calendar calendar = Calendar.getInstance();
    private static String fecha;

    public Fecha(){
    }

    public static String Fecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        fecha = sdf.format(calendar.getTime());
        return fecha;
    }

    public static String FechaBD() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fecha = sdf.format(calendar.getTime());
        return fecha;
    }
    
    public static String FechaBDpost() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        calendar.add(Calendar.DATE,+3);
        fecha = sdf.format(calendar.getTime());
        return fecha;
    }
    
}
