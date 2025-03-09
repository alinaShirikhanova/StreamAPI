package org.example.teeing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 3, 7, 21, 5);
//        Integer collect = numbers.stream()
//                .collect(Collectors.teeing(
//                        Collectors.maxBy(Integer::compare),
//                        Collectors.minBy(Integer::compare),
//                        (max, min) -> max.orElse(0) - min.orElse(0)
//                ));
//        System.out.println(collect);
//
//        List<String> numberLines = Arrays.asList("1 2 3", "4 5", "6");
//        int sum = numberLines.stream()
//                .flatMap(l -> Arrays.stream(l.split(" ")))
//                .map(Integer::valueOf).mapToInt(Integer::intValue).sum();
//
//        class Product {
//            String name;
//            double price;
//
//            public double getPrice() {
//                return price;
//            }
//
//            Product(String name, double price) {
//                this.name = name;
//                this.price = price;
//            }
//        }
////         Дано: Список продуктов с полем price.
//// Требуется: Используя collectingAndThen(), собрать список цен, отсортировать его по возрастанию и вернуть неизменяемый список.
//        List<Product> products = Arrays.asList(
//                new Product("Bread", 1.5),
//                new Product("Milk", 1.2),
//                new Product("Cheese", 2.5)
//        );
//        List<Double> sortedPrices = products.stream()
//                .map(Product::getPrice)
//                .sorted()
//                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
//        System.out.println(sortedPrices);
//
//        List<String> words = Arrays.asList("Apple", "banana", "Cherry", "date");
//        List<Integer> lengths = words.stream()
//                .collect(
//                        Collectors.filtering(
//                                word -> Character.isUpperCase(word.charAt(0)),
//                        Collectors.mapping(String::length, Collectors.toList())
//                        ));
//        System.out.println("Длины: " + lengths);

        List<Integer> numbers = Arrays.asList(2, 3, 4);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        String combined = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue),
                        Collectors.collectingAndThen(Collectors.toList(), list -> product),
                        (sum, prod) -> "Сумма: " + sum + ", Произведение: " + prod));
        System.out.println(combined);



    }
}
