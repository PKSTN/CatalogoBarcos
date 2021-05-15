package barcos;

import tareaonline8.ES;

/**
 * <p>
 * Esta clase permite crear cruceros, hereda de Barco</p>
 *
 * @author Antonio Jose Martin Barroso
 * @see Barco
 */
public class Crucero extends Barco {

    private int _autonomia;
    private int _habitaciones;
    private int _salones;
    private int _piscinas;

    /**
     * Constructor de la clase Cucero. Recibe sus atributos como parametros
     *
     * @param marca
     * @param modelo
     * @param eslora
     * @param calado
     * @param nombre
     * @param combustible
     * @param precio
     * @param autonomia
     * @param habitaciones
     * @param salones
     * @param piscinas
     * @see Barco
     */
    public Crucero(String marca, String modelo, int eslora, int calado, String nombre, String combustible, int precio, int autonomia, int habitaciones, int salones, int piscinas) {
        this._marca = marca;
        this._modelo = modelo;
        this._eslora = eslora;
        this._calado = calado;
        this._nombre = nombre;
        this._combustible = combustible;
        this._precio = precio;
        this._autonomia = autonomia;
        this._habitaciones = habitaciones;
        this._salones = salones;
        this._piscinas = piscinas;
    }

    /**
     * Constructor manual de la clase Crucero
     */
    public Crucero() {
        ES.mostrar("Introduzca la autonomía del Crucero");
        this._autonomia = ES.leerEntero(0, 5000);
        ES.mostrar("Introduzca el número de habitaciones del Crucero");
        this._habitaciones = ES.leerEntero(0, 500);
        ES.mostrar("Introduzca el número de salones del Crucero");
        this._salones = ES.leerEntero(0, 500);
        ES.mostrar("Introduzca el número de piscinas del Crucero");
        this._piscinas = ES.leerEntero(0, 500);
    }

    public int getAutonomia() {
        return _autonomia;
    }

    public void setAutonomia(int _autonomia) {
        this._autonomia = _autonomia;
    }

    public int getHabitaciones() {
        return _habitaciones;
    }

    public void setHabitaciones(int _habitaciones) {
        this._habitaciones = _habitaciones;
    }

    public int getSalones() {
        return _salones;
    }

    public void setSalones(int _salones) {
        this._salones = _salones;
    }

    public int getPiscinas() {
        return _piscinas;
    }

    public void setPiscinas(int _piscinas) {
        this._piscinas = _piscinas;
    }

    /**
     * Metodo que convierte a String el objeto para mostrarlo por pantalla
     *
     * @return atributos como String junto con una plantilla
     */
    @Override
    public String toString() {
        return "\n-----------------------------------------------------------"
                + "\n                      Crucero                           "
                + "\nMarca= " + super._marca + "\nModelo= " + super._modelo + "\nEslora= "
                + super._eslora + "\nCalado= " + super._calado + "\nNombre= " + super._nombre
                + "\nAutonomia= " + this._autonomia + "\nCombustible= " + super._combustible
                + "\nHabitaciones =" + this._habitaciones + "\nSalones= " + this._salones
                + "\nPiscinas= " + this._piscinas
                + "\n-----------------------------------------------------------";

    }

}
