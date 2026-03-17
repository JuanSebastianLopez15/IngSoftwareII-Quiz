package org.juanse.models;

public interface IComputadoraBuilder {
    IComputadoraBuilder setProcesador(String procesador);
    IComputadoraBuilder setRam(int ramGB);
    IComputadoraBuilder setAlmacenamiento(int almacenamientoGB);
    IComputadoraBuilder setGrafica(boolean tieneGrafica);
    IComputadoraBuilder setLucesRGB(boolean tieneLuces);

    IComputadoraBuilder reset();
    Computadora getComputadora(); // Igual al getCasa() de tu profe
}