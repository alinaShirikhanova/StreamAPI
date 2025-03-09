package org.example.practice;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * Найти среднее всех нечетных чисел, делящихся на 5
 */
public class Task1 {
    public static void main(String[] args) {
        Double average = Stream.iterate(1, (a) -> a + 1)
                .limit(30)
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 5 == 0)
                .peek(System.out::println)
                .mapToInt(Integer::intValue)
                .average().orElse(0);
        System.out.println(average);



    }
}
