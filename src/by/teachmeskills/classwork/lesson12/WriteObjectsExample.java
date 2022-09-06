package by.teachmeskills.classwork.lesson12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectsExample {
    public static void main(String[] args) {
        Person firstPerson = new Person("first", 20);
        Person secondPerson = new Person("second", 30);

        try (FileOutputStream fos = new FileOutputStream("objsample.txt")) { //создаем исходящий поток, который будет записывать в файл
            ObjectOutputStream outputStream = new ObjectOutputStream(fos); //создаем поток, который будет передавать объект из предыдущего потока с файлами
            outputStream.writeObject(firstPerson); //записываем в файл
            outputStream.writeObject(secondPerson); //записываем в файл
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
