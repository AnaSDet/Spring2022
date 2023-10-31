package Inheritan_Overriding;

public class Method_Overriding_13_1 {
    public static void main(String[] args) { //1.create a main method
        Dog d = new Dog();//5. creating a Dog object
        d.makeSound(); //ptints out "Animal makes a sound"
        d.eat(); //9.
        d.getNumLegs(); //10.

        Animal animal = new Animal(); //6. create Animal object
        animal.makeSound(); //ptints out "Animal makes a sound"
  }
}

class Animal{   //2. create a parent class

    public void getNumLegs(){ //7.
    System.out.println("4 legs");
    }

    public void eat(){ //8.
    System.out.println("Eating...");
    }

    public void makeSound(){ //4.create a method
    System.out.println("Animal makes a sound");
   }
}

class Dog extends Animal {   //3. create a child class

//rules of Overriding: The Overriding method in the child class MUST have the same method, signature name, return type,
//and parameter types. Only then we're actually applying method Overriding Access Modifier.
//We cannot reduce the visibility of the overridden method. If parent class is public, the Overridden method
//MUST be only public or protected.
    @Override //Annotation. It is information about a method or an instance variable, or constructor,or a class.
    // in this case we're using Overriding method. this gives info other developers that we're using this method
    public void makeSound() { //11. let's modify our method (step 4). We're Overriding our logic
        System.out.println("Bark Bark");
    }
}