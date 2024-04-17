package javaCode;

public class Q4 {
	
	public static String reverseWithString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

	public static void main(String[] args) {
		String original = "Hello, World!";
	    String reversed = reverseWithString(original);
	    System.out.println("Reversed string: " + reversed);
	    reversed = new StringBuilder(original).reverse().toString();
	    System.out.println("Reversed string: " + reversed);
	    reversed = new StringBuffer(original).reverse().toString();
	    System.out.println("Reversed string: " + reversed);
	}
    
}
