package lambda;

import java.util.Arrays;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ex1solLambda {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));

        printConditionslly(people, p->true);

        printConditionslly(people,p -> p.getLastName().startsWith("C"));
        printConditionslly(people,p -> p.getFristName().startsWith("C"));
    }
    private static void printConditionslly(List<Person> people, Predicate<Person> predicate){
        for (Person p: people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }
}