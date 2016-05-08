/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture14;


/**
 * Defines the HashTable interface.
 *
 * @param <K> the type of keys stored in the hash table.
 * @param <V> the type of values stored in the hash table.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public interface HashTable<K, V> {

    /**
     * Returns the value associated with the specified key.  Returns null if the key is not present.
     *
     * @param key the key mapping for the value.
     * @return the value associated with the key. Null if not found.
     */
    V get(Object key);

    /**
     * returns true if this table contains no key-value mappings.
     *
     * @return  True if the table is empty.
     */
    boolean isEmpty();

    /**
     * Associates the key with the value.
     *
     * @param key the key to use for the mapping.
     * @param value  the value to map to the key.
     * @return Returns the previous value associated with the key, or null if there was none.
     */
    V put(K key, V value);

    /**
     * Removes the mapping for this key.
     *
     * @param key  The key to remove.
     * @return The value that was mapped to the key, or null if nothing was.
     */
    V remove(Object key);

    /**
     * Returns the size of the table.
     *
     * @return the size of the table.
     */
    int size();

}
