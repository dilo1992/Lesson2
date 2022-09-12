package by.teachmeskills.classwork.lesson14;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerMain {
    public static void main(String[] args) {
//        consumerElements(list -> System.out.println(list));
//
//        consumerElements(list -> {
//            Collections.sort(list);
//            System.out.println(list);
//        });
//
//        consumerElements(list -> {
//            if (list.size() > 3) {
//                System.out.println(list.subList(0, 2));
//            }
//        });

        printOneElement(()->0);
        Random r = new Random();
        printOneElement(()->r.nextInt(7));  //7 в скобках потому, что в листе 7 слов занесено
        printOneElement(()->r.nextInt(7));
        printOneElement(()->r.nextInt(7));
        printOneElement(()->r.nextInt(7));
    }


    private static void consumerElements(Consumer<List<String>> consumer) {
        List<String> myElement = new ArrayList<>();
        myElement.addAll(Arrays.asList("first", "second", "third", "fourth", "fifth", "cucumber", "hj"));
        consumer.accept(myElement);
    }

    private static void printOneElement(Supplier<Integer> supplier) {
        List<String> myElement = new ArrayList<>();
        myElement.addAll(Arrays.asList("first", "second", "third", "fourth", "fifth", "cucumber", "hj"));
        System.out.println(myElement.get(supplier.get()));
    }
}
