    // CALCULAR EL AREA DE POLIGONOS CON MENU: 1 CIRCULO, 2 RECTANGULO, 3 CUADRADO Y 4 TRIANGULO
package funcioneschema;
import java.util.Scanner;
import static java.lang.Math.*;
public class FUNCIONAREAPOLIGONOS 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int opcion;
        double resultado1, resultado2, resultado3, resultado4;
        System.out.println("Introduce numero 1 para area circulo, 2 para rectangulo, 3 para cuadrado y 4 para triangulo");
        opcion = leer.nextInt();

        while ((opcion < 1) || (opcion > 4)) {
            System.out.println("Opción no válida");
            opcion=leer.nextInt();       
        }
        
        switch (opcion){
            case 1: 
                System.out.println("Introduzca radio: ");
                double radio;
                radio=leer.nextDouble();
                areaCirculo(radio);
                break;
                
            case 2:
                System.out.println("Introduzca base del rectangulo: ");
                System.out.println("Introduzca altura del rectangulo: ");
                int base, altura, arearec;
                base=leer.nextInt();
                altura=leer.nextInt();
                areaRectangulo(base,altura);
                break;
            case 3:
                System.out.println("Introduce lado del cuadrado: ");
                int lado;
                lado=leer.nextInt();
                areaCuadrado(lado);
                break;
            case 4:
                System.out.println("Introduce la base del triángulo: ");
                System.out.println("Introduce la altura del triángulo: ");
                int basetri,alturatri;
                basetri=leer.nextInt();
                alturatri=leer.nextInt();
                areaTriangulo(basetri,alturatri);
                break;
                     
        }
    }
        static void areaCirculo(double radio) {  
        double resultado;
        resultado=PI*pow(radio,2);
        System.out.println(resultado);
      
        }
        //Hay que poner el tipo de variable en la funcion otra vez, en cada una de ellas
        static void areaRectangulo(int base,int altura){
            int arearec;
            arearec=(base*altura);
            System.out.println(arearec);
        }
            
        static void areaCuadrado (int lado){
            int areacu;
            areacu=(lado*lado);
            System.out.println(areacu);
        }
        static void areaTriangulo (int basetri, int alturatri) {
            int areatri;
            areatri=(basetri*alturatri)/2;
            System.out.println(areatri);
        }       

}
    
    

