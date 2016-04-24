/**
 * CS2852
 * Spring 2016
 * Week 7
 */
package lecture12;

/**
 * Defines the search tree interface.
 *
 * @param <E> the type of values stored in the node.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public interface SearchTree<E> {

    /**
     * Inserts item where it belongs in the tree.
     *
     * @param item the item to insert.
     * @return true if the item is inserted, false if the item is already in the tree.
     */
    boolean add(E item);

    /**
     * Returns true if the target is found in the tree.
     *
     * @param target the item to look for.
     * @return true if the target exists in the tree.
     */
    boolean contains(E target);

    /**
     * Returns a reference to the data in the node that is equal to the target.
     *
     * @param target the item to look for.
     * @return the reference, if found, null otherwise.
     */
    E find(E target);

    /**
     * Removes the target (if found) from the tree.
     *
     * @param target the item to remove.
     * @return the target if found, null otherwise.
     */
    E delete(E target);

    /**
     * Removes the target (if found) from the tree.
     *
     * @param target the item to remove.
     * @return true if found, false if not found.
     */
    boolean remove (E target);
}
