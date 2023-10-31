package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.HashMap;
import java.util.Map;
public class PutMethod_CheckWordLength_11_3 {
    public static void main(String[] args) {
    }
//    Write a method called checkWordLength() that takes a string as input and returns a Map object containing each
//    word as a key and a boolean value indicating whether the length of the word is even or odd.
//Params: A String sentence with words.
//Return: A Map object with word-length pairs, where the key is the word (String) and the value is a boolean
// (true for even length, false for odd length).
    public static Map<String,Boolean> checkWordLength(String input){
        String[] split = input.split(" ");
        Boolean answer = false;
        Map<String, Boolean> map = new HashMap<>();
        for( int i=0; i<split.length;i++){
            if(split[i].length()%2==0){
                answer=true;
            }else answer= false;
            map.put(split[i], answer);
        }
        return map;

    }
}
