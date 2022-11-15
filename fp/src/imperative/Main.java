package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("JOHN", Gender.MALE),
                new Person("PRAVEEN", Gender.MALE),
                new Person("ISHANVI", Gender.FEMALE),
                new Person("VIJAY", Gender.MALE),
                new Person("JOHN2", Gender.MALE)
        );

        // Imperative Approach
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();
        for(Person person: people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        }

        // Declarative Approach
        System.out.println("Declarative Approach");
        List<Person> female = people.stream().
                filter(person -> Gender.FEMALE.equals(person.gender)).
                collect(Collectors.toList());
        female.forEach(System.out::println);
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
        MALE, FEMALE
    }

}