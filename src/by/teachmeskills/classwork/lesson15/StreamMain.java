package by.teachmeskills.classwork.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 8));

        Stream<Integer> intStream = numbers.stream();
       // Stream<Integer> intStream = numbers.parallelStream();
        Stream<Integer> myNextStream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<String> linesStream = Files.lines(new File("document.txt").toPath());//а как взять новый файл и старый//можно запихнуть сразу в стрим не надо создавать файл ридер райтер

        Stream<Integer> values = Stream.generate(() -> new Random().nextInt());

        //  intStream.limit(3).forEach(x-> System.out.println(x));//выводим первые три элемента можно вывести хоть 1000000 даже если у тебя 10 он просто выведит10

        // intStream.forEach(x-> System.out.print(x));//нельзя пройтись 2 раз так как он пустой, это как течение на реке поток ушел уже ничего не словить
        // numbers.forEach(x-> System.out.println(x));
        //Map<String,String> myMap=new HashMap<>();
        //myMap.forEach((key, value)-> System.out.println(key+""+value));
        //intStream.skip(2).limit(3).forEach(x-> System.out.println(x));//первых два он из массива скипнул потом первые три после скипа распечатал
        //intStream.skip(2).limit(3).map(x->x*x).forEach(x-> System.out.println(x));
        //intStream.skip(2).limit(3).map(x->Math.pow(x,5)).forEach(x-> System.out.println(x));
        //intStream.skip(2).limit(3).map(x->x*x).filter(x->x>25).forEach(x-> System.out.println(x));
        // intStream.distinct().skip(2).limit(3).map(x -> x * x).filter(x -> x > 25).forEach(x -> System.out.println(x));//distinct оставляет все в одном экземпляре
     //   Stream<List<Integer>> listStream=new Stream.of(numbers,numbers);
      //  int[] sum = new int[1];//чтобы сравнить классы с помощью компееер ту нужно добавить этот метод в класс и указать  как будут сравниваться объекты персон например по фамилии имени тд
        //intStream//.skip(2).sorted((a,b)->b.compareTo(a)).distinct().peek(x -> {//кампоратор выводит задом наперед указанные числа
            //sum[0] += x;
       // }).limit(3).map(x -> x * x).forEach(x -> System.out.println(x));//если есть peek то каждая цифра возвращается к пику из конца
//listStream.flatMap(Collection::stream);
        // System.out.println(LocalDateTime.now());
        //listStream.flatMap(Collection::stream);//чтобы понять насколько быстро выполнилась операция
        //System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        Stream<List<Integer>> listStream=Stream.of(numbers,numbers);
        Set<Integer> myResult=listStream.flatMap(Collection::stream)
                .collect(Collectors.toSet());
        System.out.println(LocalDateTime.now());
        System.out.println(myResult);
        //myNextStream.filter(x->x>3).findFirst();//находит именно первый элемент
        //myNextStream.filter(x->x>3).anyMatch(x->x>4);//быстрее в плане производительности
        //myNextStream.filter(x->x>3).noneMatch(x->x>4);
        //myNextStream.filter(x->x>3).mapToDouble(x->x).average();//среднее
      //  myNextStream.filter(x->x>3).mapToDouble(x->x).sum();
        //myNextStream.filter(x->x>3).mapToDouble(x->x).max();
      //  myNextStream.filter(x->x>3).mapToDouble(x->x).min();
        System.out.println(myNextStream.filter(x->x>3).mapToDouble(x->x).summaryStatistics());
        //mapToDouble mapToInteger mapToLong переводит в примитивы дабл
        //System.out.println(myNextStream.filter(x->x>3).count());//считает сколько элементов осталось после фильтрации
        //myNextStream.filter(x->x>3).findAny();//находит любое число подходщее под условие
        var element=3;//джава сама выводит тип переменных
    }
}
