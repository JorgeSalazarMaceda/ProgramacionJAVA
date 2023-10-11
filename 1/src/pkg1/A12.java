//EJERCICIO 12 //SE INTRODUCE UNA CONTRASEÑA EN EL CODIGO. POR TECLADO SE PIDE QUE SE INTRODUZCA UNA CONTRASEÑA.
//HASTA QUE NO SE INTRODUZCA LA MISMA SEGUIRÁ PREGUNTÁNDOLA.
package pkg1;

import java.util.Scanner;

public class A12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//OTRA FORMA CON IF HECHA POR SALVA  
//        String contraseña = "Lucas";
//        
//        System.out.println("Por favor,introduzca su contraseña: ");
//        String contraseña_usuario=leer.nextLine();
//        
//        if(contraseña_usuario.equalsIgnoreCase(contraseña))
//        System.out.println("Son iguales");
//        else System.out.println("Son distintos");

        String contraseña = "Lucas";
        String usuario = " ";
        System.out.println("Por favor,introduzca su contraseña: ");
        usuario = leer.nextLine();
        //Se declaran las variables String contraseña (lucas) y otra en blanco que es la que introducirá el usuario por Scanner
        //Hacemos un bucle while (porque el usuario puede equivocarse infinitas veces) donde si el usuario introduce algo distinto a (equals) contraseña saldrá error
        while (!usuario.equals(contraseña)) {
            System.out.println("Error, introduza la contraseña correcta");
            usuario = leer.nextLine();
            //PUEDES PONER LA ! ANTES DE LA CONTRASEÑA O AL FINAL EL == FALSE.
            //LA IDEA ES DECIR QUE MIENTRAS USUARIO META UNA CONTRASEÑA INCORRECTA, SIEMPRE SALTARÁ EL BUCLE DE INCORRECTO
            //SI PUSIERA equalsIgnoreCase DARIA IGUAL QUE LUCAS FUERA EN MAYUSCULA LA L
        }

        if (usuario.equals(contraseña)) {
            System.out.println("Su contraseña es correcta");
            //Si el usuario acierta (if usuario = (equals) contraseña. La contraseña es correcta
            
        }
        
////          C O N       C H A R A T
//        
//
//        String contraseña = "Lucas";
//        String usuario = " ";
//        System.out.println("Por favor,introduzca su contraseña: ");
//        usuario = leer.nextLine();
//        //Se declaran las variables String contraseña (lucas) y otra en blanco que es la que introducirá el usuario por Scanner
//        //Hacemos un bucle while (porque el usuario puede equivocarse infinitas veces) donde si el usuario introduce algo distinto a (equals) contraseña saldrá error
//        while (usuario.charAt(0) != contraseña.charAt(0)) {
//            System.out.println("Error, introduza la contraseña correcta");
//            usuario = leer.nextLine();
//        }
//
//        if (usuario.equals(contraseña)) {
//            System.out.println("Su contraseña es correcta");
//            //Si el usuario acierta (if usuario = (equals) contraseña. La contraseña es correcta
//            
//        }
        
        
//          C O N          F O R

//        for (int i = 0; i < 10; i++) {
//            if (!usuario.equalsIgnoreCase(contraseña)) {
//                System.out.println("Introduce contraseña");
//                usuario = leer.next();
//            }
//        }
//        if (usuario.equalsIgnoreCase(contraseña)) {
//            System.out.println("Contraseña correcta");
//        }
        
//        C O N      D O      W H I L E
//
//        do {
//            System.out.println("Introduce contraseña");
//            usuario = leer.next();
//
//        } while (!usuario.equalsIgnoreCase(contraseña));
//
//        if (usuario.equalsIgnoreCase(contraseña)) {
//            System.out.println("Acertaste!!!");
//        }
        
    }
    
}
