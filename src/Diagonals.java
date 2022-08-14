import java.util.Arrays;

public class Diagonals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5}, {2, 4, 6}, {3, 6, 9}};
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Diagonal from [0;0] to [2,2]: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i][i]+", ");
        }
        System.out.println();
        System.out.print("Diagonal from [0;2] to [2,0]: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i][arr.length - 1 - i]+", ");
        }
        System.out.println();
    }
}
