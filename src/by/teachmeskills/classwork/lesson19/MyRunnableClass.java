package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.Callable;

public class MyRunnableClass implements Runnable, Callable<String> {
    //����� ������� �� ��� �������� � ����������������. ������ ,��� ���� ������������� ������������� �� ������,
    // � � Java ������������� �� ���� ������� ������������ ������. ��� ����� ���������� ��������� Runnable


    @Override
    public void run() {
        System.out.println("this is our runnable");
    }

    @Override
    public String call() throws Exception {
        return "Hello world";
    }
}
