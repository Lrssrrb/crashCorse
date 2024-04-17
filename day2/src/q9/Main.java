package q9;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", "John Doe");
        Journal journal = new Journal("Scientific Journal", 1);
        Multimedia multimedia = new Multimedia("Introduction to Algorithms", "DVD");

        System.out.println(book);
        System.out.println(journal);
        System.out.println(multimedia);
        
        System.out.println("\nBook");
        book.checkOut();
        book.isCheckedOut();
        book.returnResource();
        book.isCheckedOut();
        
        System.out.println("\nJournal");
        journal.checkOut();
        journal.isCheckedOut();
        journal.returnResource();
        journal.isCheckedOut();
        
        System.out.println("\nMultimedia");
        multimedia.checkOut();
        multimedia.isCheckedOut();
        multimedia.returnResource();
        multimedia.isCheckedOut();
    }
}
