import java.util.ArrayList;
import java.util.Random;


public class ArrayWithoutOurNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(new Random().nextInt(0,10));
        arr.add(new Random().nextInt(0,10));
        arr.add(new Random().nextInt(0,10));
        arr.add(new Random().nextInt(0,10));
        arr.add(new Random().nextInt(0,10));
        System.out.println(arr.toString());
    }
}