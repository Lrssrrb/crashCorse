package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class Library{
	
	private ArrayList<Book> books;
	private LinkedList<String> waitingList;
	private Vector<String> members;
	private Stack<Book> returnedBooks;
	private HashSet<String> uniqueMembers;
	private LinkedHashSet<Book> borrowedBooks;
	private TreeSet<String> sortedBookTitles;
	private HashMap<Integer, Book> bookDetails;
	private LinkedHashMap<Integer, String> checkoutHistory;
	private TreeMap<Integer, Book> sortedBooksById;
	
	public Library() {
	    books = new ArrayList<>();
	    waitingList = new LinkedList<>();
	    members = new Vector<>();
	    returnedBooks = new Stack<>();
	    uniqueMembers = new HashSet<>();
	    borrowedBooks = new LinkedHashSet<>();
	    sortedBookTitles = new TreeSet<>();
	    bookDetails = new HashMap<>();
	    checkoutHistory = new LinkedHashMap<>();
	    sortedBooksById = new TreeMap<>();
		}

	public void addBook(int id, String title) {
	    Book book = new Book(id, title);
	    books.add(book);
	    sortedBookTitles.add(title);
	    bookDetails.put(id, book);
	    sortedBooksById.put(id, book);
	}
	
	public void registerMember(String name) {
	    if (uniqueMembers.add(name)) {
	        members.add(name);
	    }
	}
	
	public void borrowBook(String memberName, int bookId) throws BookNotAvailableException {
	    Book book = bookDetails.get(bookId);
	    if (book == null || !book.isAvailable()) {
	        throw new BookNotAvailableException("Book with ID " + bookId + " is not available.");
	    }
	
	    book.setAvailable(false);
	    borrowedBooks.add(book);
	    waitingList.add(memberName);
	    checkoutHistory.put(bookId, memberName);
	}
	
	public void returnBook(int bookId) {
	    Book book = bookDetails.get(bookId);
	    if (book != null && !book.isAvailable()) {
	        book.setAvailable(true);
	        returnedBooks.push(book);
	        waitingList.poll();
	    }
	}
	
	public void displayCheckoutHistory() {
	    System.out.println("Checkout History:");
	    for (Map.Entry<Integer, String> entry : checkoutHistory.entrySet()) {
	        System.out.println("Book ID: " + entry.getKey() + ", Borrower: " + entry.getValue());
	    }
	}
}