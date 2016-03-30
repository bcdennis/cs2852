/**
 * CS2852
 * Spring 2016
 * Week 4-5
 */
package lecture08;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * Unit tests for a queue implementation.
 *
 * If you get "Empty Test suite" errors see:
 * http://stackoverflow.com/questions/14381694/
 * why-is-the-android-test-runner-reporting-empty-test-suite
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class QueueTest {

    Queue<String> queue;

    @Before
    public void setUp() throws Exception {
        queue = new ArrayDeque<>();
    }

    @After
    public void tearDown() throws Exception {
    }


}