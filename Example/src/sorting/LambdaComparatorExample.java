package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Bob", 25));

        System.out.println("Sorting by Name:");
        Collections.sort(people, Comparator.comparing(Person::getName));
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\nSorting by Age:");
        Collections.sort(people, Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

