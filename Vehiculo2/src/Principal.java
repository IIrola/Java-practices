/**
 * @autor joseA
 * */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear nuestros objetos
        Vehiculo mivehiculo=new Vehiculo();
        
        mivehiculo.nombreVehiculo="Vehigolu";
        
        System.out.println(""+ mivehiculo.Transportar() + mivehiculo.nombreVehiculo );
        
        Acuatico minavegante = new Acuatico();
        
        minavegante.NombreAcua="Mi navegante";
        
        System.out.println(""+minavegante.Navegar());
        
        System.out.println("Metodo transportar desde la clase acuatico "+minavegante.Transportar());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        Barco flota = new Barco();
        
        flota.NombreAcua="Froger";
        System.out.println("Nombre Acuatico desde la clase barco: "+flota.NombreAcua);
        System.out.println("Funcion de barco: "+flota.PrenderMotor());
        System.out.println("Funcion de Acuatico desde barco: "+flota.Navegar());
        System.out.println("Funcion de Vehiculo desde barco: "+flota.Transportar());
        flota.nombreVehiculo="Trasarco";
        System.out.println("Nombre de Vehiculo desde Barco: "+flota.nombreVehiculo);
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        Velero Veler = new Velero();
        
        Veler.NombreAcua="Veler";
        System.out.println("Nombre Acuatico desde la clase Velero: "+Veler.NombreAcua);
        System.out.println("Funcion de Velero: "+Veler.IzarVelas());
        System.out.println("Funcion de Acuatico desde Velero: "+Veler.Navegar());
        System.out.println("Funcion de Vehiculo desde Velero: "+Veler.Transportar());
        Veler.nombreVehiculo="Trasvele";
        System.out.println("Nombre de Vehiculo desde Velero: "+Veler.nombreVehiculo);
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        Avion Aidor = new Avion();
        
        Aidor.NombreAero="Volador";
        System.out.println("Nombre Aereo desde la clase Avion: "+Aidor.NombreAero);
        System.out.println("Funcion de Avion: "+Aidor.BajarTrendeAterrizaje());
        System.out.println("Funcion de Aereo desde Avion: "+Aidor.Volar());
        System.out.println("Funcion de Vehiculo desde Avion: "+Aidor.Transportar());
        Aidor.nombreVehiculo="Trasvion";
        System.out.println("Nombre de Vehiculo desde Avion: "+Aidor.nombreVehiculo);
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        Helicoptero helicopter = new Helicoptero();
        
        helicopter.NombreAero="Heli";
        System.out.println("Nombre Aereo desde la clase Helicoptero: "+helicopter.NombreAero);
        System.out.println("Funcion de Helicoptero: "+helicopter.EncenderHelices());
        System.out.println("Funcion de Aereo desde Helicotero: "+helicopter.Volar());
        System.out.println("Funcion de Vehiculo desde Helicoptero: "+helicopter.Transportar());
        helicopter.nombreVehiculo="trashelic";
        System.out.println("Nombre de Vehiculo desde Helicoptero: "+helicopter.nombreVehiculo);
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
    }
}