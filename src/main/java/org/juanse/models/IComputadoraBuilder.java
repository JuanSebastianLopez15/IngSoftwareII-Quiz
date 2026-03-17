package org.juanse.models;

/**
 *Define el contrato o los pasos necesarios para construir un objeto Computadora
 */
public interface IComputadoraBuilder {
    /**
     * Establece el procesador de la computadora.
     * * @param procesador El modelo del procesador
     * @return La instancia actual del constructor para encadenar métodos.
     */
    IComputadoraBuilder setProcesador(String procesador);
    /**
     * Establece la cantidad de memoria RAM.
     * * @param ram La cantidad de RAM
     * @return La instancia actual del constructor para encadenar métodos.
     */
    IComputadoraBuilder setRam(int ram);
    /**
     * Establece la capacidad de almacenamiento interno.
     * * @param almacenamiento La capacidad de almacenamiento.
     * @return La instancia actual del constructor para encadenar métodos.
     */
    IComputadoraBuilder setAlmacenamiento(int almacenamiento);
    /**
     * Configura si la computadora llevará tarjeta gráfica dedicada.
     * * @param tieneGrafica true para incluir gráfica dedicada, false para omitirla.
     * @return La instancia actual del constructor para encadenar métodos.
     */
    IComputadoraBuilder setGrafica(boolean tieneGrafica);
    /**
     * Configura si la computadora incluirá luces RGB.
     * * @param tieneLuces true para incluir luces RGB, false para omitirlas.
     * @return La instancia actual del constructor para encadenar métodos.
     */
    IComputadoraBuilder setLucesRGB(boolean tieneLuces);
    /**
     * Limpia la configuración actual y prepara el constructor para ensamblar
     * una computadora completamente nueva y en blanco.
     * * @return La instancia actual del constructor reiniciada.
     */
    IComputadoraBuilder reset();
    /**
     * Devuelve el producto final (la computadora) una vez que se han configurado todos sus componentes.
     * * @return El objeto Computadora ya construido.
     */
    Computadora getComputadora(); // Igual al getCasa() de tu profe
}