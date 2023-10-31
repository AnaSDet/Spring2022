package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.Map;
public class ValuesMethod_11_12 {
    public static void main(String[] args) {
    }
//Implement a method called countUnevenValues() that takes a Map<Integer, String> as input.
// The method should count the number of values in the map that have an uneven number of characters,
// ignoring whitespace, comma, and dot characters. An uneven number of characters means the length
// of the string is not divisible by 2.
//Params: Map<Integer, String> representing a map of integer keys and string values.
//Return: An integer representing the count of values in the map that have an uneven number of characters,
// ignoring whitespace, comma, and dot characters.
public static int countUnevenValues(Map<Integer, String> map) {
int count = 0;
for (String value : map.values()) {
String cleanedValue = value.replaceAll("[\\s,.]", ""); // Remove whitespace, comma, and dot characters
  if (cleanedValue.length() % 2 != 0) {
      count++;
    }
 }
    return count;
  }
}
