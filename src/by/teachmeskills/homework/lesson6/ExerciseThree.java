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
        int removeTwenty = 0, removeTwentyTwo = 0, removeTwentyThree = 0; //число снимаемых купюр 20$
        int removeFifty = 0, removeFiftyTwo = 0;    //число снимаемых купюр 50$
        int removeOneHundred = 0;   //число снимаемых купюр 100$
        int ostatok = 0;    //переходящий остаток в методах выше 40$
        int limit = 0;  //для лимита 110 или 130
        if (removeSum % 10 != 0 || removeSum > sum) {
            do {
                System.out.print("This operation isn`t done!");
                return;
            } while (true);
        }
        if (removeSum < 40 && removeSum != 20) {
            do {
                System.out.print("This operation isn`t done!");
                return;
            } while (true);
        }
        if (removeSum == 20) {
            removeTwenty = 1;
            if (removeTwenty > twenty) {
                System.out.println("This operation isn`t done (don`t have 20$ cash)");
            } else removeTwenty = 1;
        }
        if (removeSum >= 40 & removeSum <= 100) {
            do {
                removeOneHundred = removeSum / 100;
                if (removeOneHundred > oneHundred) {
                    removeFifty = (removeSum / 100) * 2;
                    if (removeFifty > fifty) {
                        removeTwenty = (removeSum / 100) * 5;
                        if (removeTwenty > twenty) {
                            System.out.println("This operation isn`t done (don`t have 20$ cash)");
                        }
                    }
                }
                ostatok = removeSum % 100;
                if (ostatok < 100 && ostatok % 20 == 0 && removeSum != 100) {
                    removeTwentyTwo = ostatok / 20;
                    if ((removeTwentyTwo + removeTwenty) > twenty) {
                        System.out.println("This operation isn`t done (don`t have 20$ cash)");
                        break;
                    }
                } else {
                    removeFiftyTwo = ostatok / 50;
                    if ((removeFiftyTwo + removeFifty) > fifty) {
                        System.out.println("This operation isn`t done (don`t have 50$ cash)");
                        break;
                    }
                    ostatok = ostatok % 50;
                    removeTwentyThree = ostatok / 20;
                    removeTwenty = +removeTwentyTwo + removeTwentyThree;
                    if (removeTwenty > twenty) {
                        System.out.println("This operation isn`t done (don`t have 20$ cash)");
                        break;
                    }
                }
            } while (true);
        }
        if (removeSum > 100 && (removeSum % 100 == 10 || removeSum % 100 == 30)) {
            removeOneHundred = removeSum / 100;
            if (removeOneHundred > oneHundred) {
                removeFifty = (removeSum / 100) * 2;
                if (removeFifty > fifty) {
                    removeTwenty = (removeSum / 100) * 5;
                    if (removeTwenty > twenty) {
                        System.out.println("This operation isn`t done (don`t have 20$ cash)");
                    }
                }
            }
            ostatok = removeSum % 100;
            limit = removeSum - (removeOneHundred - 1) * 100;
            if (limit == 110) {
                removeOneHundred -= 1;
                removeFiftyTwo = 1;
                ostatok = 60;
            }
            removeTwentyTwo = ostatok / 20;
            if ((removeTwenty + removeTwentyTwo) > twenty) {
                System.out.println("This operation isn`t done (don`t have 20$ cash)");
            }
            if (limit == 130) {
                do {
                    removeFiftyTwo = ostatok / 50;
                    ostatok %= 50;
                } while (ostatok != 80);
                removeTwentyTwo = ostatok / 20;
            }
        }
        else if (removeSum > 100){

        }
        if ((removeOneHundred + (removeFifty + removeFiftyTwo) + (removeTwenty + removeTwentyTwo + removeTwentyThree)) > 0) {
            System.out.println("You took " + removeSum + "$: " + removeOneHundred +
                    " denomination banknots 100$, " + (removeFifty + removeFiftyTwo) +
                    " denomination banknots 50$, " + (removeTwenty + removeTwentyTwo + removeTwentyThree) +
                    " denomination banknots 20$");
        } else {
            System.out.println("You can`t withdraw money!");
        }
    }
}

