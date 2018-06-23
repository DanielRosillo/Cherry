package structures.interfaces;

import java.util.LinkedList;

/**
 * Ofrece una base bioinspirada para la creacion de una estructura de soluciones
 * 
 * @author DanielRosillo
 * @github DanielRosillo
 */
public interface Nature<R>
{
    /**
     * Florece(agrega) un nuevo estado en la estructura de estados
     * 
     * @param father
     *            Estado Origen
     * @param o
     *            Nuevo estado
     */
    public void flourish(R father, R o);

    /**
     * Elimina un estado de la estructura esto incluye sus acciones
     * asociadas(estados)
     * 
     * @param leaf
     *            estado a eliminar
     */
    public void wither(R leaf);

    /*
     * Numero de estados en la estructura
     */

    public int size();

    /**
     * Enjuaga(elimina) todos los estados de la estructura
     * 
     */
    public void flush();

    /**
     * 
     * @return la estructura en forma de una lista enlazada
     */
    public LinkedList<R> onList();

}
