package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class SizeAndIsEmptyMethods_ConvertBinaryMap_11_8 {
    public static void main(String[] args) {

    }
//     Implement a method called convertBinaryMap() that accepts a String input consisting of binary digits (0s and 1s).
//     The method should convert each digit into a map entry, where the key is the index starting from 0, and the value
//     is a string indicating "true" if the digit is 1, and "false" if the digit is 0. If the number of binary digits
//     is odd, add an additional map entry with the key as the next available index and the value as "null".
//     If the input string is empty or contains no binary digits, include a single map entry with the key as 0 and
//     the value as "NO BOOLEAN".
//Params: String input representing binary digits.
//Return: Map object with index-boolean pairs, where the index is an Integer and the string value represents the
// binary digit.

public static Map<Integer, String> convertBinaryMap(String input) {
    Map<Integer, String> resultMap = new HashMap<>();
    if (input.isEmpty() || !input.matches("[01]+")) {
        resultMap.put(0, "NO BOOLEAN");
        return resultMap;
    }
    int index = 0;
    for (char digit : input.toCharArray()) {
        resultMap.put(index, digit == '1' ? "true" : "false");
        index++;
    }
    if (resultMap.size() % 2 != 0) {
        resultMap.put(index, "null");
    }
    return resultMap;
}
}
