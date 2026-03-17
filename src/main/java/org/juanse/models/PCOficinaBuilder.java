// ESTUDIANTE 2 - PARTE 1: Constructor de PC de Oficina
public class PCOficinaBuilder implements BuilderComputadora {

    private Computadora pc = new Computadora();

    @Override
    public void definirProcesador() { pc.procesador = "Intel Core i5"; }

    @Override
    public void definirRAM() { pc.ram = "16GB DDR4"; }

    @Override
    public void definirAlmacenamiento() { pc.almacenamiento = "512GB SSD"; }

    @Override
    public void instalarTarjetaGrafica() {
        // PC de oficina NO tiene tarjeta gráfica dedicada
        pc.tieneTarjetaGrafica = false;
    }

    @Override
    public void instalarLucesRGB() {
        // PC de oficina NO tiene luces RGB
        pc.tieneLucesRGB = false;
    }

    @Override
    public Computadora getResult() { return pc; }
}
