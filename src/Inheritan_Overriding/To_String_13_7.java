package Inheritan_Overriding;

public class To_String_13_7 {
    public static void main(String[] args) { //1. main
       //toString() method in the Object class provides a default implementation. By default, it returns a String
        // that consist of the class name, "@" symbol, and the hash code of the object.

      Person p = new Person("Elon", 52);  //9.
      System.out.println(p.toString()); //10. or we can just do System.out.println(p); //and it will give us the
        // same result because Internally println() method calls the toString method of the object.

    }
}
class Person{ //2.
   private String name; //3.
   private int age; //4.

   //5. create a constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //6. create GETTER and SETTER methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //7. creating @Override and toString
    @Override
    public String toString() {
        return "name: " + name +"\nage: " + age; //8.
    }
}

//every single class that we create implicitly implements object class. So object class is the Godfather of all classes.
//Each and every class extends from the object class that Java has. If we are inheriting some methods and not overriding
// them in our classes it means we are inheriting those methods with their default behavior. Default functionality.