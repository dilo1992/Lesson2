package by.teachmeskills.homework.lesson3;//Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа (не больше 100).
//Для ввода числа воспользуйтесь классом Scanner. Если число не попадает
// в указанный интервал (меньше или больше) — ничего не считайте,
// а просто напишите что человек не прав)

import java.util.Scanner;

public class numericalProgression {
    public static void main(String[] args) {
        System.out.print ("Enter a number (max <=100) for progression: ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if (number>100) {
            System.out.println("The entered number don`t match the task");
        }
        int i=0; // сумма чисел последовательных чисел j
        int j=0; // число, последовательно идущее до number
        for(;j<=number+1;i+=j,j++){
            System.out.println(i);
        }
    }
}
