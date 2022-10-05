package by.teachmeskills.classwork.lesson19;

public class Counter {

    private Object lock = new Object();  //������� ������, ������� �������� ��� �������
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() { //���� ������� ���������� ��������, ������� ��� �����, � ��������� synchronized
        synchronized (lock) {
            setCount(getCount() + 1);
        }
        System.out.println("From there");
        System.out.println("and there");
    }

//    public synchronized int getCount() {  //synchronized ������� � ���, ��� � ���� ����� ����� ����� ������ ���� �����,
//        // � ������ ����� ����� ���� ������ ������ �� ������
//        return count;
//    }
//
//    public synchronized void setCount(int count) {
//        this.count = count;
//    }
    //���� ������������, ��������, synchronized � ���� ������� (������ � ������),
    // �� ������ ����� �������� ������ ���� � ������ ������ � �������, �� ������ ������ ��������

}
