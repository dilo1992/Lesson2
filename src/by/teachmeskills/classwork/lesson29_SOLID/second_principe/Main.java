package by.teachmeskills.classwork.lesson29_SOLID.second_principe;

public class Main {
    public static void main(String[] args) {
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        perimeterCalculator.getPerimeter(new MyFigure());
        // можно различные фигуры, кот имплементят shape так считать периметр одним методом
    }
}
