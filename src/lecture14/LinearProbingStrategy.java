/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture14;

/**
 * Implements a linear probing scheme in an open addressing hash table.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class LinearProbingStrategy implements ProbingStrategy {

    /**
     * Finds the index where the key exists or where to insert if the key does not exist.
     *
     * @param table the haystack.
     * @param key the needle.
     *
     * @return the index where the key was found, or the location to insert if it wasn't.
     */
    @Override
    public int find(HashTableEntry[] table, Object key) {
        //Calculate the starting index.
        System.out.println("probing for: " + key);
        int index = key.hashCode() % table.length;

        // make the index positive if it's not.
        if (index < 0) {
            index += table.length;
        }
        System.out.println("starting index: " + index);

        // search linearly until an empty slot is reached or the key is found.
        while ((table[index] != null) && !key.equals(table[index].getKey())) {
            index++;
            System.out.println(" - probing index: " + index);
            // wrap around and keep searching.
            if (index >= table.length) {
                index = 0;
            }

            // what conditions would this be an infinite loop?
        }
        System.out.println(" - final index: " + index);
        return index;
    }
}
