package by.teachmeskills.classwork.lesson12;

import java.io.FileWriter;
import java.io.IOException;

    public class FileWriterExample {
        public static void main(String[] args) {
            //чтоб не использовать .close() для закрытия можно использовать try with resources
            // try(FileWriter fileWriter = new FileWriter("sample3.txt") {   вот так
            try(FileWriter fileWriter = new FileWriter("sample3.txt", true)) { //флаг append: true говорит о том, что нужно дозаписать (если уже есть строки, которые мы создавали раньше), а не заменять
                //FileWriter fileWriter = new FileWriter("D:\\TMS\\TeachMeSkills\\sample3.txt");
                //FileWriter fileWriter = new FileWriter("sample3.txt"); //добавляем файл в папку с нашим проектом
                fileWriter.write("This is first line\n"); //добавляем строчку с текстом в скобках в строчку созданного файла
                fileWriter.write("This is second line\n"); //добавляем строчку с текстом в скобках в строчку созданного файла
                fileWriter.flush();  //записать все, что должен был выполнить до данной строки
                //fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
