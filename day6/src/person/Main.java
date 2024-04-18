package person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));

        Collections.sort(persons);
        System.out.println("Sorted by age:");
        System.out.println(persons);

        Collections.sort(persons, Comparator.comparing(Person::getName));
        System.out.println("Sorted by name:");
        System.out.println(persons);
    }
}
