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
                .filter(order->order.getProducts() //��������� � �������� ��� ��������
                        .stream()     //��������� ��������� � �����
                        .anyMatch(product -> product.getName().equals("milk")))  //���� ���� ���� ���� �������� milk, �� true
                .collect(Collectors.toList()));

        System.out.println(orders.stream()
                .flatMap(order -> order.getProducts().stream())    //flatMap ��������� ��� ������ � ����
                //.stream() ��� ����, ���� ������� �� ����� stream. flatMap ��������� �����, � ���������� �����.
                // �� ����� �������� List order � ������ ��� �� order.getProducts(). ���� ������� ���������� List � �����,
                // �� ��������� ����� .stream()
                .distinct()
                .collect(Collectors.toList()));





    }
}
