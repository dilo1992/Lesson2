package by.teachmeskills.classwork.lesson5;

import java.util.Arrays;

public class Deep {

        public static void main(String[] args) {
            int[][]arr=new int[4][];
            arr[0]=new int[1];
            arr[1]=new int[2];
            arr[2]=new int[3];
            arr[3]=new int[4];
            for(int i = 0; i<arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = j;
                }
            }
                System.out.println(Arrays.deepToString(arr));
        //int a=0;
        //int[][] arr2 = {{0},{0,1},{0,1,2},{0,1,2,3}};
        //   System.out.println(Arrays.deepToString(arr2));

        }
}
