package by.teachmeskills.homework.lesson3;//За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//Напишите программу, в которую пользователь вводит сумму вклада и
//количество месяцев. А банк вычисляет конечную сумму вклада с учетом
//начисления процентов за каждый месяц.
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть
//сумма вклада будет представлять тип float.


import java.util.Scanner;

public class percentOfBank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a summ: ");
        float summ=scanner.nextFloat();
        System.out.print("Enter a term in months: ");
        int term=scanner.nextInt();
        int i; //счетчик по месяцам
        float summ_final=summ; //конечая сумма (изначально приравнена стартовой)
        for (i=1;i<=term;i++){
            summ_final=(float) (summ_final+summ_final*0.07);
            if (i==term){
                System.out.println("The total amount was "+summ_final);
                break;
            }
        }
    }
}
