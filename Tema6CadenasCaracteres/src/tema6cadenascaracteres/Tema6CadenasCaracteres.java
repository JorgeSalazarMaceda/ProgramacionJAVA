
package tema6cadenascaracteres;

public class Tema6CadenasCaracteres {

    public static void main(String[] args) {
        
        
        //UNICODE // Son el conjunto de caracteres estandar para representar un determinado caracter como por ej un corazón
        char c;
        c='a'; //Directamente mediante el teclado
        c=9825; //Usando el code point en decimal
        
        System.out.println(c);
        
        //SECUENCIAS DE ESCAPE //Un caracter precedido por una barra invertida es una SECUENCIA DE ESCAPE
        
        char b ='\''; //Muestra una comilla simple
        char a='\"'; //Muestra una comilla doble
        System.out.println(b + a);
        
        //Conversión de char a int // Cada code point no es mas que un numero entero, representado en un decimal o hexadecimal.
        //El hecho de que un caracter se identifique con un número crea una estrecha relación entre el tipo char y el tipo int.
        //Es posible asignar un valor entero a una variable tipo char.
         int e='a';// Asigna un caracter a una variable int.
         System.out.println(e); //Muestra 97.
         e='\u0061';//Asigna un carácter a una variable int.
         System.out.println(e);//Muestra 97.
         char j=97; //Asigna un entero a una variable char.
         System.out.println(j);//Muestra 'a'.
         
         //Tambien es posible forzar una conversión con un casting
         
         char f='a';
         System.out.println((int)f); //Muestra un 97.
         System.out.println((char)j);//Muestra 'a'
        
    }
    
}
