/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapersistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Jorge
 */
public class JavaPersistence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaPersistencePU");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createNativeQuery("select e from Empleados e");
        List<Empleados> lista = query.getResultList();
        for(Empleados empleado : lista) {
            System.out.println("El empleado es: " + empleado.getNombre());
        }
    }
    
}
