import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondArrayOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value elements of the array (6..10): ");
        int n = scanner.nextInt();
        do {
            if (n <= 5 || n > 10) {
                System.out.print("The entered number does not meet the conditions." +
                        "Enter a value elements of the array again (6..10): ");
                n = scanner.nextInt();
            } else break;
        } while (true);  //(n < 5 || n >= 10);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println("The array is " + Arrays.toString(arr));
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                j++;
            }
        }
        int[] arr2 = new int[j];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[k] = arr[i];
                k++;
            }
        }
        if (arr2.length == 0) {
            System.out.println("The even numbers are don`t have in the array arr.");
        } else {
            System.out.println("It is a new array with even numbers. " + Arrays.toString(arr2));
        }
    }
}
