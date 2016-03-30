/**
 * CS2852
 * Spring 2016
 * Week 4
 */
package lecture07;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implementation of a simple stack
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 *
 * @param <E> the list type.
 */
public class ArrayListStack<E> {

    private ArrayList<E> elements;

    /**
     * Creates an empty Stack.
     */
    public ArrayListStack() {

    }


    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack.
     * @return the item argument.
     */
    public E push(E item) {
        //TODO implement me
        return null;
    }

    /**
     * Removes the object at the top of the stack and returns it.
     *
     * @return the object at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        //TODO implement me
        return null;
    }


    /**
     * Looks at the object at the top of this stack without removing it.
     *
     * @return the object at the top of the stack.
     */
    public E peek() {
        //TODO implement me
        return null;
    }
    /**
     * Tests if the stack is empty.
     *
     * @return true if the stack is empty.
     */
    public boolean empty() {
        //TODO implement me
        return false;
    }

}
