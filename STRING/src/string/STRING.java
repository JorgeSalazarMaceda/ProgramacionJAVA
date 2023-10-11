//HACER UN PROGRAMA QUE USE LA VARIABLE STRING Y LAS SIGUIENTES FUNCIONES:

//1- LENGTH (PARA QUE NOS DIGA CUANTOS CARACTERES)TOMA TODOS LOS CARACTER

//2- SUBSTRING (PARA EXTRAER UN DETERMINADO DE CARACTERES DENTRO DE UNA CADENA, SERIA COMO UNA SUBCADENA)

//3- CONTAINS = BUSCA COINCIDENCIAS DENTRO DE UNA CADENA DE TEXTO, RECONOCIENDO MAYUSCULAS Y MINUSCULAS
//     Nos devuelve un booleano, true si encuentra coincidencias y false si no

//4- TO UPPER CASE // TO LOWER CASE= SON METODOS PARA TRANSFORMAR CADENAS DE CARACTERES EN MAYUSCULAS Y MINUSCULAS

//5- CHARAT (PARA QUE NOS DIGA (DEVUELVA) LA POSICION DEL CARACTER, DESDE EL 0 HASTA X)

//6- EQUALS COMPARA CADENAS DE CARACTERES Y DEVUELVE TRUE SI DOS CADENAS DE CARACTERES SON IGUALES Y FALSE SI NO LO SON
//   TAMBIEN OBSERVA SI SON MAYUSCULAS O MINUSCULAS

//7- EQUALSIGNORECASE= IGUAL QUE EQUALS PERO NO DISTINGUE ENTRE MAYUSCULAS Y MINUSCULAS

//8- COMPARETO= COMPARA DOS STRINGS LEXICO-GRAMATICALMENTE, ES DECIR COMPARA SI UNA CADENA ES MAYOR O MENOR QUE OTRA

package string;

public class STRING 
{

    public static void main(String[] args)
    {
//        String nombre="Jorge"; //* nombre es objeto. Los datos char tienen que ir con ' y String con "
//        System.out.println("Mi nombre es: " + nombre);
////
//////   1- Ahora vamos a ver cuantas letras tiene mi nombre con el metodo lengh
//        String nombre="Jorge"; 
//        System.out.println("Mi nombre es: " + nombre);
//        System.out.println("Mi nombre tiene: " + nombre.length()  + " Letras");
        
////   2- Substring vamos a determinar unos caracteres determinados dentro de otro, el primero te devuelve un parametro
//        y el segundo te devuelve dos paramtros, inicio y final. 
//        De "hoy" ponemos para extraer o,y. 1(PRIMER PARAMETRO) 3 (EL ULTIMO PARAMETRO QUE NO QUEREMOS QUE EXTRAIGA)
//        
//              String frase="Hoy es un estupendo dia para aprender a programar en Java";
//              String frase_resumen=frase.substring(1, 3);
//              System.out.println(frase_resumen);
//        
//     3- Ahora vamos a buscar coincidencias dentro de una cadena de textos, true es frase 1 y frase 3.
//       frase 1 y frase 2 es false
//       si comparo frase1 y cadena de busqueda, nos dira si las dos incluyen la palabra comer
//              String frase1= "Hoy vamos a ir a comer al campo";
//              String frase2= "Hoy vamos a ir a comer al bosque";  
//              String frase3= "Hoy vamos a comer al campo";
//              String cadena_busqueda=new String("campo");
//              System.out.println(frase1.contains(cadena_busqueda));
        
////  4- Ahora vamos a convertir cadenas de mayusculas y minusculas y viceversa
//        
//              String cadena1;
//              String cadena2;
//            
//              cadena1="automovil";
//              System.out.println(cadena1.toUpperCase()); 
////            (en pantalla aparecerá en mayusculas)
//        
//              cadena2="FERROCARRIL";
//              System.out.println(cadena2.toLowerCase());
//              En pantalla aparecerá ferrocarril en minusculas

////   5- Ahora vamos a ver las posiciones de los caracteres mi nombre con el metodo charAt 0 es la primera posicion  
              String nombre="Jorge"; 
              System.out.println("La primera letra de mi nombre : " + nombre.charAt(0));
              System.out.println("La última letra de mi nombre : " + nombre.charAt(nombre.length()-1)); 
//              PONGO ESTO PARA QUE META EL NOMBRE QUE META ME DIGA LA ULTIMA PALABRA
        
////   6- Ahora vemos a comparar dos cadenas de caracteres para ver si son iguales, dara true si lo son y false si no.
//        Distingue entre mayusculas y minusculas
            
//              String alumno1, alumno2;
//              alumno1="david";
//              alumno2="david";
//              System.out.println(alumno1.equals(alumno2));
          
////      7- Igual que equals pero no distingue entre mayusculas y minusculas
//         Pongo mayuscula una variable y dara igual true en el ej
//        
//              String alumno1, alumno2;
//              alumno1="David";
//              alumno2="david";
//              System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
////      8- COMPARA CADENAS PARA COMPARARLAS ALFABETICAMENTE Y COMPARA CARACTERES DE UNO EN UNOPERO NOSOTROS LE DIREMOS POR QUÉ SON IGUALES,  no devuelve true o false, si no un objeto
//          SI DEVUELVE 0 SON IGUALES, 1 PUES ALUMNO 1 ES MAYOR QUE ALUMNO 2 Y -1 ES MENOR
//          EJ: DOS COCHES SON DISTINTOS PERO PARA NOSOTROS SON IGUALES, PERO ASI LOS ORDENAS, EJEMPLO SUELDOS, PRECIOS...
//              String palabra1="ABCD";
//              String palabra2="AABCD";
//              System.out.println(palabra1.compareTo(palabra2));               
    }
    
}
