package by.teachmeskills.classwork.lesson29_SOLID.second_principe;

public class PerimeterCalculator {

    //5 - ������� ������ ����
//    public int getPerimeter(Circle circle) {
//        return 0;
//    }
//
//    public int getPerimeter(Triangle triangle) {
//        return 0;
//    }

    // 4 - ������� ���� �����
    public int getPerimeter(Shape shape) {
        return shape.getPerimeter();
    }
}
