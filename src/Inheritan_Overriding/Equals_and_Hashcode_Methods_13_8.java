package Inheritan_Overriding;

import java.util.Objects;

public class Equals_and_Hashcode_Methods_13_8 {
    public static void main(String[] args) { //1. main method
       Person1 p = new Person1("Elon", 52); //6.
        Person1 p2 = new Person1("Elon", 52); //7.

    System.out.println(p == p2); //FALSE. by default comparing if two object are the same and both pointing to the same memory location //8
    System.out.println(p.equals(p2));//true.because the step 11 and 12. //9
    }
}

class Person1 {//2.
    private String name;
    private int age;

    //3. constructor

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //4. Getters and Setters

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

    //5. we can create @Override and toString using ->Generate -> toString()
    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //10. hashCode returns as int
    @Override
    public int hashCode() {
        return Objects.hash(name, age); //MEMORIZE by heart!!!!!!!!!!
    }

    //11. equals. if the obj in the param has the instance variables with the same value of my current object
    @Override
    public boolean equals(Object obj) { //equals method will return true only if the names and age are equal(the same)
        //steps 14 and 15 always will be the same
        if (this == obj) {   //14. by standards, we need to use if method.
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { //15.
            return false;
        }
            //primary functionality here.
        //steps 12 and 13 params will be changing
            Person1 other = (Person1) obj; //12. down-casting
            return Objects.equals(name, other.getName()) && age == other.getAge(); //13.
        }
    }
