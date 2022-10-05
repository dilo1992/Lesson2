package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {
    private AtomicInteger value = new AtomicInteger(0);  //этот класс придумали специально для счетчиков.
    // Он говорит кто будет выполнять операцию. Методы все такого же функционала, как synchronized

    public void increment() {
        value.getAndIncrement();  //этот метод берет число, которое у нас было записано (value), потом выполняет инкремент (++)
        value.getAndDecrement();   //этот метод берет число, которое записано, и выполняет декремент (--)
        value.getAndSet(3);  //этот метод берет число и устанавливает значение

    }
}
