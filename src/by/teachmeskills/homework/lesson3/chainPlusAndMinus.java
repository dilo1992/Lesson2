package by.teachmeskills.homework.lesson3;//Вывести 10 первых чисел последовательности 0, -5, 10,-15..
// (смотрите, знак меняется)

public class chainPlusAndMinus {
    public static void main(String[] args) {
        int i = 0; //счетчик чисел (до 10)
        int j = 5; //шаг ряда
        int k = 1; //множитель
        int number = 0; //начальное число
        for (; i <= 9; i++) { //i>=9 потому, что изначальный 0 считается за первое число
            System.out.print(number + " ");
            number = k * (k*(-1)*number + j);
            k = k * (-1);
        }
    }
}