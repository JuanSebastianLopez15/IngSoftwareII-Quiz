package org.juanse.models;

/**
 * Implementación concreta del constructor (Builder).
 * Se encarga de ensamblar paso a paso las piezas de la computadora,
 * guardando el progreso en un objeto interno
 */
public class PCGamerBuilder implements IComputadoraBuilder{

    /**
     * El producto que se está construyendo actualmente.
     */
    private Computadora pc;

    /**
     * Constructor por defecto.
     * Al instanciar este "obrero", automáticamente prepara una computadora en blanco lista para ser ensamblada.
     */
    public PCGamerBuilder(){
        this.reset();
    }

    /** Define el modelo del procesador de la PC y retorna el constructor. */
    @Override
    public IComputadoraBuilder setProcesador(String procesador) {
        this.pc.procesador = procesador;
        return this;
    }

    /** Asigna la cantidad de memoria RAM  */
    @Override
    public IComputadoraBuilder setRam(int ram) {
        this.pc.ram = ram;
        return this;
    }

    /** Asigna la cantidad de almacenamiento. */
    @Override
    public IComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.pc.almacenamiento= almacenamiento;
        return this;
    }

    /* Asigna la Grafica*/
    @Override
    public IComputadoraBuilder setGrafica(boolean tieneGrafica) {
        this.pc.tieneGrafica = tieneGrafica;
        return this;
    }

    /** Asigna la iluminacion de la computadora */
    @Override
    public IComputadoraBuilder setLucesRGB(boolean tieneLuces) {
        this.pc.tieneLucesRGB = tieneLuces;
        return this;
    }

    /**
     * Reinicia el proceso de construcción creando una nueva instancia de Computadora.
     * Esto borra cualquier configuración previa.
     * * @return La instancia actual del constructor.
     */
    @Override
    public IComputadoraBuilder reset() {
        this.pc = new Computadora();
        return this;
    }

    /**
     * Entrega la computadora terminada y automáticamente reinicia el constructor para que pueda ser utilizado en un nuevo ensamblaje.
     * * @return El objeto Computadora completamente configurado.
     */
    @Override
    public Computadora getComputadora() {
        Computadora resultado = this.pc;
        this.reset();//reseteamos para poder armar otro
        return resultado;
    }
}