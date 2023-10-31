package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.TreeMap;
public class RemoveMethod_ClassifyAndDeduplicateIntegers_11_6 {
    public static void main(String[] args) {

    }
//    Create a method called classifyAndDeduplicateIntegers() that takes a string of integers as input.
//    The method should parse the string, classify each integer based on its value, and return a map object
//    where each unique integer is the key and the corresponding value is a string indicating its classification.
//Params:
//A string of integers.
//Return:
//A map object with integer-classification pairs, where the key is the integer (Integer) and the value is a
// string indicating its classification (String).
//Classifications:
//Positive even integers: "Positive Even"
//Positive odd integers: "Positive Odd"
//Zero: "Zero"
//Negative integers: "Negative"
//Duplicate Removal:
//If a number appears more than once in the input string, remove all occurrences of that number from the map.
public static TreeMap<Integer, String> classifyAndDeduplicateIntegers(String input){
    String[] inputArrString = input.split(" ");
    TreeMap<Integer, String> output = new TreeMap<>();
    int[] intArr = new int[inputArrString.length];
    for (int i = 0; i < inputArrString.length; i++) { //parses the input to int array
        intArr[i]= Integer.parseInt(inputArrString[i]);
    }
    for(int num : intArr){
        if (output.containsKey(num)){
            output.remove(num);
        } else {
            if (num > 0 && num % 2 == 0) {
                output.put(num, "Positive Even");
            } else if (num > 0) {
                output.put(num, "Positive Odd");
            } else if (num < 0) {
                output.put(num, "Negative");
            } else {
                output.put(num, "Zero");
            }
        }
    }
    return output;
}
}
