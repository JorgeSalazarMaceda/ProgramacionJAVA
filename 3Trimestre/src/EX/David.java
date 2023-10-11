/*
Haz una lista cualquiera para que el usuario la rellene de nombres. Después haz un método que interactue con la lista 
y te indique si la lista lista el nombre o no.
 */
package EX;

/**
 *
 * @author Jorge
 */
import java.util.*;
import java.util.Scanner;

public class David {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        David lista = new David();
        lista.contiene();

    }

    public void contiene() {
        List<String> lista = new ArrayList<>();
        
        System.out.println("Dime nombres");
        String nombre = sc.next();
        
        while (!nombre.equalsIgnoreCase("fin")) {
            lista.add(nombre);
            nombre = sc.next();
        }

        System.out.println("Introduce un nombre por consulta, escribe \"fin\" para terminar");
        System.out.println(">>Nombre: ");
        nombre = sc.next();
        
        if (lista.contains(nombre)) {
            System.out.println("Pertenece");
        } else {
            System.out.println("No pertenece");
        }
    }

}
