/**
 * CS2852
 * Spring 2016
 * Week 1
 */
package lecture04;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Implementation of a simple ArrayList
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 *
 * @param <E> the list type.
 */
public class SimpleArrayList<E> implements List<E> {
    private static final int DEFAULT_SIZE = 0;

    @SuppressWarnings("unchecked")
    private E[] elements = (E[])new Object[DEFAULT_SIZE];

    /**
     * Adds the element to the end of the array.
     *
     * @param element the reference to add.
     * @return returns true if the element was added.
     */
    @SuppressWarnings("unchecked")
    public boolean add(E element) {
        E[] temp = (E[]) new Object[size() + 1];

        for (int i = 0; i < size(); i++) {
            temp[i] = elements[i];
        }

        temp[size()] = element;
        elements  = temp;

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
        if (index > size()) {
            throw new IndexOutOfBoundsException("Can't add element to index " + index
                    + " in list of size " + size());
        }

        E[] temp = (E[]) new Object[size() + 1];

        for (int i = 0; i < index; i++) {
            temp[i] = elements[i];
        }

        temp[index] = element;

        for (int i = index; i < size(); i++) {
            temp[i + 1] = elements[i];
        }
        elements  = temp;
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
        if (index > size() -1) {
            throw new IndexOutOfBoundsException("Can't add element to index "
                    + index + " in list of size " + size());
        }

        E target = elements[index];
        E[] temp = (E[]) new Object[size() - 1];

        for (int i = 0; i < size(); i++) {
            if (i < index) {
                temp[i] = elements[i];
            } else if (i > index) {
                temp[i-1] = elements[i];
            }
        }

        elements = temp;
        return target;
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
        boolean hasTarget = false;
        for (int i = 0; i < size(); i++) {
            hasTarget = ((E)target).equals(elements[i]);
            if (hasTarget) {
                remove(i);
                break;
            }
        }

        return hasTarget;
    }

    /**
     * Removes all elements from the list.
     */
    @SuppressWarnings("unchecked")
    public void clear() {
        elements = (E[]) new Object[DEFAULT_SIZE];
    }

    /**
     * Checks the elements to see if there is a matching one.
     * @param target the element to check.
     * @return true if the element exists.
     */
    public boolean contains(Object target) {
        boolean contains = false;

        for (E e : elements) {
            if  (((E)target).equals(e)) {
                contains = true;
                break;
            }
        }

        return contains;
    }

    /**
     * Returns the index of the first occurrence of the specified element.
     *
     * @param target the element to search for.
     * @return the lowest index of the matched element, or -1 if not found.
     */
    public int indexOf(Object target) {
        int index = -1;

        for (int i = 0; i < size(); i++) {
            if (((E)target).equals(elements[i])) {
                index = i;
                break;
            }
        }

        return index;
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
     * Replaces the element at the specified index
     *
     * @param index index of the element to replace
     * @param element the element to be stored.
     * @return the element previously at the specified position
     *
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public E set(int index, E element) {
        if (index > size() -1) {
            throw new IndexOutOfBoundsException("Can't add element to index "
                    + index + " in list of size " + size());
        }
        E temp = elements[index];
        elements[index] = element;

        return temp;
    }
    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements currently stored in the array list.
     */
    public int size() {
        return elements.length;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if the list contains no elements.
     */
    public boolean isEmpty() {
        return size() == 0;
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
        for (int i = 0; i < size(); i++) {
            temp[i] = elements[i];
        }
        return temp;
    }

    /**
     *  Returns an iterator for the list.
     *
     * @return an iterator to iterator over the underlying collection.
     */
    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    /**
     * An inner class implementing Iterator for our SimpleArrayList
     */
    private class ArrayListIterator implements Iterator<E> {


        private ArrayListIterator() {

        }

        /**
         * Returns true if there is another element available in the list.
         *
         * @return true if there is another element available.
         */
        @Override
        public boolean hasNext() {

            return false;
        }

        /**
         * Returns the next element in the list.
         *
         * @return the next element in the list.
         * @throws java.util.NoSuchElementException if there is no element available.
         */
        @Override
        public E next() {

            return null;
        }

        /**
         *  Removes the last element returned by this iterator.
         *
         *  @throws java.lang.IllegalStateException if no element can be removed.
         */
        @Override
        public void remove() {

        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
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