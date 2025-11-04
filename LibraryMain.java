// Main Class
public class LibraryMain {
    public static void main(String[] args) {
        // Creating first book object
        Library b1 = new Library();
        b1.bookId = 101;
        b1.bookTitle = "Data Structures in Java";
        b1.author = "Mark Allen Weiss";
        b1.showBookDetails();

        // Creating second book object
        Library b2 = new Library();
        b2.bookId = 102;
        b2.bookTitle = "Operating System Concepts";
        b2.author = "Silberschatz";
        b2.showBookDetails();
    }
}