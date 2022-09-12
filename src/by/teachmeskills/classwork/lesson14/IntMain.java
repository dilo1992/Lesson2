package by.teachmeskills.classwork.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class IntMain {
    public static void main(String[] args) {
//        printValues(str -> str.length() < 5);  //выведет только строчки с длиной меньше 5
//        System.out.println("-------------------------------------");
//        printValues(str -> str.length() > 6);  //выведет только строчки с длиной больше 6
//        System.out.println("-------------------------------------");
//        printValues(str -> str.startsWith("f"));  //выведет только строчки, начинающиеся в буквы f
//        System.out.println("-------------------------------------");
//

//        convertValues(str->str);
//        System.out.println("-------------------------------------");
//        convertValues(str->str+str);
//        System.out.println("-------------------------------------");
//        convertValues(str->str.substring(0,2));
//        System.out.println("-------------------------------------");
//

        // первое условие, по которому нужно решать менять нужно или нет, по второму - как менять, если нужно
        filerAndConvertValues(str->str.length()<5, str->str.substring(0,2));  //для всех строчек в которых длина меньше 5 сделаем подстрочки из первых двух символов
        System.out.println("-------------------------------------");
        filerAndConvertValues(str->str.startsWith("f"), str->str+str);  //для всех строчек, которые начинаются на f сделаем склейку двух строчек
        System.out.println("-------------------------------------");
    }

    //комментарии применительно первому случаю
    private static void printValues(Predicate<String> predicate) { //str -> str.length() < 5
        List<String> myElement = new ArrayList<>();
        myElement.addAll(Arrays.asList("first", "second", "third", "fourth", "fifth", "cucumber", "hj"));
        for (String current : myElement) {  //в методе мы используем current как str
            if (predicate.test(current)) {
                System.out.println(current);
            }
        }
    }

    private static void convertValues(Function<String, String> function) {
        List<String> myElement = new ArrayList<>();
        myElement.addAll(Arrays.asList("first", "second", "third", "fourth", "fifth", "cucumber", "hj"));
        for (String element : myElement) {
            System.out.println(function.apply(element));
        }
    }

    private static void filerAndConvertValues(Predicate<String> predicate, Function<String, String> function) {
        List<String> myElement = new ArrayList<>();
        myElement.addAll(Arrays.asList("first", "second", "third", "fourth", "fifth", "cucumber", "hj"));
        for (String current : myElement) {  //в методе мы используем current как str
            if (predicate.test(current)) {
                System.out.println(function.apply(current));
            }
        }

    }

}
