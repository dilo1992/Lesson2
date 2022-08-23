package by.teachmeskills.homework.lesson6;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        System.out.print("Enter number of banknotes of the ATM (*20$):");
        Scanner scanner = new Scanner(System.in);
        int twenty = scanner.nextInt();
        System.out.print("Enter number of banknotes of the ATM (*50$):");
        int fifty = scanner.nextInt();
        System.out.print("Enter number of banknotes of the ATM (*100$):");
        int oneHundred = scanner.nextInt();
        int sum = twenty * 20 + fifty * 50 + oneHundred * 100;
        Bankomat bankomat = new Bankomat(twenty, fifty, oneHundred);
        System.out.print("Enter remove sum: ");
        int removeSum = scanner.nextInt();
        int removetwenty, removetwentytwo;  //число снимаемых купюр 20$
        int removefifty;    //число снимаемых купюр 50$
        int removeOneHundred;   //число снимаемых купюр 100$
        int ostatok;    //переходящий остаток в методах выше 40$
        if (removeSum % 10 != 0 & removeSum > sum) {
            do {
                System.out.print("This operation isn`t done!");
                return;
            } while (true);
        }
        if (removeSum < 40 || removeSum != 20) {
            do {
                System.out.print("This operation isn`t done!");
                return;
            } while (true);
        }
        if (removeSum == 20) {
            removetwenty = 1;
            if (removetwenty > twenty) {
                System.out.println("This operation isn`t done (don`t have 20$ cash)");
            }
        } else if (removeSum >= 40 && removeSum <= 100) {
            do {
                removeOneHundred = removeSum / 100;
                if (removeOneHundred > oneHundred) {
                    System.out.println("This operation isn`t done (don`t have 100$ cash)");
                }
                ostatok = removeSum % 100;
                if (ostatok < 100 & ostatok % 20 == 0) {
                    removetwenty = ostatok / 20;
                    if (removetwenty > twenty) {
                        System.out.println("This operation isn`t done (don`t have 20$ cash)");
                        break;
                    }
                } else {
                    removefifty = ostatok % 50;
                    if (removefifty > fifty) {
                        System.out.println("This operation isn`t done (don`t have 50$ cash)");
                        break;
                    }
                        ostatok = ostatok % 50;
                        removetwentytwo = ostatok / 20;
                        removetwenty = +removetwentytwo;
                        if (removetwenty > twenty) {
                            System.out.println("This operation isn`t done (don`t have 20$ cash)");
                            break;
                        }
                    }
                } while (true);



                    do {
                        removefifty = ostatok / 50;
                        ostatok %= 50;
                    } while (ostatok > 60);
                    removetwenty = ostatok / 20;
                    if (ostatok % 20 == 0) {
                        System.out.println("You took " + removeSum + "$: " + removeOneHundred +
                                " denomination banknots 100$, " + removefifty +
                                " denomination banknots 50$, " + removetwenty +
                                " denomination banknots 20$");
                    } else {
                        System.out.println("You can`t withdraw money!");
                    }
                }
            }
        }

