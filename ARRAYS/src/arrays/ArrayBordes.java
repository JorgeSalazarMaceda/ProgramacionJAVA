//Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0
//salvo los de los bordes que deben ser 1. Mostrarla.
//
//111111 Cuando i sea 0
//100001 Estos son la j
//100001
//100001
//100001
//100001
//100001
//111111 Cuando i sea 8
package arrays;

public class ArrayBordes {

    public static void main(String[] args) {
        int miMatriz[][] = new int[8][6]; //Lo primero, creamos una matriz con el tamaño deseado

        //Vamos a rellenar la matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                

                if (i == 0 || i == 7) { //Esto indica las columnas //Es 7 porque el array parte desde 0
                    miMatriz[i][j] = 1;
                } else if (j == 0 || j == 5) { //Esto indica los 1 de los lados
                    miMatriz[i][j] = 1;
                } else {
                    miMatriz[i][j] = 0;
                }
            }
            
        }
        for (int i = 0; i < 8; i++) { //Volvemos a hacer dos for anidados para pintar la matriz, dado que ya tenemos los valores.
            for (int j = 0; j < 6; j++) {
                System.out.print(miMatriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
