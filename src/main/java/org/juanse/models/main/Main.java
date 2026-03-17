package org.juanse.models.main;

import org.juanse.models.*;

public class Main {

    // Colores ANSI para la consola
    public static final String RESET    = "\u001B[0m";
    public static final String VERDE    = "\u001B[32m";
    public static final String CIAN     = "\u001B[36m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String MAGENTA  = "\u001B[35m";
    public static final String ROJO     = "\u001B[31m";

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

    // Metodo para imprimir las especificaciones de una PC
    static void mostrarPC(Computadora pc, String nombre) {
        System.out.println(AMARILLO + "\nEspecificaciones - " + nombre + RESET);
        System.out.println(CIAN + "Procesador     : " + RESET + pc.procesador);
        System.out.println(CIAN + "RAM            : " + RESET + pc.ram);
        System.out.println(CIAN + "Almacenamiento : " + RESET + pc.almacenamiento);

        // Mostramos en verde si tiene el componente, en rojo si no
        System.out.println(CIAN + "Tarjeta Grafica: " + RESET
                + (pc.tieneGrafica  ? VERDE + "Si" : ROJO + "No") + RESET);
        System.out.println(CIAN + "Luces RGB      : " + RESET
                + (pc.tieneLucesRGB ? VERDE + "Si" : ROJO + "No") + RESET);
    }
}
