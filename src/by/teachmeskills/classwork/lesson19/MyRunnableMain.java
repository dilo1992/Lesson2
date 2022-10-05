package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.*;

public class MyRunnableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //�������� ������ � ������� ������ � ����������� Runnable
        MyRunnableClass myRunnableClass = new MyRunnableClass();
        Thread thread = new Thread(myRunnableClass);
        thread.start();

        //����� ������ ������������� ���������� CALLABLE
        Future<String> myFuture;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        myFuture = executorService.submit((Callable<String>) myRunnableClass);
        // ��� ��������, ��� ����� ������������� �����, ����������� ���� �����, ������ �������
        // (���������� � ������ myRunnableClass)
        // ����� �������� � ���������� ������� myFuture ��������� ���
        myFuture.get();

        //����� �� ��������� ����� �� ������ ���������� Runnable, � ����� ��� ������� � �������
        Thread thread1 = new Thread(() -> {
            System.out.println("egegei");
            System.out.println("egegei2");
        });
        //��� ��� (��� �� �� �����, ������ ���������)
        Runnable r = () -> System.out.println("egegei");
        Thread thread2 = new Thread(r);
        thread1.start();
        thread2.start();

    }
}
