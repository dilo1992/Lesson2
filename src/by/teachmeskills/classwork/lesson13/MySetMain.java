package by.teachmeskills.classwork.lesson13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySetMain {
    //Set - набор данных, в которых элементы не повторяются. Коллекция уникальных значений
    //HashSet - хэшкод - какое-то число, соответствующее объектую Если есть объект, программа может очень быстро посчитать для него число
    //TreeSet - сразу отсортированный набор данных. При добавлении происходит сортировка коллекции сразу

    public static void main(String[] args) {
        //Set<String> mySet = new HashSet<>();
        Set<String> mySet = new TreeSet<>();
        System.out.println(mySet.size());
        mySet.add("first");
        mySet.addAll(Arrays.asList("first", "second", "mine"));
        System.out.println(mySet);
        System.out.println(mySet.contains("mine"));
        System.out.println(mySet.isEmpty());
        System.out.println(mySet.remove("second")); //результатом является true или false (удаление успешно или элемента там не было)
        System.out.println(mySet);
    }
}
