package by.teachmeskills.classwork.lesson19;

import java.util.Arrays;
import java.util.List;

public class CountMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000); //для того, чтоб дать потокам выполнить операции
        System.out.println(counter.getCount());

        // !!!ПОЧИТАТЬ ПРО СИМОФОР!!!, CYCLING BARRIER


        //ПРИМЕР, КАК ИСПОЛЬЗОВАТЬ МНОГОПОТОЧКУ. При использовании parallelStream() программа сама определит,
        // сколько потоков создавать и как распределить выполнение программы между ними
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = values.parallelStream()
                .mapToInt(value->value)
                .max()
                .getAsInt();
    }
}
