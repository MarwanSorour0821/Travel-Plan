import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private int ISBN;
    private List<Book> books = new ArrayList<>();


    Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    Book(){}

    public void addBook(Book b){
        this.books.add(b);
    }

    public void remBook(Book b){
        this.books.remove(b);
    }

    public void setBooks(List<Book> b){
        this.books = b;
    }

    public List<Book> retBook(){
        return books;
    }






}
