package by.teachmeskills.classwork.lesson7;

public interface Flyable {
    //void fly(); - ������ � ������ ������ Java

    // � ����� ������ Java 8
    int myNumber = 0;

    default void fly() {
        System.out.println(getString() + "I can`t fly");
    }

    private String getString() {
        return "Ohh ";
    }
}
