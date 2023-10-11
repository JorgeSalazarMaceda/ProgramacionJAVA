
package maquinaria;
import personal.Mecanico; //Importamos del paquete personal, la clase mecanico para hacer uso de ella, de sus atributos y constructores
public class Locomotora {
    String matricula;
    int potencia;
    int añoFabricación;
    
    Mecanico mec; // Hacemos uso de los atributos mecanico
    public Locomotora (String matricula, int potencia, int añoFabricación,Mecanico mec){
    this.matricula = matricula;
    this.potencia = potencia;
    this.añoFabricación = añoFabricación; 
    this.mec = mec;
    }
}
