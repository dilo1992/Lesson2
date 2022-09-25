package by.teachmeskills.homework.lesson15;

import java.util.*;
import java.util.stream.Collectors;


public class StreamOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            numbers.add(new Random().nextInt(20));
        }
        System.out.println(numbers);
        List<Integer> streamNumber = numbers.stream()
                .distinct()
                .filter(x -> (x >= 7) & (x <= 17) & (x % 2 == 0))
                .map(x -> x * 2)
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(streamNumber);

        DoubleSummaryStatistics stats = streamNumber.stream()
                .mapToDouble(x -> x)
                .summaryStatistics();
        System.out.println("Count: " + stats.getCount() + "\n" + "Average: " + stats.getAverage());
    }
}
