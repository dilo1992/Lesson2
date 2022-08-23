import java.util.Arrays;

public class ExerciseInClass {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = i * 10 + j;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
