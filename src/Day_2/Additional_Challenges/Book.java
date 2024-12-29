package Day_2.Additional_Challenges;
import java.util.ArrayList;
import java.util.List;

public class Book {
    int bookid;
    String title;
    String author;
    boolean isavailable;

    Book(int bookid, String title, String author, boolean isavailable) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.isavailable = true;
    }

    public void borrowBook() {
        if (isavailable) {
            isavailable = false;
            System.out.println("Book '" + title + "' has been borrowed.");
        } else {
            System.out.println("Book '" + title + "' is unavailable.");
        }
    }

    public void returnBook() {
        isavailable = true;
        System.out.println("Book '" + title + "' has been returned.");
    }

    public void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isavailable);
    }
}

class Member {
    int memberId;
    String name;
    List<Book> borrowedBooks;

    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isavailable) {
            borrowedBooks.add(book);
           System.out.println("Book '" + book.title + "' has been borrowed.");
        } else {
            System.out.println("Book '" + book.title + "' is unavailable.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
           System.out.println("Book '" + book.title + "' has been returned.");
        } else {
            System.out.println("You have not borrowed the book '" + book.title + "'.");
        }
    }

    public void display() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + name);
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.display();
        }
    }
}

class Librarian {
    String name;

    Librarian(String name) {
        this.name = name;
    }

    public void displayLibraryInfo(List<Book> libraryBooks) {
        System.out.println("Library Inventory managed by Librarian: " + name);
        for (Book book : libraryBooks) {
            book.display();
        }
    }



    public static void main(String args[]) {

        Book book1 = new Book(101, "The Alchemist", "Paulo Coelho", true);
        Book book2 = new Book(102, "The Catcher in the Rye", "J.D. Salinger", true);
        book1.display();
        book2.display();
        book1.borrowBook();
        book1.returnBook();

        Member m = new Member(125366, "Nikitha");

        m.borrowBook(book1);
        m.borrowBook(book2);
        m.display();

        m.returnBook(book1);
        m.display();

        Librarian l = new Librarian("Raju");
        List<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        l.displayLibraryInfo(libraryBooks);
    }
}
