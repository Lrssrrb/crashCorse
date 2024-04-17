package q9;

class Journal extends Resource{
    private String title;
    private int issueNumber;

    public Journal(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

	@Override
	public String toString() {
		return "Journal [title=" + title + ", issueNumber=" + issueNumber + "]";
	}
}
