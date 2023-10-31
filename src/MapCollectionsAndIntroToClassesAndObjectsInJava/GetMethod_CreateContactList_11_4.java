package MapCollectionsAndIntroToClassesAndObjectsInJava;
import java.util.*;

public class GetMethod_CreateContactList_11_4 {
    public static void main(String[] args) {

    }
//    Create a method called createContactList() that takes two strings as input - one representing names and
//    the other representing phone numbers. The method should create a map object where the names are the keys and
//    the phone numbers are the corresponding values.
//Params: Two Strings - one representing names and the other representing phone numbers.
//Return: A map object with name-phone number pairs, where the key is the name (String) and the value is the
// phone number (String).
    public static Map<String, String> createContactList(String names, String phoneNumbers) {
        Map<String, String> contactMap = new LinkedHashMap<>();
        String[] nameArray = names.split("\\s+");
        String[] phoneNumberArray = phoneNumbers.split("\\s+");
        int namesCount = nameArray.length;
        int phoneNumbersCount = phoneNumberArray.length;
        // Remove duplicate elements from name and phone number arrays
        Set<String> uniqueNames = new LinkedHashSet<>(Arrays.asList(nameArray));
        Set<String> uniquePhoneNumbers = new LinkedHashSet<>(Arrays.asList(phoneNumberArray));
        Iterator<String> nameIterator = uniqueNames.iterator();
        Iterator<String> phoneNumberIterator = uniquePhoneNumbers.iterator();
        // Create contact list map
        while (nameIterator.hasNext()) {
            String name = nameIterator.next();
            if (phoneNumberIterator.hasNext()) {
                String phoneNumber = phoneNumberIterator.next();
                contactMap.put(name, phoneNumber);
            } else {
                contactMap.put(name, "-1");
            }
        }
        // Handle extra phone numbers
        int extraPhoneNumbers = phoneNumbersCount - namesCount;
        int unknownCounter = 1;
        while (extraPhoneNumbers > 0 && phoneNumberIterator.hasNext()) {
            String phoneNumber = phoneNumberIterator.next();
            String unknownName = "unknown" + unknownCounter;
            contactMap.put(unknownName, phoneNumber);
            unknownCounter++;
            extraPhoneNumbers--;
        }
        return contactMap;
    }
}
