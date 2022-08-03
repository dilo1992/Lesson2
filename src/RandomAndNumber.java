import java.util.Random;

public class RandomAndNumber {
    public static void main(String[] args) {
        int randomValue=new Random().nextInt();
        if (randomValue%2==0){
            String typeNumber="even";
            System.out.println("Number "+randomValue+" is "+typeNumber);
        }
        else {
            String typeNumber="odd";
            System.out.println("Number "+randomValue+" is "+typeNumber);
        }
    }
}
