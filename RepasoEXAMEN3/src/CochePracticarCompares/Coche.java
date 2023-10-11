/*
Compara por num pasajeros y por matrícula.
 */
package CochePracticarCompares;

/**
 *
 * @author Jorge
 */
public class Coche implements Comparable <Coche>{
    private int numPasajeros;
    private String marca;
    private String matricula;
    
    public Coche (int numPasajeros, String marca, String matricula){
    this.numPasajeros = numPasajeros;
    this.marca = marca;
    this.matricula = matricula;
    }
    
    public Coche (){
    this.numPasajeros = 5;
    this.marca = "Seat";
    this.matricula = "XXXXX";
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int compareTo(Coche a){
        return this.numPasajeros - a.numPasajeros;
    }
    
//      public int compareTo(Coche a){
//        return this.marca.compareToIgnoreCase(marca);
//    }
    
    public String toString(){
        return "Los pasajeros: " + numPasajeros + " La marca: " + marca + " La matricula: " + matricula + "\n";
    }

}
