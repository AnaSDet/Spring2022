package Abstraction;

public class Abstraction_Intro_13_9 {

    public static void main(String[] args) { //1. create a main method
       Animal a = new Dog();  //12.
       Animal c = new Cat();  //13.

        a.makeSound();
        c.makeSound();
    }
}
    //Abstraction solves 2 problems:
//1. when you want to restrict the ability to create objects from parent class.
// Abstract classes can not be instantiated(you cannot create an object from an abstract class).
//The whole purpose of the Abstract class is to serve as a parent class that stores all common behaviors and properties.
//2. When you want to create a method in the parent class to enable polymorphism, and you knot that
// every single child class MUST override that method logic. You can declare methods abstract.

abstract class Animal{ //2.declaring the parent class using abstract method
// abstract methods are methods that can only be declared in Abstract class or interface.
// abstract methods don't have a body.
// abstract methods are meant to be overridden in concrete - subclasses.
public abstract void makeSound();//4.abstract method

}
//if the subclass is extending an abstract class that has abstract methods the concrete subclass
// must override all inherited abstract methods, otherwise the code doesn't compile
class Dog extends Animal{ //3.
    @Override //5.
public void makeSound(){ //6.
    System.out.println("Woof!"); //7.
   }
 }
 class Cat extends Animal{ //8.
    @Override //9.
     public void makeSound(){ //10.
        System.out.println("Meow!"); //11.
    }
 }