public interface Flyable {
    //void fly(); - только в старой версии Java

    // в новой версии Java 8
    int myNumber = 0;

    default void fly() {
        System.out.println(getString() + "I can`t fly");
    }

    private String getString() {
        return "Ohh ";
    }
}
