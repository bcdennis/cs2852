/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture15;



/**
 * Represents an autobalancing binary search tree (AVL).
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class AVLTree<E extends Comparable<E>> extends BinarySearchTreeWithRotations<E> {




    protected static class AVLNode<E> extends BinaryNode<E> {
        public static final int LEFT_HEAVY = -1;
        public static final int BALANCED = 0;
        public static final int RIGHT_HEAVY = 1;
        


        private AVLNode(E value) {
            super(value);
            this.left = null;
            this.right = null;
        }
    }
}
