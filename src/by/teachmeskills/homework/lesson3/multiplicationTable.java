package by.teachmeskills.homework.lesson3;//Напишите программу, которая выводит на консоль таблицу умножения.

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=1;i<=10;i++){
            for (j=1;j<=10;j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
