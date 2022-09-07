package by.teachmeskills.classwork.lesson13;

import java.util.*;

public class ListMain {
    //List
    //ArrayList [1,2,3,4,5];
    //LinkedList 1 -> 2 -> 3

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(); //создаем ArrayList
        arrayList.add(1); //добавляем один элемент в лист
        arrayList.add(10);
        arrayList.add(2, 5); //вставляем на второе место элемент 5
        arrayList.addAll(Arrays.asList(3, 4, 5, 6, 7, 8, 9)); //добавляем не одно число в лист
        System.out.println(arrayList);
        arrayList.set(2, 8); //перезаписывает второй элемент массива на элемент 8
        System.out.println(arrayList);
        System.out.println(arrayList.get(2)); //выводит на печать элемент листа с индексом в скобках
        System.out.println(arrayList.size()); //выводит на печать размер листа
        System.out.println(arrayList.isEmpty()); // выводит true или false насчет тоо, пустой лист или нет
        System.out.println(arrayList.contains(7)); //проверяем, есть ли в листе число в скобках
        System.out.println(arrayList.subList(2, 5)); //составляет подлист с элементами листа с индексами в скобках НЕ ВКЛЮЧАЯ ПОСЛЕДНИЙ
        System.out.println(arrayList.indexOf(7)); // показывает индекс позиции искомого числа в листе в начала
        System.out.println(arrayList.lastIndexOf(7)); // показывает индекс позиции искомого числа в листе в конца
        System.out.println(arrayList.remove(3)); //удаление числа из листа (можно по индексу или элементу)
        System.out.println(arrayList.remove(Integer.valueOf(8))); //удаление числа тоже

        int sum = 0;
        for (int value : arrayList) {
            sum += value;
        }

        //для прохождения по листу в процессе удаления может возникнуть ошибка, что элемента нет, а мы пытаемся его использовать
        //с помощью итератора этой ошибки не будет.
        Iterator<Integer> iterator = arrayList.iterator();
        int counter = 0;
        while (iterator.hasNext()) { //проверяем есть ли еще строчка в листе
            if (counter == 0) {
                iterator.next(); //берет строчку, удовлетворяющую условию
                iterator.remove();
                counter++;
            }
            break;
        }

        Collections.sort(arrayList); //сортирует (цифры, строчки в алфавитном порядке с учетом регистра и длины строчки)
        Collections.reverse(arrayList); //реверс листа (меняет элементы задом наперед)
        Collections.shuffle(arrayList); //рандомно перетасовывает элемента (можно для тестов задать сценарий, добавив new Random(цифра) в скобке после запятой)

    }
}
