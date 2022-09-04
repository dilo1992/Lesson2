package by.teachmeskills.homework.lesson10;

import java.util.Scanner;
import static by.teachmeskills.homework.lesson10.MinQuantitySymbols.*;

public class MainMinQuantitySymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phrase: ");
        String str = scanner.nextLine();
        printMinSymbols(str);
    }
}
