package Abstraction;

public class Interface_IntroClass_13_11 {
    public static void main(String[] args) { //1.

        Shape shape = new Rectangle(); //8.
        //List list = new ArrayList(), because List it is an interface
        //Map map = new HashMap(); Map is an interface. We are applying polymorphism on these lines 7 and 8


         shape.calculateArea(); //9. just like we did in abstract classes
    }
}
//Interfaces don't have any characteristics, instance variables, nor constructors. We don't create an object from INTERFACE.
interface Shape{ //2.
    public static final int i = 10; //10. All variables in an interface are constants - public static final
    //by default all methods in the interface are public and abstract
      void calculateArea(); //3. we want this method to be accessible and OVERRIDDEN
}
//we use implements keyword to make  class inherit interfaces
//when we implement an interface, the first concrete class must override all abstract methods from the interface
class Rectangle implements Shape{ //4.
    @Override //5.
      public void calculateArea(){ //6. we are going to override step 3
      System.out.println(1+1); //7.
    }
}

