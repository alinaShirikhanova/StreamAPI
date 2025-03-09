package org.example.reducing;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum1 = numbers.stream()
                .reduce(Integer::sum);
        Integer sum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum2);

//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        int totalLength = words.stream()
//                .collect(Collectors.reducing(0, String::length, Integer::sum));
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String result = words.stream()
                .collect(Collectors.collectingAndThen(Collectors.joining(", "), String::toUpperCase));
        System.out.println(result);


        List<Integer> nums = Arrays.asList(5, 3, 8, 1);
        List<Integer> sortedList = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println(sortedList);


//        Задача 3: Собрать список чисел, вычислить их сумму и вернуть результат как строку.
//

//// Решение:
        List<Integer> numbers2 = Arrays.asList(10, 20, 30);
        String sumString = numbers2.stream()
                .collect(Collectors.collectingAndThen(
                                Collectors.summingInt(Integer::intValue),
                                String::valueOf
                        )
                );
        System.out.println(sumString);

        int[] numbers3 = {2, 7, 8, 10, 13};
        long count = Arrays.stream(numbers3)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.counting());

        List<Integer> numbers4 = Arrays.asList(4, 8, 2, 10, 3);
        Optional<Integer> max = numbers4.stream()
                .collect(Collectors.maxBy(Integer::compare));


        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String toString() {
                return name + ": " + age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );
        Optional<Person> oldest = people.stream()
                .max(Comparator.comparing(Person::getAge));

        List<String> words3 = Arrays.asList("apple", "banana", "cherry");
        Optional<String> longest = words.stream()
                .max(Comparator.comparing(String::length));
        longest.ifPresent(word -> System.out.println("Самое длинное слово: " + word));

//        List<Integer> numbers4 = Arrays.asList(10, 20, 30);
//        int sum = numbers.stream()
//                .collect(Collectors.summingInt(n-> n));
        List<List<Integer>> listOLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> flatList = listOLists.stream()
                .collect(Collectors.flatMapping(List::stream, Collectors.toList()));
        System.out.println(flatList);


        List<String> words4 = Arrays.asList("hi", "ok");
        List<Character> chars = words.stream()
                .collect(Collectors.flatMapping(
                        word -> word.chars().mapToObj(c -> (char) c),
                        Collectors.toList()));
        System.out.println(chars);



    }
}
