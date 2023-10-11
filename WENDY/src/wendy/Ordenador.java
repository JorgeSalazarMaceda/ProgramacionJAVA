/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wendy;

/**
 * Clase Aula5 En la clase hay ordenadores con un botón de encendido y apagado,
 * y además hay un interruptor general para el aula. Una ordenador se enciende
 * si su interruptor y el general del aula están activados. Escribe una clase de
 * nombre Aula5 que recoja estas casuísticas con los siguientes métodos: 1.
 * Pulsar el interruptor de un ordenador 2. Pulsar la general del aula 3. Saber
 * si un ordenador está encendido o no Ampliación del ejercicio: Cada ordenador
 * puede tener un consumo eléctrico distinto. Al encender cada ordenador, el
 *
 *
 * consumo se incrementa según la potencia que tenga ese ordenador. Al apagarlo,
 * se reduce el consumo. Hay que saber según los ordenadores que estén
 * encendidos el consumo total del aula.
 */
public class Ordenador {

    /*-------------------------------ATRIBUTOS ---------------------------------------*/
    //Interruptor del ordenador 
    boolean interruptor_orde = false;
    int potencia;
    int consumo = 0;
    //Atributo de clase
    //Interruptor General
    static boolean interruptor_general = false;
    static int consumoAula = 0;

    /*-------------------------------CONSTRUCTORES ---------------------------------------*/
    public Ordenador(int pot) {
        this.potencia = pot;
    }

    public Ordenador() {
        this.potencia = 50;
    }

    public static int getConsumoAula() {
        return consumoAula;
    }

    public static void setConsumoAula(int consumoAula) {
        Ordenador.consumoAula = consumoAula;
    }

    
    public int getConsumo() {
        return (int) consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
      public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    

    /*-------------------------------MÉTODOS----------------------------------------------*/
 /*    ENCENDER GENERAL         */
    public boolean EncenderGeneral() {
        if (!interruptor_general) {
            System.out.println("Encendiste el interruptor general. ");
            interruptor_general = true;

        } else {
            System.out.println("Ya encendiste el interruptor general.");
        }

        return interruptor_general;
    }

    /*    APAGAR GENERAL         */
    public boolean ApagarGeneral() {
        System.out.println("Has apagado el interruptor general.");
        interruptor_orde = false;
        return interruptor_general = false;
    }

    /*      APAGAR ORDENADOR        */
    public boolean ApagarOrdenador() {

        System.out.println("Apagaste el ordenador.");
        interruptor_orde = false;
        this.consumo = 0;

        return interruptor_orde;
    }

    /*       ENCENDER ORDENADOR        */
    //Encender ordenador solo cuando este activo el interruptor general 
    public boolean EncenderOrdenador() {

        if (interruptor_general == true) {
            System.out.println("Ha encendido el ordenador.");
            interruptor_orde = true;
            this.consumo = potencia * 10;
            consumoAula += consumo;

        } else {
            System.out.println("No se puede encender el ordenador, enciende el nterruptor general primero.");
            interruptor_orde = false;
        }
        return interruptor_orde;
    }

    /*       CONSUMO TOTAL       */
    public void consumoTotal() {
        System.out.println("El consumo general es de: " + consumoAula);
    }

    /*      ESTADO DE ORDENADOR       */
    //Estado en el que esta un ordenador, encendido o apagado 
    public void estadoOrdenador() {
        if (interruptor_orde == true) {
            System.out.println("El ordenador está encendido.");
        } else {
            System.out.println("El ordenador está apagado.");
        }
    }

    /*----------------------------------MÉTODO toString----------------------------------------------*/
    public String toString() {
        return "Interruptor general: " + interruptor_general + " Interruptor Ordenador: " + interruptor_orde + "consumo general: " + consumoAula + "\n";
    }
}

/*
void general(){
    
    if(general==false){
        general=true;
        System.out.println("El interruptor general esta encendido");
    }else{
        general=false;
        encenderInterruptor=false;
        this.consumo=0;
        consumoTotalAula=0;
        System.out.println("El interruptor general esta apagado");  
    }
}
  void interruptor(){
     
       if(encenderInterruptor==false && general==true){
           encenderInterruptor=true;
           this.consumo=potencia*2;
           consumoTotalAula=+this.consumo;
        System.out.println("Encendemos el boton del ordenador");
                
    }else{
        encenderInterruptor=false;
        this.consumo=0;
        System.out.println("El interruptor del ordenador esta apagado");
    }
  }
  
 void encenderOrdenador(){
     
     if(encenderInterruptor==true ){
        System.out.println("El ordenador se ha encendido");
        
        }else{
        System.out.println("El ordenador esta apagado");
     }
 */

 /*public void interruptor(){
     
       if(encenderInterruptor==false && general==true){
           encenderInterruptor=true;
           this.consumo=potencia*2;
           consumoTotalAula=+this.consumo;
        System.out.println("Encendemos el boton del ordenador");
                
    }else{
        encenderInterruptor=false;
        this.consumo=0;
        System.out.println("El interruptor del ordenador esta apagado");
    }*/
