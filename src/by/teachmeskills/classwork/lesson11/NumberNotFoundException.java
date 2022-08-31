package by.teachmeskills.classwork.lesson11;

public class NumberNotFoundException extends Exception {
    public NumberNotFoundException(String a) {
        super("This is mistake appears when numbers are don`t founded (maybe, "+a+" String?)");
    }

    //метод, который соединяет ошибки до и после
    public NumberNotFoundException(String a, Throwable exception) {
        super("This is mistake appears when numbers are don`t founded (maybe, "+a+" String?)", exception);
    }
}
