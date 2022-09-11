package by.teachmeskills.homework.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMaxAverageNumber {
    public static void main(String[] args) {
        System.out.print("Enter an array size: ");
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(15);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The max number in an array is " + max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The min number in an array is " + min);
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        float average = (float) summ / arrSize;
        System.out.println("The average number in an array is " + average);
    }
}