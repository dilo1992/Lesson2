package by.teachmeskills.homework.lesson15;

import java.util.List;
import java.util.Optional;

public class StreamOfStudentsNames {
    public static void main(String[] args) {
        List<String> names = List.of("Dmitry", "Andrei", "Evgeniy", "Polina", "Yaroslav",
                "Gleb", "Artem", "Alexander", "Andrei", "Kirill");
        List<String> myName = names.stream()
                .filter(x -> x.equalsIgnoreCase("Dmitry"))
                .toList();
        if (myName.size() <= 1)
            System.out.println("My name does not occur except for me");
        else
            System.out.println((myName.size() - 1) + " people have my name");

        List<String> namesStartsWithA = names.stream()
                .filter(x -> x.toLowerCase().startsWith("a"))
                .toList();
        if (namesStartsWithA.size() == 0)
            System.out.println("There aren`t names starting with 'a'");
        else
            System.out.println((namesStartsWithA.size()) + " people have name starting with 'a'");

        Optional<String> firstElCollection = names.stream()
                .sorted()
                .findFirst();
        firstElCollection.ifPresentOrElse(
                x -> System.out.println(x),
                () -> System.out.println("Empty")
        );
    }
}
