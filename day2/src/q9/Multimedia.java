package q9;

class Multimedia extends Resource{
    private String title;
    private String format;

    public Multimedia(String title, String format) {
        this.title = title;
        this.format = format;
    }

	@Override
	public String toString() {
		return "Multimedia [title=" + title + ", format=" + format + "]";
	}
    
    
}
