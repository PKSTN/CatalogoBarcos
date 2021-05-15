
package barcos;

import tareaonline8.ES;

/**
 * <p>
 * Esta clase permite crear veleros, hereda de Barco</p>
 *
 * @author Antonio Jose Martin Barroso
 * @see Barco
 */
public class Velero extends Barco {

    private int _altura;
    /**
     * Constructor de la clase Velero. Recibe sus atributos como parametros
     * @param marca
     * @param modelo
     * @param eslora
     * @param calado
     * @param nombre
     * @param combustible
     * @param precio
     * @param altura 
     * @see Barco
     */
    public Velero(String marca, String modelo, int eslora, int calado, String nombre, String combustible, int precio, int altura) {
        this._marca = marca;
        this._modelo = modelo;
        this._eslora = eslora;
        this._calado = calado;
        this._nombre = nombre;
        this._precio = precio;
        this._altura = altura;
        
    }
    /**
     * Constructor manual de Velero
     */
    public Velero() {
        ES.mostrar("Introduzca la altura del Velero");
        this._altura =ES.leerEntero();
    }
    //Getters y Setters
    public int getAltura() {
        return _altura;
    }

    public void setAltura(int _altura) {
        this._altura = _altura;
    }
    /**
     * Metodo que convierte a String el objeto para mostrarlo por pantalla
     * @return atributos como String junto con una plantilla
     */
    @Override  
    public String toString(){
        return "\n-----------------------------------------------------------"+
                "\n                       Velero                          "+
                "\nMarca= "+super._marca+"\nModelo= "+super._modelo+"\nEslora= "
                +super._eslora+"\nCalado= "+super._calado+"\nNombre= "+super._nombre
                +"\nAltura= "+this._altura+"\nCombustible= "+
                "\n-----------------------------------------------------------";
       
    }
    
}
