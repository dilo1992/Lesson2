package by.teachmeskills.homework.lesson17;

import java.io.File;
import java.util.Scanner;

public class DocumentsMain {
    public static void main(String[] args) {
        String pathOfOlder;
        System.out.println("Enter document folder name: ");
        Scanner scanner = new Scanner(System.in);
        String pathOfFolder = scanner.nextLine();
        File file = new File(pathOfFolder);
        System.out.println(file.isDirectory());
        String[] arrOfFiles = file.list();
        String docNumberCheckerPattern = "^(\\d{4}-)|([a-zA-Z]{3}-)|(\\d{4}-)|([a-zA-Z]{3}-)|(\\d[a-zA-Z]\\\\d[a-zA-Z])$";
        String emailCheckerPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        String phoneNumberCheckerPattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";



    }
}
