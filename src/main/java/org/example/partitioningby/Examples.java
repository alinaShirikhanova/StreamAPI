package org.example.partitioningby;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale("North", "Electronics", 150.0),
                new Sale("North", "Clothing", 80.0),
                new Sale("South", "Electronics", 200.0),
                new Sale("South", "Clothing", 120.0),
                new Sale("North", "Electronics", 100.0),
                new Sale("South", "Books", 50.0)
        );
        Map<String, Long> collect = sales.stream()
                .collect(Collectors.groupingBy(
                        sale -> sale.getAmount() > 99 ? "High" : "Low",
                        Collectors.counting()
                ));
        System.out.println(collect);


        List<String> words = List.of("Java", "Stream", "API");
        int totalLength = words.stream().mapToInt(String::length).sum();
        System.out.println(totalLength);
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
