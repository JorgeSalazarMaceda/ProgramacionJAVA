package multiples.de.pkg0.a.pkg100;
import java.util.Scanner;
//El usuariio elige por teclado un numero del 1 al 100 (ambos incluidos) y mostrar
//informacion para 5 variables:
//numcifras;numero entero que nos dice el numero de cifras
//esPar:Será S cuando sea par y N cuando sea impar
//mitad1 sera true cuando el numero entre 1 y 50 y false cen caso contrario
//mitad 2 sera true cuando el nimero este entre 51 y 100 y false en caso contrario
//multiplo sera "solo es multiplo de 3 cuando solo sea de 3"
//sera "multiplo de 5 cuando solo sea multiplo de 5."
//sera "multiplo de 3 y 5 vuando sea de 3 y 5"
//caso contrario "no es ni multiplo de 3 ni de 5"
public class MULTIPLESDE0A100
{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, numerocifras;
        char esPar;
        boolean mitad1, mitad2;
        String multiplo;

        System.out.println("Escriba un número dentro del rango 1 hasta 100:");
        num = leer.nextInt();
        
        if ((num>=1) && (num<=100)){
            System.out.println("Esta dentro del rango 1 a 100");}       
        else {System.out.println("Está fuera del ranngo");}
        
        numerocifras=num/1;
        
        if ((numerocifras>=1) && (numerocifras<=9)){
            System.out.println("Num solo tiene una cifra");}
        else if ((numerocifras>=10) && numerocifras<=99){
            System.out.println("Num tiene dos cifras");}
        if ((numerocifras>=100)) {
            System.out.println("Num tiene 3 cifras");}
        
        if (num%2==0){
            esPar='s';
            System.out.println("El numero es par " + esPar);
        }
        else {esPar='n';
                System.out.println("El numero es impar " + esPar);
        }
       
        if ((num>=1) && (num<=50)){
            mitad1=true;
            System.out.println("Es cierto que está en la primera mitad");}
        else {mitad1=false;
            System.out.println("Es falso que está en la primera mitad");}
        
//        if ((num>=51) && (num<=100)){
//            mitad2=true;
//            System.out.println("Es cierto que esté en la segunda mitad");}
//        else {
//            mitad2=false;
//            System.out.println("Es falso que esté en la segunda mitad");}
        
        while (num++<=100){
            System.out.println(num);
            if(num%3==0){
                System.out.println("El número es múltiplo de 3");}
            else if (num%5==0){
                System.out.println("El número es múltiplo de 5");}
            else if ((num%3==0) && (num%5==0)){
                System.out.println("El número es múltiplo de 3 y de 5");}
            else {
                System.out.println("No es múltiplo ni de 3 ni de 5");}
         
        }
        
    }

}
