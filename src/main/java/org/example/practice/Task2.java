package org.example.practice;

import java.util.Arrays;
import java.util.List;

/**
 * Найти кол-во уникальных строк, длиной больше 8 символов
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple111111", "banana", "cherry");
        long count = words.stream()
                .filter(s -> s.length() > 8)
                .distinct().count();
        System.out.println(count);
    }
}
