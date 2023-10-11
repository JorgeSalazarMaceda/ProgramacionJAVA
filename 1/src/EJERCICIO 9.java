// EJERCICIO 9 //PEDIR UNA NOTA DEL 0 AL 10 Y MOSTRARLA DE LA SIGUIENTE MANERA:INSUFICIENTE, SUFI, BIEN.. CON IF Y CON SWITCH
package pkg9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double nota;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota:");
        nota = leer.nextDouble();

        //Hacemos la variable nota con double por si hay decimales.
        //Hacemos el Scanner para introducir la nota.
        //Primero hacelos con condicionales if y else 
        //Decimos que si es menor que 5,insuficiente, si es mayor o igual que 5 y menor que 6 aprobado y así sucesivamente
//        if (nota >= 0 && nota < 5) {
//            System.out.println("Insuficiente");
//        } else if ((nota >= 5) && (nota < 6)) {
//            System.out.println("aprobado");
//        } else if ((nota >= 6) && (nota < 7)) {
//            System.out.println("bien");
//        } else if ((nota >= 7) && (nota < 9)) {
//            System.out.println("notable");
//        } else if ((nota >= 9) && (nota <= 10)) {
//            System.out.println("sobresaliente");
//        } else {
//            System.out.println("Nota fuera de rango");
//        }
//    }
//}
        float notas;

        System.out.println("Dame una calificaciónn del 0 al 10");
        notas = leer.nextInt();
        // Hacemos la variable y el scanner para introducir nota.
        //Hemos intentado hacerla con double como arriba pero es incompatible con switch, por lo que hacemos un casting en lass notas.
        switch ((int) notas) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("Insuficiente");
                break;
            case 5:
                System.out.print("Suficiente");
                break;
            case 6:
                System.out.print("Bien");
                break;
            case 7:
            case 8:
                System.out.print("Notable");
                break;
            case 9:
            case 10:
                System.out.print("Sobresaliente");
                break;
            default:
                System.out.print("La nota introducida no es válida");
        }
    }
}
