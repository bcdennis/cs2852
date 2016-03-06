/**
 * CS2852
 * Spring 2016
 * Week 1
 */
package lecture02;

/**
 * Implementation of a simple ArrayList
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 *
 * @param <E> the list type.
 */
public class SimpleArrayList<E>  {
    private static final int DEFAULT_SIZE = 10;

    @SuppressWarnings("unchecked")
    protected E[] elements = (E[])new Object[DEFAULT_SIZE];


    /**
     * Removes all elements from the list.
     */
    public void clear() {
        elements = (E[]) new Object[DEFAULT_SIZE];
    }

    /**
     * Returns the element at the index.
     * @param index the index to get the element at.
     * @return the element.
     */
    public E get(int index) {
        return elements[index];
    }

    /**
     * Returns the number of elements currently stored in the array list.
     * @return the size
     */
    public int size() {
        return elements.length;
    }

}