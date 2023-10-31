package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.LinkedHashMap;
import java.util.Map;
public class Simple_Initialization_LinkedHashMap_11_2 {
//    Write a method called createMap() that returns an empty LinkedHashMap as Map with key Integer and value Double.
//Params: none
//Return: Map of type LinkedHashMap.
    public static Map<Integer, Double> createMap() {
        return new LinkedHashMap<>();
    }

    public static void main(String[] args) {
        Map<Integer, Double> map = createMap();
        System.out.println(map); // {}
    }
}