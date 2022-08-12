import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayWithoutOurNumber {
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
        arr[0] = new Random().nextInt(0, 10);
        arr[1] = new Random().nextInt(0, 10);
        arr[2] = new Random().nextInt(0, 10);
        arr[3] = new Random().nextInt(0, 10);
        arr[4] = new Random().nextInt(0, 10);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[j];
        int k = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != number) {
                arr2[k] = arr[x];
                k++;
            }
        }
        if (arr.length == arr2.length) {
            System.out.println("The entered number is not in the array");
        } else {
            System.out.println("The entered number is ruled out. This is a new array. " + Arrays.toString(arr2));
        }
    }
}