import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMaxAverageNumber {
    public static void main(String[] args) {
        System.out.print("Enter an array size: ");
        Scanner scanner=new Scanner(System.in);
        int arrsize=scanner.nextInt();
        int[] arr=new int[arrsize];
        for(int j=0;j<arr.length;j++){
            arr[j]=new Random().nextInt(0,15);
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for (int k=1;k<arr.length;k++){
            if (max<arr[k]){
                max=arr[k];
            }
        }
        System.out.println("The max number in an array is "+max);
        int min=arr[0];
        for (int k=1;k<arr.length;k++){
            if (min>arr[k]){
                min=arr[k];
            }
        }
        System.out.println("The min number in an array is "+min);

        int summ=0;
        for (int k=0;k<arr.length;k++){
            summ=summ+arr[k];
        }
        float average= (float) summ/arrsize;
        System.out.println("The average number in an array is "+average);
        }
    }
