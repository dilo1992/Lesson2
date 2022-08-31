package by.teachmeskills.classwork.lesson11;


import java.io.IOException;

// Делаем ошибки сами
public class Main2 {
    public static void main(String[] args) {
        //System.out.println(getDivision(2, 0));
        try {
            System.out.println(getDivision(2, 0));
        } catch (MySuperException | IOException e) {
            System.out.println("need to exit");
            e.printStackTrace(); //показывает место, в котором прозошла ошибка. Но программа работать дальше будет
            System.out.println(e.getMessage()); //печатает сообщение, которое задали в конструкторе, вместо всего большого текста ошибки
            throw new RuntimeException();
        } finally {                             //выполняется в любом случае
            System.out.println("We done it");
        }
        System.out.println("Hello World");
    }

    //throws - говорим о том, что наш метод может вернуть ошибку
//    private static int getDivision(int a, int b) throws ArithmeticException {
//        if (b==0) throw new ArithmeticException("this is illegal"); // если b=0, то метод выбросит новую арифметическую ошибку
    // в скобках можем написать, что будет выдаваться при ошибке

    //создаем со своей ошибкой
    private static int getDivision(int a, int b) throws MySuperException, IOException {
        if (b == 0) throw new MySuperException(a, b);
        if (b == 100) throw new MySuperException(a, b);
        return a / b;
    }
}
