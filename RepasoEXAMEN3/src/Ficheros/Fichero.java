/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Fichero {
    public static void main(String[] args) {
//        
//      Fichero lectura = new Fichero();
//      
//        try {
//            lectura.leer();
//        } catch (IOException ex) {
//           System.out.println(ex.getLocalizedMessage());
//            System.out.println("Error al leer el fichero");
//        }
        
        String texto = "";
        FileReader in = null;
        
        try{
            in = new FileReader("C:\\Users\\Jorge\\Documents\\NetBeansProjects\\RepasoEXAMEN3\\src\\Ficheros\\fichero.txt");
            int c = in.read();    //read() devuelve un entero
            while (c != -1) {    // -1 = fin del archivo
                texto = texto + (char) c;
                c = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Ha entrado en el catch");
        } finally {
            if (in != null) {
                try {
                    in.close();
                    System.out.println("Ha cerrado el fichero");
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}
//     Forma resumida, JAVA te lo cierra, te evitas el finally
//        public static void main(String[] args) {
//		String texto = "";
//
//		
//		try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Daw2\\Desktop\\Prueba.txt"))){
//
//			String linea = in.readLine();
//			while (linea != null) {
//				texto = texto + linea + '\n';
//				linea = in.readLine();
//			}
//		}catch (IOException ex){
//			System.out.println(ex.getMessage());
//		}
//		System.out.println(texto);
//	}
//}
    
    
//    public void leer() throws IOException{
//          FileReader in = null;
//          String texto = "";
//           try{
//             in = new FileReader("C:\\Users\\Jorge\\Desktop\\fichero.txt");
//             int c=in.read();
//             while(c !=-1){
//                 texto = texto + (char)c;
//                 c=in.read();
//             }
//               System.out.println(in);
//            
//             
//        }catch(IOException ex){
//            System.out.println(ex.getLocalizedMessage());
//            System.out.println("Error al leer el fichero");
//        }finally{
//               if (in != null){
//                    in.close();
//               }
//           }   
//    }
}
