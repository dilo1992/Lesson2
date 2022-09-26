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
        //������������� ��������� ���, ���� ���� ����� ���� ������, � �������� ���� ����������� ��������� ����� ����� � �����
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 1, 1, 3, 3, 4, 4, 5, 6, 7, 9));
        Map<Integer, Long> results = numbers.stream()      // <Integer, Long> - ������, ��� �������� � int, � counting() ������ � Long
                //���������� �� ������-�� ��������
                .collect(Collectors.groupingBy(
                        //��������, ������� ���������� � �����
                        Function.identity(),
                        //������� ��� �����������
                        Collectors.counting()));        //Function.identity() ��������� ���� ����� ��� ����,
                                                        // � Collectors.counting() ��������� ��� �������� ���������� ��� ����� ������
                                                        // ����� ����������� � List
        System.out.println(results);

        //���������� � Person
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", 28));
        people.add(new Person("Petr", 20));
        people.add(new Person("Sergey", 18));
        people.add(new Person("Andrey", 35));
        people.add(new Person("Semen", 50));
        people.stream().collect(Collectors.groupingBy(Person::getAge));  //�������� Person ���, ��� �������� (����������) �� ��������,
                                                                         // � ����� ��� ��������������� �������� ����� � List<Person>
        Map<Integer, List<Person>> listMap = people.stream().collect(Collectors.groupingBy(Person::getAge));  //Person::getAge - ������ person->person.getAge()
        System.out.println(listMap.toString());

        //����� ����� ����� ��, ������ ����������� �� ������
        people.stream().collect(Collectors.groupingBy(Person::getName));  //�������� Person ���, ��� �������� (����������) �� ������,
        // � ����� ��� ��������������� �������� ����� � List<Person>
        Map<String, List<Person>> listMap2 = people.stream().collect(Collectors.groupingBy(Person::getName));  //Person::getName - ������ person->person.getName()
        System.out.println(listMap2);

        //����� ��� ���. ����� �������� var �������� ��� ������ � ��� ���������� ���
        var listMap3 = people.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(listMap2);
    }
}
