import java.util.Random;
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
        if (removeSum != 20 & removeSum < 40 & removeSum % 10 != 0 & removeSum > sum) {
            do {
                System.out.print("This operation isn`t done!");
                break;
            } while (true);
        } else {
            int removetwenty;
            int removefifty;
            int removeOneHundred;
            if (removeSum == 20) {
                removetwenty = removeSum / 20;
            } else if (removeSum >= 40) {
                int ostatok;
                do {
                    removeOneHundred = removeSum / 100;
                    ostatok = removeSum % 100;
                } while (ostatok > 110);
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
}
