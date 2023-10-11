//Escribir un programa que lea por teclado una hora cualquiera y un numero n que representa una cantidad en segundos. 
//El programa mostrará la hora introducida y las n siguientes que se diferencian en un segundo.
//Para ello hemos de diseñar previamente la clase HORA que dispone de los atributos hora, minuto y segundo.
//Los valores de los atributos se controlarán con los métodos set/get
package poo;
import java.util.Scanner;
public class HORA_76_PAG228 {
    //La clase Hora es muy simple y dispondrá de los  atributos hora, minuto y segundo.
    //Estos serán privados y, para acceder a ellos, usaremos métodos set/get.
    //Internamente vamos a utilizar el tipo byte para almmacenar los atributos, 
    //pero desde fuera de la clase nos interesa dar la sensacion de que los atributos son int
    //estamos ocultando la verdadera implementacion
    //no escribimos ningun constructor
    
    //Atributos
    private byte hora;
    private byte minuto;
    private byte segundo;
    
    //Get
    public int getHora(){
        return hora; //Devuelve la hora
    }
    public int getMinuto(){
        return minuto; //Devuelve la minuto
    }
    public int getsSegundo(){
        return segundo; //Devuelve la segundo
    }
    
    public void sethora(int hora){
        if(0<= hora && hora >=23){
            //Rango de horas entre 0 y 23
        this.hora=(byte)hora; //casting de hora
        }
        else{
            this.hora = 0; //Si el valor está fuera de rango, lo ponemos a 0
        }
    }
    public void setMinuto(int minuto){
        if(0<= minuto && minuto >=59){
        this.minuto=(byte)minuto; 
        }
        else{
            this.minuto = 0; //Si el valor está fuera de rango, lo ponemos a 0
        }
    }
    public void setSegundo(int segundo){
        if(0<= segundo && segundo >=59){
        this.segundo=(byte)segundo; 
        }
        else{
            this.segundo = 0; //Si el valor está fuera de rango, lo ponemos a 0
        }
    }
    
    //Metodo para incrementar los segundos
    
    public void incrementaSegundo(){
        segundo++; //Incrementamos los segundos
        
        if(segundo==60){ //Si los segundos alcanzan 60 reiniciamos los segundos e incrementamos los minutos
            segundo=0;
            minuto++;
        }
        if(minuto==60){
            minuto=0;
            hora++;
        }
        if(hora==24){
            hora=0;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HORA_76_PAG228 hora1 = new HORA_76_PAG228(); ///Objeto hora1
        int valor;
        
        System.out.println("Hora: ");
        valor = sc.nextInt(); //leemos un valor
        
        hora1.sethora(5);
        
        System.out.println("Minuto: ");
        valor = sc.nextInt();
        
        hora1.setMinuto(3);
        
        System.out.println("Segundo: ");
        valor = sc.nextInt();
        
        hora1.setSegundo(4);
        
        System.out.println("Cuantos segundos quiere mostrar: ");
        
        int numSegundos = sc.nextInt();
        
        for (int i = 0; i < numSegundos; i++) {
            //Mostramos la hora
            System.out.println(hora1.getHora() + ":" + hora1.getMinuto() + ":" + hora1.getsSegundo());
            hora1.incrementaSegundo(); //Incrementamos la hora actual en un segundo
            
        }
    }
        
}
