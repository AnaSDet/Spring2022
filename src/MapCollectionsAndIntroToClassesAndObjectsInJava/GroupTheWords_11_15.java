package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//Implement a method called groupAndCountMapValues() that takes a Map<String, List<String>> as input.
//The method should group the strings in each list by their length and count the number of occurrences for each length.
//The resulting map should have the length as keys and the count as values.
//Params: Map<String, List<String>> representing a map with string keys and string lists as values.
//Return: A Map<Integer, Integer> where the keys are the lengths of the strings in the lists and the values
// are the counts of strings with that length.
public class GroupTheWords_11_15 {
    public static void main(String[] args) {
        Map<String, List<String>> inputMap = new HashMap<>();
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        inputMap.put("Words", words);

        Map<Integer, Integer> categories = groupAndCountMapValues(inputMap);
        System.out.println(categories);
    }

    public static Map<Integer, Integer> groupAndCountMapValues(Map<String, List<String>> inputMap) {
        Map<Integer, Integer> result = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : inputMap.entrySet()) {
            List<String> strings = entry.getValue();

            for (String string : strings) {
                int length = string.length();

                if (result.containsKey(length)) {
                    result.put(length, result.get(length) + 1);
                } else {
                    result.put(length, 1);
                }
            }
        }

        return result;
    }
}