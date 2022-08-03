import java.util.Random;

public class RandomAndNumber {
    public static void main(String[] args) {
        int randomValue=new Random().nextInt(12)+1;
        if (randomValue<=2 && randomValue>11) {
            System.out.println("Now is winter. It`s " + randomValue + " month");
        }
        if (randomValue>2 && randomValue<=5) {
            System.out.println("Now is spring. It`s " + randomValue + " month");
        }
        if (randomValue>5 && randomValue<=8) {
            System.out.println("Now is summer. It`s "+randomValue+" month");
        }
        if (randomValue>8 && randomValue<=11) {
            System.out.println("Now is autumn. It`s "+randomValue+" month");
        }
    }
}
