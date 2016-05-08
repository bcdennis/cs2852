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

        //TODO finish the HashTableOpen implementation
        //TODO create a quadratic probing strategy and watch it work the same list.

        hash.put("dennis@msoe.edu", "Brad");
        hash.put("albedahfk@msoe.edu", "Fahad");
        hash.put("albiterri@msoe.edu", "Raunel");
        hash.put("appelbaumgl@msoe.edu", "Geoff");
        hash.put("eidsoncd@msoe.edu", "Chris");
        hash.put("fontainesw@msoe.edu", "Brad");
        hash.put("goihlnm@msoe.edu", "Nathan");
        hash.put("greennm@msoe.edu", "Noah");
        hash.put("griggszm@msoe.edu", "Zach");
        hash.put("guinnrd@msoe.edu", "Ryan");

        // ... etc.

    }
}
