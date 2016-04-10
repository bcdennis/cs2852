/**
 * CS2852
 * Spring 2016
 * Week 5
 */
package lecture08;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * An ArrayList adaptor for the PureStack interface.
 *
 * @param <E> the list type.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class ArrayStack<E> implements PureStack<E>{
    private ArrayList<E> data;

    /**
     * Initialize the ArrayStack
     */
    public ArrayStack() {
        clear();
    }

    /**
     * Inserts a specified element on the top of this ArrayStack.
     * The averageTime(n) is constant and worstTime(n) is O(n).
     *
     * @param element - the element to be pushed.
     */
    public void push(E element) {
        data.add(element);
    }

    /**
     * Removes the top element from this ArrayStack.
     *
     * @return - the element removed.
     * @throws EmptyStackException - if this PureStack object is empty.
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.remove(data.size() - 1);
    }

    /**
     * Returns the top element on this ArrayStack.
     *
     * @return - the element returned.
     * @throws EmptyStackException - if this PureStack object is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1);
    }


    /**
     * Determines if this ArrayStack object has no elements.
     *
     * @return true - if this ArrayStack object has no elements; otherwise,
     * return false.
     */
    public boolean isEmpty() {
        return data.size() == 0;
    }

    /**
     * Determines the number of elements in this ArrayStack object.
     *
     * @return the number of elements in this ArrayStack object.
     */
    public int size() {
        return data.size();
    }

    /**
     * Clears the PureStack of any elements.
     */
    public void clear() {
        data = new ArrayList<>();
    }
}
