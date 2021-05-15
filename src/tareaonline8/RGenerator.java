package tareaonline8;

/*
Conjunto de métodos para generar características aleatorias para el catalogo de prueba
La formula para generar un número aleatorio dentro de un rango es:
                 (Math.random)*(max-min+1)+min
 */
public class RGenerator {

    public static String getMarcaR() {

        String[] nombreMarca = {"Prestige", "Sun Odyssey", "Merry Fisher", "Leader", "Navantia"};
        int numero = (int) (Math.random() * (4 - 0 + 1) + 0);
        String marca = nombreMarca[numero];

        return marca;
    }

    public static String getNombreModeloR() {

        String[] nombreModelos = {"Modelo 1990", "Modelo 1993", "Modelo 1994", "Modelo 2000", "Modelo 2005", "Modelo 1988", "Modelo 1999"};
        int numero = (int) (Math.random() * (6 - 0 + 1) + 0);
        String nombreMod = nombreModelos[numero];

        return nombreMod;
    }

    public static int getPrecioR() {

        int[] cantidadPrecio = {5000, 6000, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000};
        int numero = (int) (Math.random() * (9 - 0 + 1) + 0);
        int precio = cantidadPrecio[numero];

        return precio;
    }

    public static int getEsloraVeleroR() {

        int[] cantidadEsloraVelero = {9, 10, 11, 12, 13, 8};
        int numero = (int) (Math.random() * (5 - 0 + 1) + 0);
        int esloraV = cantidadEsloraVelero[numero];

        return esloraV;
    }

    public static int getCaladoVeleroR() {

        int[] cantidadCaladoVelero = {1, 2, 3};
        int numero = (int) (Math.random() * (2 - 0 + 1) + 0);
        int caladoV = cantidadCaladoVelero[numero];

        return caladoV;
    }

    public static int getAlturaR() {

        int[] alturaVelero = {9, 10, 11, 12, 13, 14, 15, 16};
        int numero = (int) (Math.random() * (7 - 0 + 1) + 0);
        int altura = alturaVelero[numero];

        return altura;
    }

    public static int getEsloraYateR() {

        int[] cantidadEsloraYate = {60, 65, 70, 71, 72, 74, 76, 77, 75};
        int numero = (int) (Math.random() * (8 - 0 + 1) + 0);
        int esloraY = cantidadEsloraYate[numero];

        return esloraY;
    }

    public static int getCaladoYateR() {

        int[] cantidadCaladoYate = {8, 7, 9, 12, 10};
        int numero = (int) (Math.random() * (4 - 0 + 1) + 0);
        int caladoY = cantidadCaladoYate[numero];

        return caladoY;
    }

    public static int getEsloraCruceroR() {

        int[] cantidaEsloraCrucero = {120, 130, 140, 150, 160, 170, 180, 200, 300, 320, 350};
        int numero = (int) (Math.random() * (10 - 0 + 1) + 0);
        int esloraC = cantidaEsloraCrucero[numero];

        return esloraC;
    }

    public static int getCaladoCruceroR() {

        int[] cantidadCaladoCrucero = {19, 20, 21, 22, 23, 24, 25, 40};
        int numero = (int) (Math.random() * (7 - 0 + 1) + 0);
        int caladoC = cantidadCaladoCrucero[numero];

        return caladoC;
    }

    public static String getNombreR() {

        String[] nombreBarcos = {"Aurora", "Buendia", "Incongnita", "San Antonio", "Narciso", "Furor", "New Port", "Santísima Trinidad", "La Perla Negra", "Satisfaction", "Roebuck", "Royal Fortune"};
        int numero = (int) (Math.random() * (11 - 0 + 1) + 0);
        String nombre = nombreBarcos[numero];

        return nombre;
    }

    public static String getCombustibleR() {

        String[] nombreCombustible = {"Diesel", "Gasolina"};
        int numero = (int) (Math.random() * (1 - 0 + 1) + 0);
        String combustible = nombreCombustible[numero];

        return combustible;
    }

    public static int getCamarotesR() {

        int[] cantidadCamarotes = {7, 8, 9, 10, 11, 12, 13, 14};
        int numero = (int) (Math.random() * (7 - 0 + 1) + 0);
        int camarotes = cantidadCamarotes[numero];

        return camarotes;
    }

    public static int getHabitacionesR() {

        int[] cantidadHabitaciones = {80, 90, 100, 110, 120, 130, 140};
        int numero = (int) (Math.random() * (6 - 0 + 1) + 0);
        int habitaciones = cantidadHabitaciones[numero];

        return habitaciones;
    }

    public static int getSalonesR() {

        int[] cantidadSalones = {3, 4, 5, 6, 7, 8};
        int numero = (int) (Math.random() * (5 - 0 + 1) + 0);
        int salones = cantidadSalones[numero];

        return salones;
    }

    public static int getPiscinasR() {

        int[] cantidadPiscinas = {1, 2, 3, 4};
        int numero = (int) (Math.random() * (3 - 0 + 1) + 0);
        int piscinas = cantidadPiscinas[numero];

        return piscinas;
    }

    public static int getAutonomiaR() {

        int[] autonomiaCY = {300, 400, 500, 600, 700, 800, 900, 1000, 2000};
        int numero = (int) (Math.random() * (5 - 0 + 1) + 0);
        int autonomia = autonomiaCY[numero];

        return autonomia;
    }

}
