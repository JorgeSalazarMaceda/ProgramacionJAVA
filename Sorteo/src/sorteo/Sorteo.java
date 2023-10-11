/*
Tenemos la clase public abstract class sorteo {
protected int posibilidades;
public abstract int lanzar();
}

Se pide:

-Crear la clase dado, la cual desciende de la clase sorteo. La clase dado, en la llamada lanzar() mostrará un número aleatorio del 1 al 6.
-Crear la clase moneda, la cual desciende de la clase sorteo. Esta clase en la llamada al método lanzar() mostrará las palabras cara o cruz.
 */
package sorteo;

/**
 *
 * @author Jorge
 */
public abstract class Sorteo {
    //Atributo
    protected int posibilidades;
    
    //Metodo abstracto lanzar... Las clases hijas lo heredarán como @Override.
    public abstract int lanzar();
    
    
    
    
}
