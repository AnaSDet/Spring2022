package OOP_InheritanceInJava;

public class University_12_3 {
    public static void main(String[] args) {
 University sc = new University("UVU", "Utah", 1997, 1500);
 System.out.println(sc.location);
 System.out.println(sc.name);
    }
}
class University{
    public String name;
    public String location;
    public int establishedYear;
    public int studentCount;

    public University(String name, String location, int establishedYear, int studentCount){
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
        this.studentCount = studentCount;
    }

}