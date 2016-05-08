/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture14;

/**
 * Defines the contract for a probing scheme in an open addressing hash table.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public interface ProbingStrategy {

    /**
     * Finds the index where the key exists or where to insert if the key does not exist.
     *
     * @param table the haystack.
     * @param key the needle.
     *
     * @return the index where the key was found, or the location to insert if it wasn't.
     */
    int find(HashTableEntry[] table, Object key);
}
