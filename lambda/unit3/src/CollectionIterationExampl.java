import java.util.Arrays;
import java.util.List;

import lambda.Person;

public class CollectionIterationExampl {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        System.out.println("for loop");
        for (int i = 0; i < people.size(); i++) {
            // System.out.println(people.get(i));
        }
        System.out.println("in loop");
        for (@SuppressWarnings("unused") Person person : people) {
            // System.out.println(person);
        }
        people.forEach(System.out::println);
         
    }
}
