import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number (0...10): ");
        int number = scanner.nextInt();
        if (number<0 || number>10){
            System.out.println("Number does not match search parameters"); return;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(0, 10);
            System.out.println(arr[i]);
        }
        if (Arrays.binarySearch(arr, number)>0) {
            System.out.println("The entered number is present in the array under " + Arrays.binarySearch(arr, number) + " index");
        } else {
            System.out.println("The entered number is not in the array");
            }
        }
    }