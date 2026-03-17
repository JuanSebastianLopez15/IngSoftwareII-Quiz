package org.juanse.models.main;

import org.juanse.models.*;

/**
 * Clase principal que actua como el cliente en el patron Builder.
 * Aqui se usa el Director para construir distintos tipos de PC
 * y se muestra el resultado en consola con colores ANSI.
 */
public class Main {

    // Colores ANSI para la consola
    public static final String RESET    = "\u001B[0m";
    public static final String VERDE    = "\u001B[32m";
    public static final String CIAN     = "\u001B[36m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String MAGENTA  = "\u001B[35m";
    public static final String ROJO     = "\u001B[31m";

    /**
     * Metodo principal, punto de entrada del programa.
     * Construye una PC Gamer y una PC Oficina usando el Director.
     * @param args argumentos de la linea de comandos (no se usan)
     */
    public static void main(String[] args) {

        // Creamos el director que va a manejar la construccion
        Director director = new Director();

        // ---- PC GAMER ----
        System.out.println(MAGENTA + "\n=== Construyendo PC Gamer ===" + RESET);

        // Le pasamos el builder gamer al director
        IComputadoraBuilder gamerBuilder = new PCGamerBuilder();
        director.construirPCGamer(gamerBuilder);

        // Obtenemos la PC ya construida y la mostramos
        Computadora pcGamer = gamerBuilder.getComputadora();
        mostrarPC(pcGamer, "PC GAMER");

        // ---- PC OFICINA ----
        System.out.println(CIAN + "\n=== Construyendo PC Oficina ===" + RESET);

        // Mismo proceso pero con el builder de oficina
        IComputadoraBuilder oficinaBuilder = new PCOficinaBuilder();
        director.construirPCOficina(oficinaBuilder);

        Computadora pcOficina = oficinaBuilder.getComputadora();
        mostrarPC(pcOficina, "PC OFICINA");
    }

    /**
     * Muestra en consola las especificaciones de una PC.
     * Usa colores ANSI para hacer la salida mas clara visualmente.
     * @param pc la computadora cuyos datos se van a mostrar
     * @param nombre el nombre que se mostrara como titulo
     */
    static void mostrarPC(Computadora pc, String nombre) {
        System.out.println(AMARILLO + "\nEspecificaciones - " + nombre + RESET);
        System.out.println(CIAN + "Procesador     : " + RESET + pc.procesador);
        System.out.println(CIAN + "RAM            : " + RESET + pc.ram + " GB");
        System.out.println(CIAN + "Almacenamiento : " + RESET + pc.almacenamiento + " GB");

        // Mostramos en verde si tiene el componente, en rojo si no
        System.out.println(CIAN + "Tarjeta Grafica: " + RESET
                + (pc.tieneGrafica  ? VERDE + "Si" : ROJO + "No") + RESET);
        System.out.println(CIAN + "Luces RGB      : " + RESET
                + (pc.tieneLucesRGB ? VERDE + "Si" : ROJO + "No") + RESET);
    }
}
