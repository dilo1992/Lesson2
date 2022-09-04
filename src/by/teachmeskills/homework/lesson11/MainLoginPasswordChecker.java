package by.teachmeskills.homework.lesson11;

import java.util.Scanner;

public class MainLoginPasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login: ");
        String login = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        System.out.println(Integer.parseInt(password));


    }
}
