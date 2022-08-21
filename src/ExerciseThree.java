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
        int removesum= scanner.nextInt();
        if (sum>=removesum){
            int j=0;
            do {
                int i=removesum-100;
                j++;
            } while(removesum>=100 && j<oneHundred);

            }
        }




    }
