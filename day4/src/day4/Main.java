package day4;

public class Main {

	public static void main(String[] args) {
        Library library = new Library();

        library.addBook(101, "Book1");
        library.addBook(102, "Book2");
        library.addBook(103, "Book3");

        library.registerMember("Member1");
        library.registerMember("Member2");

        try {
            library.borrowBook("Member1", 101);
            library.borrowBook("Member2", 102);
            library.borrowBook("Member3", 103);
            library.borrowBook("Member3", 104);
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        library.returnBook(101);
        library.returnBook(102);

        library.displayCheckoutHistory();
    }
}
