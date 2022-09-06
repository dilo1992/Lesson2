package by.teachmeskills.classwork.lesson12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectsExample {
    public static void main(String[] args) {
        //Person lastPerson = null; //если нужно потом использовать последний объект Person
        try (FileInputStream fis = new FileInputStream("objsample.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                //lastPerson = (Person) ois.readObject(); //- приравниваем lastPerson к последнему обработанному
                Person person = (Person) ois.readObject();
                //System.out.println(lastPerson); // печатаем
                System.out.println(person);
            }
        } catch (IOException e) {
            System.out.println("here");
        } catch (ClassNotFoundException e) {
            System.out.println("here 2");;
        }
        //lastPerson.setAge(40); //присваиваем возраст 40
        //System.out.println(lastPerson); //печатаем
    }
}
