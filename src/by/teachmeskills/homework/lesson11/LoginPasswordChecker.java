package by.teachmeskills.homework.lesson11;


import java.sql.SQLOutput;

public class LoginPasswordChecker {
    public static boolean checkLogin(String login) throws WrongLoginException {
        if (login.length() >= 20) {
            System.out.println("Too many symbols in this login");
            throw new WrongLoginException(login);
        }
        if (login.isEmpty()) {
            System.out.println("Login can`t be is empty");
            throw new WrongLoginException(login);
        }
        if (login.contains(" ")) {
            System.out.println("Login can`t contain spaces");
            throw new WrongLoginException(login);
        }
        return true;
    }

    public static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException, NumberFormatException {
        if (!(password.equals(confirmPassword))) {
            System.out.println("Fields password and confirm password must be the same");
            throw new WrongPasswordException(password);
        }
        if (password.length() >= 20) {
            System.out.println("Too many symbols in this password");
            throw new WrongPasswordException(password);
        }
        if (password.isEmpty()) {
            System.out.println("Password can`t be is empty");
            throw new WrongPasswordException(password);
        }
        if (password.contains(" ")) {
            System.out.println("Password can`t contain spaces");
            throw new WrongPasswordException(password);
        }
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            try {
                if (Integer.parseInt(String.valueOf(password.charAt(i))) >= 0 && Integer.parseInt(String.valueOf(password.charAt(i))) <= 9) {
                    count++;
                }
            } catch (NumberFormatException e) {
                continue;
            }
            if (count == 0) {
                System.out.println("Password must contain at least one digit");
                throw new WrongPasswordException(password);
            } else {
                return true;
            }
        }
        return true;
    }
}




