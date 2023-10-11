/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

/**
 *
 * @author Jorge
 */
public class Cita {
    enum DiaSemana {
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
    }
    
    DiaSemana hoy = DiaSemana.MIERCOLES;
    
    String mihoy=DiaSemana.VIERNES,toString()
}
