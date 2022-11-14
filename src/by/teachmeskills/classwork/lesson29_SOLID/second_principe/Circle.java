package by.teachmeskills.classwork.lesson29_SOLID.second_principe;

////3 - имплементим интерфейс и переопределяем метод
public class Circle implements Shape {
    int radius;

    @Override
    public int getPerimeter() {
        return 6 * radius; //упрощенно взяли формулу такую
    }
}
