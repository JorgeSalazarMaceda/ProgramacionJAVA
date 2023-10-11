/*
En la clase hay ordenadores con un botón de encendido y apagado, y además hay un
BotonPC general para el aula.
Una ordenador se enciende si su BotonPC y el general del aula están activados.
Escribe una clase de nombre Aula5 que recoja estas casuísticas con los siguientes
métodos:
1. Pulsar el BotonPC de un ordenador
2. Pulsar la general del aula
3. Saber si un ordenador está encendido o no
Ampliación del ejercicio: Cada ordenador puede tener un consumo eléctrico distinto. Al
encender cada ordenador, el consumo se incrementa según la potencia que tenga ese
ordenador. Al apagarlo, se reduce el consumo.
Hay que saber según los ordenadores que estén encendidos el consumo total del aula.
 */
package aula;

/**
 *
 * @author Jorge
 */
public class Aula5 {
    

    //atributos
    private static boolean general;
    private boolean BotonPc;
    private Ordenadores[] pc;
    private int consumo;
        
    //Constructor con parametro para el numero de ordenador
    public Aula5(int a) {
        general = false;
        BotonPc = false;
        pc = new Ordenadores[a];
        for (int i = 0; i < pc.length; i++) {
            pc[i]=new Ordenadores();
        }
    }

    public static boolean General() {
        return general;
    }
    
    //metodos
    //El general del aula está como apagado y al invocar al metodo cambiará de estado
    void general() {

        if (!general) {
            general = true;
            System.out.println("General encendido");
        } else {
            general = false;
            System.out.println("General apagado");
        }
    }
    //El de los botones del ordenador
    void BotonPC(int i){
      if(general){
         pc[i].calculaConsumoPC();
      }
  } 

//    void Resultado() {
//
//        if (general == true && BotonPc == true) {
//            System.out.println("El ordenador se ha encendido");
//        } else if (general == true && BotonPc == false) {
//            System.out.println("Hay corriente pero no has encendido el ordenador");
//        } else if (general == false && BotonPc == true) {
//            System.out.println("Has intentado encender el ordenador pero no hay corriente");
//        } else {
//            System.out.println("El ordenador esta apagado");
//        }
//    }
    
     void Resultado (int i){
         if(general==false){
             System.out.println("Sin corriente");
         }else if(general==true && pc[i].getBotonPC()==true){
             System.out.println("Ordenador número:" + i + " Encendido");
         }else if(general==true && pc[i].getBotonPC()==false){
             System.out.println("Ordenador número:" + i + " Apagado");
         }
     }

    void MostrarSistema() {
        System.out.println("El alula está: " + general);
        System.out.println("El ordenador está: " + BotonPc);
    }
      //Ampliación del ejercicio
    public int totalConsumo(){
        int totalConsumo=0;
        for(int i=0;i<pc.length;i++){
            totalConsumo += pc[i].getConsumo();
        }
        return totalConsumo;
}
}
