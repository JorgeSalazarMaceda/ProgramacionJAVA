package funcioneschema;

import java.util.Scanner;

public class FUNCIONESCHEMA {
    
    public static void main(String[] args) {
        int n[]={8,33,200,150,11};
        int m []=new int[5];
        
        muestraArray(n);
        incrementa(n);
        muestraArray(n);
    }
    public static void muestraArray (int x[]){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
            
        }
        System.out.println();
    }
    public static void incrementa (int x[]){
        for (int i = 0; i < x.length; i++) {
            x[i]++;
        }
    }
        //Primero muestra el array de n con un espacio y seguido.
        // Segundo, no muestra nada, solo incrementa el valor en 1 de cada valor
        //Ahora vuelve al tercero y muestra n con el valor aumentado.
        //Esta es la diferencia con el ejercicio siguiente, porque el valor aqui si lo puede cambiar
    
    
    //Ejemplo de Salva, PREGUNTA DE EXAMEN,  
    // pORQUE EL PASO DE PARAMETROS SE HACE POR VALOR PORQUE DE N 10 CALCULA N, SOLO QUE SU VALOR CALCULA DE 10.
    //DENTRO DEL METODO CALCULA X, LE ASIGNA EL VALOR DE 10 Y A ESTO LE SUMA 24.
    //SOUT 34,
    // SALE DEL METODO Y EL VALOR DE N NO LO TOCA. DEVUELVE 10 34 10.
//    public static void main(String[] args) {
//        int n=10;
//        System.out.println(n);
//        calcula (n);
//        System.out.println(n);
//    }
//            public static void calcula (int x){
//                x+=24;
//                System.out.println(x);
//            }
    
    ////( 4.4 DISEÑAR UNA FUNCION QUE RECIBE COMO PARÁMETROS DOS NUMEROS ENTEROS Y DEVUELVE EL MÁXIMO DE AMBOS.
//    
//    public static void main(String[] args) {   
//    Scanner leer = new Scanner(System.in);
//    int a,b;
//        System.out.println("Introduce a: ");
//        a=leer.nextInt();
//        System.out.println("Escribe el valor de b: ");
//        b = leer.nextInt();
//        
//        System.out.println("El numero mayor es: " + maximo(a,b));
//    }
//    static int maximo(int a, int b){
//     int maximo;
//     if(a>b){
//         maximo=a;
//     }else{
//         maximo=b;
//     }
//     return (maximo);
//    }
    
//// 4.5 CREA UNA FUNCION QUE MEDIANTE UN BOOLEANO, 
////INDIQQUE SI EL CARACTER QUE SE PASA COMO PARAMETRO DE ENTRADA CORRESPONDE CON UNA VOCAL
//
//    
//    public static void main(String[] args) { //Se tendran en cuenta vocales mayusculas y minusculas
//        System.out.println("La i es una vocal " +esVocal('i'));
//        System.out.println("La E es una vocal " +esVocal('E'));
//        System.out.println("La f es una vocal " +esVocal('f'));
//    }
//    
//    static boolean esVocal(char c){
//        boolean resultado; //true si es vocal y false si no lo es
//        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
//            resultado=true;
//        }
//        else{
//            resultado=false;
//        }
//        return(resultado);
//    }
    
    

////  NECESITAMOS QUE RODEES LA PALABRA HOLA CON ASTERISCOS
//    public static void main(String[] args) {
//        String palabra = "HOLA";
////        imprimirAsteriscos(palabra);
//
//        for (int i = 1; i <= palabra.length() + 2; i++) {
//            System.out.println("*");
//            System.out.println("*" + "HOLA" + "*");
//            for (int j = 1; j <= palabra.length() + 1; j++) {
//                System.out.print("*");
//            }
//        }
//        imprimirAsteriscos(palabra);
//        System.out.println("");
//    }
//
//    static void imprimirAsteriscos(String palabra) {
//        for (int i = 1; i <= palabra.length() + 2; i++) {
//            System.out.println("*");
//            System.out.println("*" + "HOLA" + "*");
//
//        }
//    }


//// 4.2 ESCRIBIR UNA FUNCION A LA QUE SE LE PASEN DOS ENTEROS Y MUESTRE TODOS LOS NUMEROS COMPRENDIDOS ENTRE ELLOS
//
//public static void main(String[] args) {   
//    Scanner leer = new Scanner(System.in);
//    int a,b;
//    
//    System.out.println("Escribe el valor de a: ");
//    a=leer.nextInt();
//    System.out.println("Escribe el valor de b: ");
//    b=leer.nextInt();
//    mostrar (a,b);
//}
//static void mostrar(int a, int b){
//    int mayor=a>b?a:b;
//    int menor=a<b? a:b;
//    
//    for (int i = menor; i <=mayor; i++) {
//        System.out.println(i);
//        
//    }
//}
//ESCRIBE UNA FUNCION A LA QUE SE PASE COMO PARÁMETROS DE ENTRADA UNA CANTIDAD DE DIAS,HORAS Y MINUTOS.
//LA FUNCION CALCULARÁ Y DEVOLVERA EL NUMERO DE SEGUNDOS QUE EXISTEN EN LOS DATOS DE ENTRADA.
//    public static void main(String[] args) {
//        int dias = 4, horas = 2, minutos = 20;
//        int segundos = 0;
//        segundos = calcularSegundos(dias, horas, minutos);
//        System.out.println("Los segundos totales: " + segundos);
//    }
//
//    public static int calcularSegundos(int dias, int horas, int minutos) {
//        int segundos = 0;
//        segundos = segundos + dias * 24 * 60 * 60;
//        segundos = segundos + (horas * 60 * 60);
//        segundos = segundos + (minutos * 60);
//
////        segundos = (dias * 24*60*60 ) + (horas * 60 * 60) + (minutos * 60);
//        return segundos;
//    }
}
