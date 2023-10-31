package Inheritan_Overriding;

import java.util.Objects;

public class Book_Comparison_13_8 {
    public static void main(String[] args) {
        Book3 b = new Book3("The last of us", "James Rodrigez", 2018, "surviving");
        Book3 b2 = new Book3("The last of us", "James Rodrigez", 2018, "surviving");
        System.out.println(b.equals(b2));
    }
}

class Book3{
    private static int lastId;
    private int id;
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book3(String title, String author, int year, String genre){
        this.title = title.toLowerCase();
        this.author = author.toLowerCase();
        this.year = year;
        this.genre = genre.toLowerCase();
        lastId++;
        id = lastId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase(), genre.toLowerCase(), year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book3 book = (Book3) obj;
        return title.equalsIgnoreCase(book.title) && author.equalsIgnoreCase(book.author) &&
                genre.equalsIgnoreCase(book.genre) && year == book.year;
    }
}