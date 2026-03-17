package org.juanse.models;

public class PCGamerBuilder implements IComputadoraBuilder{

    private Computadora pc;

    public PCGamerBuilder(){
        this.reset();
    }

    @Override
    public IComputadoraBuilder setProcesador(String procesador) {
        this.pc.procesador = procesador;
        return this;
    }

    @Override
    public IComputadoraBuilder setRam(int ram) {
        this.pc.ram = ram;
        return this;
    }

    @Override
    public IComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.pc.almacenamiento= almacenamiento;
        return this;
    }

    @Override
    public IComputadoraBuilder setGrafica(boolean tieneGrafica) {
        this.pc.tieneGrafica = tieneGrafica;
        return this;
    }

    @Override
    public IComputadoraBuilder setLucesRGB(boolean tieneLuces) {
        this.pc.tieneLucesRGB = tieneLuces;
        return this;
    }

    @Override
    public IComputadoraBuilder reset() {
        this.pc = new Computadora();
        return this;
    }

    @Override
    public Computadora getComputadora() {
        Computadora resultado = this.pc;
        this.reset();//reseteamos para poder armar otro
        return resultado;
    }
}
