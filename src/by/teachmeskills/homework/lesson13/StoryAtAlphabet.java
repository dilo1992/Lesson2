package by.teachmeskills.homework.lesson13;

import java.io.*;
import java.util.*;

public class StoryAtAlphabet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\" +
                "Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson13\\Story.txt")) {
            Scanner scanner = new Scanner(fileReader);

            //цикл для добавления слов в list в нижнем регистре (чтоб избежать при сортировке занятия первых индексов букв в верхнем регистре)
            while (scanner.hasNext()) {
                String word =scanner.next();
                word = checkerDotAndComma(word);
                list.add(word.toLowerCase());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(list);
        System.out.println(list);
    }

    //метод для удаления точек и запятых, которые попадаются при взятии слова операцией .next()
    private static String checkerDotAndComma(String word) {
        if (word.contains(".")) {
            int dot = word.indexOf(".");
            StringBuilder sb = new StringBuilder(word);
            word = String.valueOf(sb.deleteCharAt(dot));
        } else if (word.contains(",")) {
            int comma = word.indexOf(",");
            StringBuilder sb = new StringBuilder(word);
            word =String.valueOf(sb.deleteCharAt(comma));
        }
        return word;
    }
}
