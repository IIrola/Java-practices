

public class pagoHoraTeclado {


    public static void main(String[] args) {
        int horas = 60;
         
        Teclado t = new Teclado();
        
        System.out.println("ingresa el salario por hora");
        
        float S=t.leeFloat();
        float sueld=0, bono=0;
        
        sueld = 40*S;
        
        bono= (horas-40)*S*1.3f;
        
        float tot= sueld+bono;
        
        System.out.println("El sueldo es "+tot);
        
    }
    
}
