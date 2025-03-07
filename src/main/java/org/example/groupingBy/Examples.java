package org.example.groupingBy;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

class Product {
    private String category;
    private int price;

    public Product(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Person {
    private String name;
    private int age;
    private String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

// Задача 2. Класс Student (Студент)
class Student {
    private String name;
    private int score;
    private int classLevel;

    public Student(String name, int score, int classLevel) {
        this.name = name;
        this.score = score;
        this.classLevel = classLevel;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getClassLevel() {
        return classLevel;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + ", classLevel=" + classLevel + "}";
    }
}

// Задача 3. Класс Sale (Продажа)
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


// Класс Product: для задач по группировке товаров по категории и ценам.

// Класс Employee: для задач с сотрудниками (группировка по департаменту, вычисление среднего возраста, объединение имён).
class Employee {
    private String name;
    private int age;         // Может использоваться для вычисления среднего возраста
    private String department;

    // Конструктор, когда нужен только департамент и имя.
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Конструктор, когда требуется возраст.
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}

// Класс LogEntry: для группировки логов по уровню с вычислением среднего времени обработки.
class LogEntry {
    private String level;
    private int executionTime;

    public LogEntry(String level, int executionTime) {
        this.level = level;
        this.executionTime = executionTime;
    }

    public String getLevel() {
        return level;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    @Override
    public String toString() {
        return "LogEntry{level='" + level + "', executionTime=" + executionTime + "}";
    }
}

// Класс Transaction: для задач по группировке транзакций по типу.
class Transaction {
    private String type;
    private int amount;

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{type='" + type + "', amount=" + amount + "}";
    }
}

// Класс Book: для многоуровневой группировки книг по жанру и автору.
class Book {
    private String genre;
    private String author;

    public Book(String genre, String author) {
        this.genre = genre;
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{genre='" + genre + "', author='" + author + "'}";
    }
}

// Класс Order: для группировки заказов по клиенту с сортировкой по дате.
class Order {
    private String customer;
    private LocalDate orderDate;

    public Order(String customer, LocalDate orderDate) {
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public String getCustomer() {
        return customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{customer='" + customer + "', orderDate=" + orderDate + "}";
    }
}

public class Examples {
    public static void main(String[] args) {
//        List<Product> products = List.of(
//                new Product("Electronics", 100),
//                new Product("Clothing", 50),
//                new Product("Electronics", 200),
//                new Product("Clothing", 80)
//        );
//
//        Map<String, Integer> totalPriceByCategory = products.stream()
//                .collect(Collectors.groupingBy(
//                        Product::getCategory,
//                        Collectors.summingInt(Product::getPrice)
//                ));
//
//        System.out.println(totalPriceByCategory);
//
//
//        List<Person> persons = List.of(
//                new Person("Alice", 30, "NY"),
//                new Person("Bob", 25, "LA"),
//                new Person("Charlie", 35, "NY"),
//                new Person("David", 28, "LA")
//        );
//
//
//        Map<String, IntSummaryStatistics> collect = persons.stream()
//                .collect(Collectors.groupingBy(
//                        Person::getCity,
//                        Collectors.summarizingInt(Person::getAge)
//                ));
//        System.out.println(collect.get("NY"));
//
//        Map<String, Double> collect1 = persons.stream()
//                .collect(Collectors.groupingBy(
//                        Person::getCity,
//                        Collectors.averagingInt(Person::getAge)
//                ));
//        System.out.println(collect1);
//
//        List<Book> books = List.of(
//                new Book("Fiction", "Author A"),
//                new Book("Fiction", "Author B"),
//                new Book("Fiction", "Author A"),
//                new Book("Non-Fiction", "Author D"),
//                new Book("Non-Fiction", "Author C"),
//                new Book("Non-Fiction", "Author C")
//        );
//
//        Map<String, Map<String, Long>> bookCountByGenreAndAuthor = books.stream()
//                .collect(Collectors.groupingBy(
//                        Book::getGenre,
//                        Collectors.groupingBy(
//                                Book::getAuthor,
//                                Collectors.counting()
//                        )
//                ));
//        System.out.println(bookCountByGenreAndAuthor);
//
////        Дан список заказов (Order), где у каждого заказа есть поля: клиент (customer)
////        и дата заказа (orderDate). Сгруппировать заказы по клиенту, а затем в каждой
////        группе разделить заказы по месяцу, в котором они были сделаны. Для каждой
////        подгруппы подсчитать количество заказов.
//        List<Order> orders = Arrays.asList(
//                new Order("Client1", LocalDate.of(2023, Month.JANUARY, 15)),
//                new Order("Client1", LocalDate.of(2023, Month.FEBRUARY, 10)),
//                new Order("Client2", LocalDate.of(2023, Month.JANUARY, 20)),
//                new Order("Client2", LocalDate.of(2023, Month.MARCH, 5)),
//                new Order("Client1", LocalDate.of(2023, Month.JANUARY, 25))
//        );
//
//
//        Map<String, Map<Month, Long>> ordersCollect = orders.stream()
//                .collect(Collectors.groupingBy(
//                        Order::getCustomer,
//                        Collectors.groupingBy(
//                                order -> order.getOrderDate().getMonth(),
//                                Collectors.counting()
//                        )
//                ));
//        System.out.println(ordersCollect);

//Задача 2. Многоуровневая группировка студентов по классу и по результату (прохождение/не прохождение)
//Условие:
//Дан список студентов (Student), где у каждого студента есть поля:
// класс (classLevel) и балл (score). Сгруппировать студентов по классу,
// а затем в каждой группе разделить студентов на тех, кто прошёл экзамен
// (балл ≥ 50) и не прошёл (балл < 50). Подсчитать количество студентов
// в каждой подгруппе.
        List<Student> students = Arrays.asList(
                new Student("Alice", 75, 10),
                new Student("Bob", 45, 10),
                new Student("Charlie", 60, 11),
                new Student("David", 30, 11),
                new Student("Eve", 90, 10)
        );


        Map<Integer, Map<Boolean, Long>> collect = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getClassLevel,
                        Collectors.groupingBy(
                                student -> student.getScore() >= 50,

                                Collectors.counting()
                        )
                ));
        System.out.println(collect);

//Задача 3. Многоуровневая группировка продаж по региону и категории с суммированием продаж
//Условие:
//Дан список продаж (Sale), где у каждой продажи есть поля: регион (region),
// категория товара (category) и сумма продажи (amount). Сгруппировать продажи
// сначала по региону, затем внутри каждого региона – по категории товара.
// Для каждой подгруппы вычислить суммарную продажную сумму.

        List<Sale> sales = Arrays.asList(
                new Sale("North", "Electronics", 150.0),
                new Sale("North", "Clothing", 80.0),
                new Sale("South", "Electronics", 200.0),
                new Sale("South", "Clothing", 120.0),
                new Sale("North", "Electronics", 100.0),
                new Sale("South", "Books", 50.0)
        );

        Map<String, Map<String, Double>> collect1 = sales.stream()
                .collect(Collectors.groupingBy(
                        Sale::getRegion,
                        Collectors.groupingBy(
                                Sale::getCategory,
                                Collectors.summingDouble(Sale::getAmount)
                        )
                ));
        System.out.println(collect1);


    }
}
