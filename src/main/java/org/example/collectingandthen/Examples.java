package org.example.collectingandthen;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;
    private double score;
    private String major;

    public Student(String name, int age, double score, String major) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет, " + score + " баллов, " + major + ")";
    }
}

public class Examples {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Алина", 22, 85.5, "Информатика"),
                new Student("Владимир", 24, 91.0, "Математика"),
                new Student("Екатерина", 21, 76.5, "Информатика"),
                new Student("Игорь", 23, 60.0, "Физика"),
                new Student("Ольга", 22, 55.0, "Математика"),
                new Student("Дмитрий", 25, 40.0, "Информатика"),
                new Student("Марина", 21, 95.0, "Физика"));
//        Условие: Используя collectingAndThen, найти студента с максимальным баллом и вернуть его имя.
        String collect = students.stream()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Student::getScore)),
                                student -> student.map(Student::getName).orElse("Не найден")
                        )
                );
        System.out.println(collect);

        String collect1 = students.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.counting(),
                        count -> "Кол-во студентов: " + count
                ));
        System.out.println(collect1);
//        Задача 3: Получить список студентов, но сделать его неизменяемым
        List<Student> list = students.stream()
                .toList();
//        list.add(null); // UnsupportedOperationException

//        Задача 4: Подсчитать средний балл студентов и округлить его
        Long collect2 = students.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingDouble(Student::getScore),
                        Math::round
                ));
        System.out.println(collect2);


        String collect3 = students.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.minBy(Comparator.comparingDouble(Student::getScore)),
                        student -> student.map(st -> st.getName().toUpperCase()).orElse("Не найден")

                ));
        System.out.println(collect3);

        List<Sale> sales = Arrays.asList(
                new Sale("North", "Electronics", 150.0),
                new Sale("North", "Clothing", 80.0),
                new Sale("South", "Electronics", 200.0),
                new Sale("South", "Clothing", 120.0),
                new Sale("North", "Electronics", 100.0),
                new Sale("South", "Books", 50.0)
        );

        Map<String, String> collect4 = sales.stream()
                .collect(Collectors.groupingBy(
                        Sale::getRegion,
                        Collectors.mapping(Sale::getCategory, Collectors.joining(", "))
                ));
        System.out.println(collect4);

        Map<String, Set<String>> collect5 = sales.stream()
                .collect(Collectors.groupingBy(
                        Sale::getRegion,
                        Collectors.mapping(Sale::getCategory, Collectors.toSet())
                ));
        System.out.println(collect5);
    }
}
class Sale {
    private String region;
    private String category;
    private double amount;

    public Sale(String region, String category, double amount) {
        this.region = region;
        this.category = category;
        this.amount = amount;
    }

    public String getRegion() {
        return region;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Sale{region='" + region + "', category='" + category + "', amount=" + amount + "}";
    }
}