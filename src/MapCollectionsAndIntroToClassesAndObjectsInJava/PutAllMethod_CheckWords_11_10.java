package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class PutAllMethod_CheckWords_11_10 {
    public static void main(String[] args) {

    }

    //    Implement a method called checkWords() that takes two strings as input. The first string represents
//    a sentence consisting of multiple words, and the second string represents another sentence with words.
//    The method should perform the following tasks:
//Palindrome Check: For the first string, check if each word is a palindrome. The key is each word from the
// first string, and the value is a boolean indicating whether the word is a palindrome or not.
//Capital Check: For the second string, check if each word starts with a capital letter.
// The key is each word from the second string, and the value is a boolean indicating whether
// the word starts with a capital letter or not.
//Break down the above tasks into separate helper methods that return Map.
//Params: Two strings representing sentences with multiple words.
//Return: A map object with word-palindrome pairs from the first string and word-capital pairs from the second string.
    public static Map<String, Boolean> checkWords(String sentence1, String sentence2) {
        Map<String, Boolean> resultMap = new HashMap<>();
        resultMap.putAll(checkPalindrome(sentence1));
        resultMap.putAll(checkCapital(sentence2));
        return resultMap;
    }

    public static Map<String, Boolean> checkPalindrome(String sentence) {
        Map<String, Boolean> palindromeMap = new HashMap<>();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            String cleanedWord = word.toLowerCase().replaceAll("[^a-z]", "");
            boolean isPalindrome = true;
            for (int i = 0; i < cleanedWord.length() / 2; i++) {
                if (cleanedWord.charAt(i) != cleanedWord.charAt(cleanedWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            palindromeMap.put(word, isPalindrome);
        }
        return palindromeMap;
    }

    public static Map<String, Boolean> checkCapital(String sentence) {
        Map<String, Boolean> capitalMap = new HashMap<>();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            boolean startsWithCapital = Character.isUpperCase(word.charAt(0));
            capitalMap.put(word, startsWithCapital);
        }
        return capitalMap;
    }
}