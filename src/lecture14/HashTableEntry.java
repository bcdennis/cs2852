/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture14;

/**
 * Defines the contract for an entry  in a hash table.
 *
 * @param <K> the type of keys stored in the hash table.
 * @param <V> the type of values stored in the hash table.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public interface HashTableEntry<K,V> {

    /**
     * Gets the key for this entry.
     *
     * @return the key.
     */
    K getKey();

    /**
     * Gets the value for this entry.
     *
     * @return the value.
     */
    V getValue();

    /**
     * Sets the value for the entry.
     *
     * @param value  The value for this entry.
     * @return The previous value, or null if there wasn't one.
     */
    V setValue(V value);

}
