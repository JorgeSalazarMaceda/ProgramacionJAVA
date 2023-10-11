package Fecha;

import Fecha.Fecha;
import java.util.Scanner;

public class PruebaFecha {

    public static void main(String[] args) {
//        Fecha fecha = new Fecha(1, 1, 2022);
//        System.out.println(fecha.toString());
//        fecha.fechaCorrecta();
//    
//
//        Fecha fecha2 = new Fecha(34, 13, 2022);
//        System.out.println(fecha2);
//        fecha2.setAño(-2);
//        System.out.println(fecha2.fechaCorrecta());
//
//        Fecha fecha3 = new Fecha(31, 12, 2022);
//        fecha3.diaSiguiente();
//        System.out.println(fecha3);

        Fecha fecha5 = new Fecha(40,2,2021);
        System.out.println("La fecha 5: " +fecha5);
        System.out.println(fecha5.fechaCorrecta());
        fecha5.diaSiguiente();
        System.out.println("La fecha 5: " +fecha5);
        
        Fecha fecha6 = new Fecha (30,11,2021);
        fecha6.diaSiguiente();
        System.out.println(fecha6);
        
        Fecha fecha7= new Fecha (31,12,2021);
        fecha7.diaSiguiente();
        System.out.println(fecha7);
        
        
        Fecha fecha = new Fecha (31,12,2021);
        System.out.println("La fecha es: " +fecha);
        fecha.diaSiguiente();
        System.out.println("La fecha es: " +fecha);
        fecha.fechaCorrecta();
        System.out.println(fecha.fechaCorrecta()); //Aquí imprimirá true porque es correcta
        
        Fecha fecha2 = new Fecha (40,12,2021);
     
        if(!fecha2.fechaCorrecta()){ //Hago un if para comprobar con otra fecha creada, si fecha 2 no es correcta imprime incorrecto
            System.out.println("Incorrecto");
        }

        //Parte 3 de arrays
        Scanner sc = new Scanner(System.in);
        int tamano = 0;

        System.out.println("Dime cuantas fechas tiene tu array: ");
        tamano = sc.nextInt();

        Fecha[] array = new Fecha[tamano]; //El array es de objetos

        System.out.println("Dime las fechas e introducelas dentro de tu array. ");

        for (int i = 0; i < array.length; i++) {
            int dia, mes, ano;
            boolean isFechaCorrecta = true;
            Fecha fechaNueva = new Fecha(); //Creo un objeto de clase Fecha llamado fecha nueva, que guardará las fechas introducidas en el array
            do {  //Quiero que me pregunte nuevamente si he metido una fecha que no es correcta, es decir, que no cumple el metodo fechaCorrecta cuando lo llamo
                isFechaCorrecta = fechaNueva.fechaCorrecta();
                if (isFechaCorrecta) {
                    
                }
               
                //Creamos variables, las pedimos, y como tenemos el constructor con los parametros que nos ha dado el usuario, creamos el nuevo objeto fechaNueva.
                System.out.println("Dime el día: ");
                dia = sc.nextInt();
                System.out.println("Dime el mes: ");
                mes = sc.nextInt();
                System.out.println("Dime el año: ");
                ano = sc.nextInt();
                fechaNueva.setDia(dia);
                fechaNueva.setMes(mes);
                fechaNueva.setAño(ano);
                
            } while (!fechaNueva.fechaCorrecta());
            
            array[i] = fechaNueva;
            
            //Hemos pedido el tamaño, ahora con un bucle hemos recorrido el array pidiendo las fechas y con un do while 
            //(haciendo el llamado a fecha correcta) vemos si es correcta, si no que las vuelva a pedir.
            //Una vez tenemos las fechas, las metemos en el array con array[i] = fechaNueva;
           
        }
        
        //Ahora vamos a recorrer las fechas para ver cual es la menor
        
        //Cramos el objeto fechaMenor como primera posicion del array.
        //Hacemos el for para recorrerlo
        //Si la fechaMenor no es menor (con el llamado del metodo (fechaMenor)) que el de la posicion i del array, 
        //es que es mayor, y nos guardamos como fecha menor el de la posicion i del array.
        //Mostramos la fecha.
        
        //Lo mismo con el metodo fecha mayor.
        
        Fecha fechaMenor = array[0];
        Fecha fechaMayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if(!fechaMenor.isfechaMenor(array[i])) {
                fechaMenor = array[i];
            }
            if(!fechaMayor.isfechaMayor(array[i])) {
                fechaMayor = array[i];
            }
        }
        
        System.out.println("La fecha menor es: " + fechaMenor.toString());
        System.out.println("La fecha mayor es: " + fechaMayor.toString());
    }
}
