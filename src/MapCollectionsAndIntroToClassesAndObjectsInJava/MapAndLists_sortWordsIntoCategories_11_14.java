package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Implement a method called sortWordsIntoCategories() that takes a string as input.
// The method should sort the words in the input string into four different categories based on certain criteria.
// The categories are: "Has Uppercase", "All Lowercase", "Has Special Character", and "Has Digit".
// Each word in the input string should be checked against these criteria and assigned to the appropriate category.
// The method should return a Map object where the keys represent the category names and the values are lists
// of strings containing the words that belong to each category.
//Params: A string representing the input.
//Return: A Map object where the keys are the category names (strings) and the values are lists of strings containing
// the words that belong to each category.
 public class MapAndLists_sortWordsIntoCategories_11_14 {
 public static void main(String[] args) {
        String input = "Hello World! 123";

        Map<String, List<String>> categories = sortWordsIntoCategories(input);
        System.out.println(categories);
    }

    public static Map<String, List<String>> sortWordsIntoCategories(String input) {
        // Create a map to store the categories and their corresponding word lists
        Map<String, List<String>> categories = new HashMap<>();
        categories.put("Has Uppercase", new ArrayList<>());
        categories.put("All Lowercase", new ArrayList<>());
        categories.put("Has Special Character", new ArrayList<>());
        categories.put("Has Digit", new ArrayList<>());

        // Split the input string into individual words
        String[] words = input.split("\\s+");

        // Iterate over each word and categorize it based on the criteria
        for (String word : words) {
            if (word.matches(".*[A-Z].*")) {
                // Word has uppercase characters
                categories.get("Has Uppercase").add(word);
            }
            if (word.matches(".*[a-z].*") && !word.matches(".*[A-Z].*")) {
                // Word has only lowercase characters
                categories.get("All Lowercase").add(word);
            }
            if (word.matches(".*[^A-Za-z0-9].*")) {
                // Word has special characters
                categories.get("Has Special Character").add(word);
            }
            if (word.matches(".*\\d.*")) {
                // Word has digits
                categories.get("Has Digit").add(word);
            }
        }

        return categories;
    }
}
