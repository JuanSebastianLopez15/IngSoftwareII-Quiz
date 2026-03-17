package org.juanse.models.main;

import org.juanse.models.*;

// ESTUDIANTE 2 - PARTE 2: Main con ambas PCs y colores ANSI
public class Main {

    // ── Códigos de color ANSI ──────────────────────────────────────────
    public static final String RESET    = "\u001B[0m";
    public static final String VERDE    = "\u001B[32m";
    public static final String CIAN     = "\u001B[36m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String MAGENTA  = "\u001B[35m";
    public static final String ROJO     = "\u001B[31m";
    public static final String BLANCO   = "\u001B[37m";
    public static final String NEGRITA  = "\u001B[1m";

    public static void main(String[] args) {

        Director director = new Director();

        // ══════════════════════════════════════════════════════════════
        // CASO 1: PC GAMER
        // ══════════════════════════════════════════════════════════════
        System.out.println(MAGENTA + NEGRITA);
        System.out.println("  ╔══════════════════════════════════╗");
        System.out.println("  ║       ENSAMBLANDO PC GAMER       ║");
        System.out.println("  ╚══════════════════════════════════╝" + RESET);

        IComputadoraBuilder gamerBuilder = new PCGamerBuilder();

        System.out.println(AMARILLO + "\n  Iniciando ensamblaje..." + RESET);
        director.construirPCGamer(gamerBuilder);
        System.out.println(VERDE + "  ✔ PC Gamer ensamblada con éxito" + RESET);

        Computadora pcGamer = gamerBuilder.getComputadora();
        imprimirEspecificaciones(pcGamer, "PC GAMER", MAGENTA);

        // ══════════════════════════════════════════════════════════════
        // CASO 2: PC OFICINA
        // ══════════════════════════════════════════════════════════════
        System.out.println(CIAN + NEGRITA);
        System.out.println("  ╔══════════════════════════════════╗");
        System.out.println("  ║      ENSAMBLANDO PC OFICINA      ║");
        System.out.println("  ╚══════════════════════════════════╝" + RESET);

        IComputadoraBuilder oficinaBuilder = new PCOficinaBuilder();

        System.out.println(AMARILLO + "\n  Iniciando ensamblaje..." + RESET);
        director.construirPCOficina(oficinaBuilder);
        System.out.println(VERDE + "  ✔ PC Oficina ensamblada con éxito" + RESET);

        Computadora pcOficina = oficinaBuilder.getComputadora();
        imprimirEspecificaciones(pcOficina, "PC OFICINA", CIAN);
    }

    // ── Método auxiliar para mostrar especificaciones ─────────────────
    static void imprimirEspecificaciones(Computadora pc, String titulo, String color) {
        System.out.println();
        System.out.println(color + NEGRITA + "  ┌─ Especificaciones: " + titulo + " ─┐" + RESET);
        System.out.println(CIAN    + "  Procesador      : " + BLANCO + pc.procesador    + RESET);
        System.out.println(CIAN    + "  RAM             : " + BLANCO + pc.ram           + RESET);
        System.out.println(CIAN    + "  Almacenamiento  : " + BLANCO + pc.almacenamiento + RESET);
        System.out.println(CIAN    + "  Tarjeta Gráfica : "
                + (pc.tieneGrafica ? VERDE + "✔ Sí" : ROJO + "✘ No") + RESET);
        System.out.println(CIAN    + "  Luces RGB       : "
                + (pc.tieneLucesRGB       ? VERDE + "✔ Sí" : ROJO + "✘ No") + RESET);
        System.out.println(color   + NEGRITA + "  └──────────────────────────────────┘\n" + RESET);
    }
}
