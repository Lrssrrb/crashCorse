package javaCode;

public class Q2 {
	
    public static void main(String[] args) {
        // Concatenation using String
        long startTime = System.nanoTime();
        String concatenatedString = "";
        for (int i = 0; i < 10000; i++) {
            concatenatedString += "a";
        }
        long endTime = System.nanoTime();
        long durationString = endTime - startTime;
        System.out.println("Time taken for String concatenation: " + durationString + " nanoseconds");

        // Concatenation using StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuilder = endTime - startTime;
        System.out.println("Time taken for StringBuilder concatenation: " + durationStringBuilder + " nanoseconds");

        // Concatenation using StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Time taken for StringBuffer concatenation: " + durationStringBuffer + " nanoseconds");
    }
}
