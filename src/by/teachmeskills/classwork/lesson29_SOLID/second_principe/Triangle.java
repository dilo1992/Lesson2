package by.teachmeskills.classwork.lesson29_SOLID.second_principe;

//2 - имплементим интерфейс и переопределяем метод
public class Triangle implements Shape {
    int a, b, c;

    @Override
    public int getPerimeter() {
        return a + b + c;
    }
}
