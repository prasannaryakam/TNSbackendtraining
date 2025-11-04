// Program: Display Library Book Details using Instance and Static Variables

// Logic Class
public class Library {
    // Instance variables — unique for each book
    int bookId;
    String bookTitle;
    String author;

    // Static variable — same for all books
    static String libraryName = "City Central Library";

    // Method to display book details
    void showBookDetails() {
        // Local variable
        String note = "Book Record";
        
        // Printing book details
        System.out.println("-----------------------------------");
        System.out.println(note);
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Library: " + libraryName);
        System.out.println("-----------------------------------\n");
    }
}

