/**
 * CS2852
 * Spring 2016
 * Week 6
 */
package lecture13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


/**
 * Scratch pad for Lecture 13.
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class Lecture13 {


    public static void main(String[] args) {
        ArrayList<String> sentence = new ArrayList<>(
                Arrays.asList("this", "is", "a", "test", "sentence", "and", "it", "is", "short"));

        doMapDemo(sentence);
        doSetDemo(sentence);

    }

    private static void doMapDemo(ArrayList<String> list) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }

        for(Integer i: map.keySet()) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();

        map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }

        for(Integer i: map.keySet()) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();

        map = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }

        for(Integer i: map.keySet()) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
    }

    private static void doSetDemo(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);

        for(String s: set) {
            System.out.print(s + " ");
        }
        System.out.println();

        set = new LinkedHashSet<>();
        set.addAll(list);

        for(String s: set) {
            System.out.print(s + " ");
        }
        System.out.println();

        set = new TreeSet<>();
        set.addAll(list);

        for(String s: set) {
            System.out.print(s + " ");
        }
        System.out.println();

    }
}
