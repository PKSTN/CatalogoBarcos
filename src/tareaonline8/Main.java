package tareaonline8;

import IOFiles.MiWriter;
import barcos.Barco;
import barcos.Crucero;
import barcos.Velero;
import barcos.Yate;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Si faltan demasiadas tildes es porque tengo un teclado reducido que si lo
 * configuro en castellano me quedo sin esto } y <> .........
 * <p>
 * Aplicación que gestiona un catálogo de barcos</p>
 *
 * @author Antonio Jose Martin Barroso
 */
public class Main {

    static SortedSet<Barco> misBarcosEslora = new TreeSet();

    public static void main(String[] args) {

        boolean terminar = false;

        do {
            Menu.menuPPAL();
            switch (ES.leerEntero(1, 10)) {

                case 1:
                    cargarBarcos();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    MiWriter.EscribirBinario(misBarcosEslora);

                    break;
                case 6:
                    switchMostrarBarcos();
                    break;
                case 7:
                    break;
                case 8:
                    Menu.menuAnhadirBarco();
                    anhadirBarco();
                    break;
                case 9:
                    break;
                case 10:
                    terminar = true;
                    break;
                default:
                    System.out.println("Introduzca un numero dentro del rango");
            }
        } while (!terminar);

    }

    /////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Función que permite elegir que tipo de barco añadir
     *
     * @see Menu#menuAnhadirBarco()
     */
    public static void anhadirBarco() {

        switch (ES.leerEntero(1, 3)) {
            case 1:
                Velero v = new Velero();
                misBarcosEslora.add(v);
                break;

            case 2:
                Yate y = new Yate();
                misBarcosEslora.add(y);
                break;

            case 3:
                Crucero c = new Crucero();
                misBarcosEslora.add(c);
                break;
            default:
                ES.mostrar("Introduzca un numero dentro del rango");

        }

    }

    /**
     * Función que permite elegir como ordenar el catálogo a la hora e mostrarlo
     *
     * @see Barco#toString()
     */
    public static void switchMostrarBarcos() {
        Menu.menuMostrarBarco();
        switch (ES.leerEntero(1, 2)) {
            case 1:
                ES.mostrar(misBarcosEslora.toString());
                break;
            case 2:
                break;
            default:
                ES.mostrar("Introduzca un numero dentro del rango");

        }
    }

    /**
     * Funcio que carga 5 barcos de cada tipo. RGenerator proporciona atributos
     * aleatorios al constructor
     *
     * @see RGenerator
     */
    public static void cargarBarcos() {
        for (int i = 0; i < 6; i++) {
            Velero velero1 = new Velero(RGenerator.getMarcaR(), RGenerator.getNombreModeloR(), RGenerator.getEsloraVeleroR(), RGenerator.getCaladoVeleroR(), RGenerator.getNombreR(), RGenerator.getCombustibleR(), RGenerator.getPrecioR(), RGenerator.getAlturaR());
            misBarcosEslora.add(velero1);
            Yate yate1 = new Yate(RGenerator.getMarcaR(), RGenerator.getNombreModeloR(), RGenerator.getEsloraYateR(), RGenerator.getCaladoYateR(), RGenerator.getNombreR(), RGenerator.getCombustibleR(), RGenerator.getPrecioR(), RGenerator.getAutonomiaR(), RGenerator.getCamarotesR());
            misBarcosEslora.add(yate1);
            Crucero crucero1 = new Crucero(RGenerator.getMarcaR(), RGenerator.getNombreModeloR(), RGenerator.getEsloraYateR(), RGenerator.getCaladoYateR(), RGenerator.getNombreR(), RGenerator.getCombustibleR(), RGenerator.getPrecioR(), RGenerator.getAutonomiaR(), RGenerator.getHabitacionesR(), RGenerator.getSalonesR(), RGenerator.getPiscinasR());
            misBarcosEslora.add(crucero1);
        }

    }
}
