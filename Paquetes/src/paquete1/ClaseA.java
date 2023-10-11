
package paquete1;
import paquete2.ClaseB;
import paquete2.*; //Con el * importas todas las clases de un paquete
public class ClaseA {
        ClaseB prueba1 = new ClaseB(); 
//Nos pone que clase B no es visible para clase A, porque está en otro paquete distinto, en el 2
// Hay que hacer un import para que si sea visible, Sería igual que el Scanner.
        ClaseC prueba2 = new ClaseC();
        
        public static void main(String[] args) {
        //prueba1. //Ahora, una vez preparado lo anterior, en el main, al crear el objeto y poner punto (prieba1.) ya te deberian sugerir los metodos
    }
       

}
