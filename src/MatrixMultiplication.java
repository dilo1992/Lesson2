import java.util.Arrays;
import java.util.Random;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        System.out.println("arr1:                arr2: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = new Random().nextInt(0, 10);
                arr2[i][j] = new Random().nextInt(0,10);
            }
            System.out.println(Arrays.toString(arr1[i]) + "            " + Arrays.toString(arr2[i]));
        }
        int[][] arrfinal = new int[3][3];
        System.out.println("arrfinal: ");
        for (int i = 0; i < arrfinal.length; i++) {
            for (int j = 0; j < arrfinal.length; j++) {
                arrfinal[i][j] = arr1[i][j] * arr2[i][j];
            }
            System.out.println(Arrays.toString(arrfinal[i]));
        }
    }
}
