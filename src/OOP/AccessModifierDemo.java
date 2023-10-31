package OOP;

import MapCollectionsAndIntroToClassesAndObjectsInJava.AccessModifierClass_11_18;

public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessModifierClass_11_18 var = new AccessModifierClass_11_18();
        var.name ="Hello";
        var.id = 1;
//public can be accessed anywhere within this project in any of these folders.
//private variables can only accessed within the same class scope
//      var.price = 2.2;
// default access modifier allows you to access instance variables in both classes that created within the same package
//        var.hobbies;
    }
}
