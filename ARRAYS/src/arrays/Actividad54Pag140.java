//Escribe la funcion:int t[], int clave), que busca de forma secuencial en la tabla t el valor clave. 
//En caso de encontrarlo, devuelve en que posición lo encuentra; y en caso de no encontrarlo, devolverá -1.
package arrays;

import java.util.Scanner;

public class Actividad54Pag140 {

    public static void main(String[] args) {
        int tabla[] = {5, 6, 2, 1, 3, 4};
        int claveBusqueda;
        int resultado1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el numero a buscar: "); //Introduces el numero que hay que buscar en el array para ver si esta
        claveBusqueda = leer.nextInt();

        resultado1 = buscar(tabla, claveBusqueda); //Llamar a la función.
        System.out.println("" + resultado1);

    }

    private static int buscar(int tabla[], int claveBusqueda) {
        int i = 0; //indice de busqueda
        int resultado;

        while (i < tabla.length && tabla[i] != claveBusqueda) {
            // While con dos condiciones, mientras que la i(indice de busqueda) sea menor que la longitud de la tabla y
            //La otra condicion es que no sea lo que busca.
            //Mientras se den las dos condiciones, incrementa para seguir buscando
            i++;
        }

        if (i < tabla.length) { //Si i es menor que la tabla resultado = i si no, -1 y devuelve resultado.
            resultado = (i);
        } else {
            resultado = (-1);
        }
        return resultado;
    }
}
