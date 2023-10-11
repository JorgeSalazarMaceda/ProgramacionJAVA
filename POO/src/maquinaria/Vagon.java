
package maquinaria;

class Vagon { //Visibilidad por defecto (Le hemos quitado el public). Solo visible por clases vecinas.
    
    //Atributos
    int numIdentificativo;
    int cargaMax; // En kg
    int cargaActual;
    String mercancia;
    
    //Constructor
    public Vagon (int numIdentificativo, int cargaMax, int cargaActual, String mercancia) {
     this.numIdentificativo = numIdentificativo;
    this.cargaMax = cargaMax; 
    this.cargaActual = cargaActual;
    this.mercancia = mercancia;
    }
}
