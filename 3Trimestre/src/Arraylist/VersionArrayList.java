/*
Ejercicio para Semana Santa: Las 10 opciones
Crear un programa que use una lista dinámica de números.
Generar el siguiente menú:
1. Insertar un número
2. Insertar un número en una posición
3. Eliminar un número
4. Buscar un número
5. Modificar un número
6. Mostrar listado de números
7. ¿Cuantos números hay?
8. ¿Quién es el mayor?
9. Mostrar listado ordenado (asc)
10. Mostrar listado ordenado (desc)
Las opciones 1, 2, 3, 4, 5 serán métodos que reciben parámetros que
introducirá el usuario por teclado.
Las opciones 3, 4, 5, 6, 7, 8, 9, 10 serán métodos donde todos devuelven un
int:
 0 cuando todo ha ido bien, y en ese caso se mostrará la información
correspondiente.
 1 cuando algo ha ido mal, y en ese caso se mostrará “Información no
disponible”. Por ejemplo cuando buscas un número y no está en la lista.
 */
package Arraylist;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class VersionArrayList {
    
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList <Integer> agenda = new ArrayList<Integer>();
		boolean fin = false;
		
		while(fin == false) {
			switch(menu()) {
				case 0 -> fin = true;
				case 1 -> insertaNumero(solicitaNumeroCliente(), agenda);
				case 2 -> insertaNumeroEnPosicion(solicitaNumeroCliente(), agenda);
				case 3 -> eliminaNumero(solicitaNumeroCliente(), agenda);
				case 4 -> buscaNumero(solicitaNumeroCliente(), agenda);
				case 5 -> modificaNumero(solicitaNumeroCliente(), agenda);
				case 6 -> muestraListadoNumeros(agenda);
				case 7 -> contarNumeros(agenda);
				case 8 -> buscaMayorNumero(agenda);
				case 9 -> muestraListadoNumerosOrdenadosAsc(agenda);
				case 10 -> muestraListadoNumerosOrdenadosDesc(agenda);
			}
		}
	}
	
	public static int menu() {
		int menu;
		
		System.out.println("Seleccione la opción que desee:");
		System.out.println("0. Salir");
		System.out.println("1. Insertar un número");
		System.out.println("2. Insertar un número en una posición");
		System.out.println("3. Eliminar un número");
		System.out.println("4. Buscar un número");
		System.out.println("5. Modificar un número");
		System.out.println("6. Mostrar listado de números");
		System.out.println("7. Cuantos números hay?");
		System.out.println("8. Quién es el mayor?");
		System.out.println("9. Mostrar listado ordenado (asc)");
		System.out.println("10. Mostrar listado ordenado (desc)");
		
		menu = sc.nextInt();
		
		while (menu < 0 || menu > 10) {
			System.out.println("Error, introduzca una opción válida: ");
			menu = sc.nextInt();
		}
		return menu;
	}
	
	public static int solicitaNumeroCliente() {
		int numero;

		System.out.println("Ingrese el número: ");
		numero = sc.nextInt();
		
		return numero;
	}
	
        //Menú 1
	public static void insertaNumero(int num, ArrayList<Integer> agenda) {
		agenda.add(num);
	}
	//Menú 2
	public static void insertaNumeroEnPosicion(int num, ArrayList<Integer> agenda) {
		int posicion;
		
		System.out.println("Ingrese la posición en la que desee insertar el n�mero: ");
		posicion = sc.nextInt();
		
		agenda.add(posicion, num);
	}
	//Menú 3
	public static int eliminaNumero(Integer num, ArrayList<Integer> agenda) {// El parametro es Integer porque sino enteder que le damos una posición
		int resultado = 1;
		
		if(agenda.remove(num)) resultado = 0;
		else System.out.println("Información no disponible.");
		
		return resultado;
	}
	//Menú 4
	public static int buscaNumero(Integer num, ArrayList<Integer> agenda) {
		int resultado = 1;
		
		if(agenda.contains(num)) {
			System.out.println("El número se encuentra en la lista.");
			resultado = 0;
		}
		else System.out.println("Información no disponible.");
		
		return resultado;
	}
	//Menú 5
	public static int modificaNumero(int num, ArrayList<Integer> agenda) {
		int posicion, resultado = 1;
		
		System.out.println("Ingrese la posición del número que desea modificar: ");
		posicion = sc.nextInt();
		
		if(posicion >= 0 && posicion < agenda.size()) {
			agenda.set(posicion, num);
			resultado = 0;
		}
		else System.out.println("Información no disponible.");
			
		return resultado;
	}
	//Menú 6
	public static int muestraListadoNumeros(ArrayList<Integer> agenda) {
		System.out.println(agenda);

		return 0;	// La agenda siempre se podrá mostrar
	}
	//Menú 7
	public static int contarNumeros(ArrayList<Integer> agenda) {
		System.out.println("Hay " + agenda.size() + " números.");
		
		return 0;	// Siempre se podra contar los números
	}
	//Menú 8
	public static int buscaMayorNumero(ArrayList<Integer> agenda) {
		System.out.println("El números más alto es: " + Collections.max(agenda));
		
		return 0;	// Siempre se podrá mostrar el número más alto
	}
	//Menú 9
	public static int muestraListadoNumerosOrdenadosAsc(ArrayList<Integer> agenda) {
		Collections.sort(agenda);
		System.out.println(agenda);
		
		return 0;	// Siempre se podrá ordenar la lista
	}
	//Menú 10
	public static int muestraListadoNumerosOrdenadosDesc(ArrayList<Integer> agenda) {
		Collections.sort(agenda);
		Collections.reverse(agenda);
		System.out.println(agenda);
		
		return 0;	// Siempre se podrá ordenar la lista
	}
}

