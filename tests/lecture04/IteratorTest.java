/**
 * CS2852
 * Spring 2016
 * Week 1
 */
package lecture04;


import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Unit tests for our array-based list implementation.
 *
 * If you get "Empty Test suite" errors see:
 * http://stackoverflow.com/questions/14381694/
 * why-is-the-android-test-runner-reporting-empty-test-suite
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class IteratorTest {

    private SimpleLinkedList<String> list;
    private Iterator iterator;

    @Before
    public void setUp() {
        list = new SimpleLinkedList<>();
        iterator = list.iterator();
    }

    @After
    public void tearDown() {
        list = null;
    }

    @Test (expected=NoSuchElementException.class)
    public void testNextOnEmptyListThrowsException() throws Exception {
        iterator.next();
    }

    @Test
    public void testHasNextOnEmptyListReturnsFalse() throws Exception {
        assertFalse(iterator.hasNext());
    }


    @Test
    public void testHasNextOnNonEmptyListReturnsTrue() throws Exception {
        list.add("A");
        list.add("B");

        assertTrue(iterator.hasNext());
    }

    @Test (expected = IllegalStateException.class)
    public void testCantRemoveBeforeCallingNext() throws Exception {
        list.add("A");
        list.add("B");

        iterator.remove();
    }

    @Test
    public void testCanRemoveAfterCallingNext() throws Exception {
        list.add("A");
        list.add("B");

        iterator.next();
        iterator.remove();
    }

    @Test
    public void testNextIteratesThroughList() throws Exception {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("D", iterator.next());

        assertFalse(iterator.hasNext());
    }

    @Test
    public void testRemoveRemovesItemsFromList() throws Exception {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        iterator.next();
        iterator.remove();

        assertEquals(3, list.size());

        iterator.next();
        iterator.remove();

        assertEquals(2, list.size());

        iterator.next();
        iterator.remove();

        assertEquals(1, list.size());

        iterator.next();
        iterator.remove();

        assertEquals(0, list.size());

    }
}