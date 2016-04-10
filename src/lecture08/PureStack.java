/**
 * CS2852
 * Spring 2016
 * Week 8
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
     * Determines the number of elements in this PureQueue object.
     *
     * @return the number of elements in this PureQueue object.
     */
    int size();


    /**
     * Determines if this PureQueue object has no elements.
     *
     * @return true - if this PureQueue object has no elements; otherwise,
     * return false.
     */
    boolean isEmpty();


    /**
     * Inserts a specified element on the top of this PureStack object.
     * The averageTime(n) is constant and worstTime(n) is O(n).
     *
     * @param element - the element to be pushed.
     */
    void push(E element);


    /**
     * Removes the top element from this PureStack object.
     *
     * @return - the element removed.
     * @throws NoSuchElementException - if this PureStack object is empty.
     */
    E pop();

    /**
     * Returns the top element on this PureStack object.
     *
     * @return - the element returned.
     * @throws NoSuchElementException - if this PureStack object is empty.
     */
    E peek();

}
