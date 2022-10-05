package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.*;

public class MyRunnableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //создание потока с помощью метода с интерфейсом Runnable
        MyRunnableClass myRunnableClass = new MyRunnableClass();
        Thread thread = new Thread(myRunnableClass);
        thread.start();

        //ѕќ—Ћ≈ Ќј„јЋј »—ѕќЋ№«ќ¬јЌ»я »Ќ“≈–‘≈…—ј CALLABLE
        Future<String> myFuture;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        myFuture = executorService.submit((Callable<String>) myRunnableClass);
        // это означает, что когда заканчиваетс€ поток, запускаетс€ этот метод, вывод€ строчку
        // (определена в классе myRunnableClass)
        // после создани€ и объ€влени€ объекта myFuture запускаем его
        myFuture.get();

        //можно не создавать метод на основе интерфейса Runnable, а сразу так сделать с л€мбдой
        Thread thread1 = new Thread(() -> {
            System.out.println("egegei");
            System.out.println("egegei2");
        });
        //или так (это то же самое, только подробнее)
        Runnable r = () -> System.out.println("egegei");
        Thread thread2 = new Thread(r);
        thread1.start();
        thread2.start();

    }
}
