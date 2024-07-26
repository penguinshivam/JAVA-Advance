package lambda;

import java.util.Arrays;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class unit2standardFunctionalInterface {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));

        perfomConditionslly(people, p->true,p->System.out.println(p)
        );

        perfomConditionslly(people,p -> p.getLastName().startsWith("C"),p->System.out.println(p));
        perfomConditionslly(people,p -> p.getFristName().startsWith("C"),p->System.out.println(p));
    }
    private static void perfomConditionslly(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer){
        for (Person p: people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}