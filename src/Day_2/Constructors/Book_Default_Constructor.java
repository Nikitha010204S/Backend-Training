//Create a class Book with default values for title and author.
// Write a default constructor to initialize these attributes.
package Day_2.Constructors;

import java.awt.print.Book;

public class Book_Default_Constructor {
    String title;
    String author;

    Book_Default_Constructor(String title, String author)
    {
        this.title = "How to influence and win friends";
        this.author ="Dale Carnegie";
    }
    public void display()
    {
        System.out.println("Title : " +title);
        System.out.println("Author : "+author);
    }
    public static void main(String[] args) {
        Book_Default_Constructor b=new Book_Default_Constructor("How to influence and win friends","Dale");
        b.display();
    }
}
