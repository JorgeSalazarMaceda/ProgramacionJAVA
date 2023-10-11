/*
Implementa un ArrayDeque que sirva para organizar los pedidos a domicilio de un restaurante
Crea un menu con las siguientes opciones.
a. Nuevo pedido, se introduce a la cola.
b. ¿Pedidos en cola?
c. ¿Primer pedido en cola?
d. Servir pedido(Mostrar pedido en cola)
e. Pedido VIP
f. Salir
 */
package ArrayDeque;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.util.*;

public class Restaurante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> pedidos = new ArrayDeque<String>();

        int numero = 0;
        String pedido;
        String pedidoListo;

        do {
            System.out.println("Diganos la opción que desea:");
            System.out.println(" 1. Nuevo pedido.");
            System.out.println(" 2. ¿Cuántos pedidos hay en cola?.");
            System.out.println(" 3. ¿Primer pedido en cola?.");
            System.out.println(" 4. Servir pedido(Mostrar pedido en cola)."); //Hay que quitar el pedido (como si hubiese servido)
            System.out.println(" 5. Pedido VIP.");
            System.out.println(" 0. Salir");
            numero = sc.nextInt();

            switch (numero) {
                case 0:
                    System.out.println("Adiós, esperamos volver a verle.");
                    break;
                case 1:

                    System.out.println("¿Que desea tomar?.");
                    pedido = sc.next();
                    pedidos.add(pedido);
                    System.out.println("Pedido realizado.");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Tenemos " + pedidos.size() + " ahora mismo."); //Size para ver el tamaño del Deque
                    System.out.println("");
                    break;
                case 3:

                    if (!pedidos.isEmpty()) {//Devuelve true si no tiene elementos
                        System.out.println("El primer pedido en cola es: " + pedidos.getFirst()); //getFirst para obtener el primer valor
                        System.out.println("");
                    } else {
                        System.out.println("No hay pedidos.");
                        System.out.println("");
                    }
                    break;
                    
                case 4:
                    pedidoListo = pedidos.poll(); //Para quitar el pedido. //No me sale, ver 
                    //Con remove, necesitas gestionar la excepción (Que no haya elementos por ejemplo). Con poll no es necesario try catch
                    System.out.println("El pedido que acaba de salir es: " + pedidos.peek());
                    break;
                case 5:
                    System.out.println("Sr Cliente VIP,indique su pedido, por favor: ");
                    pedido = sc.next();
                    pedidos.addFirst(pedido); //Para añadir el primero y colarle, ya que es vip
                    System.out.println("Pedido prioritario realizado.");
                    System.out.println("");
            }
        } while (numero != 0);
    }
}
