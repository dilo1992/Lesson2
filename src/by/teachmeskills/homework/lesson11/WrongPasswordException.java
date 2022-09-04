package by.teachmeskills.homework.lesson11;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String password) {
        super("Entered password doesn`t satisfy the conditions");
    }
}
