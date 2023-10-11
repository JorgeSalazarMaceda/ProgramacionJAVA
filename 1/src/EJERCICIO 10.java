// EJERCICIO 10 //PEDIR UN NUM DE 0 A 99 Y MOSTRARLO POR ESCRITO. POR EJ, PARA 56 MOSTAR CINCUENTA Y SEIS
package pkg10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero, decenas, unidades;
        numero = leer.nextInt();
//        decenas = leer.nextInt();
//        unidades = leer.nextInt();
        //PRIMERO HAGO EL SCANNER Y LAS VARIABLES NÚMERO A INTRODUCIR, DECENAS Y UNIDADES
        //LUEGO SACO LOS NUMEROS UNICOS, ONCE,DOCE ETC, SI (IF) EL NUM INTRODUCIDO ESTA ENTRE 10 Y 16 SWTCH HASTA 16 IMPRIMIENDOLOS
        //ELSE, SACO LAS DECENAS, DIVIDIENDO (NUMERO) ENTRE 10, ASÍ CORRO LA COMA Y ME QUEDO CON LA PRIMERA CIFRA
        //DECENAS=NUMERO/10
        //UNIDADES=numero%10
        //IF DECENAS >=0 SWTICH CASE DE 1 A 9 CON IMPRESION POR PANTALLA DE DIEZ, VEINTE, TREINTA,CUARENTA...
        //PARA LAS UNIDADES, SI UD>0
        //PONEMOS UN SYSTEM OUT PRINT CON "Y" AHORA PARA QUE QUEDE ENTRE DECENAS Y UNIDADES EJ:TREINTA Y UNO.
        //HACEMOS EL SWITCH CASE DE 1 A 9

        if (numero > 10 && numero < 16) {
            switch (numero) {
                case 11:
                    System.out.println("Once");
                    break;
                case 12:
                    System.out.println("Doce");
                    break;
                case 13:
                    System.out.println("Trece");
                    break;
                case 14:
                    System.out.println("Catorce");
                    break;
                case 15:
                    System.out.println("Quince");
                    break;
            }
        } else {
            decenas = numero / 10;
            unidades = numero % 10;
            if (decenas >= 1) {
                switch (decenas) {
                    case 1:
                        System.out.println("Diez");
                        break;
                    case 2:
                        System.out.println("Veinte");
                        break;
                    case 3:
                        System.out.println("Treinta");
                        break;
                    case 4:
                        System.out.println("Cuarenta");
                        break;
                    case 5:
                        System.out.println("Cincuenta");
                        break;
                    case 6:
                        System.out.println("Sesenta");
                        break;
                    case 7:
                        System.out.println("Setenta");
                        break;
                    case 8:
                        System.out.println("Ochenta");
                        break;
                    case 9:
                        System.out.println("Noventa");
                }
            }
            if (unidades > 0) {
                System.out.println(" y ");
                switch (unidades) {
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;
                    case 7:
                        System.out.println("siete");
                        break;
                    case 8:
                        System.out.println("ocho");
                        break;
                    case 9:
                        System.out.println("nueve");
                        break;
                }
            }
        }
    }
}
