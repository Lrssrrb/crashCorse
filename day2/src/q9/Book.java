package q9;

class Book extends Resource {
    @Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
}
