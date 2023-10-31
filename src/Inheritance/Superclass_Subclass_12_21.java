package Inheritance;
public class Superclass_Subclass_12_21 {

    public static void main(String[] args) {

            SubClass1 obj = new SubClass1();
            SubClass1 obj2 = new SubClass1(2, " Hey");
            SubClass1 obj3 = new SubClass1(" Hey");
        }
    }

    class Superclass1{
    public int num;

        public Superclass1(){
            System.out.println("Default constructor from parent class");
        }

        public Superclass1(int a, String b){
            System.out.println("two param constructor from parent class" + a + " " + b);
        }
    }


    class SubClass1 extends Superclass1 {
        public SubClass1() {
            System.out.println("Default constructor from child class");
            super.num = 1000;
        }

        public SubClass1(int a, String b) {
            System.out.println("two param constructor from child class " + a + " " + b);
        }


        public SubClass1(String b) {
            super(2, b);
            System.out.println("one param constructor from child class" + b);
        }
    }
//super keyword is used to access accessible instance variables from a parent class inside child class.
