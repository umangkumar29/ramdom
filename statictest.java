public class LibraryTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 250, "Fiction");

        Magazine magazine1 = new Magazine("National Geographic", "January 2024", "Science and Nature");

        Librarian librarian = new Librarian();

        Reader reader = new Reader("John Doe", 25);

        System.out.println("Book 1: " + book1);
        System.out.println("Magazine 1: " + magazine1);

        librarian.checkOutBook(reader, book1);
        librarian.checkOutMagazine(reader, magazine1);

        librarian.returnBook(reader, book1);
        librarian.returnMagazine(reader, magazine1);
    }
}

class Library {
    // Assume there are common attributes and methods for a library
}

class Book {
    String title;
    String author;
    int pageCount;
    String genre;

    public Book(String title, String author, int pageCount, String genre) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pageCount=" + pageCount + ", genre=" + genre + "]";
    }
}

class Magazine {
    String name;
    String issueDate;
    String category;

    public Magazine(String name, String issueDate, String category) {
        this.name = name;
        this.issueDate = issueDate;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Magazine [name=" + name + ", issueDate=" + issueDate + ", category=" + category + "]";
    }
}

class Librarian {
    void checkOutBook(Reader reader, Book book) {
        System.out.println("Librarian checking out book: " + book.title + " for reader: " + reader.name);
    }

    void returnBook(Reader reader, Book book) {
        System.out.println("Librarian receiving returned book: " + book.title + " from reader: " + reader.name);
    }

    void checkOutMagazine(Reader reader, Magazine magazine) {
        System.out.println("Librarian checking out magazine: " + magazine.name + " for reader: " + reader.name);
    }

    void returnMagazine(Reader reader, Magazine magazine) {
        System.out.println("Librarian receiving returned magazine: " + magazine.name + " from reader: " + reader.name);
    }
}

class Reader {
    String name;
    int age;

    public Reader(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
