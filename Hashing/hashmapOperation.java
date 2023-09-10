/**
 * hashmapOperation
 */
import java.util.HashMap;
public class hashmapOperation {

    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);

        System.out.println(hm);

        // Get - O(1)

        int population = hm.get("India");

        System.out.println(population);

        System.out.println(hm.get("Indonesia"));// null

        // Containskey - O(1)

        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("india")); // false
        

        // Remove - O(1)

        System.out.println(hm.remove("China")); // 150
        System.out.println(hm.remove("Chinaaa")); // 150
        System.out.println(hm);

        // Size

        System.out.println(hm.size());

        // Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}