package streams;

import imperative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("JOHN", MALE),
                new Person("PRAVEEN", MALE),
                new Person("ISHANVI", FEMALE),
                new Person("VIJAY", MALE),
                new Person("JOHN2", MALE),
                new Person("BOB", PREFER_NOT_TO_SAY)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        boolean b = people.stream()
                        .anyMatch(person -> FEMALE.equals(person.gender));

        System.out.println(containsOnlyFemales);
        System.out.println(b);




    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
