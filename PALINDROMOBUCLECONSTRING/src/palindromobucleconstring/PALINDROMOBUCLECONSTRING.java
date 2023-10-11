//ANALIZAR PALINDROMO DABALE ARROZ A LA ZORRA EL ABAD (COMO EL NUMERO CAPICUA EJ 101,SE LEE IGUAL DE UN LADO PARA OTRO EJ OSO)
//IGN FRASE=FRASE QUE QUERAMOS Y HAY QUE DECIR SI ESA FRASE ES UN PALINDROMO O NO Y ESO SE HACE CON UN BUCLE QUE LEA DE DERECHA 
//A IZQUIERDA Y QUE COMPARE SI ES UN PALINDROMO.
//LENGH ME DICE CUANTAS LETRAS TENGO
//CHARAT LAS POSICIONES DE CADA LETRA
//Y FOR EL BUCLE PODRIA SER
package palindromobucleconstring;


public class PALINDROMOBUCLECONSTRING 
{

    public static void main(String[] args) 
    {
        String p="123"; 
        String reverso= "";
         for (int i = p.length(); i>0;i--) {
             reverso=reverso+p.charAt(i-1);
             System.out.println(reverso);
        }
        
        
        
    }
    
}
