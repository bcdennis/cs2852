/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture15;



/**
 * Represents a binary search tree that can rotate left and right.
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class BinarySearchTreeWithRotations<E extends Comparable<E>> extends BinarySearchTree<E> {


    /**
     * Performs a right rotation on a binary tree.
     */
    public void rotateRight() {
        root = rotateRight(root);
    }

    /**
     * Performs a left rotation
     */
    public void rotateLeft() {
        root = rotateLeft(root);
    }

    protected BinaryNode<E> rotateRight(BinaryNode node) {
        if (node.left == null) {
            // can't rotate right.
            return null;
        }

        BinaryNode<E> temp = node.left;
        node.left = temp.right;
        temp.right = node;
        node = temp;

        return node;
    }

    protected BinaryNode<E> rotateLeft(BinaryNode node) {
        //TODO Implement me
        return node;
    }



    public static void main(String[] args) {
        BinarySearchTreeWithRotations<Integer> tree = new BinarySearchTreeWithRotations<>();
        //int[] unbalanced = {5, 8, 10, 15, 20, 25, 30, 35, 37, 40, 45, 50};
        int[] integers = {30, 20, 25, 15, 10, 5, 8, 35, 40, 37, 45, 50};

        for(int i = 0; i < integers.length; i++) {
            tree.add(integers[i]);
        }


        System.out.println("L height: " + tree.heightLeft() + "  R height: " + tree.heightRight());
        tree.print();


        System.out.println("\n=============[AFTER RIGHT ROTATION]===================\n");
        tree.rotateRight();
        System.out.println("L height: " + tree.heightLeft() + "  R height: " + tree.heightRight());
        tree.print();

        System.out.println("\n=============[AFTER RIGHT ROTATION]===================\n");
        tree.rotateRight();
        System.out.println("L height: " + tree.heightLeft() + "  R height: " + tree.heightRight());
        tree.print();
    }
}
