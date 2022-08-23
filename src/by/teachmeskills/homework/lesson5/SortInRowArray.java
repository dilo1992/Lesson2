import java.util.Arrays;
import java.util.Random;

public class SortInRowArray {
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                arr[i][j]=new Random().nextInt(0,10);
            }
            System.out.print(Arrays.toString(arr[i])+"   ");
            Arrays.sort(arr[i]);
            System.out.println("The "+i+" row was sort: "+Arrays.toString(arr[i]));
        }
        System.out.println();
    }
}
