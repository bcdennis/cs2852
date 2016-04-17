/**
 * CS2852
 * Spring 2016
 * Week 6
 */
package lecture11;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests for our Tree.
 *
 * If you get "Empty Test suite" errors see:
 * http://stackoverflow.com/questions/14381694/
 * why-is-the-android-test-runner-reporting-empty-test-suite
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class TreeTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testHeightReturnsCorrectHeight() throws Exception {
        TreeNode<String> a = new TreeNode<>("A");
        TreeNode<String> b = new TreeNode<>("B");
        TreeNode<String> c= new TreeNode<>("C");
        TreeNode<String> d = new TreeNode<>("D");
        TreeNode<String> e = new TreeNode<>("E");
        TreeNode<String> f = new TreeNode<>("F");
        TreeNode<String> g = new TreeNode<>("G");

        b.addChild(c);
        b.addChild(d);
        e.addChild(f);
        f.addChild(g);

        a.addChild(b);
        a.addChild(e);

        assertEquals(4, a.height());
    }

}