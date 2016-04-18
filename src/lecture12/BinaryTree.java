/**
 * CS2852
 * Spring 2016
 * Week 6
 */
package lecture12;

/**
 * Represents a binary tree/node.
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class BinaryTree<E> {

    protected Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node<E> root) {
        this.root = root;
    }

    public BinaryTree(E data, BinaryTree<E> left, BinaryTree<E> right) {
        root = new Node<>(data);
        if (left != null) {
            root.left = left.root;
        }
        if (right != null) {
            root.right = right.root;
        }
    }

    /**
     * Executes a pre-order traversal.
     */
    public void preorder() {

    }

    /**
     * Executes an in-order traversal. This makes no sense in a regular tree.
     * Why?
     */
    public void inorder() {

    }

    /**
     * Executes a post-order traversal.
     */
    public void postorder() {

    }
    /**
     * Executes a BFS iteratively with a Queue.
     */
    public void breadthFirst() {
        //TODO implement me using a Queue
    }

    /**
     * Executes a DFS iteratively with a stack.
     */
    public void depthFirst() {
        //TODO implement me using a Stack
    }

    /**
     * Calculates and returns the height of the binary tree.
     *
     * @return the height.
     */
    public int height() {
        //TODO implement me
        return -1;
    }

    /**
     *Determine whether this tree is a leaf.
     *
     * @return true if the root has no children
     */
    public boolean isLeaf() {
        //TODO implement me
        return false;
    }

    /**
     * Gets the left subtree of this node.
     *
     * @return the left subtree of the node and null otherwise.
     */
    public BinaryTree<E> getLeftSubtree(){
        return null;
    }

    /**
     * Gets the right subtree of this node.
     *
     * @return the right subtree of the node and null otherwise.
     */
    public BinaryTree<E> getRightSubtree() {
        return null;
    }

    private static class Node<E> {
        private E value;
        private Node<E> left;
        private Node<E> right;


        public Node(E value) {
            this.value  = value;
            left = null;
            right = null;
        }

    }
}
