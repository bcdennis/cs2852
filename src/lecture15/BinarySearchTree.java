/**
 * CS2852
 * Spring 2016
 * Week 7
 */
package lecture15;


import lecture12.SearchTree;


/**
 * Represents the tree node.
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class BinarySearchTree<E extends Comparable<E>> implements SearchTree<E> {

    private boolean addReturn = false;
    private boolean deleteReturn;
    protected BinaryNode<E> root;

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

        if (localRoot == null) {
            // item was added
            addReturn = true;
            return new BinaryNode<>(item);
        } else if (item.compareTo(localRoot.value) == 0) {
            // item was already in tree
            addReturn = false;
            return localRoot;
        } else if (item.compareTo(localRoot.value) < 0) {
            // item is less than localroot
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {
            // item is greater than localroot
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }

    /**
     * Returns true if the target is found in the tree.
     *
     * @param target the item to look for.
     * @return true if the target exists in the tree.
     */
    @Override
    public boolean contains(E target) {
        return contains(root, target);
    }

    private boolean contains(BinaryNode<E> localRoot, E target) {
        if (localRoot == null) {
            return false;
        }

        int comparison = target.compareTo(localRoot.value);
        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            // look left
            return contains(localRoot.left, target);
        } else {
            // look right
            return contains(localRoot.right, target);
        }
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

    /**
     * Returns the height of tree.
     *
     * @return The height of the tree.
     */
    public int height() {
        return height(root);
    }

    /**
     * Returns the height of the left subtree.
     *
     * @return the height of the left subtree.
     */
    public int heightLeft() {
        return height(root.left);
    }

    /**
     * Returns the height of the left subtree.
     *
     * @return the height of the left subtree.
     */
    public int heightRight() {
        return height(root.right);
    }

    private int height(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /**
     * Pretty prints the binary search tree.
     */
    public void print() {
        print(root, true, "");
    }

    private void print(BinaryNode<E> node, boolean isTail, String indent) {

        if(node.right != null) {
            print(node.right, false, indent + (isTail ? "│   " : "    "));
        }
        System.out.println(indent + (isTail ? "└── " : "┌── ") + node.value);

        if(node.left!=null) {
            print(node.left, true, indent + (isTail ? "    " :"│   "));
        }
    }

    protected static class BinaryNode<E extends Comparable<E>> {
        protected E value;
        protected BinaryNode<E> left;
        protected BinaryNode<E> right;

        protected BinaryNode(E value) {
            this.value = value;
            this.left = null;
            this.right = null;

        }
    }


}
