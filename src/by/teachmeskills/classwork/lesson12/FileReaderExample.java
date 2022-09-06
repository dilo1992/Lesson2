package by.teachmeskills.classwork.lesson12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("sample3.txt")) {
            Scanner scanner = new Scanner(fileReader); //вход на сканер осуществляется из файла (определено fileReader в скобках)
            while (scanner.hasNextLine()) { //пока в файле есть строчка, то читаем ее (.hasNextLine() - проверять есть ли строчка)
                //если нужно смотреть есть ли слово, то можно использовать .hasNext()
                System.out.println(scanner.nextLine()); //печатаем последовательно строчки, проверенные .hasNextLine
                // если печатаем слово, то .next()
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
