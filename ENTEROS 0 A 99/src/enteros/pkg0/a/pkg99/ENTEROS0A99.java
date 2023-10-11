package enteros.pkg0.a.pkg99;
//PEDIR UN NUMERO DE 0 A 99 Y MOSTRARLO EN LETRA EJ 56, CINCUENTA Y SEIS
import java.util.Scanner;

public class ENTEROS0A99 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero, decenas, unidades;
        numero = leer.nextInt();
//        decenas = leer.nextInt();
//        unidades = leer.nextInt();
//        esto no se pone
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
