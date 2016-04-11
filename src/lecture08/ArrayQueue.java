/**
 * CS2852
 * Spring 2016
 * Week 5
 */
package lecture08;

import java.util.NoSuchElementException;

/**
 * An array backed circular queue implementation of the PureQueue interface.
 *
 * @param <E> the list type.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class ArrayQueue<E> implements PureQueue<E> {
    private static final int CAPACITY = 10;
    private E[] data;
    private int front;
    private int rear;


    /**
     * Initializes the ArrayQueue.
     */
    public ArrayQueue() {
        clear();
    }

    /**
     * Inserts a specified element at the back of this PureQueue object.
     *
     * @param element - the element to be appended.
     */
    public void enqueue(E element) {
       //TODO implement me
    }
    /**
     * Removes the front element from this PureQueue object.
     *
     * @return - the element removed.
     * @throws NoSuchElementException - if this PureQueue object is empty.
     */
    public E dequeue() {
        //TODO implement me
        return null;
    }

    /**
     * Returns the front element in this PureQueue object.
     *
     * @return - the element returned.
     * @throws NoSuchElementException - if this PureQueue object is empty.
     */
    public E front() {
        //TODO implement me
        return null;
    }

    /**
     * Determines if this PureQueue object has no elements.
     *
     * @return true - if this PureQueue object has no elements; otherwise,
     * return false.
     */
    public boolean isEmpty() {
        //TODO implement me
        return false;
    }

    /**
     * Determines the number of elements in this PureQueue object.
     *
     * @return the number of elements in this PureQueue object.
     */
    public int size() {
        //TODO implement me
        return 0;
    }

    /**
     * Clears the PureQueue object of any elements.
     */
    public void clear() {
        //TODO implement me

    }
}
