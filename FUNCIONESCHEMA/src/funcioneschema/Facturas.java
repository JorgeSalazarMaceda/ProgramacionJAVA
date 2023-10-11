//Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.

//En cada factura figura:
//- Cod articulo
//- Cantidad vendida en litros
//- Precio por litro

//Se pide introducir 5 facturas y calcular:
//- Facturación total
//- Cantidad en litros vendidos del articulo 1
//- Cuantas facturas se emitieron de más de 600€
package funcioneschema;

import java.util.Scanner;

public class Facturas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String codigo;
        int cantidad;
        double precio, precioTotal = 0;
        int cantidadArticulo1 = 0;
        int numfacturas = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Introduce factura " + (i + 1) + ": ");
            codigo = leer.next();

            System.out.print("   Introduce cantidad vendida en litros: ");
            cantidad = leer.nextInt();
            System.out.print("   Introduce precio por litro: ");
            precio = leer.nextDouble();

            precioTotal = calcularPrecioTotal(precioTotal, precio, cantidad);

            cantidadArticulo1 = calcularCantidadArticulo1(cantidad,i, cantidadArticulo1);
            
            numfacturas=facturasMayor600(precio,cantidad,numfacturas);
        }
        System.out.println("La factura total es: " + precioTotal);
        System.out.println("La cantidad articulo 1: " + cantidadArticulo1);
        System.out.println("La facturas que superan los 600 euros son : " + numfacturas);
    }

    public static double calcularPrecioTotal(double precioTotal, double precio, int cantidad) {
        return precioTotal + (precio * cantidad); // Punto 1 que es la facturación total.
    }

    public static int calcularCantidadArticulo1( int cantidad, int posicion, int cantidadArticulo1) {
        if (posicion == 0) {
            return cantidad;// Punto 2 que es la cantidad de litros vendidos de art 1.
        } else {
            return cantidadArticulo1;// Hay que ponerlo para el caso de que i!=0. Y devolvemos la cantidad que ya teníamos acumulada.
        }
    }

    public static int facturasMayor600(double precio,int cantidad,int numfacturas) {
        if (precio * cantidad > 600) {
                numfacturas++; // Punto 3 que es la cantidad de facturas que superan 600 euros.
            }
        return numfacturas;
    }
}
