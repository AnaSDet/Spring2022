package OOP_InheritanceInJava;

public class Person_12_5 {
    public static void main(String[] args) {

        person125 sc = new person125("Cinnamon", 23, "cocohead@gmail.com", "4456783837");
        System.out.println(sc.getAge());
    }
}
class person125 {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    // Constructor
    public person125(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


