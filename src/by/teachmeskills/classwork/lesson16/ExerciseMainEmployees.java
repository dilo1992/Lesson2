package by.teachmeskills.classwork.lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseMainEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(22,"Worker"));
        employees.add(new Employee(20,"Worker"));
        employees.add(new Employee(30,"Worker"));
        employees.add(new Employee(18,"Worker"));

        employees.add(new Employee(33,"Manager"));
        employees.add(new Employee(50,"Manager"));
        employees.add(new Employee(40,"Manager"));
        employees.add(new Employee(19,"Manager"));


        //���������� ������� ��������
        double average = employees.stream()
                .mapToDouble(x->x.getSalary())
                .average()
                .getAsDouble();
        System.out.println(average);

        //��� �� ������ ����� ������� ���
        System.out.println(
                employees.stream()
                .mapToDouble(x->x.getSalary())
                .average()
                .getAsDouble()
                );

        //������������� �� ���������� � �������
        Map<String, List<Employee>> listMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory));

        System.out.println(listMap);

        //���������� �� ���������� � ������������ �� ��
        var listMap2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(listMap2);

        //��� ��� ���
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary))));

        //�������� ����� ������ ���������� �� ����������
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                                Collectors.minBy(Comparator.comparing(Employee::getSalary)))));
    }
}
