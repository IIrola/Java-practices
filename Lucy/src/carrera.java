

public class carrera {
    
    public static void main(String[] args) {
    
        Teclado t = new Teclado();
        
        System.out.println("Ingresa la velocidad del vehiculo trasero ");
        float v1 = t.leeFloat();
        System.out.println("Ingresa la velocidad del vehiculo delantero ");
        float v2 = t.leeFloat();
        System.out.println("Ingresa la distancia entre vehiculos ");
        float dist = t.leeFloat();
        
        float time = dist / (v1 - v2);

        System.out.println("El tiempo que tarda es de: " + time + " Segundos");
}

    
}
