package Inheritance;

public class Animal_12_18 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Lion");
        animal.setAge(5);
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println("The animal makes a generic sound. " + animal.makeSound());

        Cat cat = new Cat();
        cat.setName("Garfield");
        cat.setAge(3);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println("The animal makes a generic sound. " + cat.makeSound());

    }
}
class Animal{
    private String name;
    private int age;

    public Animal() {
        this.name = name;
        this.age = age;
    }

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
        if (age < 0) {
            System.out.println("Age cannot be less than 0. Setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public boolean makeSound(){
        return true;
    }
}

class Cat extends Animal{

    public Cat() {
        super();
    }
}
