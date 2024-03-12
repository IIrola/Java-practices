package Cajero;

/**
 *
 * @author josea
 */
public class inicioSesion {
    
    protected short pinUsers[] = {1243, 1234, 4321, 1324, 4231};
    public short aux;
    
    public short identUser( short code ){
        switch(code){
            case 2345:
                return pinUsers[0];
            case 4321:
                return pinUsers[1];
            case 8765:
                return pinUsers[2];
            case 6789:
                return pinUsers[3];
            case 9285:
                return pinUsers[4];
            default: 
                return 0;
        }
    }
    
}
