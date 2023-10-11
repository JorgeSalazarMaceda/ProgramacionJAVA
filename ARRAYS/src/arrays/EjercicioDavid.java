/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase que contiene los métodos solicitados en el ejercicio 10 de la 
 * colección 7, los cuales son: 
 * @see #rellenarMatriz(int) {@link #mostrarMatriz(int[][])}  
 * {@link #obtenerDiagonalPrincipal(int[][])} {@link #mostrarMenu()} 
 * {@link #obtenerDiagonalPrincipal(int[][])} {@link #obtenerDiagonalSecundaria(int[][])}
 * {@link #obtenerModa(int[][])} {@link #espiral(int[][])}
 * 
 */
public class EjercicioDavid {

	static int[][] matriz;
	//static final int dimension=4;

/**
 * Método que muestra el menu de opciones que puede realizar el usuario 
 * con la matriz generada por el método @rellnarMatriz.
 * @return
 */
	public static int mostrarMenu() {
		int b = 0;
		int opcionSalida = 7;
		final int dimen = 4;
	matriz = EjercicioDavid.rellenarMatriz(dimen);

		  while(b!=opcionSalida) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println(" Listado de opciones:\r\n" + "1 - Mostrar Matriz.\r\n"
					+ "2 - Obtener diagonal principal.\r\n" + "3 - Obtener diagonal secundaria.\r\n"
					+ "4 - Obtener perimetro.\r\n" + "5 - Obtener moda.\r\n" + "6 - Recorrer espiral.\r\n"
					+ "7 - Salir\r\n" + "Elige una opción. 7 para Salir: ");
			b = sc.nextInt();

			switch (b) {

			case 1:
				EjercicioDavid.mostrarMatriz(matriz);

				break;
			case 2:
				System.out.println( Arrays.toString(EjercicioDavid.obtenerDiagonalPrincipal(matriz)));
//				for (int vector : Ejercicio10.obtenerDiagonalPrincipal(matriz)) {
//
//					System.out.println(vector);
//				}
				break;
			case 3:
				System.out.println( Arrays.toString(EjercicioDavid.obtenerDiagonalSecundaria(matriz)));
//				for (int vector : Ejercicio10.obtenerDiagonalSecundaria(matriz)) {
//
//					System.out.println(vector);
//				}

				break;
			case 4:
				System.out.println(Arrays.toString(EjercicioDavid.obtenerPerimetro(matriz)));
				break;
			case 5:
				System.out.println(EjercicioDavid.obtenerModa(matriz));
				break;
			case 6:
				EjercicioDavid.espiral(matriz);
				break;
			case 7:
				System.out.println("Hasta luegui....");
			}
		}
		return b;

	}

/**
 * Método que rellena una matriz bidimensional.
 * @param dimension recibe la dimension que queramos que tenga nuestra matriz
 * @return va a devolver una matriz bidimensional rellena con números random del 0 al 9.
 */
	public static int[][] rellenarMatriz(int dimension) {
		matriz = new int[dimension][dimension];
		Random ram = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				int valor = ram.nextInt(10);

				matriz[i][j] = valor;

			}
		}

		return matriz;
	}

/**
 * Método recorre una matriz dimensional para hallar su diagonal.
 * @param mat Recibe una matriz que va a ser recorrida.
 * @return	Devuelve un array unidimensional que contiene los valores
 * de la diagonal de la matriz que se recibió como parámetro.
 */
	static int[] obtenerDiagonalPrincipal(int[][] mat) {

		int[] diagonal = new int[mat.length];

		for (int i = 0; i < mat.length; i++) {

				diagonal[i] = mat[i][i];
		}

		return diagonal;
	}
	
/**
 * Método que halla la matriz inversa de una matriz dada. 
 * @param mat Recibe la matriz bidimensional que se va a recorrer.
 * @return Devuelve un array unidimensional que contiene los valores
 * de la diagonal inversa de la matriz que se recorrió. 
 */
		static int[] obtenerDiagonalSecundaria(int[][] mat) {
			int[] diagonalinversa = new int[mat.length];
			int k = mat.length-1;
			
			for (int i = 0; i <mat.length; i++) {

				diagonalinversa[i] = mat[i][k];
				k--;
			}
			return diagonalinversa;
		}

/**
 * Método que nos va a mostrar la matriz que se genera 
 * con el metodo rellenarMatriz. 
 * 
 * @param matriz Recibe una matriz bidimensional que se va a mostrar.
 * @see Ejercicio10.rellenarMatriz.
 */
	static void mostrarMatriz(int[][] matriz) {

		for (int[] vector : matriz) {
			System.out.println();
			for (int vec : vector) {
				System.out.print(vec + " ");
			}
		}
	}


/**
 * Método que recorrerá una matriz dada para hallar devolver 
 * los valores contenidos en el perímetro de la misma.
 * 
 * @param matriz Recibe la matriz bidimensional que se va a recorrer.
 * @return Devolverá un array unidimensional que contiene los valores
 * contenidos en el perímetro de la matriz recibida desde la posción[0][0]. 
 */
	static int[] obtenerPerimetro(int[][] matriz) {
		int[] perimetro = new int[matriz.length * 4 - 4];
		int k = 0, c = 0;
		int[] x = new int[matriz.length - 2];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (i == 0 && matriz.length - j != 0) { 
					perimetro[k] = matriz[i][j];
					k++;
				} else if (i != matriz.length - 1 && i != 0 && j == 0) {
					x[c] = matriz[i][j];
					c++;
				} else if (i != matriz.length - 1 && i != 0 && j == matriz.length - 1) {
					perimetro[k] = matriz[i][j];

					k++;
				} else if (i == matriz.length - 1) {
					perimetro[k] = matriz[i][matriz.length - 1 - j];
					k++;
				}
			}
		}
		for (int i = 0; i < matriz.length - 2; i++) {
			perimetro[k] = x[matriz.length - 2 - 1 - i];
			k++;
		}

		return perimetro;
	}
