package OOP_InheritanceInJava;

public class Static_Variables_12_9 {
    public static void main(String[] args) {         //1
     Sample obj1 = new Sample();                    //4
     Sample obj2 = new Sample();
     Sample obj3 = new Sample();
     Sample obj4 = new Sample();

     //we can do Sample.count = 10 and our program will show 10 when we run it
//     Sample.count = 10;                         //5
//     System.out.println(Sample.count); //10     //6
//     System.out.println(obj1.count);  //10
//     System.out.println(obj2.count); //10

     // if we want to count objects, we just print out SOP(Sample.count)
        System.out.println(Sample.count); //4
        System.out.println(Sample.companyName);    //1.2
    }
}
class Sample{                                     //2
    public static int count;                      //3

    public static String companyName = "Wedevx.co";  //constant values         //1.1


    public Sample(){  //if we want to count objects    //7
        count++;                                   //8
    }
}
