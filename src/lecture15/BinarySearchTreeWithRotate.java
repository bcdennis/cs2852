package lecture15;


/**
 * This class extends the BinarySearchTree by adding the rotate
 * operations. Rotation will change the balance of a search
 * tree while preserving the search tree property.
 * Used as a common base class for self-balancing trees.
 * @author Koffman and Wolfgang
 */
public class BinarySearchTreeWithRotate<E extends Comparable<E>>
     extends BinarySearchTree<E> {

    // Methods


    /**
     * Rotates right around the root.
     */
    public void rotateRight(){
        root = rotateRight(root);
    }
    /**
     * Method to perform a right rotation.
     * @pre  root is the root of a binary search tree.
     * @post root.right is the root of a binary search tree,
     *       root.right.right is raised one level,
     *       root.right.left does not change levels,
     *       root.left is lowered one level,
     *       the new root is returned.
     * @param root The root of the binary tree to be rotated
     * @return The new root of the rotated tree
     */
    protected Node<E> rotateRight(Node<E> root) {
        Node<E> temp = root.left;
        root.left = temp.right;
        temp.right = root;
        return temp;
    }


    /**
     * Rotates left around the root.
     */
    public void rotateLeft(){
        root = rotateLeft(root);
    }
    /**
     * Method to perform a left rotation (rotateLeft).
     * @pre  localRoot is the root of a binary search tree
     * @post localRoot.right is the root of a binary search tree
     *       localRoot.right.right is raised one level
     *       localRoot.right.left does not change levels
     *       localRoot.left is lowered one level
     *       the new localRoot is returned.
     * @param localRoot The root of the binary tree to be rotated
     * @return the new root of the rotated tree
     */
    protected Node<E> rotateLeft(Node<E> localRoot) {
        //TODO implement me
        return localRoot;
    }

    public static void main(String[] args) {
        BinarySearchTreeWithRotate<Integer> tree = new BinarySearchTreeWithRotate<>();
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
