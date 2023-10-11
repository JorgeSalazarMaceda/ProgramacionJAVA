
//Juego del calamar
//Se hace una matriz de 2x6, y se colocan bombas aleatorias en cada columna.
//Las bombas no se ven. El muñeco tiene que llegar a la meta moviéndose con
//dos teclas
//o La q para ir avanzando por la fila de arriba.
//o La a para la fila de abajo.
//Si cae en una bomba eliminado.

package arrays;

public class Calamar 
{
    public static void main(String[] args) 
    {
        String puente[][]= new String[2][6];
        
        for (int fila = 0; fila < puente.length; fila++) {
            for (int columna = 0;columna < puente[fila].length; columna++) {
                //Creamos con los bucles el puente y invocamos con el aleatorio las bombas para que aparezcan con un 50 % posibilidades en las filas.
                puente[fila][columna]=" ";
            }
        }
        
        for (int columna = 0;columna < puente[0].length; columna++) {
            int bomba=(int)Math.round(Math.random());
            //Creamos con los bucles el puente y invocamos con el aleatorio las bombas para que aparezcan con un 50 % posibilidades en las filas.
            puente[bomba][columna]="*";
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(puente[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
        
    }
    
    
}
