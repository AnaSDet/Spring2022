package MapCollectionsAndIntroToClassesAndObjectsInJava;

import java.util.HashMap;
import java.util.Map;

public class MapPractice_11_15 {
    public static void main(String[] args) {
//given a string(text) write a program that prints out the number of times each
//word occurs it the text
//        ex: Hello world hello askar askar adina
//        hello = 2
//        world = 1
//        askar = 3
//        adina = 1

        String text = "Hello world hello wedevx wedevx wedevx adina";
//        hello = 2
//        world = 1
//        wedevx = 3
//        java = 1
//1. split each word by space
//2. I will have an array of String(word)
//3. loop through every element in string
//4. there are 2 things i need to store- word and a number of occurrences
//5. create a map of String keys and Integer values
//6. put(word, 1)

    String[] words= text.split(" ");
    System.out.println(words[0]); //hello

    Map<String, Integer> wordOccurrences = new HashMap<>();

    for(String word : words)  {
    Integer currentValue = 0;
    //check if the key doesn't exists

        if (wordOccurrences.containsKey(word)) {
            //get method returns null if the word doesn't exist
            currentValue = wordOccurrences.get(word);
        }
        wordOccurrences.put(word, currentValue + 1);
    }
    System.out.println(wordOccurrences); //{world=1, Hello=1, hello=1, adina=1, wedevx=3}
    }
}