/**
 * Método que halla la moda de los datos contenidos en un 
 * array bidimensional dado.
 * 
 * @param matriz Recibe la matriz bidimensional que se va a recorrer.
 * @return Devuelve un entero que representa el número que más se 
 * repite dentro de la matriz recibida. 
 */
	public static int obtenerModa(int[][] matriz) {
		int[] moda = new int[matriz.length * matriz.length];
		int[] moda2 = new int[matriz.length * matriz.length];
		int index = 0;
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++) {
				moda2[index] = matriz[i][j];
				index++;
			}
		Arrays.sort(moda2);
		for (int i = 0; i < moda2.length; i++) {
			double contador = 0;
			for (int j = 0; j < moda2.length; j++) {
				moda[i] = (int) contador;
				if (moda2[i] == moda2[j] && i != j) {
					contador++;
				}
			}
		}
		double valormax = moda[0];
		int posicionModa = 0;
		for (int i = 0; i < moda2.length; i++) {
			if (moda[i] > valormax) {
				valormax = moda[i];
				posicionModa = i;

			}
		}
		return moda2[posicionModa];
	}
	/**
	 * Método que da los valores en espiral de un array. 
	 * @param matriz
	 * @return
	 */
//	public static int [] obtenerEspiral(int[][] matriz) {
//	int [] espiral= new int [matriz.length*matriz.length];	
//		
//	return espiral;	
//	}
	/**
	 * Método que da los valores en espiral de un array. 
	 * @param matriz
	 * @return
	 */
	public static void espiral(int[][] matriz) {

        int mitadF = ((matriz.length) / 2);
        int mitadC = ((matriz[0].length) / 2);

        if (matriz.length % 2 == 0) {

            for (int j = mitadC; j >= mitadC - 1; j--)
                System.out.print(matriz[mitadF][j] + " ");
            for (int j = mitadC - 1; j <= mitadC; j++)
                System.out.print(matriz[mitadF - 1][j] + " ");

            for (int k = 1; k <= mitadC - 1; k++) {

                for (int i = mitadF - k; i <= mitadC + k; i++)
                    System.out.print(matriz[i][mitadC + k] + " ");

                for (int j = (mitadF - 1) + k; j >= (mitadF - 1) - k; j--)
                    System.out.print(matriz[mitadF + k][j] + " ");

                for (int i = (mitadF - 1) + k; i >= (mitadF - 1) - k; i--)
                    System.out.print(matriz[i][(mitadC - 1) - k] + " ");

                for (int j = (mitadF) - k; j <= mitadC + k; j++)
                    System.out.print(matriz[(mitadF - 1) - k][j] + " ");
            }
        } else {

            System.out.print(matriz[mitadF][mitadC] + " ");

            for (int k = 0; k <= mitadC - 1; k++) {

                for (int i = mitadF + k; i >= mitadF - k; i--)
                    System.out.print(matriz[i][(mitadC - 1) - k] + " ");

                for (int j = (mitadF - 1) - k; j <= (mitadC + 1) + k; j++)
                    System.out.print(matriz[(mitadF - 1) - k][j] + " ");

                for (int i = mitadF - k; i <= mitadC + k; i++)
                    System.out.print(matriz[i][(mitadC + 1) + k] + " ");

                for (int j = (mitadF + 1) + k; j >= (mitadF - 1) - k; j--)
                    System.out.print(matriz[(mitadF + 1) + k][j] + " ");

            }
        }

    } 

	/// --MAIN--

	public static void main(String[] args) {

		Ejercicio10.mostrarMenu();
		
	}
}

