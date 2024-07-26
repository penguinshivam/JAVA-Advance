package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exsol {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        Collections.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person o1,Person o2){
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(people);

        printConditionslly(people,new Condition() {
            @Override
            public boolean test(Person p){
                return p.getLastName().startsWith("C");
            }
        });
    }
    private static void printConditionslly(List<Person> people, Condition condition){
        for (Person p: people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
    private static void printAll(List<Person> people){
        for (Person p : people) {
            System.out.println(p);
        }
    } 
}
interface Condition{
    boolean test(Person p) ;
}