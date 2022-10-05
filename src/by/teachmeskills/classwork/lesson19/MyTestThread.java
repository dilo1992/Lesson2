package by.teachmeskills.classwork.lesson19;

public class MyTestThread extends Thread {
    //��� ������ � ������ ��������������� ���������� ������������� �� ������ Thread
    //������ � ����� ������ ������ ����������� ����������� � ������ run()
    //����������� ���������� ������� �������� ���������� ���������� ������� (����) CPU +1


    //��� ��������� ����� ����������������� ������ ���������� ��� ��, ��� � �����������,
    //������-������ �� ���� override methods
    @Override
    public void run() {
        //super.run(); //��� ��� ������� ��������� ���������� ������ run(), ������������ ���������� Java

        //������ ��� ��� ������ ������
        //this.setName("My super thread");

        System.out.println("Our thread started: " + this.getName());  //this.getName() - ��� ����� ����� ������

        //���������� ����� ��� ���������� ������
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.println("Our thread finished: " + this.getName());
    }


}
