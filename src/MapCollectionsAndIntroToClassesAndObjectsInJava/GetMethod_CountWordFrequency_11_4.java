package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class GetMethod_CountWordFrequency_11_4 {
    public static void main(String[] args) {

    }
//    Write a method called countWordFrequency() that takes a String as input and returns a Map object containing each
//    word as a key and its frequency as the corresponding value.
//Params: A String sentence with words.
//Return: A Map object with word-frequency pairs where the key is String and the value is Integer.
    public static Map<String, Integer> countWordFrequency(String words) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        String[] wordArray = words.split(" ");

        for (String word : wordArray) {
            int frequency = wordFrequencyMap.getOrDefault(word, 0);
            wordFrequencyMap.put(word, frequency + 1);
        }

        return wordFrequencyMap;
    }
}
