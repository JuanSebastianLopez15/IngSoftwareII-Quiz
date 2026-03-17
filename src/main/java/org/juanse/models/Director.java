package org.juanse.models;

public class Director {
    public void construirPCGamer(IComputadoraBuilder builder) {
        builder.reset() // Limpiamos por si queda algo de un procedimiento viejo
                .setProcesador("Intel Core i9")
                .setRam(32)
                .setAlmacenamiento(2000)
                .setGrafica(true)
                .setLucesRGB(true);
    }

    public void construirPCOficina(IComputadoraBuilder builder) {
        builder.reset()
                .setProcesador("Intel Core i3")
                .setRam(8)
                .setAlmacenamiento(500)
                .setGrafica(false)
                .setLucesRGB(false);
    }
}