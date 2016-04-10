/**
 * CS2852
 * Spring 2016
 * Week 8
 */
package lecture08;

import java.util.NoSuchElementException;

/**
 * A clean queue interface without all the Collection<E> requirements.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 *
 * @param <E> the list type.
 */
public interface PureQueue<E> {     // Note: does not extend Collection<E>

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
     * Clears the PureQueue object of any elements.
     */
    void clear();

    /**
     * Inserts a specified element at the back of this PureQueue object.
     *
     * @param element - the element to be appended.
     */
    void enqueue(E element);


    /**
     * Removes the front element from this PureQueue object.
     *
     * @return - the element removed.
     * @throws NoSuchElementException - if this PureQueue object is empty.
     */
    E dequeue();

    /**
     * Returns the front element in this PureQueue object.
     *
     * @return - the element returned.
     * @throws NoSuchElementException - if this PureQueue object is empty.
     */
    E front();

}
