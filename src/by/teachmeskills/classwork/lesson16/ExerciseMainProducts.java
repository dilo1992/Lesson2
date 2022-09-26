package by.teachmeskills.classwork.lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseMainProducts {
    public static void main(String[] args) {
        List<Product> products1 = Arrays.asList(
                new Product("milk", 11),
                new Product("meat", 30),
                new Product("apple", 5),
                new Product("oil", 20)
        );

        List<Product> products2 = Arrays.asList(
                new Product("melon", 4),
                new Product("lemon", 50),
                new Product("apple", 23),
                new Product("pineapple", 40)
        );

        List<Order> orders = Arrays.asList(
                new Order(1,products1),
                new Order(2, products2)
        );


        System.out.println(orders.stream()
                .filter(order->order.getProducts() //фильтруем и отбираем все продукты
                        .stream()     //добавл€ем результат в стрим
                        .anyMatch(product -> product.getName().equals("milk")))  //если есть хоть одно название milk, то true
                .collect(Collectors.toList()));

        System.out.println(orders.stream()
                .flatMap(order -> order.getProducts().stream())    //flatMap склеивает все стримы в один
                //.stream() дл€ того, чтоб сделать из листа stream. flatMap принимает поток, и возвращает поток.
                // ћы сразу передаем List order и мен€ем его на order.getProducts(). „тоб сделать измененный List в поток,
                // мы добавл€ем потом .stream()
                .distinct()
                .collect(Collectors.toList()));





    }
}
