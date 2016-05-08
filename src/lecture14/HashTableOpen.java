/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture14;

/**
 * Represents the an open-addressing implementation of HashTable
 *
 * @param <K> the type of keys stored in the hash table.
 * @param <V> the type of values stored in the hash table.
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class HashTableOpen<K,V> implements HashTable<K,V> {

    private static final int START_CAPACITY = 17;
    private static final double LOAD_THRESHOLD = 0.75;

    private Entry<K, V>[] table;
    private final Entry<K,V> deletedEntry = new Entry<K, V>(null, null);


    private ProbingStrategy strategy;
    private int numberOfKeys;
    private int numberOfDeletes;


    /**
     * Constructs the open addressing table.
     *
     * @param strategy the probing scheme to use.
     */
    @SuppressWarnings("unchecked")
    public HashTableOpen(ProbingStrategy strategy) {
        this.strategy = strategy;
        table = new Entry[START_CAPACITY];
    }
    /**
     * Returns the value associated with the specified key.  Returns null if the key is not present.
     *
     * @param key the key mapping for the value.
     * @return the value associated with the key. Null if not found.
     */
    @Override
    public V get(Object key) {
        int index = find(key);
        V returnValue = null;

        if (table[index] != null) {
            returnValue = table[index].value;
        }

        return returnValue;
    }

    /**
     * returns true if this table contains no key-value mappings.
     *
     * @return True if the table is empty.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Associates the key with the value.
     *
     * @param key   the key to use for the mapping.
     * @param value the value to map to the key.
     * @return Returns the previous value associated with the key, or null if there was none.
     */
    @Override
    public V put(K key, V value) {
        int index = find(key);
        V returnValue = value;

        // if an empty element was found, insert a new entry.
        if (table[index] == null) {
            table[index] = new Entry<K,V>(key, value);
            numberOfKeys++;

            if (shouldRehash()) {
                rehash();
            }
        } else {
            // replace the value at this key and return the old one.
            returnValue = table[index].value;
            table[index].value = value;
        }

        return returnValue;
    }

    /**
     * Removes the mapping for this key.
     *
     * @param key The key to remove.
     * @return The value that was mapped to the key, or null if nothing was.
     */
    @Override
    public V remove(Object key) {
        // TODO implement me
        // 1. find the the first item that is empty or the element that contains the key.
        // 2. if empty was found return null
        // 3. if key was found, replace this item with the deleted object, increment deleted , decrement keys
        // 4. return the value for this key

        return null;
    }

    /**
     * Returns the size of the table.
     *
     * @return the size of the table.
     */
    @Override
    public int size() {

        //TODO implement me
        return 0;
    }

    private int find(Object key) {
        return strategy.find(table, key);
    }

    private boolean shouldRehash() {
        // What is the consequence of forgetting to cast this as a double?
        double loadFactor = (double) (numberOfKeys + numberOfDeletes) /table.length;
        System.out.println(" - load factor: " + loadFactor);
        return (loadFactor > LOAD_THRESHOLD);
    }

    private void rehash() {
        //TODO implement me
        // 1. double the capacity of the old table, keep it odd. You could also find the nearest prime.
        // 2. reinsert all active items from the old table into the new one.
        // 3. reset the deleted and keys counters.
    }

    private static class Entry<K,V> implements HashTableEntry<K,V> {
        private K key;
        private V value;

        /**
         * Creates the hash table entry.
         *
         * @param key  The key to associate the value with.
         * @param value  The value to map the key to.
         */
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        /**
         * Gets the key for this entry.
         *
         * @return the key.
         */
        public K getKey() {
            return key;
        }

        /**
         * Gets the value for this entry.
         *
         * @return the value.
         */
        public V getValue() {
            return value;
        }


        /**
         * Sets the value for the entry.
         *
         * @param value  The value for this entry.
         * @return The previous value, or null if there wasn't one.
         */
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }
}
