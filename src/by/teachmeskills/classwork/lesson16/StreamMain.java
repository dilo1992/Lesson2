package by.teachmeskills.classwork.lesson16;

import by.teachmeskills.classwork.lesson12.Person;

import java.util.*;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,11,12,1, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 8));
        double average = numbers.stream().mapToDouble(x->x).average().orElse(0);             //DoubleStream, LongStream, IntStream - ������������������ ������

        DoubleSummaryStatistics statistics = numbers.stream().mapToDouble(x->x).summaryStatistics();  //�������� � summaryStatistics.
        // ����� ������������ � int, ����� ��� ���������� ����� �� DoubleSummaryStatistics, � IntSummaryStatistics,
        // � ��� ������ ���������� (����� �������� ���������������) ����� � int
        System.out.println(statistics.getMax()+" "+statistics.getCount()+" "+statistics.getAverage()+" "+ statistics.getMin()+" "+statistics.getSum());

        List<Person> people = new ArrayList<>();
        people.stream().max(Comparator.comparing(Person::getAge));  //����������� ������� ���������� ������� Person �� �������� (getAge)

    }

}
