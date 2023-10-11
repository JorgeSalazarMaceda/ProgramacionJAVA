
package javaapplication50;
public class JavaApplication50 {
    public static void main(String[] args)
    {
       double suma1=0,suma2=0;
       double sumapares, sumaimpares;
        for (int i = 1; i <=99; i++) {
            if(i%2!=0){
                suma1=suma1+i;
                System.out.println("La suma de los números impares es: " +suma1);
          }       
        }
        
        for (int i2 = 0; i2 <= 98; i2++) {
            if(i2%2==0){
                suma2=suma2+i2;
                System.out.println("La suma de los números pares es: " +suma2);
            }  
        }
//HEMOS REALIZADO UN BUCLE FOR PARA QUE REVISE TODOS LOS NUMEROS DESDE EL CONTADOR 0 HASTA EL 100.
//DESPUES HEMOS PROPUESTO LA CONDICIÓN DE QUE SEAN DISTINTOS DE RESTO 0 PARA SACAR LOS IMPARES.
//ACTO SEGUIDO HEMOS CREADO LA VARIABLE SUMA PARA SUMAR I YA QUE ASÍ SOLO SUMA LOS IMPARES.
//AHORA LO MISMO CON LOS PARES PERO CON RESTO 0 
    }
}
