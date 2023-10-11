//COMPROBAR SI UNA FRASE INTRODUCIDA POR TECLADO ES UN PALINDROMO
package palindromobucleconstring;
import java.util.Scanner;
public class Comprobarpalindromo 
{
    public static void main(String[] args) {
        String frase =" ";
        boolean palindromo=true;
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce tu frase: ");
        frase=leer.next();
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)!= frase.charAt(frase.length()-1-i)){
            palindromo=false;        
        }     
        }
        System.out.println(palindromo);
//Es mas facil buscar las que no lo son en vez de las que si (if)      
//Tenemos la frase por ejemplo casa, salimos desde char 0 que seria la 0.
//Si char de 0 es distinto del final (length, menos 1 (porque length parte desde 1) - i
//Esa i, es como el contador para ir disminuyendo (es como el bucle que intente al principio del j anidado, la i va subiendo 1 (a), 2(s) etc etc...                       
    }   
}
