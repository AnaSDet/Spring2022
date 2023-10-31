package MapCollectionsAndIntroToClassesAndObjectsInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MapAndLists_11_14 {
    public static void main(String[] args) {
        Map<String, List<String>> managerAndEmployees = new HashMap<>();
//        Elon--> Steve, Alice, Bill, Jane
        List<String> elonsEmployees = new ArrayList<>();
        elonsEmployees.add("Steve");
        elonsEmployees.add("Alice");
        elonsEmployees.add("Bill");
        elonsEmployees.add("Jane");

        managerAndEmployees.put("Elon", elonsEmployees);
      System.out.println(managerAndEmployees);

//      Askar --> Chirag, Parush, Akmaral, Aika
        List<String> askarEmployees = new ArrayList<>();
        askarEmployees.add("Chirag");
        askarEmployees.add("Parush");
        askarEmployees.add("Akmaral");
        askarEmployees.add("Aika");

        managerAndEmployees.put("Askar", askarEmployees);
        System.out.println(managerAndEmployees);
    }
}
