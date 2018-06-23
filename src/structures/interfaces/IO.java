package structures.interfaces;

import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.Optional;

/**
 * Determina operaciones entre diferentes tipos de listas
 * 
 * @author DanielRosillo
 * @github DanielRosillo
 */
public interface IO<O>
{
    public void push(O o);

    public O pop();

    public O last();

    public O first();

    public boolean isEmpty();

    public int size();

    public void flush();

    public LinkedList<O> onList();

    public void remove(O o);

    public default String peek()
    {
	return ("Report - " + ZonedDateTime.now().getDayOfMonth() + "/" + ZonedDateTime.now().getMonthValue() + "/"
		+ ZonedDateTime.now().getYear() + "  " + ZonedDateTime.now().getHour() + "" + ":"
		+ ZonedDateTime.now().getMinute() + "" + ":" + ZonedDateTime.now().getSecond() + "\n" + "fist element: "
		+ first().toString() + "last element: " + last().toString() + "size: " + size() + "\n");
    }

    public default Optional<O> find(Object k)
    {
	return onList().stream().filter(x -> x.equals(k)).limit(1).findAny();
    }

    public default boolean contains(O o)
    {
	return (onList().contains(o));
    }
}
