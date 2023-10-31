package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class KeySetMethod_SwapKeysAndValues_11_11 {
    public static void main(String[] args) {

    }
//Implement a method called swapKeysAndValues() that takes a map of type TreeMap<String, Integer> as input.
//The method should swap the keys with their corresponding values in the map, creating a new map where
//the original values become the keys, and the original keys become the values. After the swap, the method should return
//  the initial TreeMap and new TreeMap in the new list List<Map<?, ?>(will be covered with Class and Objects topics).
//Params: Map object of type TreeMap<String, Integer>.
//Return: List<Map<?, ?>> (? - means data type is not indicated. It helps us to store Maps
// with type <Integer, String> and <String, Integer> together).
public static List<Map<?, ?>> swapKeysAndValues(TreeMap<String, Integer> initialMap) {
    List<Map<?, ?>> result = new ArrayList<>();
    TreeMap<Integer, String> swappedMap = new TreeMap<>();

    for (Map.Entry<String, Integer> entry : initialMap.entrySet()) {
        String key = entry.getKey();
        Integer value = entry.getValue();
        swappedMap.put(value, key);
    }

    result.add(initialMap);
    result.add(swappedMap);

    return result;
  }
}
