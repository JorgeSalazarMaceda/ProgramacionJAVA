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
import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.function.Predicate;

/**
 *
 * @author Jorge
 */
public class Lista {
    static Scanner sc = new Scanner(System.in);
    

	public static void main(String[] args) {
		ArrayList <Integer> lista = new ArrayList<Integer>();
		boolean fin = false;
		
		while(fin == false) {
			switch(menu()) {
				case 0:
                                    fin = true;
                                    break;
				case 1:
                                    insertarNumero(numeroCliente(), lista);
                                    break;
				case 2:
                                    insertarDetPosicion(numeroCliente(), lista);
                                    break;
				case 3:
                                    eliminarNumero(numeroCliente(), lista);
                                    break;
				case 4:
                                    buscarNumero(numeroCliente(), lista);
                                    break;
				case 5:
                                    modificarNumero(numeroCliente(), lista);
                                    System.out.println(mostrarMayor(lista));
                                    break;
				case 6:
                                    mostrarListado(lista);
                                    break;
				case 7:
                                    mostrarCantidad(lista);
                                    break;
				case 8:
                                    mostrarMayor(lista);
                                    //System.out.println(mostrarMayor(lista)); Para ver que funciona el return y devuelve 0.
                                    break;
				case 9:
                                    OrdenadosAsc(lista);
                                    break;
				case 10:
                                    OrdenadosDesc(lista);
                                    break;
			}
		}
                
	}
	
	public static int menu() {
		int menu;
		
        System.out.println("");
        System.out.println("Introduce la opción deseada: ");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println(" 0. Salir");
        System.out.println(" 1. Insertar un número");
        System.out.println(" 2. Insertar un número en una posición");
        System.out.println(" 3. Eliminar un número");
        System.out.println(" 4. Buscar un número");
        System.out.println(" 5. Modificar un número");
        System.out.println(" 6. Mostrar listado de números");
        System.out.println(" 7. ¿Cuantos números hay?");
        System.out.println(" 8. ¿Quién es el mayor?");
        System.out.println(" 9. Mostrar listado ordenado (asc)");
        System.out.println(" 10. Mostrar listado ordenado (desc)");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("");
		
		menu = sc.nextInt();
		
		while (menu < 0 || menu > 10) {
			System.out.println("Error, pon una opción válida: ");
			menu = sc.nextInt();
		}
		return menu;
	}
	//Método scanner para solicitar el número
	public static int numeroCliente() {
		int numero;

		System.out.println("¿Cual es el número?: ");
		numero = sc.nextInt();
		return numero;
	}
	
        //Menú 1
	public static void insertarNumero(int numero, ArrayList<Integer> lista) {
		lista.add(numero);
	}
	//Menú 2
	public static void insertarDetPosicion(int numero, ArrayList<Integer> lista) {
		int id;
		
		System.out.println("Ingrese la posición en la que desee insertar el número: ");
		id = sc.nextInt();
		
		lista.add(id, numero);
	}
	//Menú 3 //En los metodos, tenemos que poner integer como objeto (clase no primitiva) para que diferencie de la posición.
	public static int eliminarNumero(Integer numero, ArrayList<Integer> lista) {
		int resultado = 1;
		if(lista.remove(numero)){
                    resultado = 0;
                }
		else {
                    System.out.println("Información no disponible.");
                }
		
		return resultado;
                
                //Con remove all cambias todos.
                
                
	}
	//Menú 4
	public static int buscarNumero(Integer numero, ArrayList<Integer> lista) {
		int resultado = 1;
		if(lista.contains(numero)) {
			System.out.println("El número se encuentra en la lista.");
			resultado = 0;
		}
                else{
                    System.out.println("El número no está en la lista.");
                }
		
		return resultado;
	}
	//Menú 5
	public static int modificarNumero(int numero, ArrayList<Integer> lista) {
		int id;
                int resultado = 1;
		
		System.out.println("Dime la posición del número que vas a cambiar: ");
		id = sc.nextInt();
		
		if(id >= 0 && id < lista.size()) { //Size te dice cuantos elementos hay en el ArrayList
			lista.set(id, numero); //Con método set, en la posicion x añades el nuevo elemento.
			resultado = 0;
		}
                else{
                    System.out.println("Información no disponible." + resultado);
                }
			
		return resultado;
	}
	//Menú 6
	public static int mostrarListado(ArrayList<Integer> lista) {
               if(!lista.isEmpty()){//Devuelve true si no tiene elementos
               System.out.println("Los elementos de la lista son: ");
               for (int i = 0; i < lista.size(); i++) { //Size te dice cuantos elementos hay en el ArrayList
                   //System.out.print(lista.get(i)); //Get nos devuelve la posicion del array, por lo que imprimirá cada posición, pero es mejor hacer un sout de lista.
                   System.out.println(lista);            
               }              
           } else{
               System.out.println("No hay valores en la lista");
           }

		return 0;
                //Mostramos la lista
	}
	//Menú 7
	public static int mostrarCantidad(ArrayList<Integer> lista) {
            if(!lista.isEmpty()){
		  System.out.println("La cantidad de elementos de la lista es: " + lista.size());
            }
            else{
               System.out.println("No hay valores en la lista");
           }
		return 0;
                //Mostramos la cantidad
	}
	//Menú 8
	public static int mostrarMayor(ArrayList<Integer> lista) {
		System.out.println("El máximo valor es: " + Collections.max(lista)); //Funciona al importar import java.util.Collection; o import java.util.*;
		
		return 0;
                //Mostramos el mas alto
	}
	//Menú 9
	public static int OrdenadosAsc(ArrayList<Integer> lista) {
            if(!lista.isEmpty()){
		Collections.sort(lista);
		System.out.println(lista);
            }
             else{
               System.out.println("No hay valores en la lista");
           }
		return 0;
                // Mostramos la lista
	}
	//Menú 10
	public static int OrdenadosDesc(ArrayList<Integer> lista) {
            //Para ordenarlo de mayor a menor, tenemos que crearnos un objeto de la clase Comparator para que compare los elementos y los ponga en orden inverso.
            if(!lista.isEmpty()){
           Comparator<Integer> comparador = Collections.reverseOrder();
           Collections.sort(lista, comparador);
           System.out.println(lista);
            }
            else{
               System.out.println("No hay valores en la lista");
           }
           //Tambien se puede hacer así:
           //Collections.sort(lista);
           //Collections.reverse(lista);
           //System.out.println(lista);
		
		return 0;
                // Mostramos la lista
	}
}
