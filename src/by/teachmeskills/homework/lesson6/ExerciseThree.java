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
        int ostatok;    //переходящий остаток в методах выше 40$
        int limit;  //для лимита 110 или 130
        if (removeSum % 10 != 0 || removeSum > sum) {
            System.out.print("This operation isn`t done!");
            return;
        }
        if (removeSum < 40 && removeSum != 20) {
            System.out.print("This operation isn`t done!");
            return;
        }
        if (removeSum == 20) {
            removeTwenty = 1;
            if (removeTwenty > twenty) {
                removeTwenty = 0;
                System.out.println("This operation isn`t done (don`t have 20$ cash)");
                return;
            }
        }
        if (removeSum >= 40 & removeSum <= 100) {
            removeOneHundred = removeSum / 100;
            if (removeOneHundred > oneHundred) {
                removeOneHundred = oneHundred;
                removeFifty = ((removeSum - removeOneHundred * 100) / 100) * 2;
                if (removeFifty > fifty) {
                    removeFifty = fifty;
                    removeTwenty = ((removeSum - removeOneHundred - removeFifty) / 100) * 5;
                    if (removeTwenty > twenty) {
                        System.out.println("This operation isn`t done (don`t have 20$ cash)");
                        return;
                    }
                }
            }
            ostatok = removeSum % 100;
            if (ostatok % 20 == 0 && removeSum != 100) {
                removeTwentyTwo = ostatok / 20;
                if ((removeTwentyTwo + removeTwenty) > twenty) {
                    removeTwentyTwo = 0;
                    System.out.println("This operation isn`t done (don`t have 20$ cash)");
                    return;
                }
            } else {
                removeFiftyTwo = ostatok / 50;
                if ((removeFiftyTwo + removeFifty) > fifty) {
                    removeFiftyTwo = 0;
                    System.out.println("This operation isn`t done (don`t have 50$ cash)");
                    return;
                }
                ostatok = ostatok % 50;
                removeTwentyThree = ostatok / 20;
                if ((removeTwenty + removeTwentyTwo + removeTwentyThree) > twenty) {
                    removeTwentyThree = 0;
                    System.out.println("This operation isn`t done (don`t have 20$ cash)");
                    return;
                }
            }
        }
        if (removeSum > 100 && (removeSum % 100 == 10 || removeSum % 100 == 30)) {
            removeOneHundred = removeSum / 100;
            if (removeOneHundred > oneHundred) {
                removeFifty = (removeSum / 100) * 2;
                if (removeFifty > fifty) {
                    removeTwenty = (removeSum / 100) * 5;
                    if (removeTwenty > twenty) {
                        System.out.println("This operation isn`t done (don`t have 20$ cash)");
                        return;
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
                removeFiftyTwo = 0;
                removeTwentyTwo = 0;
                System.out.println("This operation isn`t done (don`t have 20$ cash)");
                return;
            }
            if (limit == 130) {
                removeOneHundred -= 1;
                removeFiftyTwo = 1;
                ostatok = 80;
            }
            removeTwentyTwo = ostatok / 20;
            if ((removeTwenty + removeTwentyTwo) > twenty) {
                removeFiftyTwo = 0;
                removeTwentyTwo = 0;
                System.out.println("This operation isn`t done (don`t have 20$ cash)");
                return;
            }

        } else if (removeSum > 100 && (removeSum % 100 != 10 || removeSum % 100 != 30)) {
            removeOneHundred = removeSum / 100;
            if (removeOneHundred > oneHundred) {
                removeOneHundred = oneHundred;
                removeFifty = ((removeSum - removeOneHundred * 100) / 100) * 2;
                if (removeFifty > fifty) {
                    removeFifty = fifty;
                    removeTwenty = ((removeSum - removeOneHundred - removeFifty) / 100) * 5;
                    if (removeTwenty > twenty) {
                        System.out.println("This operation isn`t done (don`t have 20$ cash)");
                        return;
                    }
                }
            }
            ostatok = removeSum % 100;
            if (ostatok % 20 == 0) {
                removeTwentyTwo = ostatok / 20;
                if ((removeTwentyTwo + removeTwenty) > twenty) {
                    removeTwentyTwo = 0;
                    System.out.println("This operation isn`t done (don`t have 20$ cash)");
                    return;
                }
            } else {
                removeFiftyTwo = ostatok / 50;
                if ((removeFiftyTwo + removeFifty) > fifty) {
                    removeFiftyTwo = 0;
                    System.out.println("This operation isn`t done (don`t have 50$ cash)");
                    return;
                }
                ostatok = ostatok % 50;
                removeTwentyThree = ostatok / 20;
                if ((removeTwenty + removeTwentyTwo + removeTwentyThree) > twenty) {
                    removeTwentyThree = 0;
                    System.out.println("This operation isn`t done (don`t have 20$ cash)");
                    return;
                }
            }
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

