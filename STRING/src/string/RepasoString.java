
package string;

/**
 *
 * @author Jorge
 */
public class RepasoString 
{
    public static void main (String[] args){
        String nombre= "chema";
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi nombre es: ".concat(nombre));
        
        System.out.println("Mi nombre tiene: " + nombre.length() + " carácteres");
        System.out.println("En la posición 2 está el carácter: " + nombre.charAt(2));
        
        String frase = "Hola, que tal?";
        System.out.println("####"+frase.charAt(5)+"####");
        
        System.out.println(frase.substring(6, 9));
        
        System.out.println(nombre.equals("chema"));
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.equalsIgnoreCase("CHEMA"));
        System.out.println(nombre.contains("em"));
        System.out.println(frase.indexOf("a")); //Te dice la primera ocurrencia donde se encuentra el String buscado
        System.out.println(frase.indexOf("z")); //Si no lo encuentra te devuelve un -1
    }
}
