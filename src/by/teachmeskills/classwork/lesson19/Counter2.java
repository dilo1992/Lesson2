package by.teachmeskills.classwork.lesson19;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {
    private AtomicInteger value = new AtomicInteger(0);  //���� ����� ��������� ���������� ��� ���������.
    // �� ������� ��� ����� ��������� ��������. ������ ��� ������ �� �����������, ��� synchronized

    public void increment() {
        value.getAndIncrement();  //���� ����� ����� �����, ������� � ��� ���� �������� (value), ����� ��������� ��������� (++)
        value.getAndDecrement();   //���� ����� ����� �����, ������� ��������, � ��������� ��������� (--)
        value.getAndSet(3);  //���� ����� ����� ����� � ������������� ��������

    }
}
