package by.teachmeskills.classwork.lesson10;

import java.util.Arrays;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        String testString = "This is out big String";
        System.out.println(testString.charAt(0));
        char[] myChars = new char[3];
        testString.getChars(6, 9, myChars, 0);
        System.out.println(Arrays.toString(myChars));
        char needed = 'i';
        int count = 0;
        for (char element : testString.toCharArray()) {
            if (element == needed) {
                count++;
            }
        }
        System.out.println(count);

        //перевод числа в строчку
        String intToStr = String.valueOf(4);

        //если хотим найти индекс выражения в скобках в строке
        // выдает индекс начала искомого выражения. Если в рзультате -1, то индекса нет
        int index = testString.indexOf("is");
        System.out.println(index);
        int lastIndex = testString.lastIndexOf("is");
        System.out.println(lastIndex);

        // проверка, начинается ли строчка с выражения в скобках
        System.out.println(testString.startsWith("This"));

        //проверка, заканчивается ли строчка выражением в скобках
        System.out.println(testString.endsWith("This"));

        //если нужно заменить символы в строчке на другие
        testString = testString.replace('i', 'a');
        //можно менять два и более раз подряд
        testString = testString.replace('i', 'a').replace('a', 'u');
        System.out.println(testString);

        //метод trim() используется для убирания пробелов до текста от скобок
        System.out.println("    7777 777     ".trim());

        //стоб сделать все символы большими или маленькими
        System.out.println("GGGGgggKKKKKfdgdg".toLowerCase());
        System.out.println("GKGDDJHjjjshkjskjjjj".toUpperCase());

        //Разбитие строчки
        //в скобках что указаноб то считается разделителем элементов в массиве
        String messageString = " this is my house";
        String[] messageArray = messageString.split(" "); //
        System.out.println(Arrays.toString(messageArray));

        //проверка, пустой ли заданный элемент массива
        // isEmpty() - проверка заданного элемента массива на ноль
        // isBlank() - проверка состоит ли строчка из одних пробелов
        String isEmptyString = "n  u l  l";
        System.out.println(messageArray[0].isEmpty());
        System.out.println(isEmptyString.isBlank());
        //Чтоб проверить на null
        System.out.println(isEmptyString != null && isEmptyString.isEmpty());
        System.out.println(isEmptyString != null && isEmptyString.isBlank());

        //отрезать часть строчки и сделать ее отдельной строчкой
        index = messageString.indexOf("is");
        System.out.println(messageString.substring(index+2));

    }
}