import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OddToZero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of a array: ");
        int arrsize= scanner.nextInt();
        int[] arr=new int[arrsize];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Random().nextInt(0,15);
        }
        System.out.println("The array is "+ Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            if (i%2!=0) {
                arr[i] = 0;
            }
        }
        System.out.println("The array without add numbers: "+Arrays.toString(arr));
        }
    }
