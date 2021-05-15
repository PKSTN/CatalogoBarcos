package tareaonline8;

import barcos.Barco;

/**
 * <p>
 * Esta clase gestiona el texto de los menus</p>
 *
 * @author Antonio Jose Martin Barroso
 */
public class Menu {
    /**
     * Funcion para mostrar el menu principal
     */
    public static void menuPPAL() {
        ES.mostrar("       ______                                    \n"
                + "       | ___ \\                                   \n"
                + "       | |_/ / __ _ _ __ ___ ___  ___            \n"
                + "       | ___ \\/ _` | '__/ __/ _ \\/ __|           \n"
                + "       | |_/ / (_| | | | (_| (_) \\__ \\           \n"
                + "       \\____/ \\__,_|_|  \\___\\___/|___/           \n"
                + "\n"
                + "1.Cargar Barcos desde Código\n"
                + "2.Cargar el contenido del catálogo utilizando fichero binario.\n"
                + "3.Guardar el contenido del catálogo utilizando fichero binario.\n"
                + "4.Cargar el contenido del catálogo utilizando ficheros de texto\n"
                + "5.Guardar el contenido del catálogo utilizando ficheros de texto.\n"
                + "6.Mostrar todo el catálogo\n"
                + "7.Borrado del catálogo \n"
                + "8.Alta de un barco\n"
                + "9.Baja de un barco.\n"
                + "10.Salir de la aplicación.\n"
                + "Introduzca su selección:");

    }
    /**
     * Funcion para mostrar el menu de los tipos de barcos
     * @see Main#anhadirBarco() 
     */
    public static void menuAnhadirBarco() {
        ES.mostrar("¿Qué tipo de barco desea añadir?"
                + "\n1.Velero"
                + "\n2.Yate"
                + "\n3.Crucero");

    }
    /**
     * Funcion para mostrar las formas de ordenar el catalogo
     * @see Barco#compareTo(barcos.Barco) 
     */
    public static void menuMostrarBarco() {
        ES.mostrar("¿Cómo desea mostrar el catálogo?"
                + "\n1.Ordenado por Eslora"
                + "\n2.Ordenado por Precio");
    }
}
