package Exceptions;
import java.util.*;
class Complex_Error_Handling_13_20 {

    public static ArrayList<Object> filterGreaterValues(Object[] arrayObj, double threshold){
        ArrayList<Object> filteredResult = new ArrayList<>();
        try{
            for(Object obj: arrayObj){
                if((Double)obj>threshold){
                    filteredResult.add(obj);
                }
                else{
                    filteredResult.add(0);
                }
            }return filteredResult;
        }catch(ClassCastException e){
            System.out.println("Filtered Result:" + filteredResult);
            return null;
        }finally{
            System.out.println("Resetting static result variable to default.");
        }
    }
    public static void main(String[] args) {
        Object[] data = {50.1, 25.9, 80.0, 0.1, 'a', 123, 3.14, true, -5};
        double threshold = 2.5;
        ArrayList<Object> filteredList = filterGreaterValues(data, threshold);
        if (filteredList != null) {
            System.out.println("Filtered Result: " + filteredList);
        }
    }
}