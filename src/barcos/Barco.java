package barcos;

import tareaonline8.ES;

/**
 * <p>
 * Esta clase es la clase padre de los otros 3 tipos de barcos</p>
 *
 * @author Antonio Jose Martin Barroso
 */
public class Barco implements Comparable<Barco> {

    //Atributos
    protected String _marca;
    protected String _modelo;
    protected int _eslora;
    protected int _calado;
    protected String _nombre;
    protected String _combustible;
    protected int _precio;

    /**
     * Constructor de la clase Barco. Recibe sus atributos como parametros
     *
     * @param marca nombre de la marca del barco
     * @param modelo modelo del barco
     * @param eslora eslora del barco
     * @param calado calado del barco
     * @param nombre nombre del barco
     * @param combustible tipo de combustible del barco
     * @param precio precio del barco
     */
    public Barco(String marca, String modelo, int eslora, int calado, String nombre, String combustible, int precio) {
        this._marca = marca;
        this._modelo = modelo;
        this._eslora = eslora;
        this._calado = calado;
        this._nombre = nombre;
        this._precio = precio;

    }

    /**
     * Constructor con entrada de atributos a mano
     */
    public Barco() {

        /*ES.mostrar("Introduzca la Marca del Barco");
        this._marca = ES.leerCadena();
        ES.mostrar("Introduzca el modelo del Barco");
        this._modelo = ES.leerCadena();
        ES.mostrar("Introduzca el precio del Barco");
        this._precio = ES.leerEntero();
        ES.mostrar("Introduzca la eslora Barco");
        this._eslora = ES.leerEntero(0, 500);
        ES.mostrar("Introduzca el calado Barco");
        this._calado = ES.leerEntero(0, 500);
        ES.mostrar("Introduzca el nombre del Barco");
        this._nombre = ES.leerCadena();
        ES.mostrar("Introduzca el combustible del Barco");
        this._combustible = ES.leerCadena();*/
    }

    //Getter y Setters
    public String getMarca() {
        return _marca;
    }

    public void setMarca(String _marca) {
        this._marca = _marca;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setPrecio(int _precio) {

        if (_precio > 0) {
            this._precio = _precio;
        } else {
            ES.mostrar("Introduzca un valor superior a 0");
        }

    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
    }

    public float getEslora() {
        return _eslora;
    }

    public void setEslora(int _eslora) {
        this._eslora = _eslora;
    }

    public float getCalado() {
        return _calado;
    }

    public void setCalado(int _calado) {
        this._calado = _calado;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getCombustible() {
        return _combustible;
    }

    public void setCombustible(String _combustible) {
        this._combustible = _combustible;
    }

    @Override
    /**
     * Metodo que usa la implementacion de SortedSet para ordenarse
     */
    public int compareTo(Barco o) {
        return this._eslora - o._eslora;
    }

}
