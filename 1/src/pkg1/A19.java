//EJERCICIO 19 //Escribir todos los números del 100 al 0 de 2 en 2. Adicionalmente mostrar un contador total de los que terminan en 8.
package pkg1;

public class A19 {

    public static void main(String[] args) {
        int numero = 0;
        int contador = 0; //se abre una variable contador 0

        //se hace un bucle for decreciente de dos en dos (-= es el operador de asignación) desde 100 para mostrar por pantalla todos los números
        for (int i = 100; i >= 0; i -= 2) {

            if ((i - 8) % 10 == 0) { //para lo del contador de los numeros que terminan en 8, si i menos 8, su resto es 0 quiere decir que es multiplo
                contador++;
                System.out.println("Este acaba en 8: " + i);
            } else {
                System.out.println(i);// se imprime i, que son los números que recoje el bucle mientras sea >=0 decreciendo de dos en dos desde 100
            }
        }
        System.out.println("");
        System.out.println("Ha encontrado " + contador + " números que terminan en 8.");

//         C O N        W H I L E
//        int numero = 100;
//
//        while (numero >= 0) {
//            System.out.println(numero);
//            numero -= 2;
//        }
//          if ((numero - 8) % 10 == 0) {
//              System.out.println("Los que acaban en 8 son: " + numero);
//            }
//        }


//      C O N      D O      W H I L E

//        int numero = 100;
//        do {
//            if (numero >= 0) {
//                numero -= 2;
//                System.out.println(numero);
//            }
//            if ((numero - 8) % 10 == 0) {
//                System.out.println("Los que acaban en 8 son: " + numero);
//            }
//        } while (numero > 0);

    }
}
