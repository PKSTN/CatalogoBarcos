package tareaonline8;

import java.util.Scanner;

public class ES {

    /**
     * Método para mostrar texto.
     *
     * @param texto Cadena a mostrar
     */
    public static void mostrar(String texto) {
        System.out.println(texto);
    }

    /**
     * Lee un entero dentro de un rango.
     *
     * @param rI rango inferior a leer.
     * @param rS rango superior a leer.
     * @return devuelve el numero introducido.
     */
    public static int leerEntero(int rI, int rS) {
        int numeroLeido = 0;
        Scanner teclado = new Scanner(System.in);
        String cadenaDeTeclado = "";
        boolean correcto;

        do {
            try {
                cadenaDeTeclado = teclado.next();
                numeroLeido = Integer.parseInt(cadenaDeTeclado);
                if ((numeroLeido >= rI) && (numeroLeido <= rS)) {
                    correcto = true;
                } else {
                    System.out.println("Introduzca un numero dentro del rango.");
                    correcto = false;
                }
            } catch (Exception e) {
                correcto = false;
                System.out.println("Lo que has introducido no es correcto.");
            }

        } while (!correcto);

        return (numeroLeido);
    }

    /**
     * Método para leer un numero entero
     *
     * @return Devuelve el número entero leido por teclado
     */
    public static int leerEntero() {

        int numeroLeido = 0;
        String cadenaDeTeclado = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = true;

        do {
            try {

                cadenaDeTeclado = teclado.next(); // Leemos el número por teclado como texto.        
                numeroLeido = Integer.parseInt(cadenaDeTeclado);
                correcto = true;

            } catch (Exception e) { // Si se ha producido una excepción
                correcto = false;
                System.out.println("Lo que has introducido no es correcto.");
                System.out.println("Vuelva a introducir un número entero.");
            }

        } while (!correcto);

        return (numeroLeido);
    }

    /*
     * Método para leer un numero Decimal
     * @return número decimal leido por teclado
     */
    public static float leerDecimal() {

        float numeroLeido = 0;
        String cadenaDeTeclado = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = true;

        do {
            try {

                cadenaDeTeclado = teclado.next(); // Leemos el número por teclado como texto.        
                numeroLeido = Float.parseFloat(cadenaDeTeclado);
                correcto = true;

            } catch (Exception e) { // Si se ha producido una excepción
                correcto = false;
                System.out.println("Lo que has introducido no es correcto.");
                System.out.println("Vuelva a introducir un número entero.");
            }

        } while (!correcto);

        return (numeroLeido);
    }

    public static String leerCadena() {
        String cadenaDeTeclado = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = true;

        do {
            try {

                cadenaDeTeclado = teclado.nextLine(); // Leemos el número por teclado como texto.        
                correcto = true;

            } catch (Exception e) { // Si se ha producido una excepción
                correcto = false;
                System.out.println("Lo que has introducido no es correcto.");
                System.out.println("Vuelva a introducir un número entero.");
            }

        } while (!correcto);

        return (cadenaDeTeclado);
    }
}
