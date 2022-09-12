package by.teachmeskills.classwork.lesson14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterfaceMain {
    public static void main(String[] args) {
        //принимает что-то, возвращает да или нет
        Predicate<Integer> myPredicate = value -> value > 3;   //интерфейс, у которого есть один метод. Возвращает true или false
        System.out.println(myPredicate.test(5));  //вызываем метод test потому, что изначально в интерфейсе Predicate объявлен метод test
        System.out.println(myPredicate.test(2));


        //принимает что-то, ничего не возвращает
        Consumer<String> myConsumer = str -> {
            if (str.length() > 5) {
                System.out.println(str);
            } else {
                System.out.println(str + str);
            }
        };
        myConsumer.accept("my first phrase");
        myConsumer.accept("second phrase");
        myConsumer.accept("stri");


        // ничего не принимает, но что-то возвращает
        Supplier<Integer> mySupplier = () -> 5;


        //принимаю значение первого типа, возвращаю значение второго типа. Типы могут быть одинаковыми
        Function<String, Integer> miFunction = str -> str.length();

    }

    private static void print(String str) {

    }
}
