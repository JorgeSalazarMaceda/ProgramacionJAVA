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
public class Marketing  extends Empleado{
    private String tipo;

    @Override
    public void subeSueldo() {
       sueldo=(int) SUBE_MARKETING;
    }
}
