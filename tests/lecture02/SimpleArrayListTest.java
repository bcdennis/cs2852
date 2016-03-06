/**
 * CS2852
 * Spring 2016
 * Week 1
 */
package lecture02;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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
public class SimpleArrayListTest {

    private SimpleArrayList<String> list;

    @Before
    public void setUp() {
        list = new SimpleArrayList<>();
    }

    @After
    public void tearDown() {
        list = null;
    }

    @Test
    public void testRemoveElementAtIndexCorrectlyRemovesElement() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        list.remove(0);

        assertFalse(list.contains("String A"));
        assertEquals(2, list.size());
        assertEquals(0, list.indexOf("String B"));
    }

    @Test
    public void testRemoveElementCorrectlyRemovesElement() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        boolean removed = list.remove("String A");

        assertFalse(list.contains("String A"));
        assertTrue(removed);
        assertEquals(2, list.size());
        assertEquals(0, list.indexOf("String B"));
    }

    @Test
    public void testRemoveElementOnlyRemovesFirstElement() throws Exception {
        list.add("String B");
        list.add("String A");
        list.add("String C");
        list.add("String A");

        boolean removed = list.remove("String A");

        assertTrue(list.contains("String A"));
        assertTrue(removed);
        assertEquals(2, list.indexOf("String A"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBoundsElement() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        list.remove(4);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddOutOfBoundsElement() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        list.add(4, "String D");
    }

    @Test
    public void testAddShiftsElements() throws Exception {
        list.add("String A");
        list.add("String C");
        list.add("String D");

        list.add(1, "String B");

        assertEquals(4, list.size());
        assertTrue(list.contains("String B"));
        assertEquals(1, list.indexOf("String B"));
    }

    @Test
    public void testClear() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        list.clear();

        assertTrue(list.isEmpty());
    }

    @Test
    public void testSetReplacesElement() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        list.set(1, "String D");

        assertEquals(1, list.indexOf("String D"));
        assertEquals(3, list.size());
        assertFalse(list.contains("String B"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOutofBoundsElementThrowsException() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        list.set(4, "String D");
    }

    @Test
    public void testToArray() throws Exception {
        String[] expected = {"String A", "String B", "String C"};

        list.add("String A");
        list.add("String B");
        list.add("String C");

        // See: http://stackoverflow.com/questions/22731706/
        // java-lang-classcastexception-ljava-lang-object-cannot-be-cast-to-ljava-lang
        Object[] actual = list.toArray();

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], (String)actual[i]);
        }
    }

    @Test
    public void testAddOneElementToList() throws Exception {
        list.add("String");

        assertTrue("String".equals(list.get(0)));
    }

    @Test
    public void testAddTwoElementsToList() throws Exception {
        list.add("String One");
        list.add("String Two");

        assertTrue("String Two".equals(list.get(1)));
        assertEquals(2 ,list.size());
    }

    @Test
    public void testContainsAddedString() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        assertTrue(list.contains("String B"));
    }

    @Test
    public void testAddElementInsertsCorrectly() throws Exception {
        list.add("String A");
        list.add("String C");
        list.add("String D");

        list.add(1, "String B");

        assertTrue(list.contains("String B"));
        assertEquals(1, list.indexOf("String B"));
        assertEquals(4, list.size());
    }

    @Test
    public void testIndexOfReturnsMinusOneForMissingElement() throws Exception {
        list.add("String A");
        list.add("String C");
        list.add("String D");

        assertEquals(-1, list.indexOf("String B"));
    }

    @Test
    public void testIndexOfReturnsCorrectIndex() throws Exception {
        list.add("String A");
        list.add("String B");
        list.add("String C");

        assertEquals(2, list.indexOf("String C"));
    }
    @Test
    public void testSizeEqualsZeroForEmptyList() throws Exception {
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeEqualsOneForSingleItemList() throws Exception {
        list.add("String");

        assertEquals(1, list.size());
    }

    @Test
    public void testEmptyListIsEmpty() throws Exception {
        assertTrue(list.isEmpty());
    }

    @Test
    public void testNonEmptyListIsntEmpty() throws Exception {
        list.add("String");

        assertFalse(list.isEmpty());
    }
}