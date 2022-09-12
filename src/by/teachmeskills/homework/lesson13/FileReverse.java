package by.teachmeskills.homework.lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileReverse {
    public static void main(String[] args) {
        List<String> textAtString = new ArrayList<>();
        try (FileReader fileReader = new FileReader("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\" +
                "Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson13\\String in list.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                textAtString.add(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new FileWriter("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\" +
                "Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson13\\String in list_Reverse.txt")) {
            Collections.reverse(textAtString);
            for (String s : textAtString) {
                fileWriter.write(s + "\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done!");
    }
}
