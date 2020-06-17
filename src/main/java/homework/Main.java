package homework;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .filter(number -> number % 2 == 0)
            .filter(number -> number % 5 == 0);

        Stream.of(new Person())
            .flatMap(person -> person.getNumbers().stream());

        Stream.of(new Person())
                .map(Person::getNumbers)
                .flatMap(Collection::stream);

        Stream.of(1, 2, 3, 17, 19, 20, 21)
            .filter(number -> number >= 20);

        Stream.iterate(8, number -> number + 1)
                .filter(number -> number % 2 == 0)
                .filter(number -> number % 5 == 0);

        List<Integer> numbers = List.of();

        numbers.stream()
                .map(number -> number * 2);
    }

    public List<Integer> covertToIntegers(List<Double> doubles) {
        return doubles.stream()
                .map(Double::intValue)
                .collect(Collectors.toList());
    }

    static class Person {
        private List<Integer> numbers;

        public List<Integer> getNumbers() {
            return numbers;
        }
    }
}
