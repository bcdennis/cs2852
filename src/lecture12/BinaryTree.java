/**
 * CS2852
 * Spring 2016
 * Week 6
 */
package lecture12;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a binary tree/node.
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class BinaryTree<E> {

    private Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(E data) {
        this.root = new Node<>(data);
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
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
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
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node<E> node = queue.remove();
            System.out.println(node.value);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
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

    public static void main(String[] args) {

        BinaryTree<String> g = new BinaryTree<>("G");
        BinaryTree<String> d = new BinaryTree<>("D", null, g);

        BinaryTree<String> h = new BinaryTree<>("H");
        BinaryTree<String> e = new BinaryTree<>("E", h, null);

        BinaryTree<String> i = new BinaryTree<>("I");
        BinaryTree<String> j = new BinaryTree<>("J");

        BinaryTree<String> f = new BinaryTree<>("F", i, j);

        BinaryTree<String> c = new BinaryTree<>("C", f, null);
        BinaryTree<String> b = new BinaryTree<>("B", d, e);

        BinaryTree<String> a = new BinaryTree<>("A", b, c);

        a.inorder();
        a.breadthFirst();
    }
}
