package org.juanse.models;

/**
 * Actua como el jefe de obra en el patron Builder
 * Es la clase que conoce los pasos exactos para construir productos predefinidamente
 */
public class Director {
    /**
     * Dirige la construcción de una computadora PC Gamer.
     * * @param builder, con esto sabe de donde sacar los pasos que ejecutara de ensamblaje.
     */
    public void construirPCGamer(IComputadoraBuilder builder) {
        builder.reset() // Limpiamos por si queda algo de un procedimiento viejo
                .setProcesador("Intel Core i9")
                .setRam(32)
                .setAlmacenamiento(2000)
                .setGrafica(true)
                .setLucesRGB(true);
    }
    /**
     * Dirige la construcción de una computadora PCOficina.
     * * @param builder, con esto sabe de donde sacar los pasos que ejecutara de ensamblaje.
     */
    public void construirPCOficina(IComputadoraBuilder builder) {
        builder.reset()
                .setProcesador("Intel Core i3")
                .setRam(8)
                .setAlmacenamiento(500)
                .setGrafica(false)
                .setLucesRGB(false);
    }
}