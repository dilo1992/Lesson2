//Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно». Можно использовать как Scanner, так и случайное число в диапазоне (-30; 30)
// (подумать как можно получить такой диапазон с помощью ограничений для nextInt)

import java.util.Scanner;

public class exercise_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter air temperature: ");
        int temp= scanner.nextInt();
        if(temp<=-20){
            System.out.println("This is cold");
        }
        else if (temp>-20 && temp<=-5) {
            System.out.println("This is normal");
        }
        else {
            System.out.println("This is warm");
        }
    }
}