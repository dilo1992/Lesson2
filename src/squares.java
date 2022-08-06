//Составьте программу, выводящую на экран квадраты чисел от 10 до 20
// включительно.

public class squares {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        for(;i<=20;j=i*i){
            System.out.print(j+" ");
        i++;
        }
    }
}
