package by.teachmeskills.homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class SumAllElementsOfArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int sum=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                arr[i][j]=new Random().nextInt(0,10);
                sum+=arr[i][j];
            }
        }
        System.out.print("The summ of all elements of the array "+ Arrays.deepToString(arr)+" is "+sum);
    }
}
