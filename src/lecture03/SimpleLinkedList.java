/**
 * CS2852
 * Spring 2016
 * Week 1
 */
package lecture03;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Implementation of a simple ArrayList
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 *
 * @param <E> the list type.
 */
public class SimpleLinkedList<E> implements List<E> {
    private Node<E> head = null;


    /**
     * Adds the element to the end of the array.
     *
     * @param element the reference to add.
     * @return returns true if the element was added.
     */
    @SuppressWarnings("unchecked")
    public boolean add(E element) {
        Node<E> item = new Node<E>(element);
        Node<E> current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = item;

        return true;
    }

    /**
     * Inserts the element at the specified index
     *
     * @param index the index to put the element at.
     * @param element the element.
     *
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    @SuppressWarnings("unchecked")
    public void add(int index, E element) {
        //TODO implement me
    }

    /**
     * Removes the element at the specified position in this list (optional operation).
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     *
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        //TODO implement me
        return null;
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present (optional operation). If this list does not contain the element,
     * it is unchanged.  Shifts any subsequent elements to the left.
     *
     * @param target the element to be removed from the list, if present.
     * @return true if the list contained the element.
     */
    public boolean remove(Object target) {
        //TODO implement me
        return false;
    }

    /**
     * Removes all elements from the list.
     */
    @SuppressWarnings("unchecked")
    public void clear() {
        //TODO implement me
    }

    /**
     * Checks the elements to see if there is a matching one.
     * @param target the element to check.
     * @return true if the element exists.
     */
    public boolean contains(Object target) {
        //TODO implement me
        return false;
    }

    /**
     * Returns the index of the first occurrence of the specified element.
     *
     * @param target the element to search for.
     * @return the lowest index of the matched element, or -1 if not found.
     */
    public int indexOf(Object target) {
        //TODO implement me
        return 0;
    }

    /**
     * Returns the element at the index.
     * @param index the index to get the element at.
     * @return the element.
     */
    public E get(int index) {
        //TODO implement me
        return null;
    }

    /**
     * Replaces the element at the specified index
     *
     * @param index index of the element to replace
     * @param element the element to be stored.
     * @return the element previously at the specified position
     *
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public E set(int index, E element) {
        //TODO implement me
        return null;
    }
    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements currently stored in the array list.
     */
    public int size() {
        //TODO implement me
        return -1;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if the list contains no elements.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * The returned array will be "safe" in that no references to it are maintained by this list.
     * (In other words, this method must allocate a new array even if this list is backed
     * by an array).  The caller is thus free to modify the returned array.
     *
     * @return an array containing all of the elements in this list in proper sequence.
     */
    @SuppressWarnings("unchecked")
    public Object[] toArray() {
        E[] temp = (E[])new Object[size()];
        Node current = head;

        while (current.next != null) {
            temp[0] = (E)current.value;
            current = current.next;
        }

        return temp;
    }

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
        private Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }


    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
}