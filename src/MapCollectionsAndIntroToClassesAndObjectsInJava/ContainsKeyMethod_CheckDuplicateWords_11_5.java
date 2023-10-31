package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class ContainsKeyMethod_CheckDuplicateWords_11_5 {
    public static void main(String[] args) {

    }
//    Create a method called checkDuplicateWords() that takes a string as input and returns a map object where each
//    unique word is the key, and a boolean value indicates whether the word is a duplicate or not. If a word appears
//    more than once in the input string, it will be stored in the map with the value false. Otherwise, if a word
//    is unique, it will be stored with the value true.
//Params: A string representing a sentence or text.
//Return: A map object with word-duplicate pairs, where the key is the word (String) and the value is a boolean
// (true for unique, false for duplicate).
    public static Map<String, Boolean> checkDuplicateWords (String input) {
        Map<String, Boolean> wordMap = new HashMap<>();
        String[] words = input.split("\\s+");
        for(String word: words) {
            boolean isUnique = false;
            if(wordMap.containsKey(word)) {
                isUnique = false;
            }else {
                isUnique = true;
            }
            wordMap.put(word, isUnique);
        }
        return wordMap;
    }
}
