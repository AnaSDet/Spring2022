package MapCollectionsAndIntroToClassesAndObjectsInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAndLists_separateWordsByStartingLetter_11_14 {
    public static void main(String[] args) {
    }
public static Map<Character, List<String>> separateWordsByStartingLetter(String input){
    Map<Character, List<String >> resultMap = new HashMap<>();
    String[] words = input.split(" ");
    for(String word : words){
        if (!word.isEmpty()){
            char startingLetter = word.charAt(0);
            if (Character.isLetter(startingLetter)){
                List<String> wordList= resultMap.getOrDefault(startingLetter, new ArrayList<>());
                word = word.replaceAll("[^a-zA-Z]+$", "");
                wordList.add(word);
                resultMap.put(startingLetter,wordList);
            }
        }
    }
    return resultMap;
}
}

