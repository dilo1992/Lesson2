package by.teachmeskills.classwork.lesson29_SOLID.second_principe;

import java.util.Random;

// 6 - создаем класс для того, чтоб понять что проще сделать
// интерфейс и от него имплементить методы чтоб не повторять по 100 раз
public class MyFigure implements Shape {
    @Override
    public int getPerimeter() {
        return new Random().nextInt();
    }
}
