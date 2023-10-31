package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class GetMethod_CheckWordCharacters_11_4 {
    public static void main(String[] args) {

    }
//    Write a method called checkWordCharacters() that takes a string as input and returns a Map object containing each
//    word as a key and a boolean value indicating whether the word contains uppercase letters, numeric digits,
//    or special characters. The value will be false only if the word consists of lowercase letters only.
//    Whitespace characters should be ignored.
//Params: A String representing the sentence.
//Return: A Map object with word-character type pairs, where the key is the word (String) and the value
// is a boolean(true if the word contains uppercase, numeric, or special characters; false if the word consists
// of lowercase letters only).
    public static Map<String, Boolean> checkWordCharacters(String sentence) {
        Map<String, Boolean> wordCharacterMap = new HashMap<>();

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            boolean hasUppercase = false;
            boolean hasNumeric = false;
            boolean hasSpecial = false;

            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if (Character.isDigit(c)) {
                    hasNumeric = true;
                } else if (!Character.isLetter(c)) {
                    hasSpecial = true;
                }
            }

            boolean containsNonLowercaseCharacter = hasUppercase || hasNumeric || hasSpecial;
            wordCharacterMap.put(word, containsNonLowercaseCharacter);
        }

        return wordCharacterMap;
    }
}
