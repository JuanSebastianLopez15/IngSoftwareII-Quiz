package org.juanse.models;

import org.juanse.models.Computadora;

/**
 * Builder concreto para construir una PC de oficina.
 * Es el obrero especializado que sabe que componentes basicos
 * necesita una computadora para uso de oficina.
 */
public class PCOficinaBuilder implements IComputadoraBuilder {

    private Computadora pc;

    /**
     * Constructor que inicializa el builder con una PC nueva.
     */
    public PCOficinaBuilder() {
        this.reset();
    }

    /**
     * Asigna el procesador a la PC en construccion.
     * @param procesador nombre del procesador, por ejemplo "Intel Core i3"
     * @return el mismo builder para encadenar metodos
     */
    @Override
    public IComputadoraBuilder setProcesador(String procesador) {
        this.pc.procesador = procesador;
        return this;
    }

    /**
     * Asigna la cantidad de RAM a la PC en construccion.
     * @param ram cantidad de RAM en GB
     * @return el mismo builder para encadenar metodos
     */
    @Override
    public IComputadoraBuilder setRam(int ram) {
        this.pc.ram = ram;
        return this;
    }

    /**
     * Asigna el almacenamiento a la PC en construccion.
     * @param almacenamiento capacidad en GB
     * @return el mismo builder para encadenar metodos
     */
    @Override
    public IComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.pc.almacenamiento = almacenamiento;
        return this;
    }

    /**
     * Indica si la PC tendra tarjeta grafica dedicada.
     * Para oficina normalmente se envia false.
     * @param tieneGrafica true si tiene grafica, false si no
     * @return el mismo builder para encadenar metodos
     */
    @Override
    public IComputadoraBuilder setGrafica(boolean tieneGrafica) {
        this.pc.tieneGrafica = tieneGrafica;
        return this;
    }

    /**
     * Indica si la PC tendra luces RGB.
     * Para oficina normalmente se envia false.
     * @param tieneLuces true si tiene RGB, false si no
     * @return el mismo builder para encadenar metodos
     */
    @Override
    public IComputadoraBuilder setLucesRGB(boolean tieneLuces) {
        this.pc.tieneLucesRGB = tieneLuces;
        return this;
    }

    /**
     * Reinicia el builder creando una PC nueva desde cero.
     * @return el mismo builder para encadenar metodos
     */
    @Override
    public IComputadoraBuilder reset() {
        this.pc = new Computadora();
        return this;
    }

    /**
     * Retorna la PC ya construida y reinicia el builder
     * para que pueda usarse de nuevo.
     * @return la computadora con todos sus componentes asignados
     */
    @Override
    public Computadora getComputadora() {
        Computadora resultado = this.pc;
        this.reset();
        return resultado;
    }
}
