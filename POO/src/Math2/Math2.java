/*
Hacer la clase Math2 que amplíe las declaraciones de métodos estáticos de la clase Math 
y que incluya rutinas que devuelve, respectivamente, el máximo, el mínimo, 
el sumatorio y la media aritmética de un array de números reales dado como parámetro
 */

package Math2;

/**
 *
 * @author Jorge
 */

final public class Math2 { //Con final nadie puede heredar de esta clase para cambiarla
    //Cualquiera ha podrá usa esta clase Math2. con sus metodos de clase estáticos.
    
        public static double maximo(double miArray[]){  
        double maximo=miArray[0];
            for (int i = 1; i < miArray.length; i++) { //Empieza en posicion 1 porque el 0 que hasta ese momento tiene el titulo de maximo
                if(miArray[i]>maximo) maximo = miArray[i];
                   
            }
        return maximo;
    }
        
        public static double minimo(double miArray[]){  
        double minimo=miArray[0];
            for (int i = 1; i < miArray.length; i++) {
                if(miArray[i]<minimo) minimo = miArray[i];
                   
            }
        return minimo;
    }
        
        public static double sumaArray(double miArray[]){  
        double resultado=miArray[0];
            for (int i = 1; i < miArray.length; i++) {
               resultado += miArray[i];
                   
            }
        return resultado;
    }
    
        public static double media(double miArray[]){  
       
            
                 return (sumaArray(miArray)/miArray.length);  
            }
        
    }

    
    
    

