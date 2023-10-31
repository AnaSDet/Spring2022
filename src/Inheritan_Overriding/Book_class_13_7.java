package Inheritan_Overriding;

public class Book_class_13_7 {
    public static void main(String[] args) { //1.
Book1 b = new Book1("Believe in yourself", "Anastasia Katcai", 2024, "Motivation");
System.out.println(b.toString());
    }
}
class Book1{ //2.
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book1(String title, String author, int year, String genre) { //3.
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }
    @Override
    public String toString(){
        return "Title: " + title+ "\nAuthor: " + author
                + "\nPublication Year: " + year+
                "\nGenre: " + genre + "\n";
    }
}

