package Inheritance;

public class Person_12_21 {
    public static void main(String[] args) {

    }
}
class Person {
    public String name;
    public int age;
    public double height;
    public double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

class Student extends Person {
    public String studentId;
    public int gradeLevel;
    public double GPA;
    public String major;

    public Student(String name, int age, double height, double weight, String studentId, int gradeLevel, double GPA, String major) {
        super(name, age, height, weight);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.major = major;
    }

    public Student(String name, int age, double height, double weight) {
        super(name, age, height, weight);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0.0;
        this.major = "N/A";
    }

    public Student(String name, int age, String studentId, int gradeLevel) {
        super(name, age, 0.0, 0.0);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = 0.0;
        this.major = "N/A";
    }

    public Student(String name, int age) {
        super(name, age, 0.0, 0.0);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0.0;
        this.major = "N/A";
    }

    public Student() {
        super("N/A", 0, 0.0, 0.0);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0.0;
        this.major = "N/A";
    }
}
