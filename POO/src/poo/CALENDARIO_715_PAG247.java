/*
 Diseña la clase Calendario que representa una fecha concreta (año,mes y dia). La clase debe disponer de los métodos:
Calendario (int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando 
la fecha que representen sea la correcta.
void incrementarDia();que incrementa en un dia la fecha del calendario.
void incrementarMes (); que incrementa en un mes la fecha del calendario.
void incrementarAño (int cantidad); que incrementa la fecha del calendario en el numero de años especificados. 
Ten en cuenta que el año 0 no existio.
void mostrar (); muestra la fecha por consola
boolean iguales(calendario otraFecha); que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.

Por simplicidad, solo tendremos en consideracion que existen meses con distinto numero de dias, pero no tendremos en cuenta los años bisiestos.
 */
package poo;

public class CALENDARIO_715_PAG247 {
    //Atributos
    
    private int año,mes,dia;
    String fecha;
    
    //Constructor //LLeva el modo de acceso, public o private
    public CALENDARIO_715_PAG247(int año ,int mes, int dia){
        this.año=año;
        this.mes=mes;
        this.dia=dia;
              //Por defecto los objetos serán con esta estructura
              //Este constructor asigna unos atributos a mi objeto y ese objeto tendra asignados unos atributos pasados como parámetros
}
    
    void incrementarDia(){
        this.dia=dia+1;// Estamos incrementando al atributo determinado en el constructor 1
    }
    void incrementarMes (){
        this.mes=mes+1;
    }
    void incrementarAño (int cantidad){ //A este, le sumará la cantidad que introduzcamos por parámetro en el main
       this.año=año+cantidad;
          
    }
    void mostrar (){
        System.out.println("La fecha es: " + this.dia + "/" + this.mes + "/" + this.año); //HAY QUE VER COMO METER OBJETOS
        
    }
    
    //ESTARÍA BIEN SABER COMO DIFERENCIAR LOS OBJETOS DENTRO DE UN MÉTODO (SE PUEDE LLAMAR A LOS OBJETOS DEL MAIN EN EL OBJETO PARA DIFERENCIAR FECHAS??)
//    String fecha(String fecha){
//       return this.fecha=fecha;
//    }?????¿¿¿¿¿?¿?¿?
    
    //BOOLEAN, entiendo que es para comprobar si la fecha es correcta
    
    public boolean fechaCorrecta(){
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = año > 0;
        mesCorrecto = mes >=1 && mes <= 12;
        
        switch (mes){
            case 2: 
                diaCorrecto = dia >= 1 && dia <= 28;
                //Para los bisiestos sería con un if
                //if(bisiesto()){
                //    diaCorrecto = dia >= 1 && dia <= 29;
                //}
                //else{
                //    diaCorrecto = dia >= 1 && dia <= 28;
                //}
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
     
    public static void main(String[] args) {
        CALENDARIO_715_PAG247 fecha1 = new CALENDARIO_715_PAG247(2022,2,5);
        //Esto es el objeto fecha 1 con la fecha con los valores determinados, luego en los metodos se incrementarán
        
        CALENDARIO_715_PAG247 fecha2 = new CALENDARIO_715_PAG247(2000,2,5); //Esto es el objeto fecha 2
        
        fecha1.mostrar();//Este metodo solo muestra
        fecha1.incrementarMes();
        fecha1.mostrar();// Ahora muestra la fecha con el mes incrementado en 1
        fecha1.incrementarAño(5);
        fecha1.mostrar(); //Ahora nos muestra la fecha con el año incrementado en 5 porque así es la cantidad que hemos indicado como parametro
        
        
        fecha2.incrementarDia();
        fecha2.incrementarMes();
        fecha2.incrementarAño(3);
        fecha2.mostrar();
        System.out.println("-----------------------------");
        fecha2.fechaCorrecta();
        fecha2.mostrar();
        
        
       
    }
}
