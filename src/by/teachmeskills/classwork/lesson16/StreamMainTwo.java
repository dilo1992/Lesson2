package by.teachmeskills.classwork.lesson16;

import by.teachmeskills.classwork.lesson12.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMainTwo {
    public static void main(String[] args) {
        //сгруппировать коллекцию так, чтоб само число было ключом, а значение было количеством включений этого числа в листе
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 1, 1, 3, 3, 4, 4, 5, 6, 7, 9));
        Map<Integer, Long> results = numbers.stream()      // <Integer, Long> - потому, что значения в int, а counting() всегда в Long
                //группируем по какому-то признаку
                .collect(Collectors.groupingBy(
                        //значение, которое изначально в листе
                        Function.identity(),
                        //сколько раз встречается
                        Collectors.counting()));        //Function.identity() вставляет само число как ключ,
                                                        // а Collectors.counting() вставляет как значение количество раз когда данное
                                                        // число встречается в List
        System.out.println(results);

        //упражнение с Person
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", 28));
        people.add(new Person("Petr", 20));
        people.add(new Person("Sergey", 18));
        people.add(new Person("Andrey", 35));
        people.add(new Person("Semen", 50));
        people.stream().collect(Collectors.groupingBy(Person::getAge));  //собираем Person так, что собираем (группируем) по возрасту,
                                                                         // а потом все отсортированное собираем опять в List<Person>
        Map<Integer, List<Person>> listMap = people.stream().collect(Collectors.groupingBy(Person::getAge));  //Person::getAge - аналог person->person.getAge()
        System.out.println(listMap.toString());

        //смысл точно такой же, только группировка по именам
        people.stream().collect(Collectors.groupingBy(Person::getName));  //собираем Person так, что собираем (группируем) по именам,
        // а потом все отсортированное собираем опять в List<Person>
        Map<String, List<Person>> listMap2 = people.stream().collect(Collectors.groupingBy(Person::getName));  //Person::getName - аналог person->person.getName()
        System.out.println(listMap2);

        //можно еще так. Можно написать var заменяет тип данных и сам определяет его
        var listMap3 = people.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(listMap2);
    }
}
