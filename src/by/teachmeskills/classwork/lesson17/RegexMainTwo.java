package by.teachmeskills.classwork.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMainTwo {
    public static void main(String[] args) {
        List<String> testList = Arrays.asList("123455", "1bb1a1", "11a 1", "8", "325", "3244", "42,55");

        System.out.println("--------------------EXERCISE 1-------------------------");
        // ^a -начинается с а (ловит только а)
        Pattern pattern = Pattern.compile("^\\d+$"); //паттерн означает, что с самого начала (^ (без скобок))
        // будут идти цифры (\\d) от одного до бесконечности (+) до самого конца ($)
        //Если бы использовать вместо плюса "+" звездочку "*", то в условии было бы не от 1 до бесконечности, а от нуля,
        // пустоты до бесконечности.
        // Если написать так "\\d&$" - то выведет только последние символы
        for (String current : testList) {
            Matcher matcher = pattern.matcher(current);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        System.out.println("--------------------EXERCISE 2-------------------------");
        Pattern pattern2 = Pattern.compile("[25]$"); //паттерн означает, что в конце должны быть идти цифры 2 или 5
        // в конце 25 - "25+$"
        //не 2 и не 5 в конце - [^25]+$ - если домик в квадратных скобках - то смысл его НЕТ
        for (String current : testList) {
            Matcher matcher2 = pattern2.matcher(current);
            if (matcher2.find()) {
                System.out.println(matcher2.group());
            }
        }

        System.out.println("--------------------EXERCISE 3-------------------------");
        Pattern pattern3 = Pattern.compile("^[a-zA-Z0-9]+$"); //паттерн означает, что от начала до конца могут быть все буквы
        // в нижнем регистре, все буквы в верхнем регистре, и все цифры. Остальные символы: запятые, двоеточия и так далее - нет
        for (String current : testList) {
            Matcher matcher3 = pattern3.matcher(current);
            if (matcher3.find()) {
                System.out.println(matcher3.group());
            }
        }

        System.out.println("---Pattern.CASE_INSENSITIVE-----");

        // сли так Pattern.compile("^[A-Z0-9]+$", Pattern.CASE_INSENSITIVE) - то регистр не учитывается
        Pattern patternWithOutCase = Pattern.compile("^[A-Z0-9]+$", Pattern.CASE_INSENSITIVE);
        for (String current : testList) {
            Matcher matcherWitoutCase = patternWithOutCase.matcher(current);
            if (matcherWitoutCase.find()) {
                System.out.println(matcherWitoutCase.group());

            }
        }


        System.out.println("--------------------EXERCISE 4-------------------------");
        //Если есть два паттерна, и мы хотим отобрать ИЛИ один, ИЛИ другой, то так
        //Pattern pattern4 = Pattern.compile("([A-Z] | [3-5])$", Pattern.CASE_INSENSITIVE);  //чтоб в конце ($) стояло ИЛИ A-Z (без учета регистра),
        // ИЛИ от 3 до 5
        Pattern pattern4 = Pattern.compile(".*[3-5]$", Pattern.CASE_INSENSITIVE);
        for (String current : testList) {
            Matcher matcher4 = pattern4.matcher(current);
            if (matcher4.find()) {
                System.out.println(matcher4.group());
            }
        }

        System.out.println("--------------------EXERCISE 5-------------------------");
        //Pattern pattern5 = Pattern.compile("\\D+$", Pattern.CASE_INSENSITIVE); //\\D - не числа
        //Pattern pattern5 = Pattern.compile("\\D\\s+$", Pattern.CASE_INSENSITIVE); //\\D - не числа после чего пробел (\\s)
        Pattern pattern5 = Pattern.compile("\\D\\S+$", Pattern.CASE_INSENSITIVE); //\\D - не числа после чего не пробел (\\S)
        // Если нет знака начала (^), а только конца($), то оно смотрит с конца
        for (String current : testList) {
            Matcher matcher5 = pattern5.matcher(current);
            if (matcher5.find()) {
                System.out.println(matcher5.group());
            }
        }

        System.out.println("--------------------EXERCISE 6-------------------------");
        //Pattern pattern6 = Pattern.compile("\\w+$", Pattern.CASE_INSENSITIVE); // \\w - сокращенный аналог набора для слова [a-zA-Z_0-9]
        Pattern pattern6 = Pattern.compile("\\W+$", Pattern.CASE_INSENSITIVE); // \\W - не \\w (в нашем случае пробел)
        for (String current : testList) {
            Matcher matcher6 = pattern6.matcher(current);
            if (matcher6.find()) {
                System.out.println(matcher6.group());
            }
        }

        System.out.println("--------------------EXERCISE 7-------------------------");
        Pattern pattern7 = Pattern.compile("\\b+$", Pattern.CASE_INSENSITIVE); // \\b - граница слова
        for (String current : testList) {
            Matcher matcher7 = pattern7.matcher(current);
            if (matcher7.find()) {
                System.out.println(matcher7.start() + " " + matcher7.end());
                System.out.println(matcher7.group());
            }
        }
    }
}
