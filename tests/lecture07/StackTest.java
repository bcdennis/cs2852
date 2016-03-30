/**
 * CS2852
 * Spring 2016
 * Week 4
 */
package lecture07;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * Unit tests for our stack implementation.
 *
 * If you get "Empty Test suite" errors see:
 * http://stackoverflow.com/questions/14381694/
 * why-is-the-android-test-runner-reporting-empty-test-suite
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class StackTest {

    private LinkedListStack<String> stack;

    @Before
    public void setUp() throws Exception {
        stack = new LinkedListStack<>();
    }

    @After
    public void tearDown() throws Exception {
        stack = null;
    }

    @Test
    public void testPushAddsElementToTopOfStack() throws Exception {
        stack.push("A");

        assertEquals("A", stack.peek());

        stack.push("B");

        assertEquals("B", stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopThrowsExceptionOnEmptyStack() throws Exception {
        stack.pop();
    }

    @Test
    public void testPopRemovesTopOfStack() throws Exception {
        stack.push("A");
        String result = stack.pop();

        assertEquals("A", result);

        stack.push("B");
        stack.push("C");

        result = stack.pop();

        assertEquals("C", result);
    }

    @Test
    public void testIsEmptyWhenStackIsEmpty() throws Exception {
        assertTrue(stack.empty());
    }

    @Test
    public void testIsNotEmptyWhenStackHasElements() throws Exception {
        stack.push("A");
        assertFalse(stack.empty());
    }

    @Test
    public void testPeekReturnsCorrectTopElement() throws Exception {
        stack.push("A");
        assertEquals("A", stack.peek());

        stack.push("B");
        assertEquals("B", stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekThrowsExceptionOnEmptyStack() throws Exception{
        stack.peek();

    }


}