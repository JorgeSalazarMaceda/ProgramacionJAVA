// EJERCICIO 9 //PEDIR UNA NOTA DEL 0 AL 10 Y MOSTRARLA DE LA SIGUIENTE MANERA:INSUFICIENTE, SUFI, BIEN.. CON IF Y CON SWITCH
package pkg1;

import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        int nota = 0;
        int opcion;
        Scanner leer = new Scanner(System.in);
//        
//        do {
//            System.out.println("Introduce nota: ");
//            nota = leer.nextInt();
//              if (nota >= 0 && nota < 5) {
//                System.out.println("Insuficiente");
//            } else if ((nota >= 5) && (nota < 6)) {
//                System.out.println("Aprobado");
//            } else if ((nota >= 6) && (nota < 7)) {
//                System.out.println("Bien");
//            } else if ((nota >= 7) && (nota < 9)) {
//                System.out.println("Notable");
//            } else {
//                System.out.println("Sobresaliente");
//            }
//        } while ((nota >= 0) && (nota <= 10));
//        System.out.println("Fin de programa, nota fuera del rango");

        
        while ((nota >= 0) && (nota <= 10)){
             System.out.println("Introduce nota: ");
            nota = leer.nextInt();
              if (nota >= 0 && nota < 5) {
                System.out.println("Insuficiente");
            } else if ((nota >= 5) && (nota < 6)) {
                System.out.println("Aprobado");
            } else if ((nota >= 6) && (nota < 7)) {
                System.out.println("Bien");
            } else if ((nota >= 7) && (nota < 9)) {
                System.out.println("Notable");
            } else if ((nota >= 9) && (nota <=10)){
                System.out.println("Sobresaliente");
            } 
        }
        System.out.println("Nota fuera de rango");
        
        
        
        
        
        
//        do {
//            System.out.println("Introduce una nota del 0 al 10: ");
//            nota = leer.nextInt();
//            if (nota >= 0 && nota < 5) {
//                System.out.println("Insuficiente");
//            } else if ((nota >= 5) && (nota < 6)) {
//                System.out.println("aprobado");
//            } else if ((nota >= 6) && (nota < 7)) {
//                System.out.println("bien");
//            } else if ((nota >= 7) && (nota < 9)) {
//                System.out.println("notable");
//            } else if ((nota >= 9) && (nota <= 10)) {
//                System.out.println("sobresaliente");
//            }  else {
//                System.out.println("Nota fuera de rango");
//                System.out.println("Introduce una nota del 0 al 10: ");
//            nota = leer.nextInt();
//            if (nota >= 0 && nota < 5) {
//                System.out.println("Insuficiente");
//            } else if ((nota >= 5) && (nota < 6)) {
//                System.out.println("aprobado");
//            } else if ((nota >= 6) && (nota < 7)) {
//                System.out.println("bien");
//            } else if ((nota >= 7) && (nota < 9)) {
//                System.out.println("notable");
//            } else if ((nota >= 9) && (nota <= 10)) {
//                System.out.println("sobresaliente");
//            } 
//            }
//        } while ((nota>=0) && (nota<=10));

        
        
//          //   V E R S I O N      N O R M A L        C O N       E L S E
        
  
//                
//            System.out.println("Introduce una nota del 0 al 10: ");
//            nota = leer.nextInt();
//            if (nota >= 0 && nota < 5) {
//                System.out.println("Insuficiente");
//            } else if ((nota >= 5) && (nota < 6)) {
//                System.out.println("aprobado");
//            } else if ((nota >= 6) && (nota < 7)) {
//                System.out.println("bien");
//            } else if ((nota >= 7) && (nota < 9)) {
//                System.out.println("notable");
//            } else if ((nota >= 9) && (nota <= 10)) {
//                System.out.println("sobresaliente");
//            }  else {
//                System.out.println("Nota fuera de rango");
//            }
//            
        
       //  V E R S I O N      B U C L E       E      I F      P A R A        P A R A R
//        while ((nota >= 0) && (nota <= 10)) {
//            System.out.println("Introduce una nota del 0 al 10: ");
//            nota = leer.nextInt();
//            if (nota >= 0 && nota < 5) {
//                System.out.println("Insuficiente");
//            } else if ((nota >= 5) && (nota < 6)) {
//                System.out.println("aprobado");
//            } else if ((nota >= 6) && (nota < 7)) {
//                System.out.println("bien");
//            } else if ((nota >= 7) && (nota < 9)) {
//                System.out.println("notable");
//            } else if ((nota >= 9) && (nota <= 10)) {
//                System.out.println("sobresaliente");
//            }
//        }
//        if ((nota < 0) && (nota > 10)) {
//            System.out.println("Nota fuera de rango");
//        }

       //  V E R S I O N      B U C L E     E T E R N O
//        Hacemos la variable nota con double por si hay decimales.
//        Hacemos el Scanner para introducir la nota.
//        Primero hacelos con condicionales if y else 
//        Decimos que si es menor que 5,insuficiente, si es mayor o igual que 5 y menor que 6 aprobado y así sucesivamente
//        while (nota >= 0 && nota <= 10 || nota < 0 || nota > 10) {
//            System.out.println("Introduce una nota del 0 al 10: ");
//            nota = leer.nextInt();
//            if (nota < 0 || nota > 10) {
//                System.out.println("Nota fuera de rango");
//            }
//            if (nota >= 0 && nota < 5) {
//                System.out.println("Insuficiente");
//            } else if ((nota >= 5) && (nota < 6)) {
//                System.out.println("aprobado");
//            } else if ((nota >= 6) && (nota < 7)) {
//                System.out.println("bien");
//            } else if ((nota >= 7) && (nota < 9)) {
//                System.out.println("notable");
//            } else if ((nota >= 9) && (nota <= 10)) {
//                System.out.println("sobresaliente");
//            }
//            
//        }
    }
}

//        float notas;
//
//        System.out.println("Dame una calificaciónn del 0 al 10");
//        notas = leer.nextInt();
//         Hacemos la variable y el scanner para introducir nota.
//        Hemos intentado hacerla con double como arriba pero es incompatible con switch, por lo que hacemos un casting en lass notas.
//        switch ((int) notas) {
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//                System.out.print("Insuficiente");
//                break;
//            case 5:
//                System.out.print("Suficiente");
//                break;
//            case 6:
//                System.out.print("Bien");
//                break;
//            case 7:
//            case 8:
//                System.out.print("Notable");
//                break;
//            case 9:
//            case 10:
//                System.out.print("Sobresaliente");
//                break;
//            default:
//                System.out.print("La nota introducida no es válida");
//        }
//    }
//}
