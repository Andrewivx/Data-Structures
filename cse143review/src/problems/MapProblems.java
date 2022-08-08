package problems;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * See the spec on the website for example behavior.
 */
public class MapProblems {

    /**
     * Returns true if any string appears at least 3 times in the given list; false otherwise.
     */
    public static boolean contains3(List<String> list) {
        TreeMap<String, Integer> dictionary = new TreeMap<>();
        boolean isBigger = false;
        for (String def: list) {
            if (!dictionary.containsKey(def)) {
                dictionary.put(def, 1);
            }
            else {
                int total = dictionary.get(def) + 1;
                if (total >= 3) {
                    isBigger = true;
                }
                dictionary.put(def, total);
            }
        }
        return isBigger;
    }

    /**
     * Returns a map containing the intersection of the two input maps.
     * A key-value pair exists in the output iff the same key-value pair exists in both input maps.
     */
    public static Map<String, Integer> intersect(Map<String, Integer> m1, Map<String, Integer> m2) {
        TreeMap<String, Integer> intersect = new TreeMap<>();
        for (String map1 : m1.keySet()) {
            if (m2.containsKey(map1)) {
                if (m1.get(map1).equals(m2.get(map1))) {
                    intersect.put(map1, m1.get(map1));
                }
            }
        }
        return intersect;

    }
}
