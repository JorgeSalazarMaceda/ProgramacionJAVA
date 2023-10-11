/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoExamen;

/**
 *
 * @author Jorge
 */
public abstract class Empleado extends Usuario{
    
    //Atributos
    protected int sueldo;
    private int codEmpleado;
    
    final double SUBE_COMERCIAL=1.02;
    final double SUBE_MARKETING=1.01;
    final double SUBE_LOGISTICA=1.03;

    public Empleado(int sueldo, int codEmpleado) {
        this.sueldo = sueldo;
        this.codEmpleado = codEmpleado;
    }
    
    public void pintaDatos (){
        super.pintaDatos();
        System.out.println(codEmpleado);
        System.out.println(sueldo);
    }
    
    public abstract void subeSueldo (); //Es solo para declararlo
        
    
    
    
}
