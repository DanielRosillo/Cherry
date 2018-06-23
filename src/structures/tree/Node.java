package structures.tree;

import structures.lists.Fifo;

/**
 * Modela un estado arbitrario para alguna estructura de busqueda de soluciones
 * 
 * @author DanielRosillo
 * @github DanielRosillo
 */
public class Node
{
    protected Fifo<Node> actions;// Acciones disponibles desde el estado
    protected String state;// Estado que representa en la estructura
    protected int level;// Nivel dentro de la estructura
    protected Node origin;// Estado origen
    protected boolean explored;// Semaforo multiusos
    protected boolean status;// semaforo multiusos
    protected double cost;// Costo del estado
    protected boolean root;// indica si el estado es el estado inicial

    /**
     * Crea un estado
     * @param value
     *            estado a representar
     * @param cost
     *            costo del estado a crear
     */
    public Node(String value, double cost)
    {
	actions = new Fifo<>();
	this.state = value;
	this.cost = cost;
    }

    public void setState(String value)
    {
	this.state = value;
    }

    public void setLevel(int level)
    {
	this.level = level;
    }

    public boolean isExplored()
    {
	return explored;
    }

    public void setExplored(boolean explored)
    {
	this.explored = explored;
    }

    public boolean isStatus()
    {
	return status;
    }

    public void setStatus(boolean status)
    {
	this.status = status;
    }

    public double getCost()
    {
	return cost;
    }

    public void setCost(double cost)
    {
	this.cost = cost;
    }

    public Node getOrigin()
    {
	return origin;
    }

    public void setOrigin(Node origin)
    {
	this.origin = origin;
    }

    public boolean isRoot()
    {
	return root;
    }

    public void setRoot(boolean root)
    {
	this.root = root;
    }

    @Override
    public int hashCode()
    {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((origin == null) ? 0 : origin.hashCode());
	long temp;
	temp = Double.doubleToLongBits(cost);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + (explored ? 1231 : 1237);
	result = prime * result + level;
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + (status ? 1231 : 1237);
	return result;
    }

    @Override
    public boolean equals(Object obj)
    {
	return this.state.equals(((Node) obj).state);
    }

    /**
     * 
     * @return true si el estado no contiene acciones (Nodo hoja)
     */
    public boolean isFinal()
    {
	return (actions.isEmpty()) ? true : false;
    }

    /**
     * 
     * @return el nivel que ocupa dentro de la estructura de soluciones
     */
    public int level()
    {
	return level;
    }

    public Fifo<Node> actions()
    {
	return actions;
    }

    /**
     * 
     * @param e
     *            Accion a asociar con el estado actual.
     */
    public void flourish(Node e)
    {
	actions.push(e);
    }

    /**
     * 
     * @return devuelve la primera accion disponible de ese estado
     */
    public Node pop()
    {
	return actions.pop();
    }

    /**
     * 
     * @return el estado que representa
     */
    public String state()
    {
	return state;
    }

    @Override
    public String toString()
    {
	return "NODE - " + "state: " + state + ",   level: " + level + ",   cost: " + cost + ",   actions: "
		+ actions.size() + "\n" + "status: " + status + ",   explored: " + explored + ",   root:" + isRoot()
		+ "]";
    }

}
