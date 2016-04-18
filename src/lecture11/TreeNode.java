/**
 * CS2852
 * Spring 2016
 * Week 6
 */
package lecture11;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the tree node.
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class TreeNode<E> {
    private E value;
    private boolean hasParent;
    private List<TreeNode<E>> children;


    /**
     * Constructs the TreeNode.
     *
     * @param value the value to store in the node.
     */
    public TreeNode(E value) {
        this.value = value;
        children = new ArrayList<>();
    }

    /**
     * Adds a child to the tree node.
     *
     * @param child the child to add.
     */
    public void addChild(TreeNode<E> child) {

        if (child == null) {
            throw new IllegalArgumentException("Child cannot be null.");
        }

        if (child.hasParent) {
            throw new IllegalArgumentException("Child already has a parent.");
        }

        child.hasParent = true;
        children.add(child);
    }

    /**
     * Returns the height of the tree.
     *
     * @return the height of the tree.
     */
    public int height() {
        return postorder(this, 0, 0);
    }

    // this node is visited before child nodes.
    private int preorder(TreeNode<E> node, int height, int maxHeight) {
        height++;
        System.out.println(node.value + "  " + height + " " + maxHeight);

        if (maxHeight < height) {
            maxHeight  = height;
        }

        if(node.children.size() == 0) {
            return maxHeight;
        }

        for(TreeNode<E> child : node.children) {
            maxHeight = preorder(child, height, maxHeight);
        }

        return maxHeight;
    }

    // child nodes are visited before this node
    private int postorder(TreeNode<E> node, int height, int maxHeight) {
        height++;

        for(TreeNode<E> child : node.children) {
            maxHeight = preorder(child, height, maxHeight);
        }

        System.out.println(node.value + "  " + height + " " + maxHeight);
        if (maxHeight < height) {
            maxHeight  = height;
        }

        if(node.children.size() == 0) {
            return maxHeight;
        }
        return maxHeight;
    }

    /**
     * Traverses the tree using a given strategy.
     */
    public void traverse() {
        depthFirst();
        breadthFirst();
    }

    // Depth First is where you descend all the way down to a leaf, then up and down again.
    private void depthFirst() {
        System.out.println(value);

        //TODO use a Stack to visit each node.
        // 1.) start by pushing root onto the stack
        // 2.) while stack is not empty
        //    2a.) pop node off
        //    2b.) add children to stack
        //    2c.) recurse
    }

    // Breadth first is where you traverse linearly across each level.
    private void breadthFirst() {
        System.out.println(value);

        //TODO use a Queue to visit each node.
    }

    public static void main(String[] args) {
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

        a.traverse();
    }
}