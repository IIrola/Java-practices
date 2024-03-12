/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pppp;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Pppp {

    /**
     * @param args the command line arguments
     * Realiza un programa que muestre la realizacion de una suma, 
     * una resta, una multiplicacion y una division entre 2 numeros cualquiera
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /*
        System.out.println("Introduce un nombre");
        String Nombre=leer.next();
        System.out.println("El nombre que escribió fue "+Nombre);
        */
        
        /*
        System.out.println("Escriba su nombre");
        String Nombre=leer.next();
        System.out.println("Escriba su edad");
        int Edad=leer.nextInt();
        System.out.println("Escriba una materia que haya cursado");
        String Materia=leer.next();
        System.out.println("Escriba la calificación de esa materia");
        float Calif=leer.nextFloat();
        System.out.println("Nombre: "+Nombre+", Edad: "+Edad+", Materia: "+Materia+", su calificación es: "+Calif);
        */        
        /*
        System.out.println("introduce 5 números");
        float n1=leer.nextFloat();
        float n2=leer.nextFloat();
        float n3=leer.nextFloat();
        float n4=leer.nextFloat();
        float n5=leer.nextFloat();
        float Res=(n1+n2+n3+n4+n5)/5;
        System.out.println("El promedio de los 5 números es: "+Res);
        
        if(n3%2==0){
            
        }else{
        
        }
        float may=0;
        System.out.println("Ingresa 3 números");
        float n1=leer.nextFloat();
        float n2=leer.nextFloat();
        float n3=leer.nextFloat();
        
        if(n1>may){
            may=n1;
        }
        if(n2>may){
            may=n2;
        }
        if(n3>may){
            may=n3;
        }
        
        if(may%2==0){
            System.out.println("el numero mayor es: "+may+" Y es par");
        }else{
            System.out.println("el numero mayor es: "+may+" Y es impar");
        }
        
        
        /*if(n1<n2){
            if(n2>n3){
                System.out.println("El número mayor es "+n2);
                if(n2%2==0){System.out.println("Es par");
                }else{
                System.out.println("Es impar");}
            }else{System.out.println("El número mayor es"+n3);
            if(n3%2==0){System.out.println("Es par");
                }else{
                System.out.println("Es impar");}}
            
        }else{
            
            if(n1>n3){
                System.out.println("El número mayor es "+n1);
            if(n1%2==0){System.out.println("Es par");
                }else{
                System.out.println("Es impar");}
            }else{
            System.out.println("El número mayor es "+n3);
            if(n3%2==0){System.out.println("Es par");
                }else{
                System.out.println("Es impar");}}
            }
            
     
        
        //El ixsy quiere saber que dia de la semana tuvo la mayor cantidad de visitantes
        //tambien quiere saber que promedio de personas fueron por dia
        //igual consideran importante recibir el promedio en decimal
        //considera que recibiras 5 numeros distintos, empezando por el lunes y acabando el viernes
        float d1=leer.nextInt();
        float d2=leer.nextInt();
        float d3=leer.nextInt();
        float d4=leer.nextInt();
        float d5=leer.nextInt();
        float dm=0;
        String dia;
        
        if(d1>dm){
        dm=d1;
        }
        if(d2>dm){
        dm=d2;
        } 
        if(d3>dm){
        dm=d3;
        }
        if(d4>dm){
        dm=d4;
        }
        if(d5>dm){
        dm=d5;
        }
        if(dm==d1){
            dia="Lunes";
        }
        else if(dm==d2){
        dia="Martes";
        }
        else if(dm==d3){
        dia="Miércoles";
        }
        else if(dm==d4){
        dia="Jueves";
        }
        else{dia="Viernes";}
        
        
        
        System.out.println("El día que tuvo mayor cantidad de visitantes fue el "+dia+" y tuvo "+dm+" visitantes");
        
        float pm=(d1+d2+d3+d4+d5)/5;
        System.out.println("El promedio de visitantes que tuvo el IXSY fue de "+pm+" visitantes");*/
        
        /*
        switch(valor){
        case 1:
        
            break;
        case 2:
            
            break;
        default:
        }
        
        System.out.println("Bienvenido al menú de operaciones");
        System.out.println("Seleccione una de las siguientes opciones");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        
        int opt=leer.nextInt();
        int num;
        int num2;
        float num3;
        float num4;
        float res;
        int Res;
            
        switch(opt){
        case 1:
            System.out.println("Ingresa 2 números");
            num=leer.nextInt();
            num2=leer.nextInt();
            Res=num+num2;
            System.out.println("El resultado es "+Res);
            break;
        case 2:
            System.out.println("Ingresa 2 números");
            num=leer.nextInt();
            num2=leer.nextInt();
            Res=num-num2;
            System.out.println("El resultado es "+Res);
            break;
        case 3:
            System.out.println("Ingresa 2 números");
            num=leer.nextInt();
            num2=leer.nextInt();
            Res=num*num2;
            System.out.println("El resultado es "+Res);
            break;
        case 4:
            System.out.println("Ingresa 2 números");
            num3=leer.nextInt();
            num4=leer.nextInt();
            res=num3/num4;
            System.out.println("El resultado es "+res);
            break;
        default: System.out.println("Opción inválida, inténtelo de nuevo.5"
                + "");    
        }*/
        
        /**
         * Desarrolla un programa que registre el nombre de un usuario
         * y una contraseña, tiene que almacenar detalles de saldo
         * en dado caso de que haya un retiro o ingreso
         * prohibir el retiro si excede el saldo
         * y el saldo inicial va a ser de 0
         */
        int opc=0;
        float money=0;
        float ingmon;
        float retmon;
        String Usuario="Lalito";
        int NIP=1234;
        
        
        while(opc!=4){
            System.out.println("Ingrese su NIP");
            int NEP=leer.nextInt();
            
                if(NEP==NIP){
                    System.out.println("Bienvenido "+Usuario);
                    System.out.println("Seleccione la opción que desea");
                    System.out.println("1.Ingresar saldo");
                    System.out.println("2.Retirar saldo");
                    System.out.println("3.Ver saldo");
                    System.out.println("4.Cerrar sesión");
                    opc=leer.nextInt();
                    switch(opc){
                        case 1:
                            System.out.println("Ingrese el monto");
                            ingmon=leer.nextFloat();
                            System.out.println("El monto que ingresó fue "+ingmon);
                            money=money+ingmon;
                            System.out.println("Su saldo actual es "+money);
                            break;
                        case 2:
                            System.out.println("Ingrese el saldo que desea retirar");
                            retmon=leer.nextFloat();
                            if(retmon<=money){
                            money=money-retmon;
                            System.out.println("Su saldo actual es "+money);
                            }else{
                            System.out.println("Saldo insuficiente");
                            }
                            break;
                        case 3:
                            System.out.println("Su saldo actual es "+money);
                            break;
                        default:System.out.print("Adios");        
                    }
                        
                    }
                            
        }
                
    }
    
}
