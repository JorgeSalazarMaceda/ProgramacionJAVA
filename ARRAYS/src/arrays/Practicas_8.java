/*
Pintar una matriz para ver la evolución año a año de una cantidad de dinero según el
tipo de interés. Los valores dados son el tipo de interés (del 10% al 15%) y la cantidad
de partida (año 0) son 10.000€ en todos los casos.
Además se hará un programa donde se pida al usuario que indique el interés y el año
y con esos datos se dará el valor. Por ejemplo, si dice interés 12% y en el año 3, el
resultado será 14.049,28€.
 */
package arrays;

/**
 *
 * @author Jorge
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Practicas_8 {

    public static double[][] imprimirArray() {

        double porcentaje = 10;

        double[][] array = new double[6][6];

        //La posición i=0 serán los porcentajes y la j son los años que van subiendo
//       array[0][0]=0.10;
//       array[0][1]=0.11;
//       array[0][2]=0.12;
//       array[0][3]=0.13;
//       array[0][4]=0.14;
//       array[0][5]=0.15;
        for (int j = 0; j < array.length; j++) {
            array[0][j] = porcentaje++;
            //Luego, observamos en el dibujo que i=1 es una constante de 10000, así que en un for lo ponemos
            array[1][j] = 10000;
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("| " + array[0][0] + "%        " + array[0][1] + "%         " + array[0][2] + "%         " + array[0][3] + "%         " + array[0][4] + "%         " + array[0][5] + "%|");
        System.out.println("----------------------------------------------------------------------------");

        //Ahora es cuando la cantidad irá cambiando cada j
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double valor = (array[i - 1][j] * (array[0][j] / 100)) + array[i - 1][j];
                array[i][j] = valor;
            }
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                DecimalFormat df = new DecimalFormat("#.00");
                //La clase DecimalFormat de java nos permite mostrar los números en pantalla con el formato que queramos, 
                //por ejemplo, con dos decimales, con una coma para separar los decimales, etc.
                System.out.print((df.format(array[i][j])) + "€    ");

            }
            System.out.println("");
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interes;
        int anio;
        double[][] matriz = Practicas_8.imprimirArray(); //Como hay un return, el resultado de la funcion se guardará en la variable matriz

        do {
            System.out.println("Indique el interés: ");
            interes = sc.nextInt();

        } while (interes < 10 || interes > 15); // Mientras este por debajo de 10 o mayor que 15 preguntara porque está mal

        do {
            System.out.println("Indique el año: ");
            anio = sc.nextInt();
        } while (anio < 0 || anio > 4); // Mientras este por debajo de 0 o mayor que 4 preguntara porque está mal

        int columna;
        columna = interes - 10; //Aqui conseguimos el interes ya que restando 10 es la posicion,

        int fila;
        fila = anio + 1; // y aquí conseguimos la fila, el año 0 está en la fila 1 y por eso le sumamos 1, porque el array empieza en 0

        double salario = matriz[fila][columna];
        System.out.println("El salario es: " + salario); // Le pasamos las coordenadas a la matriz que ya teniamos y pintamos.
    }
}
//        //Array porcentajes, encabezado de la matriz
//        int tipoInteres [] = {10,11,12,13,14,15};
//      
//        
//        //For para pintar el array de porcentajes0
//        for (int i = 0; i < tipoInteres.length; i++) {
//            System.out.print(tipoInteres[i] + "%" + "        ");
//        }

//        System.out.println("Cuantos años quieres analizar: ");
//        años=sc.nextInt();
////      System.out.println("Cual es el tipo de interés: ");
////      interes=sc.nextInt();
//
//        
//        double precios[][]=new double[años][años]; //El array se puede inicializar con el primer corchete solo
//        for (int i = 0; i < precios.length; i++) {
//            interes++;
//            for (int j = 0; j < años; j++) {
//                //i seria el tipo de interes
//                //j los años que quieres ver ese incremento
//                precioTotal= (precio*interes/100)+precio;
//                precio+=precioTotal;
//                precios[i][j]=precio;      
//               
//            }              
//        }
//        for (int i = 0; i < precios.length; i++) { //Volvemos a hacer dos for anidados para pintar la matriz, dado que ya tenemos los valores.
//            for (int j = 0; j < años; j++) {
//                System.out.print(precios[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");

//Alternativa
/*
MATRIZ DE 6X6
i 1 = 10.000
matriz[2][2] = matriz[1][2] + porcentaje
 */
//import java.util.Scanner;
//
///**
// *
// * @author Jorge
// */
//public class Practicas_8 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int porcentaje = 10;
//
//        double años[][] = new double[5][6];
//
////VALORES PARA LOS INTERESES
//        for (int i = 0; i < 6; i++) {
//            System.out.print(porcentaje + "%" + "          ");
//            porcentaje += 1;
//        }
//
//        //TABLA DE AÑOS
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (i == 0) {
//                    años[0][j] = 10000;
//                } else if (i == 1) {
//                    años[1][0] = (años[0][j] * 0.1) + años[0][0];
//                    años[1][1] = (años[0][j] * 0.11) + años[0][1];
//                    años[1][2] = (años[0][j] * 0.12) + años[0][2];
//                    años[1][3] = (años[0][j] * 0.13) + años[0][3];
//                    años[1][4] = (años[0][j] * 0.14) + años[0][4];
//                    años[1][5] = (años[0][j] * 0.15) + años[0][5];
//                } else if (i == 2) {
//                    años[2][0] = (años[1][0] * 0.1) + años[1][0];
//                    años[2][1] = (años[1][1] * 0.11) + años[1][1];
//                    años[2][2] = (años[1][2] * 0.12) + años[1][2];
//                    años[2][3] = (años[1][3] * 0.13) + años[1][3];
//                    años[2][4] = (años[1][4] * 0.14) + años[1][4];
//                    años[2][5] = (años[1][5] * 0.15) + años[1][5];
//                } else if (i == 3) {
//                    años[3][0] = (años[2][0] * 0.1) + años[2][0];
//                    años[3][1] = (años[2][1] * 0.11) + años[2][1];
//                    años[3][2] = (años[2][2] * 0.12) + años[2][2];
//                    años[3][3] = (años[2][3] * 0.13) + años[2][3];
//                    años[3][4] = (años[2][4] * 0.14) + años[2][4];
//                    años[3][5] = (años[2][5] * 0.15) + años[2][5];
//                } else if (i == 4) {
//                    años[4][0] = (años[3][0] * 0.1) + años[3][0];
//                    años[4][1] = (años[3][1] * 0.11) + años[3][1];
//                    años[4][2] = (años[3][2] * 0.12) + años[3][2];
//                    años[4][3] = (años[3][3] * 0.13) + años[3][3];
//                    años[4][4] = (años[3][4] * 0.14) + años[3][4];
//                    años[4][5] = (años[3][5] * 0.15) + años[3][5];
//                }
//
//            }
//        }
//        //INTENTA HACERLO CON UN FOR PARA CADA AÑO
//
//        //Mostrar
//        for (int i = 0; i < 5; i++) {
//            System.out.println("     ");//Filas ->
//            for (int j = 0; j < 6; j++) { //Columnas ||
//                System.out.print(String.format("%.2f", años[i][j]) + "    ");
//            }
//            System.out.println("");
//        }
//
//    }
//}
