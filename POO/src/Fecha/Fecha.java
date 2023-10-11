/*
1. Crear una Clase Fecha con las siguientes indicaciones:
• Tres atributos privados dia, mes y año de tipo entero.
• Constructor por defecto.
• Constructor con tres parámetros para crear objetos con valores iniciales.
• Métodos set y get para cada atributo.
• Método fechaCorrecta(). Devuelve un valor de tipo boolean indicando si la
fecha es correcta o no. Este método a su vez utilizará un método privado de la
clase llamado esBisiesto.
• Método esBisiesto: comprueba si el año es bisiesto. Devuelve un valor de tipo
boolean, indicando si el año es bisiesto o no.
• Método diaSiguiente(): Cambia la fecha actual por la del día siguiente. El objeto
de la clase Fecha al que se le aplique este método deberá quedar siempre en
un estado consistente, es decir, la nueva fecha deberá ser correcta.
• Modificar el método toString()para mostrar las fechas de la forma dd-mm-aaaa
2. Crear una Clase PruebaFecha con método main que haga uso de la clase
Fecha, haciendo uso de los métodos públicos que tiene la clase
3. Modificar la clase PruebaFecha usando arrays
• El usuario elige por teclado el tamaño de una matriz unidimensional.
• En esa matriz, se guardarán objetos de esa clase Fecha.
• El usuario irá introduciendo por teclado distintas fechas y se almacenarán en el
array, siempre y cuando las fechas tengan formato correcto.
• Una vez introducidas las fechas hay que decir cuál es la menor fecha que se
haya introducido y la mayor.
 */
package Fecha;

/**
 *
 * @author Jorge
 */
public class Fecha {
    //Atributos
    private int dia, mes, año;
    
    //Constructor sin parámetros (Por defecto)
    public Fecha (){
        this.dia=1;
        this.mes=1;
        this.año=2022;
    }
    // Constructor con parámetros //Esto es una sobrecarga de constructores
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
   //Setters
   public void setDia (int dia){
       this.dia = dia;
   }
   
   public void setMes (int mes){
       this.mes =mes;
   }
   
    public void setAño (int año){
       this.año =año;
   }
    
    //Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    
   public boolean fechaCorrecta(){
        boolean diaCorrecto, mesCorrecto, añoCorrecto; //Hacemos variables locales
        añoCorrecto = año > 0;
        mesCorrecto = mes >=1 && mes <= 12; //Se indica que hay 12 meses para que el default sepa donde terminar
        
        switch (mes){
            case 2: //Febrero
                //Para los bisiestos sería con un if
                if(this.esBisiesto()){
                    diaCorrecto = dia >= 1 && dia <= 29;
                }
                else{
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
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
    private boolean esBisiesto(){ //Se define el metodo es bisiesto a parte, pero los usas dentro del metodo fechaCorrecta
        return (año % 4 == 0) && (año % 100 != 0 || año % 400 == 0); //Formula sacada de microsoft para saber si es bisiesto.
    }
    
    public void diaSiguiente(){
        dia++;
        if(!fechaCorrecta()){ //Si la fecha no es correcta, tenemos el dia 1 e incrementamos el mes
            dia=1;
            mes++;
            if(!fechaCorrecta()){ // Si es diciembre, para evitar el mes 13, otro if anidado, iniciamos el mes y aumentamos año
                mes=1;
                año++;
            }
        }
    }
    
    @Override
    public String toString() { //Inicializamos los String con las comillas (funcionaria igual, pero es buena practica)
        //Si dia es < que 10, el formato de dia será 0 mas el dia, si no, espacio en blanco mas el dia
        
        String diaFormat = "";
        if (dia < 10) {
            diaFormat = "0" + dia;
        } else {
            diaFormat = "" + dia;
        }
        
//        dia < 10 ? "0" + dia : dia;
        
        String mesFormat = "";
        if (mes < 10) {
            mesFormat = "0" + mes;
        } else {
            mesFormat = "" + mes;
        }
        
        String anoFormat = "";
        if (año < 10) {
            anoFormat = "000" + año;
        } else if (año < 100) {
            anoFormat = "00" + año;
        } else if (año < 1000) {
            anoFormat = "0" + año;
        } else {
            anoFormat = "" + año;
        }
        
        return diaFormat + "-" + mesFormat + "-" + anoFormat;
    }
    
//    public String toString(){ El metodo toString
//    return "" + dia + "" + mes + "" + año;
//}
    public boolean isfechaMenor (Fecha fecha){ //La clase funciona como el tipo.
        if(this.año<fecha.getAño()){ //Si el año que tenemos en la clase es menor return true. Si no, es mayor o igual y en este caso hay que ver el mes
            return true;
        }
        else if (this.mes<fecha.getMes()){ 
            return true;
        }
        else if (this.dia<fecha.getDia()){ 
            return true;
        }
        else{
            return false;
        }
        //Este metodo lo que hace es ver si la fecha de la clase es menor que la fecha introducida.
    }
    
    public boolean isfechaMayor (Fecha fecha){ //La clase funciona como el tipo.
        if(this.año>fecha.getAño()){ //Si el año que tenemos en la clase es mayor return true. Si no, es menor o igual y en este caso hay que ver el mes
            return true;
        }
        else if (this.mes>fecha.getMes()){ 
            return true;
        }
        else if (this.dia>fecha.getDia()){ 
            return true;
        }
        else{
            return false;
        }
        //Este metodo lo que hace es ver si la fecha de la clase es mayor que la fecha introducida.
    }
}
