/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author Jorge
 */
public class PrincipalAula {
       public static void main(String[] args) {
        Aula5 ordenador = new Aula5(5);

        ordenador.general();
       
      
        
        ordenador.BotonPC(0);
        ordenador.BotonPC(1);
        ordenador.BotonPC(1);
        ordenador.BotonPC(1);
        ordenador.BotonPC(2);
        ordenador.BotonPC(3);
        ordenador.BotonPC(4);
        ordenador.general();
        
        //Vemos los resultados
        ordenador.Resultado(0);
        ordenador.Resultado(1);
        ordenador.Resultado(2);
        ordenador.Resultado(3);
        ordenador.Resultado(4);
        
        ordenador.MostrarSistema();
        


        System.out.println("consumo total: "+ordenador.totalConsumo());
    }
}
