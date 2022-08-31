package by.teachmeskills.classwork.lesson11;

// создаем класс с нашей собственной ошибкой
public class MySuperException extends Exception {
    public MySuperException(int a, int b){
        super("Attention! This is my exception. "+a+" cannot be devided by "+b);
    }
}
