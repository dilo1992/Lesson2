package by.teachmeskills.classwork.lesson29_SOLID.second_principe;

//2 - ����������� ��������� � �������������� �����
public class Triangle implements Shape {
    int a, b, c;

    @Override
    public int getPerimeter() {
        return a + b + c;
    }
}
