package CollectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list); // [Apple, Banana]

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map.get(1)); // One
    }
}
