package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.TreeMap;
import java.util.Map;
public class Simple_Initialization_TreeMap_11_2 {
//    Write a method called createMap() that returns an empty TreeMap as Map with key String and value Boolean.
//Params: none
//Return: Map of type TreeMap.
    public static Map<String, Boolean> createMap() {
        return new TreeMap<>();
    }

    public static void main(String[] args) {
        Map<String, Boolean> map = createMap();
        System.out.println(map); // {}
    }
}
