package barcos;

import tareaonline8.ES;

/**
 * <p>
 * Esta clase permite crear yates, hereda de Barco</p>
 *
 * @author Antonio Jose Martin Barroso
 * @see Barco
 */
public class Yate extends Barco {

    private int _autonomia;
    private int _camarotes;

    /**
     * Constructor de la clase Yate. Recibe sus atributos como parametros
     *
     * @param marca
     * @param modelo
     * @param eslora
     * @param calado
     * @param nombre
     * @param combustible
     * @param precio
     * @param autonomia
     * @param camarotes
     * @see Barco
     */
    public Yate(String marca, String modelo, int eslora, int calado, String nombre, String combustible, int precio, int autonomia, int camarotes) {
        this._marca = marca;
        this._modelo = modelo;
        this._eslora = eslora;
        this._calado = calado;
        this._nombre = nombre;
        this._precio = precio;
        this._autonomia = autonomia;
        this._camarotes = camarotes;

    }

    /**
     * Constructor manual de la clase Yate
     */
    public Yate() {
        ES.mostrar("Introduzca la autonomía del Yate");
        this._autonomia = ES.leerEntero(0, 5000);
        ES.mostrar("Introduzca el numero de camarotes del Yate");
        this._camarotes = ES.leerEntero(0, 100);
    }

    public int getAutonomia() {
        return _autonomia;
    }

    public void setAutonomia(int _autonomia) {
        this._autonomia = _autonomia;
    }

    public int getCamarotes() {
        return _camarotes;
    }

    public void setCamarotes(int _camarotes) {
        this._camarotes = _camarotes;
    }

    /**
     * Metodo que convierte a String el objeto para mostrarlo por pantalla
     *
     * @return atributos como String junto con una plantilla
     */
    @Override
    public String toString() {
        return "\n-----------------------------------------------------------"
                + "\n                       Yate                             "
                + "\nMarca= " + super._marca + "\nModelo= " + super._modelo + "\nEslora= "
                + super._eslora + "\nCalado= " + super._calado + "\nNombre= " + super._nombre
                + "\nAutonomia= " + this._autonomia + "\nCombustible= " + super._combustible
                + "\nCamarote= " + this._camarotes
                + "\n-----------------------------------------------------------";

    }
}
