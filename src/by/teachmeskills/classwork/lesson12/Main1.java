package by.teachmeskills.classwork.lesson12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        File file = new File("D:\\TMS\\TeachMeSkills"); //если вводить с адресом размещения - то относительный путь к файлу
                                                    // в нашем случае абсолютный - как место берется адрес нашего проекта
        System.out.println(file.exists());  //проверяем, есть ли вообще такой файл
        System.out.println(file.isDirectory()); //проверяем, является ли наш файл - папкой
        System.out.println(file.isFile()); //проверяем, является ли наш файл - файлом
        System.out.println(file.isHidden()); //проверяем, является ли наш файл скрытым

        file.mkdir(); //создаем папку
        //file.createNewFile(); //создаем файл

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(file.getAbsolutePath()); //если хотим узнать полный адрес к нашему файлу
        System.out.println(file.getParent()); //проверяем, есть ли у папки родители

        //символы
        System.out.println("my string\t\n"); // \t - табуляция (вставляет Tab), \n - новая строчка

        System.out.println(Arrays.toString(file.list())); //выводит и указывает все файлы, которые находятся в папке
        for (File currentFile: file.listFiles()) {        //цикл выводит имена всех файлов, которые есть в нашей папке
            System.out.println(currentFile.getName());
        }
    }
}
