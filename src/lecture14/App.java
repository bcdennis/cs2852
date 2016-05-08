/**
 * CS2852
 * Spring 2016
 * Week 9
 */
package lecture14;

/**
 * Driver for the Hashtable lecture.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class App {

    public static void main(String[] args) {
        ProbingStrategy linear = new LinearProbingStrategy();
        HashTable<String, String> hash = new HashTableOpen<>(linear);

        hash.put("bcdennis", "Brad Dennis");
        hash.put()
    }
}
