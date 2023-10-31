package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.Map;
import java.util.LinkedHashMap;
public class ReplaceMethod_ManageMap_11_7 {
    public static void main(String[] args) {

    }
//     Implement a method named manageMap() that accepts a String input. The method's objective is to construct
//     a map where the keys are Integers starting from 1, and the values are Strings representing full names.
//     The names in the input string are separated by semicolons. After the assignment sort each value so that
//     longer word comes first.
//Params: String.
//Return: Map with the full names, where values are rearranged so that longer words appear first.
public static Map<Integer, String> manageMap(String sentenceOfFullNames) {
    String[] fullNames = sentenceOfFullNames.trim().split(";+\\s+");
    Map<Integer, String> numberedFullNamesMap = new LinkedHashMap<>();
    String firstName;
    String lastName;
    int counter = 1;
    for (String fullName : fullNames) {
        String[] firstAndLastNames = fullName.split("\\s");
        firstName = firstAndLastNames[0];
        lastName = firstAndLastNames[1];
        if (firstName.length() > lastName.length()) {
            numberedFullNamesMap.put(counter, firstName.concat(" ").concat(lastName));
        } else {
            numberedFullNamesMap.put(counter, lastName.concat(" ").concat(firstName));
        }
        counter++;
    }
    return  numberedFullNamesMap;
}
}
