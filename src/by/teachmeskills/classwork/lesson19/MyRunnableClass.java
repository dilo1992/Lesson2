package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.Callable;

public class MyRunnableClass implements Runnable, Callable<String> {
    //Можно создать от так работать с многопоточностью. Бывает ,что есть необходимость наследоваться от класса,
    // а в Java наследоваться от двух классов одновременно нельзя. ДЛя этого существует интерфейс Runnable


    @Override
    public void run() {
        System.out.println("this is our runnable");
    }

    @Override
    public String call() throws Exception {
        return "Hello world";
    }
}
