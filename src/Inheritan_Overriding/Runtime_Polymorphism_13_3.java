package Inheritan_Overriding;

public class Runtime_Polymorphism_13_3 {
    public static void main(String[] args) { //1.

    Animal1 a = new Animal1();//13.
    a.makeSound(); //14. prints out step 6
    }
}
class Animal1{ //2.
    public void makeSound(){ //5.
       System.out.println("Parent class"); //6.
  }
}
class Cat extends Animal1{ //3.
    @Override   //7.
    public void makeSound(){ //8.
        System.out.println("Meow!!!"); //9.
    }
}
class Dog1 extends Animal1{ //4.
    @Override   //10.
    public void makeSound(){ //11.
        System.out.println("Woof!!!"); //12.
    }
}