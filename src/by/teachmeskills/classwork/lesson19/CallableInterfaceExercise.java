package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.Callable;

public class CallableInterfaceExercise implements Runnable, Callable<String> {
  //��������� Callable<> ����� �� Runnable, �� �� ���-�� ����������

    @Override
    public void run() {

    }

    @Override
    public String call() throws Exception {
        return "Hello world";
    }
}
