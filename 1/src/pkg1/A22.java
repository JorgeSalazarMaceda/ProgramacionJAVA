//EJERCICIO 22//Programa que muestre las tablas de multiplicar del 1 al 10
package pkg1;

public class A22
{
        
    public static void main(String[] args)
    {
        //Hacemos un bucle for para que aparezca la primera cifra de cada tabla, desde el 1 hasta el 11.
        // Primero, multiplicador vale 1, ¿es menor que 11? si, pues pasa al siguiente bucle... Ahora multiplicando vale 1 ¿es menor que 11? si
        // Pues tenemos el multiplicador fijado en 1, y ahora se incrementará el multiplicando hasta 10.
        // Así tenemos toda la tabla de 1. Cuando se deje de cumplir la condicion del segundo bucle, volverá al primero y ya ahí
        // multiplicador pasará a ser 2... ¿Es menor que 11? si, pues pasa al segundo bucle y se incrementa el multiplicando hasta 10
        // Así tenemos la tabla del 2. Y así hasta las 10 tablas de multiplicar.
        //El System.out es un salto de linea. El primero separa las tablas y el segundo separa las lineas dentro de una tabla.
        for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
            System.out.println();
            for (int multiplicando = 1; multiplicando < 11; multiplicando++) {
                int resultado=(multiplicador*multiplicando);

                System.out.print((multiplicador + " * " +multiplicando) + " = " + resultado);
                System.out.println();
            } 
        }
    }
    
}
