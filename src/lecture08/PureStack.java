/**
 * CS2852
 * Spring 2016
 * Week 5
 */
package lecture08;

/**
 * A clean queue interface without all the Collection<E> requirements.
 *
 * @param <E> the list type.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public interface PureStack<E> {     // Note: does not extend Collection<E>

    /**
     * Determines the number of elements in this PureStack object.
     *
     * @return the number of elements in this PureStack object.
     */
    int size();


    /**
     * Determines if this PureStack object has no elements.
     *
     * @return true - if this PureStack object has no elements; otherwise,
     * return false.
     */
    boolean isEmpty();


    /**
     * Inserts a specified element on the top of this PureStack object.
     *
     * @param element - the element to be pushed.
     */
    void push(E element);


    /**
     * Removes the top element from this PureStack object.
     *
     * @return - the element removed.
     * @throws EmptyStackException - if this PureStack object is empty.
     */
    E pop();

    /**
     * Returns the top element on this PureStack object.
     *
     * @return - the element returned.
     * @throws EmptyStackException - if this PureStack object is empty.
     */
    E peek();

    /**
     * Clears the PureStack of any elements.
     */
    void clear();

}
