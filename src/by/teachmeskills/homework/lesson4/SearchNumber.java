import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number (0...10): ");
        int number = scanner.nextInt();
        if (number < 0 || number > 10) {
            System.out.println("Number does not match search parameters");
            return;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
            if (arr[i] == number) {
                j++;
            }
        }
        if (j > 0) {
            System.out.print("The entered number is present in the array " + j + " once.");
        } else {
            System.out.println("The entered number is not in the array");
        }
        System.out.println(Arrays.toString(arr));
    }
}