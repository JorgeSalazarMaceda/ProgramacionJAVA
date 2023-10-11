//RECURSIVIDAD ES UN METODO QUE SE LLAMA A SI MISMO
package recursividad;
import java.util.Scanner;
public class RECURSIVIDAD 
{

    public static void main(String[] args) 
    {
      // NUMEROS FACTORIALES: SON TODOS LOS NUMEROS DEL NUMERO MULTIPLICADOS HACIA ATRÁS
      // EJEMPLO FACTORIAL DE 5 ES 5*4*3*2*1=120
        
        int numero;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Introduce un número: ");
        numero=leer.nextInt();
        
        System.out.println(" El factorial de " + numero + " es " + factorial (numero));
    }
    
    public static int factorial (int numero){
        if(numero==1){
            return 1;
        }
        else{
            
            return numero * factorial(numero-1);
            
        }
        //El usuario introduce por ejemplo el 5.
        //Entonces, tenemos el 5 y el factorial es de 5.
        //Vamos al if que es el caso base, y el caso base es 1. Si numero == 1 devuelve 1 que es el caso base para que vuelva a subir.
        //Factorial de 5 no es == 1, no está en el caso base, así que vamos al else.
        //Else es Factorial de 5 * factorial de 5 -1, que es 4.
        //Ahora tenemos factorial de 4 * 4-1 que es 3 (seguimos en el else).
        //Ahora tenemos factorial de 3 * 3-1 que es 2 (seguimos en el else).
        //Ahora tenemos factorial de 2 * 2-1 que es 1 y ya hemos llegado al caso base.
        //Pues ahora al reves haces las operaciones.
        //tenemos factorial de 1 por 2 que es el numero que quedo a la espera... 2*1 = 2.
        //Factorial de 2 * el 3 que quedó a la espera que es 6.
        //Factorial de 6 por el 4 que quedó a la espera que es 24.
        //Factorial de 24 por el 5 que quedó a la espera que es 120.  Y YA ESTARÍA ESO ES LO QUE DEVUELVE Y HEMOS DICHO QUE DEVUELVA.
    }    
    
}
