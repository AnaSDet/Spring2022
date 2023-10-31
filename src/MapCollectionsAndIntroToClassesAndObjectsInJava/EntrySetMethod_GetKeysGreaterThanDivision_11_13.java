package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class EntrySetMethod_GetKeysGreaterThanDivision_11_13 {
    public static void main(String[] args) {

    }
    //Implement a method called getKeysGreaterThanDivision() that takes a Map<String, Integer> and a Double as input.
// The method should calculate the sum of all values in the map and divide it by the Double input.
// It should then return an array of all keys from the map where the corresponding value is greater than the
// division result. If the Double input is 0, it should return an array of all keys from the map.
//Params:
//Map<String, Integer>: A map with string keys and integer values.
//Double: A double value used for division.
//Return: An array of strings containing keys from the map where the value is greater than the division result.
// If the Double input is 0, it should return an array of all keys from the map.
    public static String[] getKeysGreaterThanDivision(Map<String, Integer> map, double divisor) {
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }

        double divisionResult = divisor != 0 ? sum / divisor : 0;
        List<String> keysGreaterThanDivision = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > divisionResult) {
                keysGreaterThanDivision.add(entry.getKey());
            }
        }

        return keysGreaterThanDivision.toArray(new String[0]);
    }
}

