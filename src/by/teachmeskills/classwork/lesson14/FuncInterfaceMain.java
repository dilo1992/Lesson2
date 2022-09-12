package by.teachmeskills.classwork.lesson14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterfaceMain {
    public static void main(String[] args) {
        //��������� ���-��, ���������� �� ��� ���
        Predicate<Integer> myPredicate = value -> value > 3;   //���������, � �������� ���� ���� �����. ���������� true ��� false
        System.out.println(myPredicate.test(5));  //�������� ����� test ������, ��� ���������� � ���������� Predicate �������� ����� test
        System.out.println(myPredicate.test(2));


        //��������� ���-��, ������ �� ����������
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


        // ������ �� ���������, �� ���-�� ����������
        Supplier<Integer> mySupplier = () -> 5;


        //�������� �������� ������� ����, ��������� �������� ������� ����. ���� ����� ���� �����������
        Function<String, Integer> miFunction = str -> str.length();

    }

    private static void print(String str) {

    }
}
