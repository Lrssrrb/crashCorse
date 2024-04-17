package q9;

abstract class Resource {
    private boolean isCheckedOut;

    public void isCheckedOut() {
    	System.out.println(isCheckedOut);
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnResource() {
        isCheckedOut = false;
    }
}
