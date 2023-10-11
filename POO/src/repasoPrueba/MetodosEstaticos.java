/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoPrueba;

/**
 *
 * @author Jorge
 */
public class MetodosEstaticos {
    
    public static class MiClase {
        public String miPropiedad;
        public static String miPropiedadEstatica = "miValorEstatico";
        
        public MiClase() {
            this.miPropiedad = "miValorDinamico";
        }
        public String getMiPropiedad(){
            return miPropiedad;
        }
        
        public String getMiPropiedadEstatica() {
            return MiClase.miPropiedadEstatica;
        }
         
    }
    
    public static void main(String[] args) {
        
        MiClase miObjeto = new MiClase();
        miObjeto.miPropiedad = "asdfasf";
        System.out.println(miObjeto.getMiPropiedad());
        
        
        MiClase miObjeto2 = new MiClase();
        miObjeto2.miPropiedad = "valor2";
        System.out.println(miObjeto2.getMiPropiedad());
        
        System.out.println(miObjeto.getMiPropiedadEstatica());
        System.out.println(miObjeto2.getMiPropiedadEstatica());
        
        MiClase.miPropiedadEstatica = "miValorEstatico2";
        System.out.println(miObjeto.getMiPropiedadEstatica());
        System.out.println(miObjeto2.getMiPropiedadEstatica());
        
    }
    
}
