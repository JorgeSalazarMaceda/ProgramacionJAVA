//CALCULAR EL AREA DE POLIGONOS CON MENU Y FUNCIONES: 1 CIRCULO, 2 RECTANGULO, 3 CUADRADO Y 4 TRIANGULO.
package funcionespoligonos;
import java.util.Scanner;
public class Funcionespoligonos
{



    public static void main(String[] args)
    {
      int opcion;
      double resultado1, resultado2, resultado3, resultado4;
      Scanner leer=new Scanner(System.in);
        System.out.println("Introduce número 1 para area circulo, 2 para rectángulo,3 para cuadrado y 4 para triangulo: ");
        opcion=leer.nextInt();
        
        while ((opcion<1) || (opcion>4)){
            System.out.println("Opción no válida");
        }
       switch (opcion){
           case 1:
               System.out.println("circulo");
               System.out.println("introduce radio");
               double radio, pi,areacir;
               radio=leer.nextInt();
               pi=3.14;
               areacir=pi*(radio*radio);
               break;
               
           case 2:
               System.out.println("rectangulo");
               int base,altura,arearec;
               System.out.println("introduce la base");
               base=leer.nextInt();
               System.out.println("introduce la altura");
               altura=leer.nextInt();
               arearec=base*altura;
               System.out.println(arearec);
               
               break;
               
           case 3:
               System.out.println("cuadrado");
               int lado,areacu;
               
               System.out.println("introduce lado en cm");
               lado=leer.nextInt();
               areacu=lado*lado;
               System.out.println(areacu);
               
               break;
               
           case 4:
               System.out.println("triangulo");
               
               
               break;
           
       }
    }
    
    
}
