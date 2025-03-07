package org.example.flatmap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
//        List<String> sentences = List.of("Hello world", "Functional programming", "Java Streams");
//        List<String> list = sentences.stream()
//                .flatMap(s -> Arrays.stream(s.split(" ")))
//                .toList();
//        System.out.println(list);
//
//        List<List<Integer>> numbers = List.of(
//                List.of(10, 20),
//                List.of(30, 40, 50),
//                List.of(60)
//        );
//
//        List<Integer> list1 = numbers.stream()
//                .flatMap(List::stream)
//                .toList();
//        System.out.println(list1);
//
//
//        List<String> words = List.of("Java", "Stream");
//        List<List<Character>> result = words.stream()
//                .map(word -> word.chars()
//                        .mapToObj(c -> (char) c)
//                        .toList()
//                )
//                .toList();
//        System.out.println(result);
//
//
//        List<Character> result2 = words.stream()
//                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
//                .toList();
//        System.out.println(result2);
//
//
//        Set<Set<String>> names = Set.of(
//                Set.of("Alice", "Bob"),
//                Set.of("Charlie", "David"),
//                Set.of("Eve")
//        );
//
//        Set<String> collect = names.stream()
//                .flatMap(Set::stream)
//                .collect(Collectors.toSet());
//        System.out.println(collect);
//
//
//        class Person {
//            String name;
//            List<String> phoneNumbers;
//
//            Person(String name, List<String> phoneNumbers) {
//                this.name = name;
//                this.phoneNumbers = phoneNumbers;
//            }
//
//            List<String> getPhoneNumbers() {
//                return phoneNumbers;
//            }
//        }
//
//        List<Person> people = List.of(
//                new Person("Alice", List.of("123", "456")),
//                new Person("Bob", List.of("789")),
//                new Person("Charlie", List.of("101", "112"))
//        );
//
//        List<String> list2 = people.stream()
//                .flatMap(person -> person.getPhoneNumbers().stream())
//                .toList();
//        System.out.println(list2);
//
//
//        List<String> words2 = List.of("Java", "Stream", "Reduce");
//
//        int totalLength = words2.parallelStream()
//                .reduce(0,
//                        (length, word) -> length + word.length(),  // accumulator
//                        Integer::max);  // combiner
//
//        System.out.println(totalLength); // 16
//
//
////Найти среднюю длину слов в списке
//        List<String> wordsList = List.of("apple", "banana", "cherry");
//        double v = wordsList.stream()
//                           .map(String::length)
//                           .reduce(0, Integer::sum) / (double) wordsList.size();
//        System.out.println(v);
//
//
//        List<Integer> numbersList = List.of(10, 20, 5, 30);
//        Integer i = numbersList.stream()
//                .reduce(Integer.MAX_VALUE, Integer::min);
//        System.out.println(i);

//        Подсчитать количество букв в списке слов
//        List<String> wordsList2 = List.of("hello", "world");
//        List<Integer> list3 = wordsList2
//                .stream()
//                .flatMap(s -> s.chars().boxed())
//                .toList();int sum = List.of(1, 2, 3, 4, 5, 6)
//
//
//        Integer reduce = wordsList2.stream()
//
//                .reduce(0, (sum, l) -> sum + l.length(), );
//        System.out.println(reduce);
//
//        int letterCount = wordsList2.stream()
//                .reduce(0, (sum, word) -> sum + word.length(), Integer::sum);

//      Найдите сумму квадратов всех четных чисел в списке.
//        Integer sum = Stream.of(1, 2, 3, 4)
//                .filter(n -> n % 2 == 0)
//                .mapToInt(n -> n * n)
//                .sum();

//        List<Integer> nums = List.of();
//        int sum1 = nums.stream()
//                .filter(n -> n % 2 == 0)
//                .mapToInt(n -> n * n)
//                .sum();
//        System.out.println(sum1);

//        TreeSet<String> treeSet = Stream.of("delta", "alpha", "charlie", "bravo")
//                .map(String::toUpperCase)
//                .collect(Collectors.toCollection(TreeSet::new));
//        IntStream.rangeClosed(10, 100)
//                .map(r -> 110 - r)
//                .forEach(System.out::println);

//        String[] animals = {"cat", "cat", "dog", "elephant"};
//        Map<String, Integer> animalMap = Arrays.stream(animals)
//                .collect(Collectors.toUnmodifiableMap(Function.identity(), String::length));
//        System.out.println(animalMap);
//
//
//        List<String> words = Arrays.asList("elephant", "tiger", "bear", "giraffe", "tiger");
//        Set<String> resultSet = words.stream()
//                .filter(s -> s.contains("e"))
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toCollection(LinkedHashSet::new),
//                        Collections::unmodifiableSet));
//        System.out.println(resultSet);

//      Ситуация: Дан список строк, представляющих имена файлов с расширениями.
//Требуется:
//
//Разбить имена файлов на имя и расширение.
//Собрать их в карту, где ключ — расширение, а значение — список имён файлов с этим расширением.
//Результирующая карта должна быть неизменяемой.
        List<String> files = Arrays.asList("doc1.pdf", "image1.png", "doc2.pdf", "notes.txt");
//        files.stream()
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toMap()
//                        )
//                ));


    }
}
