//Необходимо, чтоб программа выводила на экран вот такую
//последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//В решении используйте цикл while.

public class tableFor7 {
    public static void main(String[] args) {
        int i=0;
        int j=1;
        while (i<100) {
            i=7*j;
            if (i>100){
                break;
            }
            System.out.print (i+" ");
            j++;
        }
    }
}
