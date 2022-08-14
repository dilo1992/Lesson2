public class ChessBoard {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
