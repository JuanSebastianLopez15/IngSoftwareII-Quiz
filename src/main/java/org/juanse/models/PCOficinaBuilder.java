package org.juanse.models;

import org.juanse.models.Computadora;

// Builder concreto para construir una PC de oficina
// Implementa la interfaz IComputadoraBuilder con componentes basicos
public class PCOficinaBuilder implements IComputadoraBuilder {

    private Computadora pc;

    // Al crear el builder, inicializamos una PC nueva
    public PCOficinaBuilder() {
        this.reset();
    }

    // Asignamos el procesador de la PC
    @Override
    public IComputadoraBuilder setProcesador(String procesador) {
        this.pc.procesador = procesador;
        return this;
    }

    // Asignamos la cantidad de RAM
    @Override
    public IComputadoraBuilder setRam(int ram) {
        this.pc.ram = ram;
        return this;
    }

    // Asignamos la capacidad de almacenamiento
    @Override
    public IComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.pc.almacenamiento = almacenamiento;
        return this;
    }

    // Una PC de oficina generalmente no necesita tarjeta grafica dedicada
    @Override
    public IComputadoraBuilder setGrafica(boolean tieneGrafica) {
        this.pc.tieneGrafica = tieneGrafica;
        return this;
    }

    // Una PC de oficina tampoco necesita luces RGB
    @Override
    public IComputadoraBuilder setLucesRGB(boolean tieneLuces) {
        this.pc.tieneLucesRGB = tieneLuces;
        return this;
    }

    // Reiniciamos el builder para poder construir otra PC desde cero
    @Override
    public IComputadoraBuilder reset() {
        this.pc = new Computadora();
        return this;
    }

    // Retornamos la PC construida y reseteamos para la proxima construccion
    @Override
    public Computadora getComputadora() {
        Computadora resultado = this.pc;
        this.reset();
        return resultado;
    }
}
