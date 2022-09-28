package by.teachmeskills.classwork.lesson17;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMain {
    public static void main(String[] args) {
        String testString = "678910.this is, my te_st string   12345";
        Pattern pattern = Pattern.compile("\\d+");  //проверяем, чтоб цифры встречались сколько угодно раз
        Matcher matcher = pattern.matcher(testString);
        System.out.println(matcher.matches());  //метод matches проверяет, соответствует ли полностью наша строчка паттерну.
        // Выдаст false потому, что у нас в строке не одни цифры, а есть и буквы.
        // Если бы были одни цифры, то было бы true

        if (matcher.find()) {                        //ищем совпадения по нашему шаблону
            System.out.println(matcher.start() + " " + matcher.end());  //start() и end() выводит индекс символа начала совпадения и окончания совпадения в строчке
            System.out.println(matcher.group());    //Распечатает первое совпадение с шаблоном (набор цифр). group() сгруппирует найденное совпадение в строчку
        }

        System.out.println("---------------------------------------------");
        // если мы хотим найти все совпадения в строке, а не первое, то вместо if используем while
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
            System.out.println(matcher.group());
        }

        System.out.println("---------------------------------------------");
        //Замена искомых совпадений на звездочки. Данная команда не заменяет данные в исходной строчке, а создает новую строчку и там меняет.
        // Исходная строчка осталась неизменной
        System.out.println(matcher.replaceAll("***"));

        System.out.println("---------------------------------------------");
        System.out.println(Arrays.asList(testString.split("\\W+")));  //делим строчку по элементам в массив, согласно паттерну, который в скобках
        // (\\W+ означает, что разделителем служат все элементы кроме букв, цифр и подчеркиваний, смотрим в таблице или ищем в интернете)

        System.out.println("---------------------------------------------");
        //можно методы с find() использовать с лямбдой
        matcher.reset();  // Команда reset() сбрасывает встроенный счетчик matcher к нулю. Он после отработки операций запоминает в какой позиции в строчке она находится
        matcher.results().forEach(matchResult -> System.out.println(matchResult.group()));

        System.out.println("NEXT IN THE RegexMainTwo CLASS");
    }
}
