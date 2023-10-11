/*
La interfaz ICalculadora tiene 4 métodos para efectuar operaciones aritméticas dados
dos valores de tipo double:
• suma
• resta
• multiplica
• divide
La interfaz ICalculadoraMemoria hereda de ICalculadora. Nos permite utilizar la
memoria para realizar las operaciones.
Añade los siguientes métodos:
• sumaMemoria (recibe un double) //Recibe un parametro
• restaMemoria (recibe un double)
• resetMemoria (limpia la memoria)
• getMemoria: devuelve el valor acumulado
• getValores: devuelve el número de valores acumulados en la memoria.
Clase Calculadora que implementa las interfaces ICalculadora y ICalculadoraMemoria.
Los atributos de la clase Calculadora:
• Valor acumulado en memoria
• Número de valores que se han sumado o restado
Escribe un programa principal que utilice todas las funcionalidades de estas interfaces.
 */
package calculadorainterfaces;

/**
 *
 * @author Jorge
 */
public class Calculadora implements ICalculadora, ICalculadoraMemoria {

    //Atributos 
    protected static double acumulado_memoria = 0;
    protected static int contadorValores = 0;
    
    
    public double Suma(double a, double b) {
        double suma;
        suma = a + b;
        return suma;
    }

    public double Resta(double a, double b) {
        double resta;
        resta = a - b;
        return resta;
    }

    public double Multiplicacion(double a, double b) {
        double multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }

    public double Division(double a, double b) {
        double division;
        division = a / b;
        return division;
    }

    //Métodos de Calculadora Memoria
    public void SumaMemoria(double numero) {

        this.acumulado_memoria += numero;
        this.contadorValores++;
    }

    public void RestaMemoria(double numero) {
        this.acumulado_memoria -= numero;
        this.contadorValores++;
    }

    public void ResetMemoria() {
        this.acumulado_memoria = 0;
        this.contadorValores = 0;
    }

    public String getMemoria() { //Pongo String para que en el return se nos permita retornar la cadena de caracteres, si no
        return "Valor memoria actual: " + this.acumulado_memoria;
    }

    public String getValores() {
        return "Nº valores utilizados: " + this.contadorValores;
    }
    
    //To string
   public String toString() {
        System.out.println("");
        String cadena = "\n------------------------------------------"; //\n es salto de linea \t es tabular.
        cadena += "\nAcumulado en memoria: " + this.acumulado_memoria;
        cadena += "\nTotal de valores: " + this.contadorValores;
        cadena += "\n------------------------------------------";
        return cadena;
    }
}
