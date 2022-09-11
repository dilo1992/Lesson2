package by.teachmeskills.classwork.lesson5;//Как альтернативный вариант решения можно было заполнить for первые две строчки,
// а остальные 6 - это их копии через одну. Т.е. 1=3=5=7, 2=4=6=8.
// arr[0]=arr[2]=arr[4]=arr[6]
// arr[1]=arr[3]=arr[5]=arr[7]

import java.util.Arrays;



public class ExerciseInClassTwo {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
                //System.out.println(Arrays.toString(arr[i])); //Вывод как массив с квадратными скобками
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
