/**
 * CS2852
 * Spring 2016
 * Week 5
 */
package lecture10;

import lecture08.PureStack;

/**
 * Stubbed method for the areEqual exercise.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class Exercise {

    /**
     *  Write a method areEqual that returns true if the two stacks specified in the parameters have the same
     *  elements in the same order, and false otherwise. Two elements are the same if they refer to the same object.
     *  The method may remove elements from the stacks, but it must return the elements to the stacks in the same
     *  order to restore the stacks to their original state. The only additional data structure that it can use as
     *  auxiliary storage is a single stack (i.e., no arrays, no ArrayLists, no linked lists no queues, no strings...).
     *  The method may also use O(1) additional space.
     *
     * @param stack1 the first stack to compare.
     * @param stack2 the second stack to compare.
     * @param <E> the type of stack being compared.
     * @return true if both stacks contain the same elements, in the same order.
     */
    public static <E> boolean areEqual(PureStack<E> stack1, PureStack<E> stack2) {
        throw new UnsupportedOperationException("remove this line");
    }
}
