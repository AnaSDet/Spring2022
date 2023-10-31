package MapCollectionsAndIntroToClassesAndObjectsInJava;

public class Book_Public_11_18 {

       public String title;
       public String author;
       public int pages;

    }
    class Main3 {
    public static void main(String[] args) {
    Book_Public_11_18 var = new Book_Public_11_18();

    var.title = "Java";
    var.author = "Kathy Sierra";
    var.pages = 755;

    System.out.println(var.title);
    System.out.println(var.author);
    System.out.println(var.pages);
        }
}
