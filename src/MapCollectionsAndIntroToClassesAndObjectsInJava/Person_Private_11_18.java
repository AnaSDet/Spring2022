package MapCollectionsAndIntroToClassesAndObjectsInJava;

public class Person_Private_11_18 {
   String name;
   int age;
   char gender;
   boolean isEmployed;
}
class Main6{
    public static void main (String []args){
    Person_Private_11_18 var = new Person_Private_11_18();

        var.name = "Anna";
        var.age = 27;
        var.gender = 'F';
        var.isEmployed = true;

        System.out.println(var.name);
        System.out.println(var.age);
        System.out.println(var.gender);
        System.out.println(var.isEmployed);
    }
}