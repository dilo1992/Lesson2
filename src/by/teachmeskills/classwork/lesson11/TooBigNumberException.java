package by.teachmeskills.classwork.lesson11;

public class TooBigNumberException extends Exception {
    public TooBigNumberException(int b) {
        super("This is mistake appears when our number "+b+" is too big (>1000)");
    }
}
