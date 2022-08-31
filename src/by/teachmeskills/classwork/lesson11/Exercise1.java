package by.teachmeskills.classwork.lesson11;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "123a";
        int value = 0;
        try {
            value = getIntFromString(str);
            if (value > 1000) {
                throw new TooBigNumberException(value);
            }
        } catch (NumberNotFoundException e) {
            value++;
            e.printStackTrace();
        } catch (TooBigNumberException e) {
            value = 1000;
            System.out.println("oops, too big");
            e.printStackTrace();
        }
    }

    private static int getIntFromString(String string) throws NumberNotFoundException {
        if (string.isEmpty())
            throw new NumberNotFoundException(string); //если строчка пустая, то сразу бросать нашу ошибку
        try {
            return Integer.parseInt(string); //если в нашей строке нет цифр, то метод (parseInt)
            // выдает ошибку NumberFormatException априори в программе
        } catch (NumberFormatException e) {  //если эта ошибка появится и мы ее словим, то вместо нее мы хотим
            throw new NumberNotFoundException(string); //увидеть нашу ошибку NumberNotFoundException
        }
    }
}