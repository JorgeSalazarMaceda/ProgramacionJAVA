//GENERAR UN NUMERO ENTERO ALEATORIO ENTRE 1 Y 10 Y MOSTRARLO POR PANTALLA
package mathrandomapijava;

public class MATHRANDOMAPIJAVA 
{
//SE HACE LA VARIABLE ALEATORIA CON MATH RANDOM DE API DE JAVA
//DESPUES SE HACE LA VARIABLE INT Y SE HACE EL CASTING PARA PASARLO A NUMERO ENTERO (int b= (int) (aleatorio*10)+1)
//LUEGO AL ALEATORIO SE LE CORRE LA COMA MULTIPLICANDO POR 10 Y COMO EL RANDOM ES DE 0 A 1, EL MAXIMO QUE DARA ES 0.99,
//POR LO QUE SE LE SUMA 1 PARA QUE PUEDA DAR 1 Y A SU VEZ (CUANDO SE MULTIPLICA POR 10) DE EL 10
    public static void main(String[] args) 
    {
        double aleatorio = Math.random();
        int b= (int)(aleatorio*10)+1;
        
        System.out.println(b);
    }
    
}
