package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class Simple_Initialization_HashMap_11_2 {
//    Write a method called createMap() that returns an empty HashMap as Map with key Character and value String.
//Params: none
//Return: Map of type HashMap.
    public static Map<Character, String> createMap() {

        return new HashMap<>();
    }

    public static void main(String[] args) {
        Map<Character, String> map = createMap();
        System.out.println(map); // {}
    }

}
