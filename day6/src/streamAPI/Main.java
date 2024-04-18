package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        List<String> transformedList = strings.stream()
                .filter(s -> s.length() >= 4)
                .map(String::toUpperCase)
                .toList();

        System.out.println("Original List: " + strings);
        System.out.println("Transformed List: " + transformedList);
    }
}

