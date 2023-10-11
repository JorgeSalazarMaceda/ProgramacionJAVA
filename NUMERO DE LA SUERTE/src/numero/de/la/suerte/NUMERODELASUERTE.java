//Realizar un programa que calcule el número de la suerte de cualquier persona
//El número de la suerte se consigue reduciendo la fecha de nacimiento a un número de un solo dígito. 
//Por ejemplo, si la fecha de nacimiento de una persona es 16-08-1973 -> 16+8+1973=1997-> 1+9+9+7=26->2+6=8. El número de la suerte de esa persona sería el 8.
package numero.de.la.suerte;

import java.util.Scanner;

public class NUMERODELASUERTE {

    public static void main(String[] args) {
        
        int resultado, numeroAcumulado = 0, numero = 0;
        
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese el dia: ");
        int dia = ingrese.nextInt();
        
        System.out.println("Ingrese el mes: ");
        int mes = ingrese.nextInt();
        
        System.out.println("Ingrese el año: ");
        int año = ingrese.nextInt();
        
        //Dejamos que el usuario introduzca su fecha de nacimiento por pantalla
        //Así obtenemos el resultado. En mi caso, 15+10+1988 = 2013.

        resultado = dia + mes + año;
        System.out.println(resultado);

        
        while (resultado != 0) {
            numero = resultado % 10;
            numeroAcumulado = numeroAcumulado + numero;
            resultado = resultado / 10;
            //El bucle hace lo siguiente, por ej, con mi edad: tenemos 15+10+1988 =2013
            //Mientras resultado sea distinto de 0 hace lo siguiente: numero = a modulo 10 de 2013, numero es 3.
            //entonces acumulamos ese número, el 3.
            //dividimos resultado entre 10 por lo que resultado pasa a ser 201.
            //sigue siendo distinto de 0.
            //numero ahora es 201%10 == 1
            //Por lo que numeroacumulado es 3+1 = 4
            //dividimos resultado (que ahora era 201) entre 10 y ahora será 20.
            //Es distinto de 0
            // numero ahora es 20%10 == 0
            //resultado 20 / 10 = 2
            //2 es distinto de 0 (seguimos en el bucle)
            // numero es 2 %10 y esto devuelve 2
            // numero acumulado era 4 + ese 2 = 6
            //resultado ahora es 
            
            
            
            
        }
        System.out.println("El numero de la suerte es: " + numeroAcumulado);
    }
}


