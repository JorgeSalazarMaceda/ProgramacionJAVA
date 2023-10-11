package PracticasEvaluablesPoo.Coche;

/*
Realice un programa que utilice los vehículos.
• Crear un array de coches eléctricos y mostrar el consumo total con la
variable de clase.
• Crear un array de coches de combustible y mostrar el consumo total con
la variable de clase.
• Crear un array de coches que mezcle coches, coches eléctricos y coches
de combustible y utilizar los métodos de acción arrancar, detenerse,...
• Recorrer el array de coches mezclados y mostrar el precio total de los
coches introducidos.

/**
 *
 * @author Jorge
 */
public class Taller2 {

    public static int consumoTotal(Coche[] coches) {
        int consumoTotalCoches = 0;
        for (int i = 0; i < coches.length; i++) {
            System.out.println("El consumo del coche: " + (i +1)+ " : " + coches[i].getConsumoTotal());
            consumoTotalCoches += coches[i].getConsumoTotal();
        }
        return consumoTotalCoches;
    }

    public static void main(String[] args) {

        Electrico[] cochesElectricos = new Electrico[3];
        cochesElectricos[0] = new Electrico(1, 10);
        cochesElectricos[1] = new Electrico(2, 10);
        cochesElectricos[2] = new Electrico(4, 10);

        System.out.println("El consumo total de todos los coches eléctricos es: " + consumoTotal(cochesElectricos));

        Combustible[] cochesFosiles = new Combustible[3];
        cochesFosiles[0] = new Combustible("diesel", 10);
        cochesFosiles[1] = new Combustible("diesel", 20);
        cochesFosiles[2] = new Combustible("gasolina", 40);

        System.out.println("El consumo total de todos los coches de combustibles fósiles es: " + consumoTotal(cochesFosiles));

        Coche[] cochesVariados = new Coche[2]; //Vamos a utilizar de la clase coche las propiedades para que las usen electrico y combustible
        cochesVariados[0] = new Electrico(1, 10);
        cochesVariados[1] = new Combustible("gasolina", 40);

        for (int i = 0; i < cochesVariados.length; i++) {
            
            cochesVariados[i].arrancar(); //Cogerá el metodo de electrico
            cochesVariados[i].acelerar();
            cochesVariados[i].frenar();
            cochesVariados[i].detenerse();
            System.out.println("El precio total del coche: " + (i+1) + " : " + cochesVariados[i].verPrecio());
            System.out.println("------------------");
            
           
        }
    }
}
