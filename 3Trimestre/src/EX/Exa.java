/*
Haz una lista cualquiera para que el usuario la rellene de nombres. Después haz un método que interactue con la lista 
y te indique si la lista contiene el nombre o no.
 */
package EX;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;

/**
 *
 * @author Jorge
 */
public class Exa {
    // lista tipo set
	List<String> lista = new ArrayList<>();;
	static Scanner sc = new Scanner(System.in);

public void leerNombres() {
		
		System.out.println("Escribe una lista de nombres, 'fin' para terminar");	
		String leido=sc.nextLine();
		while (!leido.equalsIgnoreCase("fin")) {
			lista.add(leido);
			leido=sc.nextLine();
		}	
	}

	public void buscarNombres() {
		System.out.println("Introduce un nombre por consulta, escribe \"fin\" para terminar");
		System.out.println(">>Nombre: ");
		
		String leido=sc.nextLine();
		while(!leido.equalsIgnoreCase("fin")) {	
			
			if(lista.contains(leido)) {
				System.out.println("Pertenece");
			}else {
				System.out.println("No pertenece.");
			}
			System.out.println(">>Siguiente nombre: ");
			leido=sc.nextLine();			
		}	
	}

	//------------main--------------------
	public static void main(String[] args) {
		Exa lista= new Exa();
		
		lista.leerNombres();
		//lista.recuperarNombres();
		lista.buscarNombres();
	}
}
