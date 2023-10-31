
package Exceptions;

public class Retrieve_From_Index_13_17 {

    public static boolean retrieveElement(boolean[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean[] array = {true, false, true};
        boolean element = retrieveElement(array, 3);
        System.out.println("Element: " + element);
    }
}