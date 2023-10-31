package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.TreeMap;
import java.util.Map;
public class PutMethod_CheckPrimeNumbers_11_3 {
    public static void main(String[] args) {

    }
//    Write a method called checkPrimeNumbers() that takes an integer as input and returns a Map object containing each
//    number from 1 to the input value (or from the input value to -1 if the input is negative) as a key and a boolean
//    value indicating whether the number is prime or not.
//Params: An integer representing the range of numbers to check.
//Return: A Map object with number-prime pairs, where the key is the number (Integer) and the value is a boolean
// (true for prime, false for non-prime).
    public static Map<Integer, Boolean> checkPrimeNumbers(int nums) {
        Map<Integer, Boolean> result = new TreeMap<>();
        if (nums > 0) {
            for (int c = 1; c <= nums; c++) {
                int counter = 0;
                for (int i = 1; i <= nums; i++) {
                    if (c % i == 0) {
                        counter++;
                    }
                }
                result.put(c, counter==2);

            }
        }else if (nums < 0) {
            for (int i = nums; i <= -1; i++) {
                int counter = 0;
                for (int j = -1; j <= i; j--) {
                    if (i % j == 0) {
                        counter++;
                    }
                }
                result.put(i, counter==2);
            }
        }
        return result;
    }
}
