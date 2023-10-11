//EJERCICIO 6 //Calcular el area de poligonos con menu: 1 circulo, 2 rectangulo,3cuadrado y 4 triangulo;
package pkg1;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Introduzca el nº 1 para circulo");
        System.out.println("Introduzca el nº 2 para rectángulo");
        System.out.println("Introduzca el nº 3 para cuadrado");
        System.out.println("Introduzca el nº 4 para triangulo");
        opcion = leer.nextInt();
        //Comenzamos con un scanner. El primer problema es hacer el menú.
        //Abrimos la variable opción, damos las instrucciones del menú al usuario y le decimos al programa que el usuario va a introducir ese dato
        //En un principio, previendo el error de usuario puse un if con ((opcion < 1) || (opcion > 4)). Después, vi que era mejor poner un while con scanner
        //Despues, una vez el usuario introduce la opción deseada, con un switch case, dará automáticamente la opción del polígono deseado
        //Cada poígono tendrá sus variables y pedirá sus instrucciones precisas para que el usuario las introduzca y con sus formulas calcula el área

        while ((opcion < 1) || (opcion > 4)) {
            System.out.println("Operacion no valida");
            opcion=leer.nextInt();
        }
        switch (opcion) {
            case 1:
                double radiocirculo,
                 pi,
                 area;

                System.out.println("dame el radio del circulo:");
                radiocirculo = leer.nextInt();

                pi = 3.14;
                area = pi * (radiocirculo * radiocirculo);
                System.out.println("El area del circulo es:" + area);
                break;

            case 2:

                double baserec,
                 alturarec,
                 arec;
                //* pongo arec para que no confunda area de otros problemas
                System.out.println("Digame la base del rectángulo");
                baserec = leer.nextDouble();

                System.out.println("Digame la altura del rectángulo");
                alturarec = leer.nextDouble();

                arec = baserec * alturarec;

                System.out.println("El area del rectángulo es:" + arec);

                break;

            case 3:

                double lado,
                 areacu;

                System.out.println("Digame el lado del cuadrado ");
                lado = leer.nextDouble();

                areacu = lado * lado;

                System.out.println("El area del cuadrado es: " + areacu);

                break;

            case 4:

                double basetri,
                 alturatri,
                 atri;

                System.out.println("Digame la base del triángulo ");
                basetri = leer.nextDouble();

                System.out.println("Digame la altura del triángulo ");
                alturatri = leer.nextDouble();

                atri = basetri * alturatri / 2;

                System.out.println("El area del rectangulo es:" + atri);

                break;

        }
    }
}
