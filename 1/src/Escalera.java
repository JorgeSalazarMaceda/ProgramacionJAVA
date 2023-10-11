//Tiene que aparecer 1,2,3,4,5 - 2,3,4,5 - 3,4,5 - 4,5 - 5
package a23;

public class Escalera 
{
    public static void main(String[] args)
    {
        
        for (int i = 1; i <=5; i++) {
            for (int j = i; j <= 5; j++) {
                //Si pones dentro del segundo bucle for, j=1 (lo normal, como los otros ejercicios) saldria 5 veces 1,2,3,4,5
                //Pero al poner en el segundo bucle,j=i va decreciendo.
                //Esto es así porque en el primer for, i es = a 1, por lo que te imprime 1,2,3,4,5 (j)
                //Después, al dar la segunda vuelta, i es 2, por llo que al ser j=i, imprime 2,3,4,5 
                // i=3, j=3,4,5
                //i=4, j=4,5
                //i=5, j=5
                System.out.print(j);             
            }
            //Despues queremos que ponga un guion separando las secuencias siempre que i sea < que 5 fuera del bucle anidado. Por lo que
            if (i<5) System.out.print("-");
            //cuidado con los print!!!! No llevan ln
        }   
    }
}
