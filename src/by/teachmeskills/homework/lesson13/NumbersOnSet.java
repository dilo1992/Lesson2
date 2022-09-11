package by.teachmeskills.homework.lesson13;

import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NumbersOnSet {
    public static void main(String[] args) throws IllegalArgumentException, IOException {
        try (FileWriter fileWriter = new FileWriter("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\" +
                "Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson13\\Numbers.txt")) {

            //цикл для создания 30 рандомных цифр и записи их в файл
            for (int i = 0; i <= 30; i++) {
                try {
                    fileWriter.write(new Random().nextInt(20) + "\n");
                } catch (IOException | IllegalArgumentException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        Set<Integer> number = new HashSet<>();
        try (FileReader fileReader = new FileReader("D:\\Учеба\\Программирование\\Java\\TeachMeSkills\\" +
                "Lesson2_final\\src\\by\\teachmeskills\\homework\\lesson13\\Numbers.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextInt()) {
                number.add(scanner.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(number);
    }
}

