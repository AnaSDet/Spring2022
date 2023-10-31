package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.*;
//Implement a method called sortAndFilterMap() that takes a Map<String, List<Integer>> as input.
//The method should sort the values in each list in ascending order and filter out any numbers that are divisible by 3.
//The resulting map should maintain the same keys, but the values should be sorted and filtered lists.
//Params: Map<String, List<Integer>> representing a map with string keys and integer lists as values.
//Return: A Map<String, List<Integer>> with the same keys as the input map, but with the values sorted in ascending
// order and filtered to exclude numbers divisible by 3.
//Note: No input is needed as data will be given from back.
public class SortAndFilter_11_15 {
    public static void main(String[] args) {
        Map<String, List<Integer>> inputMap = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        inputMap.put("Numbers", numbers);

        Map<String, List<Integer>> result = sortAndFilterMap(inputMap);
        System.out.println(result);
    }

    public static Map<String, List<Integer>> sortAndFilterMap(Map<String, List<Integer>> inputMap) {
        Map<String, List<Integer>> result = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : inputMap.entrySet()) {
            String key = entry.getKey();
            List<Integer> values = entry.getValue();

            List<Integer> sortedAndFilteredValues = new ArrayList<>(values);
            sortedAndFilteredValues.removeIf(value -> value % 3 == 0);
            Collections.sort(sortedAndFilteredValues);

            result.put(key, sortedAndFilteredValues);
        }

        return result;
    }
}