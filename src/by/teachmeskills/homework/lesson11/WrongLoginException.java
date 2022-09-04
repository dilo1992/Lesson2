package by.teachmeskills.homework.lesson11;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String login) {
        super("Entered login doesn`t satisfy the conditions");
    }
}
