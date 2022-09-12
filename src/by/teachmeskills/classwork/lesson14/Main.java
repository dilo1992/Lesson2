package by.teachmeskills.classwork.lesson14;

public class Main {
    public static void main(String[] args) {
        System.out.println(Month.JANUARY);

        //таким циклом можно вывести все значения списка enum
        for(Month month:Month.values()) {
            System.out.println(month);
        }

        Month month = Month.JANUARY;
        System.out.println(Month.JANUARY.ordinal()); //ordinal() выводит номер позиции в списке enam
        printMonth(month);
        printMonth(Month.FEBRUARY);

    }

    private static void printMonth(Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("It`s "+Month.JANUARY.getNumber()+" month"); break; //getNumber() может выводить числа number, которые в скобках конструктора
            case FEBRUARY:
                System.out.println("It`s "+Month.FEBRUARY.getNumber()+" month"); break;
        }
    }
}
