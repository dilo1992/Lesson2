package by.teachmeskills.classwork.lesson29_SOLID.second_principe;

import java.util.Random;

// 6 - ������� ����� ��� ����, ���� ������ ��� ����� �������
// ��������� � �� ���� ������������ ������ ���� �� ��������� �� 100 ���
public class MyFigure implements Shape {
    @Override
    public int getPerimeter() {
        return new Random().nextInt();
    }
}
