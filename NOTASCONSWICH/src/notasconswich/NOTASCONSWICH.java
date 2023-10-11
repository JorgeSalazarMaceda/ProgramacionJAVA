package notasconswich;

import java.util.Scanner;

public class NOTASCONSWICH {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //*if (notas<=5);{*/
        int notas;

        System.out.println("Dame una calificaciónn del 0 al 10");
        notas = leer.nextInt();

        switch (notas) {
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
