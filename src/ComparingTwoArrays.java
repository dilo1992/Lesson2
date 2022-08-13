import java.util.Arrays;
import java.util.Random;

public class ComparingTwoArrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int[] arr2=new int[5];
        for (int i=0;i<arr.length;i++) {
            arr[i] = new Random().nextInt(0,15);
            arr2[i] = new Random().nextInt(0,15);
        }
        System.out.println("The array arr is "+Arrays.toString(arr));
        System.out.println("The array arr2 is "+Arrays.toString(arr2));
        int summarr=0;
        int summarr2=0;
        for(int j=0;j<arr.length;j++){
            summarr=summarr+arr[j];
            summarr2=summarr2+arr2[j];
        }
        float average=(float) summarr/arr.length;
        float average2=(float) summarr2/arr2.length;
        System.out.println("The average value of the elements of the array arr" +
                " is "+average+", and the array arr2 is "+average2);
        if (average>average2) {
            System.out.println("The average value of the array arr larger.");
        } else if (average<average2) {
            System.out.println("The average value of the array arr less.");
        } else if (average==average2){
            System.out.println("The average value of the arrays arr and arr2 equal.");
        }
    }
}
