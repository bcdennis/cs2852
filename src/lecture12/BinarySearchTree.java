/**
 * CS2852
 * Spring 2016
 * Week 7
 */
package lecture12;


/**
 * Represents the tree node.
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class BinarySearchTree<E extends Comparable<E>> implements SearchTree<E>{

    private boolean addReturn = false;
    private boolean deleteReturn;
    private BinaryNode<E> root;

    /**
     * Inserts item where it belongs in the tree.
     *
     * @param item the item to insert.
     * @return true if the item is inserted, false if the item is already in the tree.
     */
    @Override
    public boolean add(E item) {
        root = add(root, item);
        return addReturn;
    }

    private BinaryNode<E> add(BinaryNode<E> localRoot, E item) {
        //TODO implement me
        // update the addReturn value if it was successfully added or not.

        // if the root is null replace the empty tree with a new tree with the item at the root and return true.
        // if the item is equal to the local root then the item is already in the tree, return false.
        // if the item is less than the local root then recursively insert into the left subtree
        // if the item is greater than the local root then recursively insert into the right subtree.
        return null;
    }

    /**
     * Returns true if the target is found in the tree.
     *
     * @param target the item to look for.
     * @return true if the target exists in the tree.
     */
    @Override
    public boolean contains(E target) {
        //TODO implement me
        return false;
    }

    /**
     * Removes the target (if found) from the tree.
     *
     * @param target the item to remove.
     * @return the target if found, null otherwise.
     */
    @Override
    public boolean remove(E target) {
        root = remove(root, target);
        return deleteReturn;
    }

    private BinaryNode<E> remove(BinaryNode<E> localRoot, E item) {
        // item is not in the tree
        if(localRoot == null) {
            deleteReturn = false;
            return null;
        }

        // search for the item to delete
        int comparison = item.compareTo(localRoot.value);

        if (comparison < 0) {
            // item is smaller than the local root
            localRoot.left = remove(localRoot.left, item);
            return localRoot;
        } else if (comparison > 0) {
            // item is larger than the local root
            localRoot.right = remove(localRoot.right, item);
            return localRoot;
        } else {
            // item is the local root
            deleteReturn = true;

            if (localRoot.left == null) {
                // if there is no left child, return the right child.
                // this may also be null
                return localRoot.right;
            } else if (localRoot.right == null) {
                // if there is no right child, return the left child.
                return localRoot.left;
            } else {
                // node being deleted has two children, replace the data with
                // the inorder predecessor
                if (localRoot.left.right == null) {
                    // the left child has no right.  Replace the data with e data in the left child.
                    localRoot.value = localRoot.left.value;
                    localRoot.left = localRoot.left.left;
                    return localRoot;
                } else {
                    // Search for the inorder predecessor and replace deleted node's value with
                    // the inorder predecessor.
                    localRoot.value = findLargestChild(localRoot.left);
                    return localRoot;
                }
            }
        }
    }

    private E findLargestChild(BinaryNode<E> parent) {
        // if the right child has no right right child, it is the inorder predecessor
        if (parent.right.right == null) {
            E returnValue = parent.right.value;
            parent.right = parent.right.left;
            return returnValue;
        } else {
            return findLargestChild(parent.right);
        }
    }

    private static class BinaryNode<E extends Comparable<E>> {
        private E value;
        private BinaryNode<E> left;
        private BinaryNode<E> right;

        private BinaryNode(E value) {
            this.value = value;
            this.left = null;
            this.right = null;

        }
    }

    public static void main(String[] args) {
        //TODO implement some simple tests
    }
}
