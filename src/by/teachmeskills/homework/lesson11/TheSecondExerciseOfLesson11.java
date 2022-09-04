package by.teachmeskills.homework.lesson11;


public class TheSecondExerciseOfLesson11 {
    public static boolean checkLogin(String login) throws WrongLoginException {
        if (login.length() >= 20) {
            System.out.println("Too many symbols in this login");
            throw new WrongLoginException(login);
        } else if (login.isEmpty()) {
            System.out.println("Login can`t be is empty");
            throw new WrongLoginException(login);
        } else if (login.contains(" ")) {
            System.out.println("Login can`t contain spaces");
            throw new WrongLoginException(login);
        }
        return true;
    }

    public static int checkPassword(String password) throws WrongPasswordException, NumberFormatException {
        if (password.length() >= 20) {
            System.out.println("Too many symbols in this password");
            throw new WrongPasswordException(password);
        } else if (password.isEmpty()) {
            System.out.println("Password can`t be is empty");
            throw new WrongPasswordException(password);
        } else if (password.contains(" ")) {
            System.out.println("Password can`t contain spaces");
            throw new WrongPasswordException(password);
        }
        try {
            return Integer.parseInt(password); //если в нашей строке нет цифр, то метод (parseInt)
            // выдает ошибку NumberFormatException априори в программе
        } catch (NumberFormatException e) {  //если эта ошибка появится и мы ее словим, то вместо нее мы хотим
            throw new WrongPasswordException(password); //увидеть нашу ошибку NumberNotFoundException
        }
    }
}

