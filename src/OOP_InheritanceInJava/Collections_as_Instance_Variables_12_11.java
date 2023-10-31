package OOP_InheritanceInJava;

import java.util.ArrayList;
import java.util.List;

public class Collections_as_Instance_Variables_12_11 {
//5. creating a main method
public static void main(String[] args) {                               //5
//6. Creating a new Employee and using constructor from the line 26-30 without providing a list
        Employee emp1 = new Employee("Elon", 52, "Executive", 100000.00 );
        System.out.println(emp1.getProjects()); //we need to create a getter (step 7) on line 90

    //8. now we need to add projects by creating another method on line 97
    emp1.addProgect("Tesla");
    System.out.println(emp1.getProjects()); //[Tesla]
    emp1.addProgect("SpaceX");
    System.out.println(emp1.getProjects()); //[Tesla, SpeceX]

    //--> a single variable emp1-->stores the following info line 23-28
    }
}
//task:
//Employee{
//name: "Elon"
//age 52
//department "Executive"
//salary 100000;
//projects [Testa, SpaceX, Boring, Neuralink, Twitter]
//                   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//In SDET industry standard we always want to put first Instance variables, then all constructors,
// then we will go to methods

//1. let's create a class
class Employee{                        //1
    private String name;              //1
    private int age;                 //1
    private String department;      //1
    private double salary;         //1
    //end of step 1

//4. on the line 46 we have one specific object, that means that we need to create
//instance variable. After creating a List and ArrayList make sure that we have import statements
//When we create a new Employee object(line 59), we create a new List(line 46). we initializing it right away
//BUT if some employees already have baggage of projects, then we might have to create another constructor to
//accommodate that situation
    private List<String > projects = new ArrayList<>();                           //4


//2. let's create a constructor(Generate-->Constructor-->select all)
    public Employee(String name, int age, String department, double salary) {   //2
        this.name = name;                                                      //2
        this.age = age;                                                       //2
        this.department = department;                                        //2
        this.salary = salary;                                               //2
   //end of step 2
    }
//3. let's create GETTERS and SETTERS(Generate-->Getter and Setter-->select all)
// and then we can optimize our code by putting name,age and etc. in THIS();
    public Employee(String name, int age, String department, double salary, List<String> projects) {  //3
     this(name, age, department, salary);                                                        //3
        this.projects = projects;                                                               //3
    }

    public String getName() {                                                                  //3
        return name;
    }

    public void setName(String name) {                                                         //3
        this.name = name;
    }

    public int getAge() {                                                                     //3
        return age;
    }

    public void setAge(int age) {                                                             //3
        this.age = age;
    }

    public String getDepartment() {                                                           //3
        return department;
    }

    public void setDepartment(String department) {                                            //3
        this.department = department;
    }

    public double getSalary() {                                                               //3
        return salary;
    }

    public void setSalary(double salary) {                                                    //3
        this.salary = salary;
    }
    //end of step 3 GETTERS and SETTERS

    //7. Creating a Getter method with List                                                 //7
    public List<String > getProjects(){
        return projects;
    }
   //8. creating another method in order to print out some projects                         //8
   public void addProgect(String projectName){
        projects.add(projectName);
   }

}
