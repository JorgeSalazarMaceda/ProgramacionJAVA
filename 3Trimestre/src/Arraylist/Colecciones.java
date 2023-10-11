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

//Ver la importación de paquetes

import java.util.*;
import java.util.Scanner;
import java.util.function.Predicate;
public class Colecciones {
  
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
         ArrayList<Integer> lista = new ArrayList<Integer>();
          
    
         boolean fin = false;
         int menu;
         while(!fin){
            menu=sc.nextInt();
            switch (menu) {
                case 0:
                    fin = true;
                    System.out.println("Adios");
                    break;
                case 1:
                    System.out.println("Has elegido la opción: 1");
                    insertarNumero(numero,lista);
                    break;
                case 2:
                    System.out.println("Has elegido la opción: 2");
                    int numero;
                    int id;
                    System.out.println(" 2. Insertar número en una determinada posición: ");
                    numero=sc.nextInt(); 
                    System.out.println("La posición donde desea insertar: ");
                    id=sc.nextInt();
                    insertarDetPosicion(id, numero);
                    break;
                case 3:
                    System.out.println("Has elegido la opción: 3");
                    eliminarNumero(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Has elegido la opción: 4");                                    
                    System.out.println("Número a buscar: ");
                    numero=sc.nextInt();
                    System.out.println("Cual es su posición: ");
                    id=sc.nextInt();
                    buscarNumero(id, numero);
                    break;
                case 5:
                    System.out.println("Has elegido la opción: 5");
                    System.out.println("Elije la posición que quieres sustituir: ");
                    id=sc.nextInt();
                    System.out.println("Número a buscar: ");
                    numero=sc.nextInt();
        
                    modificarNumero(id, numero);
                    break;
                case 6:
                    System.out.println("Has elegido la opción: 6");
                    mostrarListado();
                    break;
                case 7:
                    System.out.println("Has elegido la opción: 7");
                    mostrarCantidad();
                    break;
                case 8:
                   System.out.println("Has elegido la opción: 8");
                   mostrarMayor();
                    break;
                case 9:
                    System.out.println("Has elegido la opción: 9");
                    ordenadoAsc();
                    break;
                case 10:
                    System.out.println("Has elegido la opción: 10");
                    ordenadoDesc();
                    break;
                
            }  
       }
}    
         public static int menu() {
		int menu;
		System.out.println("");
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
			System.out.println("Error, introduzca una opción válida: ");
			menu = sc.nextInt();
		}
		return menu;
	}
         
}
  
    
       //Menú 1
       public static void insertarNumero(int numero,ArrayList<Integer> lista){
           
           System.out.println(" 1. Insertar un número");
           lista.add(numero); //Con el objeto de clase ArrayList llamamos al método add.
           System.out.println("Se ha insertado el número: " + numero);
       }
       
       //Menú 2
       public static void insertarDetPosicion(int numero,ArrayList<Integer> listaNumeros){
           int posicion;
		
		System.out.println("Ingrese la posici�n en la que desee insertar el n�mero: ");
		posicion = sc.nextInt();
		
		agenda.add(posicion, num);
           //Tambien se puede hacer la excepcion con un if
//           if (id >= 0 || id < listaNumeros.size()) {
//                listaNumeros.add(id, numero);
//           } else {
//               System.out.println("La posición no es correcta");
//           }
       }
       
       //Menú 3
       public static void eliminarNumero(Integer numero){
        System.out.println(" 3. Eliminar número: ");
        ArrayList<Integer> borrar = new ArrayList(); //Creamos un nuevo arraylist llamado borrar, y le añadimos el numero, luego le cambiamos ese número en el original
        //Por la duda de si hay números repetidos, ejemplo dos ochos, cambiamos todos.
        borrar.add(numero);
        listaNumeros.removeAll(borrar);
        
//        int id;
//       id=listaNumeros.indexOf(numero);
//           if(id>=0){
//               System.out.println("Número borrado");
//           } else{
//                System.out.println("El número no se encuentra");
//           }
       }
       
       //Menú 4
       public static void buscarNumero(int id, Integer numero){
           if(id >=0){ //Si el id mayor o = a 0, muestranos la posición, si no, no está. Los arrays siempre empiezan en 0
               id=listaNumeros.indexOf(numero); //Con el objeto de la clase ArrayList invocamos el metodo indexof que te indica la posicion donde se encuentra ese elemento.
               System.out.println("Tu número se encuentra en la posición: " + id + " Y el número es: " + numero);
           }else{
               System.out.println("El número no se encuentra");
           }
       }
       
       //Menú 5
       public static void modificarNumero(int id, Integer numero){
           id=listaNumeros.indexOf(numero); //Con el objeto de la clase ArrayList invocamos el metodo indexof que te indica la posicion donde se encuentra ese elemento.
           if(id >=0){
               listaNumeros.set(id, numero); //Con método set, en la posicion x añades el nuevo elemento.
           }else{
               System.out.println("El número no se encuentra");
           }
       }
       
       //Menú 6
       public static void mostrarListado(){
           if(!listaNumeros.isEmpty()){//Devuelve true si no tiene elementos
               System.out.println("Los elementos de la lista son: ");
               for (int i = 0; i < listaNumeros.size(); i++) { //Size te dice cuantos elementos hay en el ArrayList
                   System.out.print(listaNumeros.get(i) + " , ");    //Get nos devuelve la posicion del array, por lo que imprimirá cada posición.             
               }              
           } else{
               System.out.println("No hay valores en la lista");
           }
       }
       
       //Menú 7
       public static void mostrarCantidad(){
           System.out.println("La cantidad de elementos de la lista es: " + listaNumeros.size());
       }
       //Menú 8
       public static void mostrarMayor(){
           //import java.util.*; incluye la interfaz collection
           System.out.println("El máximo valor es: " + Collections.max(listaNumeros)); //Funciona al importar import java.util.Collection; o import java.util.*;
       }
       //Menú 9
       public static void ordenadoAsc(){
           Collections.sort(listaNumeros);
           System.out.println(listaNumeros);
       }
       //Menú 10
       public static void ordenadoDesc(){
           //Para ordenarlo de mayor a menor, tenemos que crearnos un objeto de la clase Comparator para que compare los elementos y los ponga en orden inverso.
           Comparator<Integer> comparador = Collections.reverseOrder();
           Collections.sort(listaNumeros, comparador);
           System.out.println(listaNumeros);
           // System.out.println(Collections.sort(listaNumeros, comparador)); por que no puedes hacer el sout??????????
       }
}
}
}
