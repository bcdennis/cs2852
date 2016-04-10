/**
 * CS2852
 * Spring 2016
 * Week 5
 */
package lecture08;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * A LinkedList adapter for the PureQueue interface.
 *
 * @param <E> the list type.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class LinkedQueue<E> implements PureQueue<E> {
    private LinkedList<E> data;


    /**
     * Initializes the LinkedQueue.
     */
    public LinkedQueue() {
        clear();
    }

    /**
     * Inserts a specified element at the back of this PureQueue object.
     *
     * @param element - the element to be appended.
     */
    public void enqueue(E element) {
        data.addLast(element);
    }
    /**
     * Removes the front element from this PureQueue object.
     *
     * @return - the element removed.
     * @throws NoSuchElementException - if this PureQueue object is empty.
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return data.removeFirst();
    }

    /**
     * Returns the front element in this PureQueue object.
     *
     * @return - the element returned.
     * @throws NoSuchElementException - if this PureQueue object is empty.
     */
    public E front() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return data.getFirst();
    }

    /**
     * Determines if this PureQueue object has no elements.
     *
     * @return true - if this PureQueue object has no elements; otherwise,
     * return false.
     */
    public boolean isEmpty() {
        return data.size() == 0;
    }

    /**
     * Determines the number of elements in this PureQueue object.
     *
     * @return the number of elements in this PureQueue object.
     */
    public int size() {
        return data.size();
    }

    /**
     * Clears the PureQueue object of any elements.
     */
    public void clear() {
        data = new LinkedList<>();
    }
}
