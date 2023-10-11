/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Agenda {
//Declaraciones
    private static final String RUTA_FICHERO = "C:\\Users\\Jorge\\Documents\\NetBeansProjects\\Excepciones\\agenda.txt";
    
    private File archivo; //Declaramos la variable file de archivo

    //Elementos para escribir (archivo fuera) y leer (in).
    private BufferedReader in = null;
    private BufferedWriter out = null;

    private Contacto[] contactos; //Array de contactos (de la clase Contacto)
    private int numContactos = 0; //Variable para el contador de contactos.

//Constructor
    public Agenda() {
        this.contactos = new Contacto[20]; //El array de contactos será de 20 posiciones en el constructor
        archivo = new File(Agenda.RUTA_FICHERO); //La variable archivo 
        if(archivo.exists()){
            try {
                in = new BufferedReader(new FileReader(archivo));
                String linea = null;
                String nombre = "";
                int telefono = 0;
                while ((linea = in.readLine()) != null) { // Recorremos todas las líneas del fichero hasta que devuelva null (Ya no hay más posiciones)
                    if (linea.contains("Nombre:")) { // Si la línea contiene Nombre:, es que estamos en la línea con el nombre
                        nombre = linea.replace("Nombre: ", ""); // Quitamos el texto Nombre: y se reemplaza solo por el contacto.
                    }
                    if (linea.contains("Tel:")) { // Lo mismo para el telefono
                        telefono = Integer.parseInt(linea.replace("Tel: ", "")); //Para analizar un argumento del método String en un objeto Integer.
                    }
                    if (linea.equals("--")) { // Si estamos leyendo '--' entonces hemos terminado de leer el contacto
                        Contacto contacto = new Contacto(nombre, telefono); // Creamos el objeto contacto con el nombre y telefono que hemos leído
                        contactos[numContactos]=contacto; // Lo añadimos a nuestro array de contactos
                        numContactos++; // Incrementamos nuestra variable de número de contactos.
                    }
                }
                
            } catch (FileNotFoundException ex) {
                System.out.println("No ha encontrado el fichero" + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("No ha encontrado el fichero" + ex.getMessage());
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException ex) {
                        System.out.println("Error al cerrar el fichero" + ex.getMessage());
                    }
                }
            }
        }
    }

    //Metodos
    //Menu 1
    public void anadirContacto(Contacto cont) {

        try {
            
            //Usamos el metodo de existeContacto para decir que si existe, no se añada, si no, procede a añadir
            //Si la agenda no está llena, mete contacto.
            if (existeContacto(cont)) {
                System.out.println("El contacto con ese nombre ya existe");
            } else if (agendaLlena()) {
                System.out.println("La agenda está llena y no se pueden meter mas contactos");
            } else {
                contactos[numContactos] = cont;
                numContactos++;
            }
        } catch (IOException e) { //Por la entrada
            System.out.println("La excepción mas concreta sería: " + e.getMessage());
        } catch (Exception e) { //Excepción más genérica
            System.out.println("lgo fue mal, la excepción" + e.getMessage());
        }
    }

    //Metodo para ver si está llena, si es null false (no esta llena) si no es null return true
    public boolean agendaLlena(){
        return numContactos == 20;
    }

    //Metodo para comprobar si el contacto ya existe.
    public boolean existeContacto(Contacto cont) throws FileNotFoundException {

        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].equals(cont)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarContacto(Contacto cont) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(cont)) {
                contactos[i] = null;
                encontrado = true;
            }
        }
    }

    //Menu 2
    public void buscarContacto(String nombre) {
        for(int i = 0; i < numContactos; i++) {
            if (contactos[i].nombre.toLowerCase().contains(nombre.toLowerCase())) { //Ponemos toLowerCase para que en el momento de la busqueda con contains (por el equals) localice todo con minúsculas
                System.out.println("Encontrado: " + contactos[i].nombre + " - " + contactos[i].telefono);
            }
        }
    }

    //Menu 3
    //Muestra todos los contactos de tu lista
    public void listado() {
        
        ordenarBurbuja();
        for (int i = 0; i < numContactos; i++) {
            System.out.println(contactos[i]);
        }
    }
    
    private void ordenarBurbuja() {
        Contacto tmp;
        for (int i = 0; i < numContactos - 1; i++) {
            for (int j = 0; j < numContactos - 1; j++) {
                if (contactos[j].nombre.toLowerCase().compareTo(contactos[j + 1].nombre.toLowerCase()) > 0) { //Ordena Strings con compareTo y usando toLowerCase para evitar el problema de las mayusculas
                    tmp = contactos[j];
                    contactos[j] = contactos[j + 1];
                    contactos[j + 1] = tmp;     
                }
            } 
        }
    }
    
    //Menu 4
    public void guardarSalir() { //Directamente escribimos en este método.
        
        try {
            out = new BufferedWriter(new FileWriter(archivo));
            for(int i = 0; i < numContactos; i++) {
                out.write("Nombre: " + contactos[i].nombre);
                out.newLine();
                out.write("Tel: " + contactos[i].telefono);
                out.newLine();
                out.write("--");
                out.newLine();
            }
            out.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            
        }
        
    }
}

//    FALLOS E INTENTOS

//metodo 1 
//                boolean encontrado = false;  //Estamos añadiendo, por lo que hay que buscar si es null (si no está)
//                for (int i = 0; i < contactos.length; i++) {
//                    if (contactos[i] == null) {
//                        
//                        contactos[i] = cont;
//                        encontrado = true;
//                        out.newLine();
//                        out.write(String.valueOf(contactos[i]));//out.write es para escribir dentro del array y hacemos el cambio, 
//                                                                //porque es un array de objetos y necesitamos cambiarlo a String
//                        System.out.println("Se añadió el contacto");
//                        out.close();
//                    }
//                    else{ 
//                    System.out.println("No se ha podido añadir");
//                }
//                    } 


// metodo 2
//        try {
//            boolean encontrado = false; //En una busqueda siempre es bueno decir si se ha encontrado o no.
//            in = new BufferedReader(new FileReader(archivo));
//            for (int i = 0; i < contactos.length && !encontrado; i++) {//!encontrado seria true (encontrado). Entonces deja de buscar ya y dime que lo has encontrado.
//                if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
//                    System.out.println("El teléfono es: " + contactos[i].getTelefono());
//                    encontrado = true;
//                    // REVISAR SI VA DENTRO DEL IF EL BUFFEREDREADER O NO
//                }
//            }
//            in.close();
//        } catch (IOException e) { //Por la entrada
//            System.out.println("IO Exception: " + e.getMessage());
//        } catch (Exception e) { //Excepción más genérica
//            System.out.println("Exception: " + e.getMessage());
//        }