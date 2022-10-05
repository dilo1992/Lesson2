package by.teachmeskills.classwork.lesson19;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        //����� ����������� ������� � ���������� � 5 ������
        System.out.println("first string");

        //Thread.currentThread().setName("First thread"); //������ ��� ��� �������� ������. �� ��������� ��� ������ � ������ main - main

        Thread.sleep(500); //����� � ������������� (5000 �� = 5 ������)
        System.out.println("second string");

        //��� �������� ������� �����
        System.out.println(Thread.currentThread().getName()); //currentThread() - ������� ��� �������� ������ (��� ��� ������� �����)

        //������� ���������� ������ MyTestThread (������ ����������) � ��������� �� ������� start() (������� ����� � ��������� ����� run)
        MyTestThread testThread = new MyTestThread();
        MyTestThread testThread2 = new MyTestThread();
        MyTestThread testThread3 = new MyTestThread();

        //������-������. ��� ��������� ������ ����������, ��� �������� ������������ �������
        testThread.setDaemon(true);
        testThread2.setDaemon(true);
        testThread3.setDaemon(true);

        //����� ���������� ��������� ������� �������. �� ��� �� �������(������ ��� ������ �� ������ �����������)
        testThread.setPriority(Thread.MAX_PRIORITY);
        testThread.start();

        //testThread.interrupt(); //���������� ������. ����� ���������� ������, ���� ����� ������ ����� ������ sleep,
        // � �� ��� � ��� ����� ��������, � �� ��������� � �� ����� ������, ��� ����������

        testThread2.setPriority(Thread.MIN_PRIORITY);
        testThread2.start();
        //testThread2.join();  //���� �������� �� ����������, ��� ���� �� ���������� ������ �����, ������ �� ��������. " �������� ��������� ������� ������"
        //testThread2.join(1);  //����������� �������, ������� �� ����������� ����� ����� ��������� ������. ���� �� �� ������ �����������, �� ���� ������

        testThread3.setPriority(Thread.NORM_PRIORITY);
        testThread3.start();






    }
}
