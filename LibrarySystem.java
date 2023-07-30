import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book \"" + book.getTitle() + "\" has been issued.");
                } else {
                    System.out.println("Sorry, the book \"" + book.getTitle() + "\" is not available.");
                }
                return;
            }
        }
        System.out.println("Sorry, the book \"" + title + "\" is not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book \"" + book.getTitle() + "\" has been returned.");
                } else {
                    System.out.println("The book \"" + book.getTitle() + "\" is already available in the library.");
                }
                return;
            }
        }
        System.out.println("Sorry, the book \"" + title + "\" is not found in the library.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book("The Maze Runner", "James Dashner"));
        library.addBook(new Book("If We Were Villains", "M. L. Rio"));
        library.addBook(new Book("Poirot Investigates", "Agatha Christie"));

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Issue a book");
            System.out.println("2. Return a book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the title of the book to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case "2":
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case "0":
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("0"));

        scanner.close();
    }
}