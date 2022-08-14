import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayWithThreeRow {
    public static void main(String[] args) {
        int[][][] arr = new int[8][8][8];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for summ: ");
        int summNumb = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] = new Random().nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] += summNumb;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
