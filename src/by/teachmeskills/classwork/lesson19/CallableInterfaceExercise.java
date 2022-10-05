package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.Callable;

public class CallableInterfaceExercise implements Runnable, Callable<String> {
  //интерфейс Callable<> похож на Runnable, но он что-то возвращает

    @Override
    public void run() {

    }

    @Override
    public String call() throws Exception {
        return "Hello world";
    }
}
