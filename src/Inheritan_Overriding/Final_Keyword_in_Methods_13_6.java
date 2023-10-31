package Inheritan_Overriding;

public class Final_Keyword_in_Methods_13_6 {
    public static void main(String[] args) { //1.
// final keyword  in Java
     //1. variables can be declared as final -> that means the variable can only be initialized once
     //2. class can be declared final -> that means no other class can be extended from that class
     //3. a method can be declared final -> the method can not be overridden
    }
}
class Animal2{ //2.
   public final void eat(){ //4. it's final method, we can't use same method anywhere else
      System.out.println("Eat"); //5.
   }
}
class Dog2 extends Animal2{ //3.

}