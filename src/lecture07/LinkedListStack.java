/**
 * CS2852
 * Spring 2016
 * Week 4
 */
package lecture07;

import java.util.EmptyStackException;

/**
 * Implementation of a simple stack
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 *
 * @param <E> the list type.
 */
public class LinkedListStack<E> {

    private Node<E> top;

    /**
     * Creates an empty Stack.
     */
    public LinkedListStack() {
        top = null;
    }


    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack.
     * @return the item argument.
     */
    public E push(E item) {
        Node<E> element = new Node<>(item);

        if (top == null) {
            top = element;
        } else {
            element.next = top;
            top = element;
        }

        return item;
    }

    /**
     * Removes the object at the top of the stack and returns it.
     *
     * @return the object at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        Node<E> element = top;
        top = top.next;

        return element.value;
    }


    /**
     * Looks at the object at the top of this stack without removing it.
     *
     * @return the object at the top of the stack.
     */
    public E peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.value;
    }
    /**
     * Tests if the stack is empty.
     *
     * @return true if the stack is empty.
     */
    public boolean empty() {
        return top == null;
    }

    /**
     * The structure used to maintain the list.
     *
     * @param <E>  The data type of the element stored in the node.
     */
    private static class Node<E> {
        private E value;
        private Node<E> next;


        /**
         * Creates a node with no next reference.
         *
         * @param value the reference data.
         */
        private Node(E value) {
            this.value = value;
            next = null;
        }
        /**
         * Creates a new Node with a pointer to the next one in the list.
         *
         * @param value the object contained in the node.
         * @param next the pointer to the next node in the list.
         */
        private Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}
