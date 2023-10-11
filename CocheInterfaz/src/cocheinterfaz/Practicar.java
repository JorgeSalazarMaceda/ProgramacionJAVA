/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocheinterfaz;
/**
 *
 * @author Jorge
 */
public class Practicar {
    public static void main(String[] args) {
        
Bateria bat = new Bateria(100, 500);
DepositoGasolina gas = new DepositoGasolina();

Coche jorge = new Coche (5, 0, "Jorge", bat);
jorge.giro(380);
System.out.println(jorge.toString());
//jorge.setCombustible(gas);
jorge.setCombustible(new DepositoGasolina());
System.out.println(jorge.toString());
jorge.getCombustible().recarga(50);
System.out.println(jorge.toString());

//
//        Bateria CocheBat = new Bateria();
//        
//        Coche ferrari = new Coche(100, "pepe", CocheBat);
//        Coche ferrari2 = new Coche(100, "pepe", CocheBat);
//        Coche ferrari3 = new Coche(100, "pepe", CocheBat);
//         ferrari.imprime();
//         ferrari2.imprime();
//         ferrari3.imprime();
//        ferrari.giro(200);
//        ferrari.giro(300);
//        ferrari.giro(300);
//        System.out.println(ferrari.getDireccion());
//        
//        
//        ferrari.setCombustible(new DepositoGasolina(100)); //Para cambiar el tipo de combustible
//        ferrari.imprime();
//        System.out.println(ferrari.getId());
//        System.out.println(ferrari2.getId());
//        Coche coche = new Coche(100, "pepe", CocheBat);
//        
//        Coche.getLastId();
//        Coche.getLastId();
//        
//         Bateria Bat = new Bateria(30, 150);
//         System.out.println(Bat.getCapacidad());
//         System.out.println(Bat.getDisponible());
//         Bat.vacio();
//         
//         Coche wen  = new Coche(100, "wen",new Bateria()); //Mete en el parametro coche wen una nueva bateria
//        System.out.println( wen.getVelocidad());
//           wen.imprime();
//           wen.getCombustible().recarga(100);
//           System.out.println(wen.getCombustible());
           //wen.giro(361);
          
           //wen.imprime();
           
          //System.out.println(wen.toString());
           
    }
}
