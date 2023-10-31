package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class ClearMethod_BinarySwitching_11_9 {
    public static void main(String[] args) {

    }
//Implement a method called binarySwitching() that takes a binary string as input. The method should iterate through
// the string and perform the following actions:
//
//If the first element in the binary string is '0', add an entry to the map with the index of the current element
// as the key and the value as false. Continue adding entries to the map with subsequent '0' values until
// a '1' is encountered. Once a '1' is encountered, empty the map and add an entry with the index of the current
// element as the key and the value as true. From that point onwards, add entries to the map with subsequent '1'
// values until another '0' is encountered. This switching pattern should continue until the end of the input string.
// Same if the input starts with '1'.
//Params: A string representing a binary sequence.
//Return: A map object with index-boolean pairs, where the index is an Integer and the boolean value represents
// the binary switching pattern.
public static Map<Integer, Boolean> binarySwitching(String binaryStr) {
    Map<Integer, Boolean> binarySwitchMap = new HashMap<>();
    boolean currentValue = binaryStr.charAt(0) == '1';
    for (int i = 0; i < binaryStr.length(); i++) {
        char ch = binaryStr.charAt(i);
        boolean switchValue = ch == '1';
        if (switchValue != currentValue) {
            binarySwitchMap.clear();
            currentValue = switchValue;
        }
        binarySwitchMap.put(i, currentValue);
    }
    return binarySwitchMap;
}
}
